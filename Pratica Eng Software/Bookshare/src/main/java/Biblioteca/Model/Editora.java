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
public class Editora {
    private int id;   
    private String razaoSocial;
    private String endereco;
    private int status;

    public int getId() {
        return id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setStatus(int status) {
        this.status = status;
    }

public void cadastrarEditora(Editora editora) {
    if (editora != null) {
        try {
            // Lógica para cadastrar a editora no banco de dados
            // Certifique-se de validar e tratar os dados adequadamente

            System.out.println("Editora cadastrada com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar a editora: " + e.getMessage());
        }
    } else {
        System.err.println("Tentativa de cadastrar uma editora nula. Verifique os dados da editora.");
    }
}


}
