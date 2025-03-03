# 📌 Operações Numéricas em Java

Este repositório contém diversos programas em Java que realizam operações numéricas, 
como comparação de valores, ordenação, verificação de divisibilidade, 
classificação de números pares ou ímpares, entre outros. 
Abaixo estão as funcionalidades de cada programa.

## 🚀 Tecnologias Utilizadas

- Java (JDK 8+)
- Scanner para entrada de dados do usuário
- Estruturas de controle (loops, condicionais)
- Métodos para modularização do código

## 📌 Confira meu artigo no DEV.to

Para aprender mais sobre Java e ver exemplos de exercícios, confira meu artigo no 
[DEV.to](https://dev.to/vitorpaiola/lista-de-exercicios-basicos-em-java-part-2-5aj2)! 🚀

## 📂 Estrutura do Projeto

```estrutura
📦 numeric-operations
├── 📁 src
│   ├── 📁 numeric
│   │   ├── 📁 maiorNumeroV1
│   │   │   └── MaiorNumeroV1.java
│   │   ├── 📁 maiorNumeroV2
│   │   │   └── MaiorNumeroV2.java
│   │   ├── 📁 maiorNumeroV3
│   │   │   └── MaiorNumeroV3.java
│   │   ├── 📁 ordenarNumeros
│   │   │   └── OrdenarNumeros.java
│   │   ├── 📁 parOuImparV1
│   │   │   └── ParOuImparV1.java
│   │   ├── 📁 parOuImparV2
│   │   │   └── ParOuImparV2.java
│   │   ├── 📁 sobrenomePrimeiro
│   │   │   └── SobrenomePrimeiro.java
│   │   ├── 📁 verificarAprovacao
│   │   │   └── VerificarAprovacao.java
│   │   ├── 📁 verificarAprovacaoMedia
│   │   │   └── VerificarAprovacaoMedia.java
│   │   ├── 📁 verificarAprovacaoV2
│   │   │   └── VerificarAprovacaoV2.java
│   │   ├── 📁 verificarDivisibilidade
│   │   │   └── VerificarDivisibilidade.java
│   │   ├── 📁 verificarMaiorIdade
│   │   │   └── VerificarMaiorIdade.java
│   │   ├── 📁 verificarMaiorIdadeV1
│   │   │   └── VerificarMaiorIdadeV1.java
│   │   ├── 📁 verificarMaiorIdadeV2
│   │   │   └── VerificarMaiorIdadeV2.java
│   │   ├── 📁 verificarNumeroV1
│   │   │   └── VerificarNumeroV1.java
│   │   ├── 📁 verificarNumeroV2
│   │   │   └── VerificarNumeroV2.java
│   │   ├── 📁 verificarSoma
│   │   │   └── VerificarSoma.java
│   │   ├── 📁 verificarTriangulo
│   │   │   └── VerificarTriangulo.java
│   │   ├── 📁 verificarVotacao
│   │   │   └── VerificarVotacao.java
│   │   ├── 📁 verificarVotacaoV2
│   │   │   └── VerificarVotacaoV2.java
└── README.md
```

## 🛠️ Como Compilar e Executar

Para compilar e executar qualquer um dos programas, siga os passos abaixo:

### 1️⃣ **Compilar**

Abra o terminal e navegue até a pasta `src` do projeto. Em seguida, execute:

```sh
javac -d . numeric-operations/NomeDaPasta/NomeDoArquivo.java
```

### 2️⃣ **Executar**

Após a compilação, execute o programa com:

```sh
java numeric-operations.NomeDaPasta.NomeDoArquivo
```

Exemplo:

```sh
java numeric-operations.parOuImparV1.ParOuImparV1
```

## 📌 Descrição dos Programas

### 🔢 **Maior Número versão-1**
Verifica o maior número entre dois valores fornecidos pelo usuário.

### 🔢 **Maior Número versão-2**
Verifica o maior número entre três valores fornecidos pelo usuário.

### 🔢 **Maior Número versão-3**
Verifica o maior número entre uma quantidade indefinida de valores fornecidos pelo usuário.

### 📊 **Ordenar Números**
Ordena três números fornecidos pelo usuário em ordem crescente.

### 🔄 **Par ou Ímpar versão-1**
Verifica se um número fornecido pelo usuário é par ou ímpar.

### 🔄 **Par ou Ímpar versão-2**
Verifica se um número é par ou ímpar utilizando operações bitwise para melhor eficiência.

### 📝 **Sobrenome Primeiro**
Exibe um nome no formato "Sobrenome, Nome", útil para listagens.

### 🎓 **Verificar Aprovação**
Verifica se a nota do aluno é suficiente para aprovação, considerando a média mínima estabelecida.

### 🎓 **Verificar Aprovação com Média**
Calcula a média de múltiplas notas e determina se o aluno está aprovado.

### 🎓 **Verificar Aprovação versão-2**
Inclui critérios adicionais para aprovação, como presença mínima.

### ➗ **Verificar Divisibilidade**
Verifica se um número fornecido pelo usuário é divisível por outro.

### 🔞 **Verificar Maioridade**
Determina se uma pessoa é maior de idade com base na idade fornecida.

### 🔞 **Verificar Maioridade versão-1**
Considera a maioridade no Brasil (18 anos).

### 🔞 **Verificar Maioridade versão-2**
Permite definir uma idade mínima personalizada para maioridade.

### 🔢 **Verificar Número versão-1**
Classifica um número como positivo, negativo ou zero.

### 🔢 **Verificar Número versão-2**
Classifica um número como inteiro ou decimal.

### ➕ **Verificar Soma**
Verifica se a soma de dois números fornecidos pelo usuário é igual a um terceiro número.

### 🔺 **Verificar Triângulo**
Determina se três lados fornecidos pelo usuário formam um triângulo válido.

### 🗳️ **Verificar Votação**
Verifica se uma pessoa pode votar com base na idade.

### 🗳️ **Verificar Votação versão-2**
Inclui verificações adicionais, como voto facultativo.

---

### 📜 **Licença**
Este projeto foi desenvolvido por mim e está livre para uso e modificação sem restrições formais.
Fique à vontade para usar e adaptar o código conforme necessário.

### 🤝 **Contribuições**
Contribuições são sempre bem-vindas! Se você tem sugestões ou gostaria de adicionar novos programas ou funcionalidades,
sinta-se à vontade para abrir um Pull Request. Estou ansioso para ver suas melhorias! 😃
