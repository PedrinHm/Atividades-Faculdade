package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AmigosDAO {
   
    private static AmigosDAO instance;
    
    public AmigosDAO(){
        MySQLDAO.getConnection();
    }
    
    public static AmigosDAO getInstance(){
        if(instance==null){
            instance = new AmigosDAO();
        }
        return instance;
    }
    
    public long createAmigos(AmigosBEAN amigos){
        String query = "insert into amigos(nome, contato, status) values (?,?,?)";
        return MySQLDAO.executeQuery(query, amigos.getNome(), amigos.getContato(), amigos.getStatus());
    }
    
    public void updateAmigos(AmigosBEAN amigos){
        String query = "update amigos set nome = ?, contato = ?, status = ? where idAmigos = ?";
        MySQLDAO.executeQuery(query, amigos.getNome(), amigos.getContato(), amigos.getStatus(), amigos.getIdAmigos());
    }
    
    public AmigosBEAN findAmigos(int idAmigos) {
        AmigosBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("select * from amigos where idAmigos=?", idAmigos);
        try {
            if (rs.next()) {
                result = new AmigosBEAN(rs.getInt("idAmigos"), rs.getString("nome"), rs.getString("contato"), rs.getString("status"));

            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
     public void deleteAmigos(AmigosBEAN amigos) {
         String query = "update amigos set status=? where idAmigos = ?";
        MySQLDAO.executeQuery(query, "inativa", amigos.getIdAmigos());
     }
    
    public ArrayList<AmigosBEAN> getAllAmigos(){
        ArrayList<AmigosBEAN> listaAmigos = new ArrayList <AmigosBEAN>();
        ResultSet rs = MySQLDAO.getResultSet("select * from amigos where status!=?", "inativa");
        try{
            while(rs.next()){
               listaAmigos.add(new AmigosBEAN(rs.getInt("idAmigos"), rs.getString("nome"), rs.getString("contato"), rs.getString("status"))); 
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaAmigos;
    }
    
    public ArrayList<AmigosBEAN> pesquisarAmigos(String pesquisar, boolean inativa){
        String pesquisa = ("%" + pesquisar + "%");
        ArrayList<AmigosBEAN> listaAmigos = new ArrayList <AmigosBEAN>();
        ResultSet rs = null;
        if(inativa == true){
        rs = MySQLDAO.getResultSet("select * from amigos where (nome like ? or contato like ?)  and status =?", pesquisa, pesquisa, "inativa");
        }else{
           rs = MySQLDAO.getResultSet("select * from amigos where (nome like ? or contato like ?)  and status =?", pesquisa, pesquisa, "ativa");  
        }
        try{
            while(rs.next()){
               listaAmigos.add(new AmigosBEAN(rs.getInt("idAmigos"), rs.getString("nome"), rs.getString("contato"), rs.getString("status"))); 
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaAmigos;
    }
}

