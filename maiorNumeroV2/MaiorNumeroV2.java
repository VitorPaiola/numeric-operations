package maiorNumeroV2;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leio dois
 * números e informe qual é o maior.
*/

public class MaiorNumeroV2 {
    private static final int TAM_LISTA = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] numeros = new double[TAM_LISTA];

        for (int i = 0; i < TAM_LISTA; i++) {
            numeros[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada);
        }

        maiorNumero(numeros);

        entrada.close();
    }

    public static double solicitarValor(String mensagem, Scanner entrada) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero inteiro positivo.");
                continue;
            }

            try {
                valor = Double.parseDouble(input);
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Entrada invalida. Digite um numero inteiro positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros inteiros.");
            }

            // ! Para expandir o intervalo de busca, FAÇA:
            // try {
            // valor = Double.parseDouble(input);
            // return valor;
            // } catch (NumberFormatException e) {
            // System.out.println("Entrada invalida. Digite apenas numeros.");
            // }
        }
    }

    public static void maiorNumero(double[] numeros) {
        if (numeros[0] > numeros[1]) {
            System.out.println("O primeiro numero e maior: " + numeros[0]);
        } else if (numeros[1] > numeros[0]) {
            System.out.println("O segundo numero e maior: " + numeros[1]);
        } else {
            System.out.println("Os numeros sao iguais: " + numeros[0]);
        }
    }
}
