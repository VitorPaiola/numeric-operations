/*
 * Escreva um programa que receba um nome commpleto
 * e exiba o sobrenome (último nome) primeiro.
*/

import java.util.Scanner;

public class SobrenomePrimeiro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nomeCompleto = solicitarValor("Digite um nome completo: ", entrada);

        String[] partesNome = partesNome(nomeCompleto);

        imprimirSobrenome(partesNome);

        entrada.close();
    }

    public static String solicitarValor(String mensagem, Scanner entrada) {
        String nomeCompleto;
        while (true) {
            System.out.print(mensagem);
            nomeCompleto = entrada.nextLine().trim();
            if (nomeCompleto.isEmpty()) {
                System.out.println("Entrada vazia nao permitida. Digite um nome valido.");
            } else if (validarEntrada(nomeCompleto)) {
                return nomeCompleto;
            } else {
                System.out.println("Entrada invalida. Digite apenas letras, sem numeros ou caracteres especiais.");
            }
        }
    }

    public static boolean validarEntrada(String nomeCompleto) {
        for (int i = 0; i < nomeCompleto.length(); i++) {
            char c = nomeCompleto.charAt(i);
            if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
                return false;
            }
        }
        return true;
    }

    public static String[] partesNome(String nomeCompleto) {
        // Divide o nome completo em partes separadas pelo espaço em branco
        return nomeCompleto.split("\\s+");
    }

    public static void imprimirSobrenome(String[] nomeCompleto) {
        String sobrenome = nomeCompleto.length > 1 ? nomeCompleto[nomeCompleto.length - 1] : "";

        System.out.println("Sobrenome: " + (sobrenome.isEmpty() ? "[Nao infomado]" : sobrenome));
    }
}
