package verificarNumeroV2;
/*
 * Faça um programa que leia um número
 * e informe se ele é par ou ímpar.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VerificarNumeroV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tamanhoLista = solicitarValor("Quantos numeros deseja verificar? ", entrada);

        int[] numeros = new int[tamanhoLista];

        for (int i = 0; i < tamanhoLista; i++) {
            numeros[i] = solicitarValor("Digite o " + (i + 1) + " valor: ", entrada);
        }

        int[][] resultado = verificarNumero(numeros);

        System.out.println("Numeros positivos: " + Arrays.toString(resultado[0]));
        System.out.println("Numeros negativos: " + Arrays.toString(resultado[1]));
        System.out.println("Numeros zero: " + Arrays.toString(resultado[2]));

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
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros inteiros.");
            }
        }
    }

    public static int[][] verificarNumero(int[] numeros) {
        List<Integer> positivos = new ArrayList<>();
        List<Integer> negativos = new ArrayList<>();
        List<Integer> zeros = new ArrayList<>();

        for (int numero : numeros) {
            if (numero > 0) {
                positivos.add(numero);
            } else if (numero < 0) {
                negativos.add(numero);
            } else {
                zeros.add(numero);
            }
        }

        Collections.sort(positivos);
        Collections.sort(negativos);

        return new int[][] {
                positivos.stream().mapToInt(i -> i).toArray(),
                negativos.stream().mapToInt(i -> i).toArray(),
                zeros.stream().mapToInt(i -> i).toArray()
        };
    }
}
