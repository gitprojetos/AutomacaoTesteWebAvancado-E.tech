#language: pt
#enconding: UTF-8
#author: José Cristiano
#date: 14/07/2023
#version: 1.0

Funcionalidade: Filtro de produtos
  Com essa Funcionalidade iremos ter uma lista de opções para filtrar produtos

  Com um usuário
  Eu desejo ter a possibilidade de filtrar produtos
  Para visualizar somente produtos que desejo
@opçoes_filtro
  Cenario: Validar as opções de filtros
    Dado estiver na tela home
    E selecionar o submenu "Women"
    Quando clicar no filtro de roupas
    Então deve visualizar as opções de filtros
      | Price: Lowest first      |
      | Price: Highest first     |
      | Product Name: A to Z     |
      | Product Name: Z to A     |
      | In stock                 |
      | Reference: Lowest first  |
      | Reference: Highest first |