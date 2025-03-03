package parOuImparV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Faça um programa que leia alguns números e
 * informe se ele é par ou ímpar.
*/

public class ParOuImparV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoLista = solicitarValor("Quantos numeros deseja verificar? ", entrada);

        int[] numeros = new int[tamanhoLista];

        for (int i = 0; i < tamanhoLista; i++) {
            numeros[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada);
        }

        int[][] resultado = separarParesEImpares(numeros);

        System.out.println("Numeros pares: " + Arrays.toString(resultado[0]));
        System.out.println("Numeros impares: " + Arrays.toString(resultado[1]));

        entrada.close();
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero inteiro.");
                continue;
            }

            try {
                valor = Integer.parseInt(input);
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Entrada invalida. Digite um numero inteiro positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros inteiros.");
            }
        }
    }

    public static int[][] separarParesEImpares(int[] numeros) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        // Ordena as listas
        Collections.sort(pares);
        Collections.sort(impares);

        // Converte as listas ordenadas de volta para arrays
        return new int[][] {
                pares.stream().mapToInt(i -> i).toArray(),
                impares.stream().mapToInt(i -> i).toArray()
        };
    }
}
