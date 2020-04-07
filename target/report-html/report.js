$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/DesafioAutomacaoHistoria.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
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
  "name": "meu carrinho devera ter um são produto",
  "keyword": "Então "
});
formatter.match({
  "location": "DesafioAutomacaoSteps2.que_estou_no_site_da_Nagem()"
});
formatter.result({
  "duration": 21616070200,
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
  "duration": 6591490400,
  "status": "passed"
});
formatter.match({
  "location": "DesafioAutomacaoSteps2.escolho_um_produto_na_lista()"
});
formatter.result({
  "duration": 1174241500,
  "status": "passed"
});
formatter.match({
  "location": "DesafioAutomacaoSteps2.adiciono_no_carrinho()"
});
formatter.result({
  "duration": 1703126500,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "comments": [
    {
      "line": 14,
      "value": "#@ignore"
    },
    {
      "line": 15,
      "value": "#Cenário: Adicionar dois produtos no carrinho"
    },
    {
      "line": 16,
      "value": "#Dado que estou no site da Nagem"
    },
    {
      "line": 17,
      "value": "#Quando faco a busca por mais um produto \"Teclado Sem Fio p/ PS3\""
    },
    {
      "line": 18,
      "value": "#E escolho produtos na lista"
    },
    {
      "line": 19,
      "value": "#E adiciono no carrinho"
    },
    {
      "line": 20,
      "value": "#Então meu carrinho devera ter dois produtos"
    }
  ],
  "line": 22,
  "name": "Remover um produto",
  "description": "",
  "id": "adicionar-produto-no-carrinho-de-compras;remover-um-produto",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 23,
  "name": "que estou no meu carrinho de compra",
  "keyword": "Dado "
});
formatter.step({
  "line": 24,
  "name": "removo um produto",
  "keyword": "Quando "
});
formatter.step({
  "line": 25,
  "name": "meu carrinho devera ter um são produto",
  "keyword": "Então "
});
formatter.match({
  "location": "DesafioAutomacaoSteps2.que_estou_no_meu_carrinho_de_compra()"
});
formatter.result({
  "duration": 9561842100,
  "status": "passed"
});
formatter.match({
  "location": "DesafioAutomacaoSteps2.removo_um_produto()"
});
