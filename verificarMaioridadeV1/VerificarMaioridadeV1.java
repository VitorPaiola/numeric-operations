package verificarMaioridadeV1;

import java.util.Scanner;

/*
 * Faça um programa que solicite a idade de uma
 * pessoa e exiba se ela é maior de idade ou não.
*/

public class VerificarMaioridadeV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = solicitarValor("Digite a sua idade: ", entrada);

        imprimirCondicao(idade);

        entrada.close();
    }

    // ! Neste modelo há tratativa para entrada vazia. Para isso devemos ler a entrada como String e depois convertê-la para um número inteiro.
    public static int solicitarValor(String mensagem, Scanner entrada) {
        int idade;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim(); // Lê como String e remove espaços extras

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero inteiro positivo.");
                continue; // Volta ao inicío do loop para pedir nova entrada
            }

            try {
                idade = Integer.parseInt(input); // Tenta converter para inteiro
                if (idade > 0) { // Verifica se é positivo
                    return idade;
                } else {
                    System.out.println("Entrada invalida. Digite um numero inteiro positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros inteiros.");
            }
        }
    }

    public static void imprimirCondicao(int idade) {
        if (idade >= 18) {
            System.out.println("Voce e maior de idade.");
        } else {
            System.out.println("Voce e menor de idade.");
        }
    }
}
