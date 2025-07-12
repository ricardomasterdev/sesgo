# 💻 Projeto Java Algoritmos — SES

Repositório público para estudo e implementação de exercícios de algoritmos em **Java** com uso de **JUnit**, **Spring Boot** e conceitos modernos de estruturação de código.

📂 Repositório público: [https://github.com/ricardomasterdev/sesgo](https://github.com/ricardomasterdev/sesgo)

---

## 🧰 Tecnologias Utilizadas

- 💡 **Java SDK**: `1.8` (compatível com projetos modernos e testes JUnit 4)
- ⚙️ **Maven**: gerenciamento de dependências
- 🧪 **JUnit 4.13.2**: para testes unitários
- 🌐 **Spring Boot 3.2.5**: para APIs REST (exercícios posteriores)
- 🖥️ **IDE**: IntelliJ IDEA 2022.2.5
- 🔧 **Java Compiler**: também testado com OpenJDK 24.0.1

---

## ✅ Questão 1 — CacheLRU (Least Recently Used)

### 📋 Enunciado Resumido

> Implemente uma classe `CacheLRU<K, V>` com política de remoção do tipo LRU.  
> A cache deve permitir adicionar (`put`), acessar (`get`), remover (`remove`) e consultar o tamanho atual (`size`).  
> Quando atingir o limite de capacidade, o item **menos recentemente usado** deve ser automaticamente removido.

---

### 🗂️ Estrutura de Pastas

| Caminho | Descrição |
|--------|-----------|
| `src/main/java/com/ricardomasterdev/cache/CacheLRU.java` | Classe da cache com política LRU |
| `src/test/java/com/ricardomasterdev/cache/CacheLRUTest.java` | Testes unitários com JUnit para validar a funcionalidade da cache |

---

### ▶️ Como Executar os Testes

1. Abra o projeto no **IntelliJ IDEA 2022.2.5**
2. Verifique se o SDK está definido como **Java 1.8**
3. Abra o arquivo de teste:
   `src/test/java/com/ricardomasterdev/cache/CacheLRUTest.java`
4. Clique com o botão direito na classe e selecione:
   `Run 'CacheLRUTest'`
5. Os testes JUnit serão executados e os resultados aparecerão no painel inferior do IntelliJ.

✅ Todos os testes devem passar, validando os métodos:
- `put()`
- `get()`
- `remove()`
- `size()`
- Comportamento de **remoção automática LRU**

---

## ✅ Questão 2 — Manipulação de Arquivos

### 📋 Enunciado Resumido

> Ler um arquivo texto chamado `input.txt`, remover todas as linhas em branco,  
> e gravar o conteúdo restante em um novo arquivo chamado `output.txt`.

---

### 🗂️ Estrutura de Pastas

| Caminho | Descrição |
|--------|-----------|
| `src/main/java/com/ricardomasterdev/arquivos/RemoverLinhasEmBranco.java` | Classe principal que executa a leitura, filtragem e escrita dos arquivos |
| `src/main/test/java/com/ricardomasterdev/arquivos/TestRemoverLinhas.java` | Classe auxiliar para execução manual do processamento |

---

### ▶️ Como Executar o Exercício

1. Crie um arquivo chamado `input.txt` na raiz do projeto (mesmo nível do `pom.xml`)
2. Insira conteúdo de teste com algumas linhas em branco, por exemplo:

```
Linha 1

Linha 2

Linha 3
```

3. Execute a classe:
   `src/main/test/java/com/ricardomasterdev/arquivos/TestRemoverLinhas.java`

✅ O programa irá gerar um novo arquivo `output.txt` na mesma pasta, contendo apenas as linhas com texto.  
✅ Todas as linhas em branco ou com espaços em branco são removidas automaticamente.  
✅ O processo é feito utilizando `Streams`, `Files.readAllLines()` e `Files.write()` da biblioteca `java.nio.file`.

---

## ✅ Questão 3 — Multithreading: Simulação Bancária

### 📋 Enunciado Resumido

> Implemente um programa que simule um banco com múltiplas contas e suporte  
> transferências simultâneas entre contas. O sistema deve lidar corretamente com concorrência,  
> evitando condições de corrida e garantindo a consistência dos saldos ao final da execução.

---

### 🗂️ Estrutura de Pastas

| Caminho | Descrição |
|--------|-----------|
| `src/main/java/com/ricardomasterdev/banco/Conta.java` | Representa uma conta bancária com saldo e operações sincronizadas |
| `src/main/java/com/ricardomasterdev/banco/Banco.java` | Contém a lógica central de transferência entre contas |
| `src/main/java/com/ricardomasterdev/banco/SimulacaoTransferencias.java` | Simula múltiplas transferências paralelas entre contas usando `ExecutorService` |
| `src/main/test/java/com/ricardomasterdev/banco/TestBanco.java` | Classe auxiliar para executar manualmente a simulação |

---

### ▶️ Como Executar o Exercício

1. Abra o projeto no IntelliJ IDEA 2022.2.5
2. Verifique se o SDK está definido como **OpenJDK 24** ou compatível com Java 8+
3. Execute a classe:
   `src/main/test/java/com/ricardomasterdev/banco/TestBanco.java`

✅ A simulação irá executar 100 transferências concorrentes de ida e volta entre duas contas bancárias.  
✅ O sistema utiliza `ExecutorService` e `synchronized` para garantir integridade dos saldos.

---

### 🧪 Funcionamento Esperado

- As contas começam com saldo igual (`1000.00` cada)
- O programa executa transferências concorrentes entre elas
- Ao final, os saldos devem permanecer consistentes (`1000.00` cada), provando que não houve condição de corrida

Exemplo de saída esperada:

```
✔ Transferido 10.00 de Conta 1 para Conta 2  
✔ Transferido 10.00 de Conta 2 para Conta 1  
...  
✅ Saldo final Conta 1: 1000.00  
✅ Saldo final Conta 2: 1000.00
```

---

## ✅ Questão 4 — API REST com Spring Boot + Oracle + Swagger

### 📋 Enunciado Resumido

> Desenvolver uma API RESTful utilizando Spring Boot que permita o gerenciamento de usuários com os seguintes endpoints:
>
> - Criar um novo usuário (`POST /users`)
> - Listar todos os usuários (`GET /users`)
> - Buscar um usuário por ID (`GET /users/{id}`)
> - Atualizar um usuário existente (`PUT /users/{id}`)
> - Deletar um usuário (`DELETE /users/{id}`)

---

### 🌐 Publicação

A API foi publicada no seguinte endereço:

- **API Endpoint:** [`http://app2.cdxsistemas.com.br:1111/users`](http://app2.cdxsistemas.com.br:1111/users)
- **Swagger UI:** [`http://app2.cdxsistemas.com.br:1111/swagger-ui/index.html`](http://app2.cdxsistemas.com.br:1111/swagger-ui/index.html)

Através da interface Swagger, é possível testar todos os endpoints diretamente pelo navegador.

---

### 🗂️ Estrutura de Pastas

| Caminho | Descrição |
|--------|-----------|
| `src/main/java/com/ricardomasterdev/api/entity/User.java` | Entidade JPA que representa um usuário |
| `src/main/java/com/ricardomasterdev/api/repository/UserRepository.java` | Interface do repositório Spring Data JPA |
| `src/main/java/com/ricardomasterdev/api/service/UserService.java` | Classe de serviço com a lógica de CRUD |
| `src/main/java/com/ricardomasterdev/api/controller/UserController.java` | Controller REST com os endpoints da API |
| `src/main/resources/application.properties` | Configuração da conexão com o banco Oracle |

---

### ⚙️ Banco de Dados Utilizado

A aplicação utiliza um banco **Oracle** remoto com as seguintes configurações:

```properties
spring.datasource.url=jdbc:oracle:thin:@//177.53.148.181:1522/XEPDB1
spring.datasource.username=codex
spring.datasource.password=Ric7901
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.database-platform=org.hibernate.dialect.OracleDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

✅ Essas credenciais permitem validar a efetividade da API, incluindo persistência e consulta no banco Oracle real.

---

### 📌 Exemplo de uso via Swagger

- **Criar um usuário:**

```json
{
  "nome": "João da Silva",
  "email": "joao@email.com"
}
```

- **Resposta esperada:**

```json
{
  "id": 1,
  "nome": "João da Silva",
  "email": "joao@email.com"
}
```



## ✅ Parte 3   - Análise e Design

## ✅ Questão 1: Projeto de Sistema (Gestão de Biblioteca)
📋 Enunciado Resumido
Você está projetando um sistema de gestão de biblioteca.
O sistema deve permitir:

Cadastro de livros

Cadastro de autores

Cadastro de leitores

Controle de empréstimo e devolução de livros

Desenhe um diagrama de classes para este sistema e explique como as classes interagem entre si.

🖼️ Diagrama UML
🔗 Visualize o diagrama de classes completo aqui:

http://app2.cdxsistemas.com.br/Diagrama_UML_Biblioteca.png


🧱 Classes Principais

Classe	Atributos principais	Relacionamentos

Livro	id, titulo, isbn, anoPublicacao	1 autor (Autor), N empréstimos (Emprestimo)
Autor	id, nome, nacionalidade	1 autor → N livros (Livro)
Leitor	id, nome, cpf, email	N empréstimos (Emprestimo)
Emprestimo	id, dataEmprestimo, dataDevolucao	1 livro (Livro), 1 leitor (Leitor)

🔄 Interações Entre as Classes

Um autor pode escrever vários livros

Um livro pertence a apenas um autor

Um leitor pode realizar vários empréstimos

Cada empréstimo vincula um livro a um leitor, com controle de datas

O sistema registra histórico de empréstimos, garantindo que um livro só seja emprestado uma vez por vez