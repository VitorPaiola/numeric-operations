package verificarMaiorIdade;

import java.util.Scanner;

/*
 * Faça um programa que leia a idade de
 * três pessoas e quantas delas é maior de
 * idade (idade >= 18).
*/

public class VerificarMaiorIdade {
    private static final int TAM_LISTA = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] idades = new int[TAM_LISTA];

        String[] variaveis = { "primeira", "segunda", "terceira" };

        for (int i = 0; i < TAM_LISTA; i++) {
            idades[i] = solicitarValor("Digite a idade da " + variaveis[i] + " pessoa: ", entrada);
        }

        calcularMaiorIdade(idades);

        entrada.close();
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                valor = Integer.parseInt(input);
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Entrada invalida. Digite um numero positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros inteiros.");
            }
        }
    }

    public static void calcularMaiorIdade(int[] idades) {
        int contador = 0;

        for (int idade : idades) {
            if (idade >= 18)
                contador++;
        }

        // Exibe as pessoas maiores de idade
        System.out.println("\nPessoas maiores de idade: " + contador);

        // Exibe o status de maioridade de cada pessoa
        for (int idade : idades) {
            System.out.println("Idade (" + idade + "): " + (idade >= 18 ? "Maior de idade" : "Menor de idade"));
        }
    }
}
