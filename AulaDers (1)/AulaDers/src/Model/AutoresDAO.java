package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AutoresDAO {
   
    private static AutoresDAO instance;
    
    public AutoresDAO(){
        MySQLDAO.getConnection();
    }
    
    public static AutoresDAO getInstance(){
        if(instance==null){
            instance = new AutoresDAO();
        }
        return instance;
    }
    
    public long createAutores(AutoresBEAN autores){
        String query = "insert into autores(nome, contato, status) values (?,?,?)";
        return MySQLDAO.executeQuery(query, autores.getNome(), autores.getContato(), autores.getStatus());
    }
    
    public void updateAutores(AutoresBEAN autores){
        String query = "update autores set nome = ?, contato = ?, status = ? where idAutores = ?";
        MySQLDAO.executeQuery(query, autores.getNome(), autores.getContato(), autores.getStatus(), autores.getIdAutores());
    }
    
    public AutoresBEAN findAutores(int idAutores) {
        AutoresBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("select * from autores where idAutores=?", idAutores);
        try {
            if (rs.next()) {
                result = new AutoresBEAN(rs.getInt("idAutores"), rs.getString("nome"), rs.getString("contato"), rs.getString("status"));

            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
     public void deleteAutores(AutoresBEAN autores) {
         String query = "update autores set status=? where idAutores = ?";
        MySQLDAO.executeQuery(query, "inativa", autores.getIdAutores());
     }
    
    public ArrayList<AutoresBEAN> getAllAutores(){
        ArrayList<AutoresBEAN> listaAutores = new ArrayList <AutoresBEAN>();
        ResultSet rs = MySQLDAO.getResultSet("select * from autores where status!=?", "inativa");
        try{
            while(rs.next()){
               listaAutores.add(new AutoresBEAN(rs.getInt("idAutores"), rs.getString("nome"), rs.getString("contato"), rs.getString("status"))); 
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaAutores;
    }
    
    public ArrayList<AutoresBEAN> pesquisarAutores(String pesquisar, boolean inativa){
        String pesquisa = ("%" + pesquisar + "%");
        ArrayList<AutoresBEAN> listaAutores = new ArrayList <AutoresBEAN>();
        ResultSet rs = null;
        if(inativa == true){
        rs = MySQLDAO.getResultSet("select * from autores where (nome like ? or contato like ?)  and status =?", pesquisa, pesquisa, "inativa");
        }else{
           rs = MySQLDAO.getResultSet("select * from autores where (nome like ? or contato like ?)  and status =?", pesquisa, pesquisa, "ativa");  
        }
        try{
            while(rs.next()){
               listaAutores.add(new AutoresBEAN(rs.getInt("idAutores"), rs.getString("nome"), rs.getString("contato"), rs.getString("status"))); 
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaAutores;
    }
}
        