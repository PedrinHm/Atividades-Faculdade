package Biblioteca.Model;

import java.util.ArrayList;

public class Emprestimo {
    private int id;
    private String data;
    private ArrayList<Livro> livros = new ArrayList<Livro>();
    private Amigo amigo;
    private int status;

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public int getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    public void setStatus(int status) {
        this.status = status;
    }

public void cadastrarEmprestimo(Empréstimo emprestimo) {
    if (emprestimo != null) {
        try {
            // Lógica para cadastrar o empréstimo no banco de dados
            // Certifique-se de validar e tratar os dados adequadamente

            System.out.println("Empréstimo cadastrado com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar o empréstimo: " + e.getMessage());
        }
    } else {
        System.err.println("Tentativa de cadastrar um empréstimo nulo. Verifique os dados do empréstimo.");
    }
}


}
