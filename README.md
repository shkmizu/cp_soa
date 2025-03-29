# fiap-checkpoint1

## 📌 Sobre o Projeto
Este projeto foi desenvolvido como parte do checkpoint da disciplina de **Arquitetura Orientada a Serviços (SOA)** na FIAP. A aplicação consiste em uma API REST utilizando **Spring Boot** para cadastrar e gerenciar pedidos de clientes.

## 🎯 Objetivo
O objetivo deste projeto é aplicar os conceitos de **desenvolvimento de API com Spring Boot** e **arquitetura orientada a serviços**, permitindo operações básicas de CRUD sobre a entidade **Pedido**.

## 👥 Integrantes
- **Vitor Shimizu Farias de Campos RM550390**
- **Leonardo de Oliveira Ruiz RM98901**

---

## 🚀 Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.1**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database**
- **Lombok**
- **Spring Boot DevTools**

## 🛠 Estrutura do Projeto
A API segue a estrutura abaixo:
```
src/main/java/br/com/fiap/checkpoint1:
├── controller  // Responsável pelos endpoints REST
├── model       // Representação dos dados (Entidades)
├── repository  // Interface para interação com o banco de dados
├── service     // Contém as regras de negócio
```

## 📦 Configuração do Banco de Dados
O projeto utiliza **H2 Database** como banco de dados em memória. O console pode ser acessado via:
- **URL:** `http://localhost:8080/h2-console`
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Usuário:** `sa`
- **Senha:** *(em branco)*

---

## 🔧 Como Executar o Projeto
### **Pré-requisitos**
- Java 17 instalado
- Maven instalado

### **Passo a passo**
1. Clone o repositório:
   ```sh
   git clone https://github.com/seu-usuario/fiap-checkpoint1.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd fiap-checkpoint1
   ```
3. Execute o projeto via **Maven**:
   ```sh
   mvn spring-boot:run
   ```
4. A API estará disponível em:
   ```
   http://localhost:8080
   ```

---

## 🛠 Endpoints da API
A API expõe os seguintes endpoints:

### 📌 **Criar um novo pedido**
- **Método:** `POST /pedidos`
- **Exemplo de Request (JSON):**
  ```json
  {
    "clienteNome": "João Silva",
    "valorTotal": 150.00
  }
  ```
- **Resposta Esperada:**
  ```json
  {
    "id": 1,
    "clienteNome": "João Silva",
    "dataPedido": "2024-03-28",
    "valorTotal": 150.00
  }
  ```

### 📌 **Buscar todos os pedidos**
- **Método:** `GET /pedidos`
- **Resposta Esperada:**
  ```json
  [
    {
      "id": 1,
      "clienteNome": "João Silva",
      "dataPedido": "2024-03-28",
      "valorTotal": 150.00
    }
  ]
  ```

### 📌 **Buscar um pedido pelo ID**
- **Método:** `GET /pedidos/{id}`
- **Resposta Esperada:**
  ```json
  {
    "id": 1,
    "clienteNome": "João Silva",
    "dataPedido": "2024-03-28",
    "valorTotal": 150.00
  }
  ```

### 📌 **Atualizar um pedido**
- **Método:** `PUT /pedidos/{id}`
- **Exemplo de Request (JSON):**
  ```json
  {
    "clienteNome": "Maria Oliveira",
    "valorTotal": 200.00
  }
  ```
- **Resposta Esperada:**
  ```json
  {
    "id": 1,
    "clienteNome": "Maria Oliveira",
    "dataPedido": "2024-03-28",
    "valorTotal": 200.00
  }
  ```

### 📌 **Deletar um pedido**
- **Método:** `DELETE /pedidos/{id}`
- **Resposta Esperada:** `204 No Content`

---

## 📸 Testes no Postman
Aqui estão os prints dos testes realizados no **Postman**:
1. **Criar um novo pedido**
   - 📷 *[Print 1]*
2. **Buscar todos os pedidos**
   - 📷 *[Print 2]*
3. **Buscar um pedido pelo ID**
   - 📷 *[Print 3]*
4. **Atualizar um pedido**
   - 📷 *[Print 4]*
5. **Deletar um pedido**
   - 📷 *[Print 5]*

_(Insira as imagens dos testes realizados no Postman)_

---
