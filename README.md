
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
3. Abra o arquivo de teste: `src/test/java/com/ricardomasterdev/cache/CacheLRUTest.java`
4. Clique com o botão direito na classe e selecione: `Run 'CacheLRUTest'`
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

3. Execute a classe: `src/main/test/java/com/ricardomasterdev/arquivos/TestRemoverLinhas.java`

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

## ✅ Questão 4 — API REST com Spring Boot + Oracle + Swagger

### 📋 Enunciado Resumido

> Desenvolver uma API RESTful utilizando Spring Boot que permita o gerenciamento de usuários com os seguintes endpoints:
> - Criar um novo usuário (`POST /users`)
> - Listar todos os usuários (`GET /users`)
> - Buscar um usuário por ID (`GET /users/{id}`)
> - Atualizar um usuário existente (`PUT /users/{id}`)
> - Deletar um usuário (`DELETE /users/{id}`)

---

### 🌐 Publicação

- **API Endpoint:** [`http://app2.cdxsistemas.com.br:1111/users`](http://app2.cdxsistemas.com.br:1111/users)
- **Swagger UI:** [`http://app2.cdxsistemas.com.br:1111/swagger-ui/index.html`](http://app2.cdxsistemas.com.br:1111/swagger-ui/index.html)

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

```properties
spring.datasource.url=jdbc:oracle:thin:@//177.53.148.181:1522/XEPDB1
spring.datasource.username=codex
spring.datasource.password=Ric7901
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.database-platform=org.hibernate.dialect.OracleDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ✅ Parte 3 – Análise e Design

### ✅ Questão 1: Projeto de Sistema (Gestão de Biblioteca)

📋 Enunciado Resumido:  
Desenvolva o projeto de um sistema para gerenciamento de biblioteca, contendo:

- Cadastro de livros
- Cadastro de autores
- Cadastro de leitores
- Controle de empréstimo e devolução de livros

🖼️ Diagrama UML:  
[Visualizar diagrama completo](http://app2.cdxsistemas.com.br/Diagrama_UML_Biblioteca.png)

---

### 🧱 Classes Principais

| Classe       | Atributos Principais                 | Relacionamentos                              |
|--------------|--------------------------------------|----------------------------------------------|
| `Livro`      | `id`, `titulo`, `isbn`, `anoPublicacao` | 1 autor (`Autor`), N empréstimos (`Emprestimo`) |
| `Autor`      | `id`, `nome`, `nacionalidade`        | 1 autor → N livros (`Livro`)                 |
| `Leitor`     | `id`, `nome`, `cpf`, `email`         | N empréstimos (`Emprestimo`)                 |
| `Emprestimo` | `id`, `dataEmprestimo`, `dataDevolucao` | 1 livro (`Livro`), 1 leitor (`Leitor`)       |

---

### 🔄 Interações Entre as Classes

- Um **autor** pode escrever vários **livros**
- Um **livro** pertence a apenas um **autor**
- Um **leitor** pode realizar vários **empréstimos**
- Cada **empréstimo** vincula um **livro** a um **leitor**, com controle de datas
- O sistema registra histórico de empréstimos, garantindo que um livro só seja emprestado uma vez por vez  


## ✅ Questão 2: Refatoração de Código

### 📋 Enunciado Resumido

Foi fornecido um código legado responsável por gerenciar pedidos (`Order`) e calcular o total dos itens. A proposta desta questão é **refatorar** o código aplicando princípios de **design orientado a objetos**, especialmente os princípios **SOLID**.

---

### 🧾 Código Original 

```java
public class Order {
   private List<Item> items;
   public Order() {
      items = new ArrayList<>();
   }
   public void addItem(Item item) {
      items.add(item);
   }
   public double calculateTotal() {
      double total = 0;
      for (Item item : items) {
         total += item.getPrice();
      }
      return total;
   }
}

```

---

### 🔁 Refatoração Aplicada

Foram aplicadas as seguintes melhorias:
- **SRP** (Responsabilidade Única): a lógica de cálculo foi extraída para uma nova classe (`TotalCalculator`)
- **DIP** (Inversão de Dependência): `Order` recebe a dependência de cálculo externamente (injeção de dependência)
- **OCP** (Aberto para extensão): novas estratégias de cálculo podem ser criadas sem modificar a classe `Order`

---

### 🗂️ Estrutura de Pastas

| Caminho | Descrição |
|--------|-----------|
| `src/main/java/com/ricardomasterdev/pedido/Order.java` | Representa um pedido com lista de itens e usa uma estratégia de cálculo |
| `src/main/java/com/ricardomasterdev/pedido/Item.java` | Entidade de domínio representando um item do pedido |
| `src/main/java/com/ricardomasterdev/pedido/TotalCalculator.java` | Interface que define o contrato de cálculo de totais |
| `src/main/java/com/ricardomasterdev/pedido/DefaultTotalCalculator.java` | Implementação padrão do cálculo total |
| `src/main/java/com/ricardomasterdev/pedido/Main.java` | Classe de exemplo para executar o fluxo de cálculo de um pedido |

---

### ▶️ Como Executar

1. Abra o projeto no IntelliJ IDEA 2022.2.5
2. Verifique se o SDK está definido como Java 1.8 ou superior
3. Execute a classe:
   `src/main/java/com/ricardomasterdev/pedido/Main.java`

A saída esperada será algo como:

```
Total do pedido: R$ 17.50
```

---

### ✅ Benefícios da Refatoração

- Fácil manutenção e extensão da lógica de negócio
- Separação clara de responsabilidades
- Facilita testes unitários e uso de diferentes estratégias de cálculo no futuro

---


## ✅ Parte 4 – Conhecimento de Frameworks e Ferramentas

---

### 🧩 1. Hibernate

**Hibernate** é um framework ORM (Object-Relational Mapping) para Java que facilita a persistência de dados em bancos relacionais. Ele permite que objetos Java sejam diretamente mapeados para tabelas do banco, eliminando a necessidade de escrever SQL manual para operações CRUD básicas.

**✅ Vantagens:**
- Reduz o código repetitivo de SQL.
- Suporte a cache e lazy loading.
- Integração com Spring Data JPA.

**🧾 Exemplo de Classe com Anotações Hibernate:**

```java
import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    // getters e setters
}
```

---

### 🧪 2. Testes Unitários com JUnit

**Testes unitários** garantem que cada unidade de código (método, classe) funcione corretamente de forma isolada.  
Com **JUnit**, podemos automatizar testes e prevenir regressões ao longo do desenvolvimento.

**✅ Vantagens:**
- Detecta erros mais cedo.
- Facilita refatorações seguras.
- Integra com CI/CD.

**🧾 Exemplo de Teste para `CacheLRU`:**

```java
import org.junit.Assert;
import org.junit.Test;

public class CacheLRUTest {

    @Test
    public void testPutAndGet() {
        CacheLRU<Integer, String> cache = new CacheLRU<>(2);
        cache.put(1, "A");
        cache.put(2, "B");

        Assert.assertEquals("A", cache.get(1));
        Assert.assertEquals("B", cache.get(2));
    }

    @Test
    public void testLRUEviction() {
        CacheLRU<Integer, String> cache = new CacheLRU<>(2);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.get(1); // A é o mais recentemente usado
        cache.put(3, "C"); // B deve ser removido

        Assert.assertNull(cache.get(2));
        Assert.assertEquals("A", cache.get(1));
    }
}
```

---

### ⚙️ 3. Maven vs Gradle

| Característica       | **Maven**                            | **Gradle**                             |
|----------------------|--------------------------------------|----------------------------------------|
| Linguagem de build   | XML (pom.xml)                        | DSL (Groovy ou Kotlin)                 |
| Performance          | Menor, recompila tudo                | Mais rápido com build incremental      |
| Configuração         | Convencional, mais verboso           | Flexível e menos verboso               |
| Curva de aprendizado | Mais fácil para iniciantes           | Exige mais aprendizado inicial         |
| Suporte a plugins    | Amplo ecossistema                    | Extensível e moderno                   |
| Integração com IDEs  | Excelente (IntelliJ, Eclipse, VSCode)| Excelente                              |

**🔍 Quando usar:**

- **Maven**: ideal para projetos Java tradicionais e times que valorizam padronização.
- **Gradle**: ideal para projetos grandes, Android ou que precisam de builds customizados e rápidos.


## ✅ Parte 5 – Resolução de Problemas

---

### 🛠️ Questão 1 – Debugging

**🧩 Enunciado:**
> Explique como você aborda o processo de debugging em uma aplicação Java complexa. Quais ferramentas e técnicas você utiliza?

**🔍 Abordagem Recomendada:**

1. **Reprodução do Problema**
   - Confirmar o ambiente (dev, staging, prod)
   - Identificar logs, entradas e ações que causam o erro

2. **Ferramentas Utilizadas**
   - `IDE (IntelliJ IDEA)` com breakpoints e inspeção de variáveis
   - `Logs com SLF4J + Logback/Log4j2` para rastrear execução
   - `Spring Boot DevTools` com live reload
   - `Actuator + Postman` para inspecionar pontos da API

3. **Técnicas**
   - Debug em tempo real com breakpoints
   - Logs com IDs de correlação para rastrear requisições
   - TDD/BDD para capturar falhas em testes automatizados
   - Observabilidade com ferramentas como Prometheus + Grafana (em produção)

---

### 🚀 Questão 2 – Melhoria de Performance

**🧩 Enunciado:**
> Dado um sistema Java que está apresentando problemas de performance, quais são os passos que você seguiria para identificar e resolver os gargalos?

**⚙️ Abordagem Recomendada:**

1. **Identificação do Sintoma**
   - Lentidão na API? Consumo de memória alto? Timeouts?
   - Logs, métricas ou feedback de usuários ajudam a restringir o escopo

2. **Medição e Profiling**
   - Ferramentas: `JVisualVM`, `JProfiler`, `Flight Recorder`, `Micrometer + Prometheus`
   - Identificar: métodos lentos, loops pesados, GC excessivo, conexões de banco mal fechadas

3. **Análise de Código**
   - Otimização de algoritmos e estruturas de dados
   - Evitar chamadas desnecessárias ao banco
   - Uso correto de `Stream`, `parallelStream` com cautela
   - Reduzir uso de operações pesadas em loops

4. **Banco de Dados**
   - Indexação de colunas consultadas frequentemente
   - Otimização de `JOINs`, `LIMIT`, `OFFSET`
   - Uso de `fetch lazy/eager` de forma apropriada

5. **Cache**
   - Uso de `@Cacheable`, `Redis`, `Ehcache` para reduzir chamadas repetidas

6. **Arquitetura**
   - Balanceamento de carga, escalabilidade horizontal, filas assíncronas (`RabbitMQ`, `Kafka`)

7. **Testes de Carga**
   - `Apache JMeter`, `k6`, ou `Gatling` para simular usuários simultâneos

---

✅ Uma análise eficaz combina **monitoramento constante**, **profiling dirigido por métricas** e **refinamento iterativo**.

