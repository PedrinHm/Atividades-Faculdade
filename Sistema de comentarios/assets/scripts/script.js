$('#comentario-form').on('submit',function(event){
    event.preventDefault();
    console.log()
})

$('#comentario-botao').click(function(){

   
    const novoComentario = $('#comentario-textearea').val();
    const contador = $('<span class="ml-2">0</span>');
    const botaoLike = $('<button type="submit" class="btn btn-primary mt-3" id="comentario-botao-like">Like <span class="contador"></span></button>');
    const botaoExcluir = $('<button type="submit" class="btn btn-danger mt-3" id="comentario-botao-excluir">Excluir</button>');
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
})
