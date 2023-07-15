#language: pt
#enconding: UTF-8
#author: José Cristiano
@login
Funcionalidade: login
  Com essa Funcionalidade iremos conseguir realizar
  o login na aplicação com usuário já cadastrado.

  Como um usuário já cadastrado na aplicação
  Eu quero inserir os meus dados cadastrais
  Para conseguir realizar o login na aplicação

  Contexto: entrar na tela de login
    Dado estiver na tela de login

  @loginAplicacao
  Cenario: Validar o login na aplicação
    Quando inserir os dados do usuário
      | email                | senha     |
      | tstlinux.c@gmail.com | 123456789 |
    Então deve visualizar o nome "José Cristiano da Silva Lucena"

  Esquema do Cenario: Validar a mensagem de erro ao inserir dados incorretos
    Quando inserir os dados do usuário
      | email            | senha   |
      | <dados_usuarios> | <senha> |
    Então deve visualizar a mensagem de erro "Authentication failed."

    Exemplos:
      | dados_usuarios         | senha    |
      | tttttlinux.c@gmail.com | teste145 |
      | tstlinux.c@gmail.com   | teste544 |