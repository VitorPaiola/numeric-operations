package maiorNumeroV1;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leio dois
 * números e informe qual é o maior.
*/

public class MaiorNumeroV1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double numero1 = solicitarValor("Digite o primeiro valor: ", entrada);
        double numero2 = solicitarValor("Digite o segundo valor: ", entrada);

        maiorNumero(numero1, numero2);

        entrada.close();
    }

    public static double solicitarValor(String mensagem, Scanner entrada) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero positivo.");
                continue;
            }

            try {
                valor = Double.parseDouble(input);
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Entrada invalida. Digite um numero positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
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

    public static void maiorNumero(double numero1, double numero2) {
        if (numero1 > numero2) {
            System.out.println("O primeiro numero e maior: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O segundo numero e maior: " + numero2);
        } else {
            System.out.println("Os numeros sao iguais: " + numero1);
        }
    }
}
