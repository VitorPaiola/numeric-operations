package verificarMaioridadeV2;

import java.util.Scanner;

/*
 * Faça um programa que solicite a idade de uma
 * pessoa e exiba se ela é maior de idade ou não.
*/

public class VerificarMaioridadeV2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = solicitarValor("Digite a sua idade: ", entrada);

        imprimirCondicao(idade);

        entrada.close();
    }

    // ! Neste modelo não há tratativa para uma intrada vazia.
    public static int solicitarValor(String mensagem, Scanner entrada) {
        int valor;
        while (true) {
            System.out.print(mensagem);
            if (entrada.hasNextInt()) { // Verifica se a entrada é um número inteiro
                valor = entrada.nextInt();
                entrada.nextLine(); // Consumir a quebra de linha pendente
                if (valor > 0) { // Garante que o número seja positivo
                    return valor;
                } else {
                    System.out.println("Entrada invalida. Digite um número inteiro positivo.");
                }
            } else {
                System.out.println("Entrada invalida. Digite apenas números inteiros.");
                entrada.next(); // Descarta a entrada inválida
            }
        }
    }

    public static void imprimirCondicao(int idade) {
        if (idade >= 18) {
            System.out.println("Voce e maior de idade.");
        } else {
            System.out.println("Voce e menor de idade.");
        }
    }
}
