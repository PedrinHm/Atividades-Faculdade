$(document).ready(function () {
    $('#comentario-form').on('submit', function (event) {
        event.preventDefault();

        const novoComentario = $('#comentario-textearea').val();
        const contador = $('<span class="ml-2">0</span>');
        const botaoLike = $('<button type="submit" class="btn btn-primary mt-3" id="comentario-botao-like">Like <span class="contador"></span></button>');
        const botaoExcluir = $('<button type="button" class="btn btn-danger mt-3 comentario-botao-excluir" data-toggle="modal" data-target="#myModal">Excluir</button>');
        const botoes = $('<div class="btn-group position-absolute bottom-0 end-0">').append(botaoLike).append(botaoExcluir);
        const novoItem = $('<li class="list-group-item">').text(novoComentario).append(botoes);

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

    $(document).on("click", ".comentario-botao-excluir", function () {
        const comentarioAExcluir = $(this).closest("li");
        $("#confirmDeleteModal").data("comentario-a-excluir", comentarioAExcluir);
        $("#confirmDeleteModal").modal("show");
    });

    $("#deleteComment").click(function () {
        const comentarioAExcluir = $("#confirmDeleteModal").data("comentario-a-excluir");

        if (comentarioAExcluir) {
            comentarioAExcluir.remove();
        }

        $("#confirmDeleteModal").modal("hide");
    });

    $("#confirmDeleteModal .btn-secondary").click(function () {
        $("#confirmDeleteModal").modal("hide");
    });
});
