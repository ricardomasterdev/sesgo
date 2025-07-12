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
   src/test/java/com/ricardomasterdev/cache/CacheLRUTest.java
4. Clique com o botão direito na classe e selecione:
   Run 'CacheLRUTest'
5. Os testes JUnit serão executados e os resultados aparecerão no painel inferior do IntelliJ.

✅ Todos os testes devem passar, validando os métodos:
- `put()`
- `get()`
- `remove()`
- `size()`
- Comportamento de **remoção automática LRU**

---

✅ Questão 2 — Manipulação de Arquivos
📋 Enunciado Resumido
Ler um arquivo texto chamado input.txt, remover todas as linhas em branco,
e gravar o conteúdo restante em um novo arquivo chamado output.txt.

🗂️ Estrutura de Pastas
Caminho	Descrição
src/main/java/com/ricardomasterdev/arquivos/RemoverLinhasEmBranco.java	Classe principal que executa a leitura, filtragem e escrita dos arquivos
src/main/test/java/com/ricardomasterdev/arquivos/TestRemoverLinhas.java	Classe auxiliar para execução manual do processamento

▶️ Como Executar o Exercício
Crie um arquivo chamado input.txt na raiz do projeto (mesmo nível do pom.xml)

Insira conteúdo de teste com algumas linhas em branco, por exemplo:
Linha 1

Linha 2

Linha 3

Abra e execute a classe:

src/main/test/java/com/ricardomasterdev/arquivos/TestRemoverLinhas.java
O programa irá gerar um novo arquivo output.txt na mesma pasta, contendo apenas as linhas com texto.

✅ Todas as linhas em branco ou com espaços em branco são removidas automaticamente.
O processo é feito utilizando Streams, Files.readAllLines() e Files.write() da biblioteca java.nio.file.

