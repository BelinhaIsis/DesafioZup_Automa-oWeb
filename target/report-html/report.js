$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/DesafioAutomacaoHistoria.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 2,
  "name": "Adicionar produto no carrinho de compras",
  "description": "\nComo usuário\nEu quero pesquisar produtos\nPara adicionar no meu carrinho de compras.",
  "id": "adicionar-produto-no-carrinho-de-compras",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Adicionar um produto no carrinho",
  "description": "",
  "id": "adicionar-produto-no-carrinho-de-compras;adicionar-um-produto-no-carrinho",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 9,
  "name": "que estou no site da Nagem",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "faco a busca do produto \"Mouse Multilaser USB Classic Box Preto MO179\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "escolho um produto na lista",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "adiciono no carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "meu carrinho devera ter um só produto",
  "keyword": "Então "
});
formatter.match({
  "location": "DesafioAutomacaoSteps2.que_estou_no_site_da_Nagem()"
});
formatter.result({
  "duration": 19651984800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mouse Multilaser USB Classic Box Preto MO179",
      "offset": 25
    }
  ],
  "location": "DesafioAutomacaoSteps2.faco_a_busca_do_produto(String)"
});
formatter.result({
  "duration": 7780018200,
  "status": "passed"
});
formatter.match({
  "location": "DesafioAutomacaoSteps2.escolho_um_produto_na_lista()"
});
formatter.result({
  "duration": 992255300,
  "status": "passed"
});
formatter.match({
  "location": "DesafioAutomacaoSteps2.adiciono_no_carrinho()"
});
formatter.result({
  "duration": 1527069600,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "Adicionar dois produtos no carrinho",
  "description": "",
  "id": "adicionar-produto-no-carrinho-de-compras;adicionar-dois-produtos-no-carrinho",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 16,
  "name": "que estou no site da Nagem",
  "keyword": "Dado "
});
formatter.step({
  "line": 17,
  "name": "faco a busca por mais um produto \"Teclado Sem Fio p/ PS3\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 18,
  "name": "escolho produtos na lista",
  "keyword": "E "
});
formatter.step({
  "line": 19,
  "name": "adicionos no carrinho",
  "keyword": "E "
});
formatter.step({
  "line": 20,
  "name": "meu carrinho devera ter dois produtos",
  "keyword": "Então "
});
formatter.match({
  "location": "DesafioAutomacaoSteps2.que_estou_no_site_da_Nagem()"
});
