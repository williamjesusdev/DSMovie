<h1 align="center">Bem vindo ao <u>DSMovie</u> ⚡</h1>

<p align="center"><code>App para avaliação de filmes WEB e responsivo</code></p>

<div align="center">
  <img src="https://img.shields.io/badge/made%20by-William%20Jesus-ff8400"/>
  <img src="https://img.shields.io/github/repo-size/williamjesusdev/dsmovie?color=ff8400"/> 
  <img src="https://img.shields.io/github/languages/count/williamjesusdev/DSMovie?color=ff8400"/>
  <a aria-label="Dia 2 de 4" href="https://devsuperior.com.br/evento-sds?episodio=2">
  <img src="https://img.shields.io/badge/SemanaSpringReact-7.0-ff8400"/>
  </a>
  <img alt="License" src="https://img.shields.io/badge/license-MIT-ff8400"/>
</div>

<div align="center">
  <img src="https://img.shields.io/badge/java-11.0.13-red?logo=java&logoColor=red"/>
  <img src="https://img.shields.io/badge/backend-v0.1.0-red"/>
  <img src="https://img.shields.io/badge/node-16.14.0-green?logo=node.js"/>
  <img src="https://img.shields.io/badge/react-17.0.2-informational?logo=react"/>
  <img src="https://img.shields.io/github/package-json/v/williamjesusdev/dsmovie?color=blue&filename=frontend%2Fpackage.json&label=frontend"/>    
</div>

<img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png">


<p align="center">
  <a href="#-tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-projeto">Projeto</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-layout">Layout</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-deploy">Deploy</a>
</p>
 
<br>

## 💻 Projeto

Projeto desenvolvido durante a Semana Spring React da [DevSuperior] para aprendizado fullstack de spring boot e react no mercado.

- Deploy no [Heroku](https://w-dsmovie-api.herokuapp.com/movies) para o backend e Deploy no [GitHub Pages](https://williamjesusdev.github.io/DSMovie) para o frontend
- Padrão de projeto em camadas
- Padrão de Código
- Criar endpoints API REST
  
<br>

## ☕ Desenvolvimento
Para iniciar o desenvolvimento, é necessário clonar o projeto do GitHub no diretório de sua preferência.

``` powershell
git clone https://github.com/williamjesusdev/DSMovie.git
cd DSMovie/
```
<br>

## 🚀 Execução
Para executar o projeto localmente será necessário verificar as seguintes dependencias.
* [JDK 11: para executar o projeto Java](https://oracle.com/java/technologies/javase-jdk11-downloads.html)
* [Maven 3.8.4: para realizar o build do projeto Java](https://maven.apache.org/download.cgi)
* [PostgreSql: para utilizar o banco de dados](https://postgresql.org/download/)
* [NodeJS LTS: para executar o frontend](https://nodejs.org/en/download/)

Após a instalação e configuração das dependências, executar os comandos.

``` bash
# Na raiz do projeto (FRONTEND)
cd frontend

# Com seu gerenciador favorito (Yarn de preferência)
yarn install | npm install # para instalar as dependências
yarn dev | npm run dev # para iniciar o ambiente DEV

# De volta a raiz do projeto (BACKEND)
cd backend 

# Com maven instalado
mvn spring-boot:run # para iniciar o ambiente DEV
```
``Note: é necessário atualizar o arquivo 'application-dev.properties' com os dados do seu banco de dados.``

<br>

## ✨ Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

- [backend](./backend/)
  - [Java 11](https://docs.oracle.com/en/java/javase/11/)
  - [Maven](https://maven.apache.org/what-is-maven.html)
  - [Spring-boot](https://spring.io/projects/spring-boot)
  
- [frontend](./frontend/)
  - [JavaScript](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript)
  - [TypeScript](https://typescriptlang.org/)
  - [Bootstrap](https://getbootstrap.com.br)
  - [Axios](https://npmjs.com/package/axios)

- [database](./)
  - [Postgresql](https://postgresql.org/download/)
  - [H2 Database](https://h2database.com/html/main.html)

- [ferramentas](./)
  - [Insomnia](https://insomnia.rest/download)

<br>

## 🖼️ Layout

Você pode visualizar o layout do projeto através [desse link](https://www.figma.com/file/hyovBMIxwrn2Bb5MZLrxHL/DSMovie4).

<br>

## 🛸 Deploy

Você pode testar e usar a Aplicação através [desse link](https://dsmovie-pacatovisk.netlify.app/).

<br>

<img src="https://raw.githubusercontent.com/andreasbm/readme/master/assets/lines/solar.png">
<h3 align ="center">Projeto realizado por: <b>William Jesus</b>®</h3>