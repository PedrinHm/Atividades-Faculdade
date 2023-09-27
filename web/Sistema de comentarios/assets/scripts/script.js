$(document).ready(function () {
    // ... código anterior ...

    $('#comentario-form').on('submit', function (event) {
        event.preventDefault();

        const novoComentario = $('#comentario-textearea').val();
        const contador = $('<span class="ml-2">0</span>');
        const botaoLike = $('<button type="submit" class="btn btn-primary mt-3" id="comentario-botao-like">Like <span class="contador"></span></button>');
        const botaoExcluir = $('<button type="button" class="btn btn-danger mt-3 comentario-botao-excluir" data-toggle="modal" data-target="#myModal">Excluir</button>');
        const botoes = $('<div class="btn-group position-absolute bottom-0 end-0">').append(botaoLike).append(botaoExcluir);
        const novoItem = $('<li class="list-group-item">').text(novoComentario).append(botoes);
        
        // Defina o atributo de dados 'data-adicao' no momento da criação do item
        $(novoItem).data('data-adicao', new Date());

        if (novoComentario != '') {
            $('#lista').append(novoItem);
            $('#comentario-textearea').val('');
        }

        let likes = 0;
        botaoLike.click(function () {
            likes++;
            botaoLike.find('.contador').text(likes);
        });
    });

    $('#ordenar-crescente').click(function () {
        ordenarComentarios(true); // Ordenar em ordem crescente
    });

    $('#ordenar-decrescente').click(function () {
        ordenarComentarios(false); // Ordenar em ordem decrescente
    });
});

function ordenarComentarios(crescente) {
    const listaComentarios = $('#lista');
    const comentarios = listaComentarios.find('li').toArray();

    comentarios.sort(function (a, b) {
        const dataA = $(a).data('data-adicao').getTime();
        const dataB = $(b).data('data-adicao').getTime();
        
        if (crescente) {
            return dataA - dataB;
        } else {
            return dataB - dataA;
        }
    });

    listaComentarios.empty();
    $(comentarios).appendTo(listaComentarios);
}