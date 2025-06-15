
# 📌 Projeto: Concorrência, Threads e Performance com Spring Boot e Java

## 🎓 O que eu aprendi

Durante o desenvolvimento deste projeto, eu aprendi os seguintes conceitos e práticas importantes para o desenvolvimento Java e Spring Boot:

- Como criar e gerenciar **threads** em Java puro.
- A importância de **sincronizar recursos compartilhados** para evitar condições de corrida.
- Como realizar **testes de carga** simulando múltiplas requisições com o Postman.
- As limitações do uso de `synchronized` dentro de aplicações Spring Boot.
- Como implementar **locks a nível de banco de dados**, utilizando tanto o **lock pessimista** quanto o **lock otimista** com a anotação `@Version`.
- Como utilizar o **@Async** no Spring Boot para criar métodos assíncronos.
- A configuração de um **Thread Pool Executor** personalizado no Spring para controlar melhor o número de threads.
- Como realizar **agendamentos de tarefas** utilizando a anotação `@Scheduled`, incluindo o uso de expressões cron.
- Os conceitos de **arquitetura não bloqueante** para melhorar a experiência do usuário.
- O uso do **CompletableFuture** para realizar tarefas assíncronas com retorno de resultado.
- Como trabalhar com o **ExecutorService** para criar e gerenciar várias threads de forma eficiente.
- Os impactos da criação de muitas threads no sistema, através de **testes de stress**.
- Como utilizar o **try-with-resources** para uma gestão mais segura e limpa de recursos como executores.
- A configuração e os benefícios das **threads virtuais (Project Loom)** no Spring Boot.
- Como configurar o **envio de e-mails reais usando Gmail SMTP** dentro de uma aplicação Spring.

Este projeto reforçou a minha compreensão sobre **concorrência**, **performance**, **assincronismo** e **resiliência de aplicações backend**.

## 🧵 Principais Conceitos Abordados

### ✅ Concorrência e Threads no Java Tradicional
- **Problema inicial:** Um código sequencial não consegue representar corretamente ações paralelas (ex: múltiplos saques em uma conta bancária).
- **Solução:** Uso de **Threads** para simular ações concorrentes.
- **Ferramentas:**  
  - **`Runnable`** para execução de tarefas.
  - **`Thread.start()`** para iniciar múltiplas threads.
  - **`join()`** para controlar a ordem de execução.

### ✅ Controle de Acesso a Recursos Compartilhados
- **Problema:** Erros inesperados por acesso simultâneo ao mesmo recurso (ex: saldo negativo).
- **Solução:** Uso de **locks com `synchronized`**.
- **Destaques:**
  - Bloqueio de acesso a recursos compartilhados.
  - Controle de concorrência manual.
  - Limitações do `synchronized` em ambientes Spring Boot.

### ✅ Teste de Concorrência com Postman (Load Testing)
- **Simulação de requisições simultâneas:** Configuração de múltiplos usuários virtuais.
- **Objetivo:** Observar o comportamento da aplicação sob carga real de usuários.

### ✅ Concorrência no Spring Boot
- **Problema:** O Spring gerencia o próprio pool de threads, o que limita o efeito do `synchronized`.
- **Soluções Spring-friendly:**
  - Uso de **locks no banco de dados (lock pessimista/otimista)**.
  - Uso de **`@Version` (lock otimista com controle de versão de entidade JPA)**.

### ✅ Assincronismo com Spring Boot
- **`@Async`:** Criação de threads assíncronas controladas pelo Spring.
- **Configuração:**
  - Habilitar o **async** na aplicação.
  - Criar um **Executor personalizado (Thread Pool Executor)**.
  - Configurar limites de threads no pool.

### ✅ Agendamento de Tarefas
- **`@Scheduled`:** Execução de tarefas periódicas (ex: envio de e-mails, geração de relatórios).
- **Configurações:**
  - Ativação do agendamento na classe principal.
  - Uso de expressões cron.

### ✅ Melhorando Experiência do Usuário
- **Arquitetura não bloqueante:**  
  Responder rápido ao usuário enquanto o processamento ocorre em background.

### ✅ Trabalhando com `CompletableFuture`
- **Quando utilizar:** Quando é necessário um **retorno futuro** de uma thread.
- **Recursos usados:**
  - **`CompletableFuture.supplyAsync()`**
  - **`.join()`**
  - **Boas práticas de combinação e encadeamento de tarefas assíncronas.**

### ✅ ExecutorService
- **Criação de muitas threads de forma controlada:**
  - Uso de **`ExecutorService`**.
  - **`execute()`** para disparo de tarefas.
  - Uso de **try-with-resources** com **Executors** para facilitar o fechamento e tratamento de exceções.

### ✅ Teste de Limite do Sistema
- **Simulação de Stress:**
  - Criação massiva de threads.
  - Verificar limite da máquina.
  - Entendimento de problemas típicos de servidores sobrecarregados.

### ✅ Threads Virtuais (Java 21+ / Spring Boot 3.x)
- **Configuração:**  
  Uso de **threads virtuais (Project Loom)** via configuração no `application.properties`.
- **Benefícios:**  
  Permite maior escalabilidade com menor custo de recursos.

## 📬 Integração com Gmail
- **Configuração para envio real de e-mails:**
  - Integração com Gmail SMTP.
  - Configurações de segurança necessárias.

## 📂 Estrutura do Projeto

```
src
├── main
│   ├── java
│   │   └── ... (código fonte)
│   └── resources
│       └── application.properties
└── test
    └── java
```

## 🚀 Tecnologias Utilizadas
- Java 17+
- Spring Boot 3.x
- Maven
- Postman (para teste de carga)
- Banco de Dados (H2 ou outro de sua escolha)

## ✅ Requisitos para Rodar
- Postman (opcional para testes de carga)

## 📌 Conclusão

Este projeto é um guia prático para quem deseja aprender sobre **controle de concorrência**, **execução assíncrona**, **locks**, **agendamento de tarefas** e **melhoria de performance** em aplicações Java com Spring Boot.
