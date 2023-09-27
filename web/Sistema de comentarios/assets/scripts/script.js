$(document).ready(function () {
  $("#comentario-form").on("submit", function (event) {
    event.preventDefault();

    const comentario_texto = $("#comentario-textearea").val();
    const contador = $('<span class="ml-2">0</span>');
    const botao_Curtir = $('<button type="button" class="btn btn-primary mt-3 comentario-botao-like">Like <span class="contador">0</span></button>');
    const botao_Excluir = $('<button type="button" class="btn btn-danger mt-3 comentario-botao-excluir" data-toggle="modal" data-target="#myModal">Excluir</button>');
    const botoes = $('<div class="btn-group position-absolute bottom-0 end-0">').append(botao_Curtir).append(botao_Excluir);
    const Comentario = $('<li class="list-group-item">').text(comentario_texto).append(botoes).data("data-adicao", new Date());

    if (comentario_texto != "") {
      $("#lista").append(Comentario);
      $("#comentario-textearea").val("");
    }

    let curtidas = 0;
    $(botao_Curtir).click(function () {
      curtidas++;
      $(this).find(".contador").text(curtidas);
    });
  });

  $(document).on("click", ".comentario-botao-excluir", function () {
    const comentarioAExcluir = $(this).closest("li");
    $("#confirmDeleteModal").data("comentario-a-excluir", comentarioAExcluir);
    $("#confirmDeleteModal").modal("show");
  });

  $("#deleteComment").click(function () {
    const comentarioAExcluir = $("#confirmDeleteModal").data(
      "comentario-a-excluir"
    );

    if (comentarioAExcluir) {
      comentarioAExcluir.remove();
    }

    $("#confirmDeleteModal").modal("hide");
  });

  $().click(function () {
    ordenarComentariosCrescente();
  });

  $("").click(function () {
    ordenarComentariosDecrescente();
  });

  $("#ordenar-decrescente").click(function () {
    $("#lista li").sort(numOrdDesc).appendTo("#lista");
  });

  $("#ordenar-crescente").click(function () {
    $("#lista li").sort(numOrdCres).appendTo("#lista");
  });

  function numOrdDesc(a, b) {
    return $(b).val() < $(a).val() ? 1 : -1;
  }

  function numOrdCres(a, b) {
    return $(b).val() > $(a).val() ? 1 : -1;
  }
});
