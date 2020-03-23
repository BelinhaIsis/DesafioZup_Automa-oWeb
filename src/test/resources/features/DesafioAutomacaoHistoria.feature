#language: pt
Funcionalidade: Adicionar produto no carrinho de compras

Como usuário
Eu quero pesquisar produtos
Para adicionar no meu carrinho de compras.

Cenário: Adicionar um produto no carrinho
Dado que estou no site da Nagem
Quando faco a busca do produto "Mouse Multilaser USB Classic Box Preto MO179"
E escolho um produto na lista
E adiciono no carrinho
Então meu carrinho devera ter um só produto

Cenário: Adicionar dois produtos no carrinho
Dado que estou no site da Nagem
Quando faco a busca por mais um produto "Teclado Sem Fio p/ PS3"
E escolho produtos na lista
E adicionos no carrinho
Então meu carrinho devera ter dois produtos     

Cenário: Remover um produto
Dado que estou no meu carrinho de compra
Quando removo um produto
Então meu carrinho devera ter um só produto 
