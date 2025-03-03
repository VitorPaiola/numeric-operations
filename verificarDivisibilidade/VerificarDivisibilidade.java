package verificarDivisibilidade;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia três números, e
 * informese a soma deles é divísivel por 5 ou não.
*/

public class VerificarDivisibilidade {
    private static final int TAM_LISTA = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int[] numeros = new int[TAM_LISTA];

        String[] variaveis = { "primeiro", "segundo", "terceiro" };

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = solicitarValor("Digite o " + variaveis[i] + " valor: ", entrada);
        }

        calcularDivisibilidade(numeros);

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
                if (valor >= 0) {
                    return valor;
                } else {
                    System.out.println("Numero invalida. Digite um numero positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void calcularDivisibilidade(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];

            System.out.println("Soma ate o " + (i + 1) + " valor (" + soma + "): " + (soma % 5 == 0 ? "Divisivel" : "Nao divisivel"));
        }
    }
}
