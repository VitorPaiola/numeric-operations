package verificarTriangulo;

import java.util.Scanner;

/*
 * Faça um programa que leia três números e informe
 * se eles podem ser os lados de um triângulo (a soma de
 * dois lados deve ser sempre maior que o terceiro lado).
*/

public class VerificarTriangulo {
    private static final int TAM_LISTA = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[TAM_LISTA];

        String[] variaveis = { "primeiro", "segundo", "terceiro" };

        for (int i = 0; i < TAM_LISTA; i++) {
            numeros[i] = solicitarValor("Digite o " + variaveis[i] + " valor: ", entrada);
        }

        verificarTriangulo(numeros);

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

    public static void verificarTriangulo(int[] numeros) {
        if ((numeros[0] + numeros[1] > numeros[2]) &&
            (numeros[1] + numeros[2] > numeros[0]) &&
            (numeros[0] + numeros[2] > numeros[1])) {
            System.out.printf("Os numeros (%d, %d, %d) podem formar um triangulo.%n", numeros[0], numeros[1], numeros[2]);
        } else {
            System.out.printf("Os numeros (%d, %d, %d) nao podem formar um triangulo.%n", numeros[0], numeros[1], numeros[2]);
        }
    }
}
