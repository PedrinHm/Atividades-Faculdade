package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EditoraDAO {
      
    private static EditoraDAO instance;
    
    public EditoraDAO(){
        MySQLDAO.getConnection();
    }
    
    public static EditoraDAO getInstance(){
        if(instance==null){
            instance = new EditoraDAO();
        }
        return instance;
    }
    
    public long createEditora(EditoraBEAN editora){
        String query = "insert into editora(nome, endereco, status) values (?,?,?)";
        return MySQLDAO.executeQuery(query, editora.getNome(), editora.getEndereco(), editora.getStatus());
    }
    
    public void updateEditora(EditoraBEAN editora){
        String query = "update editora set nome = ?, endereco = ?, status = ? where idEditora = ?";
        MySQLDAO.executeQuery(query, editora.getNome(), editora.getEndereco(), editora.getStatus(), editora.getIdEditora());
    }
    
    public EditoraBEAN findEditora(int idEditora) {
        EditoraBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("select * from editora where idEditora=?", idEditora);
        try {
            if (rs.next()) {
                result = new EditoraBEAN(rs.getInt("idEditora"), rs.getString("nome"), rs.getString("endereco"), rs.getString("status"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
     public void deleteEditora(EditoraBEAN editora) {
         String query = "update editora set status=? where idEditora = ?";
        MySQLDAO.executeQuery(query, "inativa", editora.getIdEditora());
     }
    
    public ArrayList<EditoraBEAN> getAllEditora(){
        ArrayList<EditoraBEAN> listaEditora = new ArrayList <EditoraBEAN>();
        ResultSet rs = MySQLDAO.getResultSet("select * from editora where status!=?", "inativa");
        try{
            while(rs.next()){
               listaEditora.add(new EditoraBEAN(rs.getInt("idEditora"), rs.getString("nome"), rs.getString("endereco"), rs.getString("status"))); 
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaEditora;
    }
    
    public ArrayList<EditoraBEAN> pesquisarEditora(String pesquisar, boolean inativa){
        String pesquisa = ("%" + pesquisar + "%");
        ArrayList<EditoraBEAN> listaEditora = new ArrayList <EditoraBEAN>();
        ResultSet rs = null;
        if(inativa == true){
        rs = MySQLDAO.getResultSet("select * from editora where nome like ? and status =?", pesquisa, "inativa");
        }else{
           rs = MySQLDAO.getResultSet("select * from editora where nome like ?  and status =?", pesquisa, "ativa");  
        }
        try{
            while(rs.next()){
               listaEditora.add(new EditoraBEAN(rs.getInt("idEditora"), rs.getString("nome"), rs.getString("endereco"), rs.getString("status"))); 
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaEditora;
    }
}
         
