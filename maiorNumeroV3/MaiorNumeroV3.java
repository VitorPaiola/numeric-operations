package maiorNumeroV3;

import java.util.Locale;
import java.util.Scanner;

/*
 * Escreva um programa que solicite três
 * números ao usuário e exiba o maior deles.
*/

public class MaiorNumeroV3 {
    private static final int TAM_LISTA = 3;

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
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros inteiros.");
            }
        }
    }

    public static void maiorNumero(double[] numeros) {
        if (numeros[0] > numeros[1] && numeros[0] > numeros[2]) {
            System.out.println("O primeiro numero e maior: " + numeros[0]);
        } else if (numeros[1] > numeros[0] && numeros[1] > numeros[2]) {
            System.out.println("O segundo numero e maior: " + numeros[1]);
        } else {
            System.out.println("O terceiro numero e maior: " + numeros[2]);
        }
    }
}
