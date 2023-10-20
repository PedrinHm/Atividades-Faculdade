package Model;

public class Emprestimos_has_livrosBEAN {

    private int idEmprestimos;
    private int idLivros;

    public Emprestimos_has_livrosBEAN(int idEmprestimos, int idLivros) {
        this.idEmprestimos = idEmprestimos;
        this.idLivros = idLivros;
    }

    public int getIdEmprestimos() {
        return idEmprestimos;
    }

    public void setIdEmprestimos(int idEmprestimos) {
        this.idEmprestimos = idEmprestimos;
    }

    public int getIdLivros() {
        return idLivros;
    }

    public void setIdLivros(int idLivros) {
        this.idLivros = idLivros;
    }  
}
