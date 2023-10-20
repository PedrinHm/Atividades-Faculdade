package Model;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Livros_has_autoresDAO {
    
    private static Livros_has_autoresDAO instance;

    public Livros_has_autoresDAO() {
        MySQLDAO.getConnection();
    }

    public static Livros_has_autoresDAO getInstance() {
        if (instance == null) {
            instance = new Livros_has_autoresDAO();
        }
        return instance;
    }
    
    public ArrayList<Livros_has_autoresBEAN> findAutores(int idLivros ) {
        ArrayList<Livros_has_autoresBEAN> lista = new ArrayList<Livros_has_autoresBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM livros_has_autores WHERE idLivros=?", idLivros);
        try {
            while (rs.next()) {
                lista.add(new Livros_has_autoresBEAN(rs.getInt("livros_idLivros"), rs.getInt("autores_idAutores")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
    
