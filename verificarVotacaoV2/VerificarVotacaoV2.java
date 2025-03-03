package verificarVotacaoV2;

import java.util.Scanner;

/*
 * Faça um programa que leia a idade de uma
 * pessoa e informe se ela não está apta a votar (idade
 * inferior a 16 anos), se está apta a votar, porém não
 * é obrigada (16, 17 anos, ou idade igual ou superior
 * a 70 anos), ou se é obrigada (18 a 69 anos).
*/

public class VerificarVotacaoV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = solicitarValor("Digite a idade: ", entrada);

        verificarAprovacao(idade);

        entrada.close();
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

    public static void verificarAprovacao(int idade) {
        if (idade < 16) {
            System.out.println("A pessoa esta nao apto(a) a votar. Idade: " + idade);
        } else if ((idade >= 16 && idade <= 17) || idade >= 70) {
            System.out.println("A pessoa esta apto(a) a votar, porem nao e obrigada! Idade: " + idade);
        } else {
            System.out.println("A pessoa e obrigada a votar. Idade: " + idade);
        }
    }
}
