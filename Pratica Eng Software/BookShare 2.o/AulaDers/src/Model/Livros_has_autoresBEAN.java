package Model;

public class Livros_has_autoresBEAN {
    private int idLivros;
    private int idAutores;


    public Livros_has_autoresBEAN(int idLivros, int idAutores) {
        this.idLivros = idLivros;
        this.idAutores = idAutores;
    }

    public int getIdLivros() {
        return idLivros;
    }

    public void setIdLivros(int idLivros) {
        this.idLivros = idLivros;
    }

    public int getIdAutores() {
        return idAutores;
    }

    public void setIdAutores(int idAutores) {
        this.idAutores = idAutores;
    }
}
