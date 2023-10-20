package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LivrosDAO {
      
    private static LivrosDAO instance;
    
    public LivrosDAO(){
        MySQLDAO.getConnection();
    }
    
    public static LivrosDAO getInstance(){
        if(instance==null){
            instance = new LivrosDAO();
        }
        return instance;
    }
    
    public void createLivros(LivrosBEAN livros, ArrayList<Integer> contaAutores) throws SQLException{
        String query = "insert into livros(id, titulo, isbn, status, livros_idCategoria, livros_idEditora) values (?,?,?,?,?,?)";
        MySQLDAO.executeQuery(query, livros.getId(), livros.getTitulo(), livros.getIsbn(), livros.getStatus(), livros.getLivros_idCategoria(),livros.getLivros_idEditora() );
        
        for (int i = 0; i < contaAutores.size(); i++) {
            String query2 = "insert livros_has_autores (livros_idLivros, autores_idAutores) values (?,?)";
            MySQLDAO.executeQuery(query2, ultimoLivro(), contaAutores.get(i));
        }
        
    }
    
    public int ultimoLivro() throws SQLException{
        String query = "select * from livros order by id desc";
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        int idLivro = 0;
        try {
            if (rs.next()) {
                idLivro = rs.getInt("id");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
        return idLivro;
    }
     
    
    public void updateLivros(LivrosBEAN livros, ArrayList<Integer> contaAutores) throws SQLException{
        String query2 = "DELETE FROM livros_has_autores WHERE livros_idLivros = ?";
        MySQLDAO.executeQuery(query2,livros.getId());
        
        String query = "update livros set titulo = ?, isbn = ?, status = ?, livros_idCategoria = ?, livros_idEditora= ? where id = ?";
        MySQLDAO.executeQuery(query, livros.getTitulo(), livros.getIsbn(), livros.getStatus(), livros.getLivros_idCategoria(), livros.getLivros_idEditora(), livros.getId());
        
        for (int i = 0; i < contaAutores.size(); i++) {
            String query3 = "insert livros_has_autores (livros_idLivros, autores_idAutores) values (?,?)";
            MySQLDAO.executeQuery(query3, livros.getId(), contaAutores.get(i));
        }
    }
    
    public LivrosBEAN findLivros(int id) {
        LivrosBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("select * from livros where id=?", id);
        try {
            if (rs.next()) {
                result = new LivrosBEAN(rs.getInt("id"), rs.getInt("livros_idCategoria"), rs.getInt("livros_idEditora"), rs.getString("titulo"), rs.getString("isbn"), rs.getString("status"));

            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
     public void deleteLivros(LivrosBEAN livros) {
         String query = "update livros set status=? where id = ?";
        MySQLDAO.executeQuery(query, "inativa", livros.getId());
    }
    
    public ArrayList<LivrosBEAN> getAllLivros(){
        ArrayList<LivrosBEAN> listaLivros = new ArrayList <LivrosBEAN>();
        ResultSet rs = MySQLDAO.getResultSet("select * from livros where status!=?", "inativa");
        try{
            while(rs.next()){
               listaLivros.add(new LivrosBEAN(rs.getInt("id"), rs.getInt("livros_idCategoria"), rs.getInt("livros_idEditora"), rs.getString("titulo"), rs.getString("isbn"), rs.getString("status"))); 
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaLivros;
    }
    
    public ArrayList<LivrosBEAN> pesquisarLivros(String pesquisar, boolean inativa){
        String pesquisa = ("%" + pesquisar + "%");
        ArrayList<LivrosBEAN> listaLivros = new ArrayList <LivrosBEAN>();
        ResultSet rs = null;
        if(inativa == true){
        rs = MySQLDAO.getResultSet("select * from livros where (titulo like ? or isbn like ?)  and status =?", pesquisa, pesquisa, "inativa");
        }else{
           rs = MySQLDAO.getResultSet("select * from livros where (titulo like ? or isbn like ?)  and status =?", pesquisa, pesquisa, "ativa");  
        }
        try{
            while(rs.next()){
               listaLivros.add(new LivrosBEAN(rs.getInt("id"), rs.getInt("livros_idCategoria"), rs.getInt("livros_idEditora"), rs.getString("titulo"), rs.getString("isbn"), rs.getString("status"))); 
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaLivros;
    }
}
