package verificarSoma;

import java.util.Scanner;

/*
 * Crie um programa que leia três números e verifique
 * se a soma deles é positiva, negativa ou igual a zero.
*/

public class VerificarSoma {
    private static final int TAM_LISTA = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[TAM_LISTA];

        String[] variaveis = { "primeiro", "segundo", "terceiro" };

        for (int i = 0; i < TAM_LISTA; i++) {
            numeros[i] = solicitarValor("Digite o " + variaveis[i] + " valor: ", entrada);
        }

        calcularSoma(numeros);

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

    public static void calcularSoma(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("Soma (" + soma + "): " + (soma > 0 ? "Positiva" : soma < 0 ? "Negativa" : "Zero"));
    }
}
