package Model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

public class EmprestimosDAO {
  
    private static EmprestimosDAO instance;
    
    public EmprestimosDAO(){
        MySQLDAO.getConnection();
    }
    
    public static EmprestimosDAO getInstance(){
        if(instance==null){
            instance = new EmprestimosDAO();
        }
        return instance;
    }
     
    public void createEmprestimos(EmprestimosBEAN emprestimos, ArrayList<Integer> contaLivros) throws SQLException{
        String query = "insert into emprestimos(idEmprestimos, data, amigos_idAmigos, status) values (?,?,?,?)";
        MySQLDAO.executeQuery(query, emprestimos.getIdEmprestimos(), emprestimos.getData(), emprestimos.getAmigos_idAmigos(), emprestimos.getStatus());
        
        for (int i = 0; i < contaLivros.size(); i++) {
            String query2 = "insert emprestimos_has_livros (emprestimos_idEmprestimos, livros_idLivros) values (?,?)";
            MySQLDAO.executeQuery(query2, ultimoEmprestimos(), contaLivros.get(i));
        } 
    }
    
    public int ultimoEmprestimos() throws SQLException{
        String query = "select * from emprestimos order by idEmprestimos desc";
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        int idLivro = 0;
        try {
            if (rs.next()) {
                idLivro = rs.getInt("idEmprestimos");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idLivro;
    }

    public void updateEmprestimos(EmprestimosBEAN emprestimos, ArrayList<Integer> contaLivros) throws SQLException{
        String query2 = "DELETE FROM emprestimos_has_livros WHERE emprestimos_idEmprestimos = ?";
        MySQLDAO.executeQuery(query2,emprestimos.getIdEmprestimos());
        
        String query = "update emprestimos set data = ?, amigos_idAmigos = ?, status = ? where idEmprestimos = ?";
        MySQLDAO.executeQuery(query, emprestimos.getData(), emprestimos.getAmigos_idAmigos(), emprestimos.getStatus(), emprestimos.getIdEmprestimos());
        
        for (int i = 0; i < contaLivros.size(); i++) {
            String query3 = "insert emprestimos_has_livros (emprestimos_idEmprestimos, livros_idLivros) values (?,?)";
            MySQLDAO.executeQuery(query3, emprestimos.getIdEmprestimos(), contaLivros.get(i));
        }
    }

    public EmprestimosBEAN findEmprestimos(int idEmprestimos) {
        EmprestimosBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("select * from emprestimos where idEmprestimos=?", idEmprestimos);
        try {
            if (rs.next()) {
                result = new EmprestimosBEAN(rs.getInt("idEmprestimos"), rs.getDate("Data"), rs.getInt("amigos_idAmigos"), rs.getString("status"));

            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

     public void deleteEmprestimos(EmprestimosBEAN emprestimos) {
         String query = "update emprestimos set status=? where idEmprestimos = ?";
        MySQLDAO.executeQuery(query, "inativa", emprestimos.getIdEmprestimos());
    }    
    
    public ArrayList<EmprestimosBEAN> getAllEmprestimos(){
        ArrayList<EmprestimosBEAN> listaEmprestimos = new ArrayList <EmprestimosBEAN>();
        ResultSet rs = MySQLDAO.getResultSet("select * from emprestimos where status!=?", "inativa");
        try{
            while(rs.next()){
               listaEmprestimos.add(new EmprestimosBEAN(rs.getInt("idEmprestimos"), rs.getDate("Data"), rs.getInt("amigos_idAmigos"), rs.getString("status"))); 
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaEmprestimos;
    }
    
    public ArrayList<EmprestimosBEAN> pesquisarEmprestimos(String pesquisar, boolean inativa){
        String pesquisa = ("%" + pesquisar + "%");
        ArrayList<EmprestimosBEAN> listaEmprestimos = new ArrayList <EmprestimosBEAN>();
        ResultSet rs = null;
        if(inativa == true){
        rs = MySQLDAO.getResultSet("select * from emprestimos where (data like ?)  and status =?", pesquisa, "inativa");
        }else{
           rs = MySQLDAO.getResultSet("select * from emprestimos where (data like ?)  and status =?", pesquisa, "ativa");  
        }
        try{
            while(rs.next()){
               listaEmprestimos.add(new EmprestimosBEAN(rs.getInt("idEmprestimos"), rs.getDate("Data"), rs.getInt("amigos_idAmigos"), rs.getString("status")));
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return listaEmprestimos;
    }
    
    public Date converterData(String data){
       Date date = Date.valueOf(data); 
       return date;
    }
}
