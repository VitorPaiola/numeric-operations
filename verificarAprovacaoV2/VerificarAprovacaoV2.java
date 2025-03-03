package verificarAprovacaoV2;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia as notas de duas provas e
 * informe se o aluno foi aprovado (nota >= 6) ou
 * reprovado (nota < 6) em cada uma das provas.
*/

public class VerificarAprovacaoV2 {
    private static final int TAM_LISTA = 2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] notas = new double[TAM_LISTA];

        for (int i = 0; i < TAM_LISTA; i++) {
            notas[i] = solicitarValor("Digite a nota da " + (i + 1) + " prova: ", entrada);
        }

        verificarNotas(notas);

        entrada.close();
    }

    public static double solicitarValor(String mensagem, Scanner entrada) {
        double valor;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um numero inteiro positivo.");
                continue;
            }

            try {
                valor = Double.parseDouble(input);
                if (valor >= 0) {
                    return valor;
                } else {
                    System.out.println("Entrada invalida. Digite um numero inteiro positivo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros.");
            }
        }
    }

    public static void verificarNotas(double[] notas) {
        System.out.println("Resultado");
        System.out.println("Nota 1 (" + notas[0] + "): " + (notas[0] >= 6 ? "Aprovado" : "Reprovado"));
        System.out.println("Nota 2 (" + notas[1] + "): " + (notas[1] >= 6 ? "Aprovado" : "Reprovado"));
    }
}
