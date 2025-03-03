package verificarNumeroV1;

import java.util.Scanner;

/*
 * Faça um programa que leia um número e informe
 * se ele é positivo, negativo ou zero.
*/

public class VerificarNumeroV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = solicitarValor("Digite um numero: ", entrada);

        verificarNumero(numero);

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

    public static void verificarNumero(int numero) {
        if (numero > 0) {
            System.out.println("O numero " + numero + " e positivo.");
        } else if (numero < 0) {
            System.out.println("O numero " + numero + " e negativo.");
        } else {
            System.out.println("O numero " + numero + " e zero.");
        }
    }
}
