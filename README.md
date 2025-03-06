# 📌 Operações Numéricas em Java

![java-5](https://github.com/user-attachments/assets/bec50591-407a-42ff-beb6-4d5c957e7324)

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
[DEV.to](https://dev.to/vitorpaiola/lista-de-exercicios-basicos-em-java-part-3-49b7)! 🚀

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
Verifica o maior número entre dois valores fornecidos pelo usuário.

### 🔢 **Maior Número versão-3**
Verifica o maior número entre três valores fornecidos pelo usuário.

### 📊 **Ordenar Números**
Ordena três números fornecidos pelo usuário em ordem crescente.

### 🔄 **Par ou Ímpar versão-1**
Verifica se um número fornecido pelo usuário é par ou ímpar.

### 🔄 **Par ou Ímpar versão-2**
Verifica se um número fornecido pelo usuário é par ou ímpar.

### 📝 **Sobrenome Primeiro**
Exibe um nome no formato "Sobrenome, Nome", útil para listagens.

### 🎓 **Verificar Aprovação**
Verifica se a nota do aluno é suficiente para aprovação, considerando a média mínima estabelecida.

### 🎓 **Verificar Aprovação com Média**
Calcula a média de múltiplas notas e determina se o aluno está aprovado.

### 🎓 **Verificar Aprovação versão-2**
Verifica se a nota do aluno é suficiente para aprovação, considerando a média mínima estabelecida.

### ➗ **Verificar Divisibilidade**
Verifica se um número fornecido pelo usuário é divisível por outro.

### 🔞 **Verificar Maior Idade**
Determina se uma pessoa é maior de idade com base na idade fornecida.

### 🔞 **Verificar Maioridade versão-1**
Considera a maioridade no Brasil (18 anos).

### 🔞 **Verificar Maioridade versão-2**
Permite definir uma idade mínima personalizada para maioridade.

### 🔢 **Verificar Número versão-1**
Classifica um número como positivo, negativo ou zero.

### 🔢 **Verificar Número versão-2**
Classifica um número como positivo, negativo ou zero.

### ➕ **Verificar Soma**
Programa que lê três números e verifica se a soma deles é positiva, negativa ou igual a zero.

### 🔺 **Verificar Triângulo**
Determina se três lados fornecidos pelo usuário formam um triângulo válido.

### 🗳️ **Verificar Votação**
Programa que lê o ano de nascimento de uma pessoa e verifica se ela está apta a votar (idade ≥ 16 anos).

### 🗳️ **Verificar Votação versão-2**
Programa que lê a idade de uma pessoa e determina sua aptidão para votar, conforme a seguinte classificação:
- **Não está apta a votar**: Se a idade for inferior a 16 anos.
- **Apta a votar, mas não é obrigada**: Se a idade for entre 16 e 17 anos, ou igual ou superior a 70 anos.
- **Obrigada a votar**: Se a idade for entre 18 e 69 anos.

## 📌 Quer acompanhar mais dicas e novidades sobre Java?

🔔 Fique por dentro de tudo sobre Java! Me siga no [Twitter](https://x.com/v__souz) para receber dicas, novidades e atualizações! 🚀✨

---

### 📜 **Licença**
Este projeto foi desenvolvido por mim e está livre para uso e modificação sem restrições formais.
Fique à vontade para usar e adaptar o código conforme necessário.

### 🤝 **Contribuições**
Contribuições são sempre bem-vindas! Se você tem sugestões ou gostaria de adicionar novos programas ou funcionalidades,
sinta-se à vontade para abrir um Pull Request. Estou ansioso para ver suas melhorias! 😃
