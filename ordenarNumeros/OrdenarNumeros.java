package ordenarNumeros;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia três números, e
 * mostre eles na tela em ordem crscente.
*/

public class OrdenarNumeros {
    private static final int TAM_LISTA = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numeros[] = new int[TAM_LISTA];

        String[] variaveis = { "primeiro", "segundo", "terceiro" };

        for (int i = 0; i < TAM_LISTA; i++) {
            numeros[i] = solicitarValor("Digite o " + variaveis[i] + " valor: ", entrada);
        }

        ordemCrescente(numeros);

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
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros inteiros.");
            }
        }
    }

    public static void ordemCrescente(int[] numeros) {
        Arrays.sort(numeros);
        System.out.println("Numeros em ordem crescente: " + Arrays.toString(numeros));
    }
}
