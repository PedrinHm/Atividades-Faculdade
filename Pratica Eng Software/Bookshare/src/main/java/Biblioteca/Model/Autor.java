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
public class Autor {
    private int id;   
    private String nome;
    private int status;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStatus(int status) {
        this.status = status;
    }
 
    
    public void cadastrarAutor(Autor autor) {
    if (autor != null) {
        try {
            // Lógica para cadastrar o autor no banco de dados
            // Certifique-se de validar e tratar os dados adequadamente

            System.out.println("Autor cadastrado com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar o autor: " + e.getMessage());
        }
    } else {
        System.err.println("Tentativa de cadastrar um autor nulo. Verifique os dados do autor.");
    }
}

}
