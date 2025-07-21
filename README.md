# Workshop SpringBoot JPA

Projeto de exemplo utilizando Spring Boot com JPA (Hibernate) para gerenciamento de usuários, pedidos, produtos e categorias, com banco de dados relacional.

---

## 📋 Descrição

API RESTful desenvolvida com Spring Boot que implementa um sistema básico de e-commerce com funcionalidades como:

- Gestão de usuários  
- Gestão de pedidos  
- Gestão de produtos  
- Gestão de categorias  
- Pagamentos vinculados a pedidos  
- Relacionamentos entre entidades (um-para-muitos, muitos-para-muitos, etc)  
- Tratamento personalizado de exceções  
- Configuração para ambiente de teste com dados populados automaticamente  

---

## 🚀 Tecnologias utilizadas

- Java 17+  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- Banco de dados relacional (configurável, ex: MySQL, H2)  
- Jackson para JSON  
- Maven  
- Jakarta Persistence API (JPA)  

---

## 📂 Estrutura do projeto
``` text
src
├── main
│ ├── java
│ │ └── com.estudospring.course
│ │ ├── config # Configuração para testes (popula banco)
│ │ ├── entities # Entidades JPA (User, Order, Product, Category, Payment, etc)
│ │ ├── entities.enums # Enumerações (ex: OrderStatus)
│ │ ├── entities.pk # Classes para chaves compostas (ex: OrderItemPK)
│ │ ├── repositories # Interfaces JpaRepository para acesso ao BD
│ │ ├── resources # Controllers REST
│ │ ├── services # Serviços de negócio
│ │ ├── services.exceptions # Exceções personalizadas (ResourceNotFound, DatabaseException)
│ │ └── resources.exceptions # Manipulador de exceções REST (StandardError)
│ └── resources
│ └── application.properties # Configurações do Spring Boot e BD
```

---

## 📦 Funcionalidades disponíveis

### Usuários (`/users`)

- `GET /users` — lista todos os usuários  
- `GET /users/{id}` — busca usuário por id  
- `POST /users` — cria novo usuário  
- `PUT /users/{id}` — atualiza dados de um usuário  
- `DELETE /users/{id}` — deleta usuário  

### Categorias (`/categories`)

- `GET /categories` — lista todas as categorias  
- `GET /categories/{id}` — busca categoria por id  

### Produtos (`/products`)

- `GET /products` — lista todos os produtos  
- `GET /products/{id}` — busca produto por id  

### Pedidos (`/orders`)

- `GET /orders` — lista todos os pedidos  
- `GET /orders/{id}` — busca pedido por id  

---

## 💾 População inicial de dados

No perfil `test`, o projeto já possui uma classe de configuração (`TestConfig`) que insere dados de exemplo no banco, como:

- Categorias: Eletrônicos, Livros, Computadores  
- Produtos: TV, Macbook, Lord of the Rings, PC Gamer, Rails for Dummies  
- Usuários e pedidos com status variados  
- Itens de pedidos  
- Pagamentos associados  

---

## 🛠️ Instruções para rodar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/workshop-springboot-jpa.git
cd workshop-springboot-jpa
```

2. Configure o banco de dados no application.properties conforme sua necessidade (MySQL, H2 etc).

3. Execute a aplicação:

```bash
./mvnw spring-boot:run
```

ou

```bash
mvn spring-boot:run
```

4. Teste os endpoints via Postman, Insomnia, curl, ou navegador

## 🔧 Exemplos de Requisições
Usuários
- Listar todos usuários
```http
GET /users
Host: localhost:8080
```
- Buscar usuário por ID
```http
GET /users/1 
Host: localhost:8080
```
- Criar um novo usuário
```http
POST /users 
Host: localhost:8080
Content-Type: application/json
```
```json
{
  "name": "João Silva",
  "email": "joao.silva@example.com",
  "phone": "999999999",
  "password": "123456"
}
```
- Atualizar usuário
```http
PUT /users/1 
Host: localhost:8080
Content-Type: application/json
```
```json
{
  "name": "João Silva Atualizado",
  "email": "joao.silva@example.com",
  "phone": "988888888",
  "password": "123456"
}
```
- Deletar usuário
```http
DELETE /users/1 
Host: localhost:8080
```
## Categorias 

- Listar todas as categorias

```http
GET /categories 
Host: localhost:8080
```

- Buscar categoria por ID

```http
GET /categories/2 
Host: localhost:8080
```

## Produtos

- Listar todos os produtos
```http
GET /products 
Host: localhost:8080
```
- Buscar produto por ID

```http
GET /products/3 HTTP/1.1
Host: localhost:8080
```

## Pedidos

- Listar todos os pedidos
```http
GET /orders HTTP/1.1
Host: localhost:8080
```

- Buscar pedido por ID

```http
GET /orders/5 HTTP/1.1
Host: localhost:8080
```
## Tratamento de Erros

Quando um recurso não é encontrado, a API retorna uma resposta JSON com detalhes do erro:

```json
{
  "timestamp": "2025-07-21T15:34:12Z",
  "status": 404,
  "error": "Resource not found",
  "message": "Resource with id 123 not found",
  "path": "/users/123"
}
```

## 📄 Licença

Projeto aberto sob licença MIT — consulte o arquivo LICENSE para detalhes.



