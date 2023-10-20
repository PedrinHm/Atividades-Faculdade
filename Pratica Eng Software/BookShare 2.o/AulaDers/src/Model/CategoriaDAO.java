package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CategoriaDAO {
   
    private static CategoriaDAO instance;
    
    public CategoriaDAO(){
        MySQLDAO.getConnection();
    }
    
    public static CategoriaDAO getInstance(){
        if(instance==null){
            instance = new CategoriaDAO();
        }
        return instance;
    }
    
    public long createCategoria(CategoriaBEAN categoria){
        String query = "insert into categoria(descricao, status) values (?,?)";
        return MySQLDAO.executeQuery(query, categoria.getDescricaoCategoria(), categoria.getStatusCategoria());
    }
    
    public void updateCategoria(CategoriaBEAN categoria){
        String query = "update categoria set descricao = ?, status = ? where idCategoriaLivro = ?";
        MySQLDAO.executeQuery(query, categoria.getDescricaoCategoria(), categoria.getStatusCategoria(), categoria.getIdCategoriaLivro());
    }
    
    public CategoriaBEAN findCategoria(int idCategoriaLivro) {
        CategoriaBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("select * from categoria where idCategoriaLivro=?", idCategoriaLivro);
        try {
            if (rs.next()) {
                result = new CategoriaBEAN(rs.getInt("idCategoriaLivro"), rs.getString("descricao"),
                        rs.getString("status"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
     public void deleteCategoria(CategoriaBEAN categoria) {
         String query = "update categoria set status=? where idCategoriaLivro = ?";
        MySQLDAO.executeQuery(query, "inativa", categoria.getIdCategoriaLivro());
     }
    
    public ArrayList<CategoriaBEAN> getAllCategorias(){
        ArrayList<CategoriaBEAN> listaCategoria = new ArrayList <CategoriaBEAN>();
        ResultSet rs = MySQLDAO.getResultSet("select * from categoria where status!=?", "inativa");
        try{
            while(rs.next()){
               listaCategoria.add(new CategoriaBEAN(rs.getInt("idCategoriaLivro"), rs.getString("descricao"), rs.getString("status"))); 
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaCategoria;
    }
    
    public ArrayList<CategoriaBEAN> pesquisarCategoria(String pesquisar, boolean inativa){
        String pesquisa = ("%" + pesquisar + "%");
        ArrayList<CategoriaBEAN> listaCategoria = new ArrayList <CategoriaBEAN>();
        ResultSet rs = null;
        if(inativa == true){
        rs = MySQLDAO.getResultSet("select * from categoria where descricao like ?  and status =?", pesquisa, "inativa");
        }else{
           rs = MySQLDAO.getResultSet("select * from categoria where descricao like ?  and status =?", pesquisa, "ativa");  
        }
        try{
            while(rs.next()){
               listaCategoria.add(new CategoriaBEAN(rs.getInt("idCategoriaLivro"), rs.getString("descricao"), rs.getString("status"))); 
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaCategoria;
    }
    

}
        