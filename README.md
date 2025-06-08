
# Adopet Store - Aula 05

Este projeto é uma simulação de uma loja de adoção de pets desenvolvida com **Spring Boot**. Ele faz parte de uma atividade prática (Aula 05) e explora conceitos como **controllers REST**, **configuração assíncrona** e estruturação de aplicações com o **Spring Framework**.

## 🚀 Tecnologias Utilizadas

- Java 17+ (ou compatível)
- Spring Boot
- Spring Web
- Spring Async
- Maven

## 📁 Estrutura do Projeto

```
adopet-store/
├── pom.xml
├── mvnw / mvnw.cmd
├── .mvn/
│   └── wrapper/
├── src/
│   └── main/
│       └── java/
│           └── br/com/alura/adopetstore/
│               ├── AdopetStoreApplication.java
│               ├── configuration/AsyncConfiguration.java
│               ├── controller/
│               │   ├── EstoqueController.java
│               │   └── LoginController.java
│               └── model/
│                   ├── Produto.java
│                   └── Usuario.java
│       └── resources/
│           └── application.properties
```

## 📌 Funcionalidades

- **LoginController**: Simula a autenticação de usuários.
- **EstoqueController**: Gerencia o estoque de produtos disponíveis para adoção.
- **AsyncConfiguration**: Habilita e configura tarefas assíncronas com `@EnableAsync`.

## ▶️ Como Executar

1. Clone ou extraia o projeto.
2. Navegue até o diretório `adopet-store`.
3. Execute o comando:

```bash
./mvnw spring-boot:run
```

Ou, se estiver no Windows:

```bash
mvnw.cmd spring-boot:run
```

4. Acesse `http://localhost:8080` para utilizar a API.

## 📘 Aprendizados

- Estruturação de APIs REST com Spring Boot
- Configuração e uso de métodos assíncronos com `@Async`
- Gerenciamento de dependências com Maven

## 🧑‍💻 Autor

Projeto educacional baseado em conteúdo da [Alura](https://www.alura.com.br/), adaptado para fins de aprendizado na Aula 05.
