#language: pt
#enconding: UTF-8
#author: José Cristiano

Funcionalidade: login
  Com essa Funcionalidade iremos conseguir realizar
  o login na aplicação com usuário já cadastrado.

  Como um usuário já cadastrado na aplicação
  Eu quero inserir os meus dados cadastrais
  Para conseguir realizar o login na aplicação

  Contexto: entrar na tela de login
    Dado estiver na tela de login

  Cenario: Validar o login na aplicação
    Quando inserir os dados do usuário "mentoria_etech@dev.com"
    Então deve visualizar o nome "José Cristiano"

  Esquema do Cenario: Validar o login na aplicação
    Quando inserir os dados do usuário <dados_usuarios>
    Então deve visualizar a mensagem de erro "Authentication failed."

    Exemplos:
      | dados_usuarios  |
      | email_incorreto |
      | senha_incorreta |