/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca.Control;

/**
 *
 * @author pedro
 */
public class AmigoController {
    
   public boolean cadastrarAmigo(int id, String nome, String telefone, String documento, int status, int limite) {
    // Verifique se nome está nulo ou vazio
    if (nome == null || nome.trim().isEmpty()) {
        return false; // Nome está nulo ou vazio
    }

    // Verifique se telefone está nulo ou vazio
    if (telefone == null || telefone.trim().isEmpty()) {
        return false; // Telefone está nulo ou vazio
    }

    // Verifique se documento está nulo ou vazio
    if (documento == null || documento.trim().isEmpty()) {
        return false; // Documento está nulo ou vazio
    }

    // Agora você pode prosseguir com a lógica de cadastro se todos os campos estiverem preenchidos
    // ...
    
    return true; // Todos os campos necessários estão preenchidos
}

    
    
}
