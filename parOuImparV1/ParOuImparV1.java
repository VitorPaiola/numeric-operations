package parOuImparV1;

import java.util.Scanner;

/*
 * Faça um programaque leia um número e
 * informe se ele é par ou ímpar.
*/

public class ParOuImparV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = solicitarValor("Digite um numero: ", entrada);

        imprimirImparOuPar(numero);

        entrada.close();
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero inteiro positivo.");
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

    public static void imprimirImparOuPar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " e par.");
        } else {
            System.out.println("O numero " + numero + " e impar.");
        }
    }
}
