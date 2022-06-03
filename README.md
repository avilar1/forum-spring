# forum-spring
Aplicação em Java usando Spring framework. Trata-se de uma API-REST

## Apresentação

Trata-se de uma aplicação usando JAVA que se utiliza de um banco de dados, controllers, Modells, Repositories etc, fazendo a comunicação também com banco de dados, incluindo modelo de segurança com autenticação quanto aos requests da API.

A entrega das requisições e também as solicitações são validadas e o  recebimento e resposta é feito em JSON


## Conteúdo da aplicação

- config.security
>configuração quanto a segurança da aplicação
- config.validacao
>configurações de validações
- controller
> inclui tanto os refertentes a autenticação quando o CRUD da aplicação, mapeados com os verbos da requisição da API
- DTO
> Fazem as respostas das entidades, criando uma ponte entre os controllers e as entidades entregando apenas o necessário dessas
- form
> são as DTOs mas para inclusão e atualização
- modelo
> as entidades em classes no modelo Java
- repository
> fazem a ligação com o banco de dados usando JPA, permitem que seja possível usar as namedQueys da interface `JpaRepository`. a injeção de dependência é facilitada pelo Spring nas controllers.

- package de testes
> testes que validam usando Junit
-arquivos de configuração
>pom.xml, properties e dockerfile


## Status
<img src="https://img.shields.io/badge/%E2%9C%93-primeira%20etapa-green">
