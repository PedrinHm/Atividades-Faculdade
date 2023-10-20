package Model;

import java.util.Objects;

public class EditoraBEAN {
      
    private int idEditora;
    private String nome, endereco, status;

    public EditoraBEAN(int idEditora, String nome, String endereco, String status) {
                 this.idEditora = idEditora;
                 this.nome = nome;
                 this.endereco = endereco;
                 this.status = status;
    }

        

   @Override
   public String toString() {
        String texto = idEditora+" - "+ nome;
        return texto;
    }
    
    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }    
 }
