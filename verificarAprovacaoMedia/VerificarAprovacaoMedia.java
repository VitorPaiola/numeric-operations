package verificarAprovacaoMedia;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia as notas de duas
 * provas, calcule a media aritmética simples, e
 * informe se o aluno foi aprovado (média >= 6)
 * ou reprovado (media < 6).
*/

public class VerificarAprovacaoMedia {
    private static final int TAM_LISTA = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] notas = new double[TAM_LISTA];

        for (int i = 0; i < TAM_LISTA; i++) {
            notas[i] = solicitarValor("Digite a nota da " + (i + 1) + " prova: ", entrada);
        }

        calcularMediaAritmetica(notas);

        entrada.close();
    }

    public static double solicitarValor(String mensagem, Scanner entrada) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero valido.");
                continue;
            }

            try {
                valor = Double.parseDouble(input);
                if (valor > 0) {
                    return valor;
                } else {
                    System.out.println("Entrada invalida. Digite um numero valido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void calcularMediaAritmetica(double[] notas) {
        double media = (notas[0] + notas[1]) / 2;
        System.out.println("Media (" + media + "): " + (media >= 6 ? "Aprovado" : "Reprovado"));
    }
}
