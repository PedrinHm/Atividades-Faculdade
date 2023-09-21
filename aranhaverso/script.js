const form = document.getElementById("form-inscricao" )

form.addEventListener("submit", function(event){
    const camposObrigatorios =["inscricao-input-text", "inscricao-select", "inscricao-input-email", ]
    var aux = 0;
    camposObrigatorios.map((item)=>{
        const element = document.getElementById(item)
        console.log(element.value)
        if(element.value === "" && aux == 0){
            alert("Campos obrigatorios vazios.")
            aux++
        }
        if(element.value != "" && aux == 0){
            alert("Cadastro realizado!.")
            aux++
        }
        
        
    })
})

const outros = document.getElementById("outros")
const email = document.getElementById("Email")
const redessociais = document.getElementById("Redes-sociais")
const novoinsert = document.getElementById("outros-adicao")

outros.addEventListener("change", function(event){
    if(event.target.value == "on"){
        novoinsert.hidden = false;
    }
})

email.addEventListener("change", function(event){
      
    if(event.target.value == "on"){
        novoinsert.hidden = true;
    }
})

redessociais.addEventListener("change", function(event){
    if(event.target.value == "on"){
        novoinsert.hidden = true;
    }
})

const palesteranteadicao1 = document.getElementById("palestrante1")
const infoadicional1 = document.getElementById("infoadicional1")

const palesteranteadicao2 = document.getElementById("palestrante2")
const infoadicional2 = document.getElementById("infoadicional2")

const palesteranteadicao3 = document.getElementById("palestrante3")
const infoadicional3 = document.getElementById("infoadicional3")

const palesteranteadicao4 = document.getElementById("palestrante4")
const infoadicional4 = document.getElementById("infoadicional4")

const palesteranteadicao5 = document.getElementById("palestrante5")
const infoadicional5 = document.getElementById("infoadicional5")

const palesteranteadicao6 = document.getElementById("palestrante6")
const infoadicional6 = document.getElementById("infoadicional6")


function infoAdicionalPalestrante(element) {
    if (element.hidden) {
        element.hidden = false;
    } else {
        element.hidden = true; 
    }
}


palestrante1.addEventListener('click', function() {
    infoAdicionalPalestrante(infoadicional1); 
});

palestrante2.addEventListener('click', function() {
    infoAdicionalPalestrante(infoadicional2); 
});

palestrante3.addEventListener('click', function() {
    infoAdicionalPalestrante(infoadicional3); 
});

palestrante4.addEventListener('click', function() {
    infoAdicionalPalestrante(infoadicional4); 
});

palestrante5.addEventListener('click', function() {
    infoAdicionalPalestrante(infoadicional5);
});

palestrante6.addEventListener('click', function() {
    infoAdicionalPalestrante(infoadicional6); 
});

const programacaotableitem0 = document.getElementById('programacao-table-item0');
const programacaotableitem1 = document.getElementById('programacao-table-item1');
const programacaotableitem2 = document.getElementById('programacao-table-item2');
const programacaotableitem3 = document.getElementById('programacao-table-item3');
const programacaotableitem4 = document.getElementById('programacao-table-item4');
const programacaotableitem5 = document.getElementById('programacao-table-item5');
const programacaotableitem6 = document.getElementById('programacao-table-item6');

function mouseEmCima(element, color) {
    element.style.backgroundColor = color;
}

function mouseFora(element) {
    element.style.backgroundColor = "var(--bg1)";
}

programacaotableitem0.addEventListener("mouseover", function () {
    mouseEmCima(programacaotableitem0, "var(--card0)");
});

programacaotableitem0.addEventListener("mouseout", function () {
    mouseFora(programacaotableitem0, "var(--card0)");
});

programacaotableitem1.addEventListener("mouseover", function () {
    mouseEmCima(programacaotableitem1, "var(--card1)");
});

programacaotableitem1.addEventListener("mouseout", function () {
    mouseFora(programacaotableitem1, "var(--card1)");
});

programacaotableitem2.addEventListener("mouseover", function () {
    mouseEmCima(programacaotableitem2, "var(--card2)");
});

programacaotableitem2.addEventListener("mouseout", function () {
    mouseFora(programacaotableitem2, "var(--card2)");
});

programacaotableitem3.addEventListener("mouseover", function () {
    mouseEmCima(programacaotableitem3, "var(--card3");
});

programacaotableitem3.addEventListener("mouseout", function () {
    mouseFora(programacaotableitem3, "var(--card3)");
});

programacaotableitem4.addEventListener("mouseover", function () {
    mouseEmCima(programacaotableitem4, "var(--card4)");
});

programacaotableitem4.addEventListener("mouseout", function () {
    mouseFora(programacaotableitem4, "var(--card4)");
});

programacaotableitem5.addEventListener("mouseover", function () {
    mouseEmCima(programacaotableitem5, "var(--card5)");
});

programacaotableitem5.addEventListener("mouseout", function () {
    mouseFora(programacaotableitem5, "var(--card5)");
});

programacaotableitem6.addEventListener("mouseover", function () {
    mouseEmCima(programacaotableitem6, "var(--card6");
});

programacaotableitem6.addEventListener("mouseout", function () {
    mouseFora(programacaotableitem6, "var(--card6)");
});

var inscricao = document.getElementById("inscricao");

form.addEventListener(
  "focus",
  function (event) {
    event.target.style.background = "#D5F4E2";
  },
  true,
);
form.addEventListener(
  "blur",
  function (event) {
    event.target.style.background = "";
  },
  true,
);

const botao = document.querySelector("#botao-modo")
const app = document.querySelector("html")

botao.addEventListener("click", function () {
    app.classList.toggle("temaEscuro")
})