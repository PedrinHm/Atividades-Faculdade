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
public class EmprestimoController {
 
    public boolean cadastrarEmprestimo(int id, String data, ArrayList<Livro> livros, Amigo amigo, int status) {
    // Verifique se id é menor ou igual a zero (considerando que um ID válido deve ser maior que zero)
    if (id <= 0) {
        return false; // ID inválido
    }

    // Verifique se data está nula ou vazia
    if (data == null || data.trim().isEmpty()) {
        return false; // Data está nula ou vazia
    }

    // Verifique se a lista de livros está vazia ou nula
    if (livros == null || livros.isEmpty()) {
        return false; // A lista de livros está vazia ou nula
    }

    // Verifique se o objeto amigo está nulo
    if (amigo == null) {
        return false; // O amigo está nulo
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
