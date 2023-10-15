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
public class Amigo {
    private int id;   
    private String nome;
    private String telefone;
    private String documento;
    private int status;
    private int limite;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public int getStatus() {
        return status;
    }

    public int getLimite() {
        return limite;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void cadastrarAmigo(Amigo amigo) {
    if (amigo != null) {
        try {
            // Lógica para cadastrar o amigo no banco de dados
            // Certifique-se de validar e tratar os dados adequadamente

            System.out.println("Amigo cadastrado com sucesso.");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar o amigo: " + e.getMessage());
        }
    } else {
        System.err.println("Tentativa de cadastrar um amigo nulo. Verifique os dados do amigo.");
    }
}

    
}
