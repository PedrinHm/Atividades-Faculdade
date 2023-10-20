package Model;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Emprestimos_has_livrosDAO {
  
    private static Emprestimos_has_livrosDAO instance;

    public Emprestimos_has_livrosDAO() {
        MySQLDAO.getConnection();
    }

    public static Emprestimos_has_livrosDAO getInstance() {
        if (instance == null) {
            instance = new Emprestimos_has_livrosDAO();
        }
        return instance;
    }
    
    public ArrayList<Emprestimos_has_livrosBEAN> findLivros(int idEmprestimos) {
        ArrayList<Emprestimos_has_livrosBEAN> lista = new ArrayList<Emprestimos_has_livrosBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM emprestimos_has_livros WHERE emprestimos_idEmprestimos=?", idEmprestimos);
        try {
            while (rs.next()) {
                lista.add(new Emprestimos_has_livrosBEAN(rs.getInt("emprestimos_idEmprestimos"), rs.getInt("livros_idLivros")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
