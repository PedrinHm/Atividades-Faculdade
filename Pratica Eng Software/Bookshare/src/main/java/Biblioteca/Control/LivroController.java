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
public class LivroController {

public boolean cadastrarLivro(int id, String titulo, Editora editora, Autor autor, int status) {
    // Verifique se id é menor ou igual a zero (considerando que um ID válido deve ser maior que zero)
    if (id <= 0) {
        return false; // ID inválido
    }

    // Verifique se o título está nulo ou vazio
    if (titulo == null || titulo.trim().isEmpty()) {
        return false; // Título está nulo ou vazio
    }

    // Verifique se o objeto editora está nulo
    if (editora == null) {
        return false; // A editora está nula
    }

    // Verifique se o objeto autor está nulo
    if (autor == null) {
        return false; // O autor está nulo
    }

    // Verifique se status é menor que 0 (por exemplo, se 0 e valores negativos são inválidos)
    if (status < 0) {
        return false; // Status inválido
    }

    // Agora você pode prosseguir com a lógica de cadastro se todos os campos estiverem preenchidos corretamente
    // ...
    Livro livro = new Livro(id, titulo, editora, autor, status);
    livro.cadastrarLivro(livro);
    return true; // Todos os campos necessários estão preenchidos corretamente
}

    
}
