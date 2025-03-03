package verificarAprovacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que receba uma quantidade x
 * de notas e informe quais são maior ou igual a 6
 * (aprovados) e menor ou igual a 6 (reprovados).
*/

public class VerificarAprovacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int tamanhoLista = (int) solicitarValor("Quantas notas deseja verificar? ", entrada);

        double[] notas = new double[tamanhoLista];

        for (int i = 0; i < tamanhoLista; i++) {
            notas[i] = solicitarValor("Digite a nota da " + (i + 1) + " prova: ", entrada);
        }

        double[][] resultado = verificarNotas(notas);

        System.out.println("Notas aprovadas: " + Arrays.toString(resultado[0]));
        System.out.println("Notas reprovadas: " + Arrays.toString(resultado[1]));

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

    public static double[][] verificarNotas(double[] notas) {
        List<Double> notasAprovadas = new ArrayList<>();
        List<Double> notasReprovadas = new ArrayList<>();

        for (double nota : notas) {
            if (nota >= 6) {
                notasAprovadas.add(nota);
            } else {
                notasReprovadas.add(nota);
            }
        }

        return new double[][] {
            notasAprovadas.stream().mapToDouble(i -> i).toArray(),
            notasReprovadas.stream().mapToDouble(i -> i).toArray()
        };
    }
}
