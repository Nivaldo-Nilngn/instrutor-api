
# Instrutor API

## Descrição

A **Instrutor API** é uma aplicação desenvolvida com Spring Boot que permite o gerenciamento de instrutores em uma instituição de ensino. A API facilita a consulta e manipulação de dados relacionados a instrutores, oferecendo endpoints RESTful para integração com outras aplicações.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação.
- **Spring Boot 3.3.4**: Framework para construção de aplicações Java.
- **Spring Data JPA**: Para gerenciamento de dados e acesso ao banco de dados.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Springdoc OpenAPI**: Para documentação automática da API utilizando Swagger.
  
## Funcionalidades

- Listar todos os instrutores cadastrados.
- Documentação da API acessível via Swagger UI.
- Suporte a OpenAPI 3.

### Listar Instrutores

- **GET** `/instrutores`

  Retorna uma lista de todos os instrutores cadastrados.

  **Exemplo de Resposta:**
  ```json
  [
      {
          "id": 1,
          "nome": "Maria Silva",
          "area": "Desenvolvimento Frontend",
          "experiencia": "5 anos"
      },
      {
          "id": 2,
          "nome": "João Pereira",
          "area": "Desenvolvimento Backend",
          "experiencia": "3 anos"
      }
  ]

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.4**
- **Springdoc OpenAPI**
- **H2 Database** (para persistência em memória)
- **Maven** (para gerenciamento de dependências)

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src/main/java/com/nivaldo/instrutorapi/controller` - Controladores da API.
- `src/main/resources` - Configurações e propriedades da aplicação.
- `pom.xml` - Configuração do Maven e dependências do projeto.

## Como Executar o Projeto

Clone o repositório:

```bash
git clone https://github.com/seuusuario/instrutor-api.git
cd instrutor-api
```

Compile e execute a aplicação:

```bash
mvn spring-boot:run
```

Acesse a documentação da API:

- **Swagger UI**: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- **OpenAPI JSON**: [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.
