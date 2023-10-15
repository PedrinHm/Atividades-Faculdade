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
public class EditoraController {
    
    public boolean cadastrarEditora(int id, String razaoSocial, String endereco, int status) {
    // Verifique se id é menor ou igual a zero (considerando que um ID válido deve ser maior que zero)
    if (id <= 0) {
        return false; // ID inválido
    }

    // Verifique se razaoSocial está nula ou vazia
    if (razaoSocial == null || razaoSocial.trim().isEmpty()) {
        return false; // Razão Social está nula ou vazia
    }

    // Verifique se endereco está nulo ou vazio
    if (endereco == null || endereco.trim().isEmpty()) {
        return false; // Endereço está nulo ou vazio
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
