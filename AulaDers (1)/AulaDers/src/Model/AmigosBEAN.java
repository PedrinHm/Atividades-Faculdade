package Model;


public class AmigosBEAN {
    
     private int idAmigos;
     private String nome, contato, status;

    public AmigosBEAN(int idAmigos, String nome, String contato, String status) {
		this.idAmigos = idAmigos;
		this.nome = nome;
                this.contato = contato;
		this.status = status;
    }

    @Override
    public String toString() {
        String texto = idAmigos+" - "+ nome;
        return texto;
    }
    
    public int getIdAmigos() {
        return idAmigos;
    }

    public void setIdAmigos(int idAmigos) {
        this.idAmigos = idAmigos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
}
