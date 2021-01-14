# Projeto DS Delivery  
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/mrraxa01/dsdeliver-sds2/blob/main/LICENSE) 

# Sobre o projeto

DS Delivery é uma aplicação FULLSTACK - WEB e MOBILE  de pedidos e entrega desenvolvida durante a 2ª edição da **"Semana DevSuperior"**,
organizado pela [DevSuperior](https://devsuperior.com.br "Site da DevSuperior").
A aplicação WEB atende a "visão do cliente" com sistema de pedidos, já a versão MOBILE oferece ao entregador uma lista de pedidos realizados para entrega, incluindo sistema de navegação.

O projeto DS Delivery pode ser conferido no link:

https://mrraxa-sds2.netlify.app/

**Importante: Devido a política do Heroku o sistema não usado fica desativado, então a primeira carga das imagens pode levar cerca de 60 segundos.**

# Modelo Conceitual e Padrão de Camadas

![Modelo Conceitual](https://github.com/mrraxa01/dsdeliver-sds2/blob/main/assets/modelo-conceitual.png)

![camadas](https://github.com/mrraxa01/dsdeliver-sds2/blob/main/assets/camadas.png)

# Layout

### WEB

#### Página Principal

![web1](https://github.com/mrraxa01/dsdeliver-sds2/blob/main/assets/tela_web1.png)

#### Página de pedidos e mapa

![web2](https://github.com/mrraxa01/dsdeliver-sds2/blob/main/assets/tela_web2.png)

### MOBILE
#### Tela inicial
![mob1](https://github.com/mrraxa01/dsdeliver-sds2/blob/main/assets/Mobile%20P1.png)

#### Listagem de pedidos
![mob2](https://github.com/mrraxa01/dsdeliver-sds2/blob/main/assets/Mobile%20P2.png)

#### Detalhes do Pedido e opções de interação
![mob3](https://github.com/mrraxa01/dsdeliver-sds2/blob/main/assets/Mobile%20P3.png)


# Tecnologias utilizadas
## Backend
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Frontend
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
- MapBox

## Implantação
- Backend: Heroku 
- Frontend-web: Netlify 
- Banco de dados: PostgreSQL

# Como executar o projeto

## Ferramentas que você deverá instalar no seu computador:
Pré-requisitos: 
- JDK 11
-	STS
-	Postman
- Postgresql 12 e pgAdmin
- Heroku CLI
- npm / yarn
- git ou Github desktop
- VS code

## Backend

```bash
# clonar repositório
git clone https://github.com/mrraxa01/dsdeliver-sds2

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Frontend-web

```bash
# clonar repositório
git clone https://github.com/mrraxa01/dsdeliver-sds2

# entrar na pasta do projeto front end web
cd front-web

# instalar dependências
yarn install

# executar o projeto
yarn start

```
# Autor
**Márcio Rodrigues Rezende**
mrraxa01@gmail.com
