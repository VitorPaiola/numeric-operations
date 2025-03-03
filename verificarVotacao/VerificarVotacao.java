package verificarVotacao;

import java.time.Year;
import java.util.Scanner;

/*
 * Faça um programa que leia o ano de nascimento
 * de uma pessoa e informe se ela está apta a
 * votar (idade >= 16 anos).
*/

public class VerificarVotacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int anoNascimento = solicitarValor("Digite o ano de nascimento: ", entrada);

        verificarAprovacao(anoNascimento);
    }

    public static int solicitarValor(String mensagem, Scanner entrada) {
        int idade;
        while (true) {
            System.out.print(mensagem);
            String input = entrada.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Entada vazia nao permitida. Digite uma idade valido.");
                continue;
            }

            try {
                idade = Integer.parseInt(input);
                if (idade > 0) {
                    return idade;
                } else {
                    System.out.println("Entrada invalida. Digite uma idade valida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite apenas numeros inteiros.");
            }
        }
    }

    public static void verificarAprovacao(int anoNascimento) {
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Voce esta apto(a) a votar. Idade: " + idade);
        } else {
            System.out.println("Voce nao esta apto(a) a votar. Idade: " + idade);
        }
    }
}
