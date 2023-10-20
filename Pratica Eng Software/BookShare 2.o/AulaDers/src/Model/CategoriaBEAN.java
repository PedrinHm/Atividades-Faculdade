package Model;

import java.util.Objects;

public class CategoriaBEAN {
    
   private int idCategoriaLivro;
   private String descricaoCategoria, statusCategoria;

    public CategoriaBEAN(int idCategoriaLivro, String descricaoCategoria, String statusCategoria) {
		this.idCategoriaLivro = idCategoriaLivro;
		this.descricaoCategoria = descricaoCategoria;
		this.statusCategoria = statusCategoria;
    }
    
    
    @Override
    public String toString() {
        String texto = idCategoriaLivro+" - "+ descricaoCategoria;
        return texto;
    }

    public int getIdCategoriaLivro() {
        return idCategoriaLivro;
    }

    public void setIdCategoriaLivro(int idCategoriaLivro) {
        this.idCategoriaLivro = idCategoriaLivro;
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }

    public String getStatusCategoria() {
        return statusCategoria;
    }

    public void setStatusCategoria(String statusCategoria) {
        this.statusCategoria = statusCategoria;
    }
   
}
