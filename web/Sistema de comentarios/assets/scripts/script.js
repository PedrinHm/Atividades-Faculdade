$('#comentario-form').on('submit',function(event){
    event.preventDefault();
    console.log()
})

$('#comentario-botao').click(function(){

   
    const novoComentario = $('#comentario-textearea').val();
    const contador = $('<span class="ml-2">0</span>');
    const botaoLike = $('<button type="submit" class="btn btn-primary mt-3" id="comentario-botao-like">Like <span class="contador"></span></button>');
    const botaoExcluir = $('<button type="button" class="btn btn-danger mt-3" id="comentario-botao-excluir" data-toggle="modal" data-target="#myModal">Excluir</button>');
    const botoes = $('<div class="btn-group position-absolute bottom-0 end-0">').append(botaoLike).append(botaoExcluir);
    const novoItem = $('<li class="list-group-item">').text(novoComentario).append(botoes);
    

    if(novoComentario != ''){
        $('#lista').append(novoItem);
        console.log(novoComentario);

        $('#comentario-textearea').val('');

    }

    let likes = 0;
    botaoLike.click(function () {
        likes++;    
        botaoLike.find('.contador').text(likes);
    });

 // Evento para abrir o modal de confirmação ao clicar em "Excluir"
// Evento para abrir o modal de confirmação ao clicar em "Excluir"
$("#comentario-botao-excluir").click(function() {
    // Quando o botão "Excluir" é clicado, armazenamos o comentário associado em uma variável de dados personalizada
    $("#confirmDeleteModal").data("comentario-a-excluir", novoItem);
    $("#confirmDeleteModal").modal("show");
});

// Evento para excluir o comentário quando o botão "Excluir" no modal de confirmação for clicado
$("#deleteComment").click(function() {
    // Recuperamos o comentário associado armazenado na variável de dados personalizada
    var comentarioAExcluir = $("#confirmDeleteModal").data("comentario-a-excluir");
    
    if (comentarioAExcluir) {
        // Remova o comentário específico da lista
        comentarioAExcluir.remove();
    }

    // Feche o modal de confirmação
    $("#confirmDeleteModal").modal("hide");
});


// Evento para fechar o modal quando o botão "Cancelar" no modal de confirmação for clicado
$("#confirmDeleteModal .btn-secondary").click(function() {
    $("#confirmDeleteModal").modal("hide");
});

})