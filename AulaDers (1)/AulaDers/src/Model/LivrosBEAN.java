package Model;

public class LivrosBEAN {
      
    private int id, livros_idCategoria, livros_idEditora;
    private String titulo, isbn, status;

    public LivrosBEAN(int id, int livros_idCategoria, int livros_idEditora , String titulo, String isbn, String status){
                 this.id = id;
                 this.livros_idCategoria = livros_idCategoria;
                 this.livros_idEditora = livros_idEditora;
                 this.titulo = titulo;
                 this.isbn = isbn;
                 this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLivros_idCategoria() {
        return livros_idCategoria;
    }

    public void setLivros_idCategoria(int livros_idCategoria) {
        this.livros_idCategoria = livros_idCategoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLivros_idEditora() {
        return livros_idEditora;
    }

    public void setLivros_idEditora(int livros_idEditora) {
        this.livros_idEditora = livros_idEditora;
    }
}
