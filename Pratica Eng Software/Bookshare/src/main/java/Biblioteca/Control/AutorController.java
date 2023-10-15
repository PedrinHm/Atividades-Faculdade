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
public class AutorController {
    
    public boolean cadastrarAutor(int id, String nome, int status) {
    // Verifique se id é menor ou igual a zero (considerando que um ID válido deve ser maior que zero)
    if (id <= 0) {
        return false; // ID inválido
    }

    // Verifique se nome está nulo ou vazio
    if (nome == null || nome.trim().isEmpty()) {
        return false; // Nome está nulo ou vazio
    }

    // Verifique se status é menor que 0 (por exemplo, se 0 e valores negativos são inválidos)
    if (status < 0) {
        return false; // Status inválido
    }

    // Agora você pode prosseguir com a lógica de cadastro se todos os campos estiverem preenchidos corretamente
    // ...

    return true; // Todos os campos necessários estão preenchidos corretamente
}

}
