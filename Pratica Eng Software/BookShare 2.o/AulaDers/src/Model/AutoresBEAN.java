package Model;

public class AutoresBEAN {
   
    private int idAutores;
    private String nome, contato, status;

    public AutoresBEAN(int idAutores, String nome, String contato, String status) {
		this.idAutores = idAutores;
		this.nome = nome;
                this.contato = contato;
		this.status = status;
    }  

    public int getIdAutores() {
        return idAutores;
    }

    public void setIdAutores(int idAutores) {
        this.idAutores = idAutores;
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
