$('#comentario-form').on('submit',function(event){
    event.preventDefault();
    console.log()
})

$('#comentario-botao').click(function(){

    const novoComentario = $('#comentario-textearea').val();

    const novoItem = $('<li class="list-group-item">').text(novoComentario);

    $('#lista').append(novoItem);
    console.log(novoComentario);

    $('#comentario-textearea').val('');
})