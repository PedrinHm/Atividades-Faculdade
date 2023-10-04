import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class editoraDAO {
    
    private editoraDAO(){
        MySQLDAO.getConnection();
    }
    
    public static editoraDAO getInstance(){
        if (instance == null){
            instance = new editoraDAO();
        }
        return instance;
    }
    
    public Long create(editotaBEAN editora){
        String query = "INSERT INTO CONTATOS (razaoSocial, status) VALUES (?,?)";
        return MySQLDAO.executeQuery (query, editora.getRazaoSocial(), editora.getStatus());
    }
    
    public void update(editoraBEAN editora){
        String query = "UPDATE EDITORAS SET razaoSocial=?, status=? WHERE id = ?";
        MySQLDAO.executeQuery(query, editora.getRazaoSocial(), status.getStatus());
    }
    
    public void delete(editoraBEAN editora){
        MySQLDAO.executeQuery(query:"DELETE FROM EDITORA WHERE idEditora  = ?", editora.getidEditora);      
    } 
    
    public ArrayList<editoraBEAN> findAllEditoras(){
        return listaEditoras(query: "SELECT * FROM EDITORA ORDER BY idEditora");
    }
}