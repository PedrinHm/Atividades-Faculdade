/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca.Model;

/**
 *
 * @author pedro
 */
public class Livro {
    private int id;   
    private String titulo;
    private Editora editora;
    private Autor autor;
    private int status;

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Editora getEditora() {
        return editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setStatus(int status) {
        this.status = status;
    }

public void cadastrarLivro(Livro livro) {
    if (livro != null) {
        try {
            // Lógica para cadastrar o livro no banco de dados
            // Certifique-se de validar e tratar os dados adequadamente

            System.out.println("Livro cadastrado com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar o livro: " + e.getMessage());
        }
    } else {
        System.err.println("Tentativa de cadastrar um livro nulo. Verifique os dados do livro.");
    }
}


}
