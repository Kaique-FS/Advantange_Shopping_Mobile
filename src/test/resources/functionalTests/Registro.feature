#language:pt
#coding:utf-8

Funcionalidade: Automação de Cadastro
Descrição: Realização de um cadastro

Contexto:
	Dado usuário em questão está Pagina inicial
	Quando clicar em menu
	E clicar em login
	E clicar em novo usuario
	E inserir o nome de usuario
	E inserir o email
	E inserir a senha
	E inserir a confirmação da senha
	E inserir o primeiro nome
	E inserir o ultimo nome
	E inserir o numero de telefone
	E inserir o pais
	E inserir a cidade
	E inserir o endereço
	E inserir o estado
	E inserir o codigo postal
	E clica em propagandas
	E clica em registrar

@RegistroPositivo
Cenario: Cliente realiza um cadastro no site
	Entao entrar na conta cadastrada

@RegistroNegativo
Cenario: Cliente realiza um cadastro ja existente
	Entao aparece mensagem de usuario ja cadastrado