//Escreva um código que receba uma String simples (apenas uma palavra) e monte um array
//com os valores respectivos a cada letra da palavra, os organize em ordem crescente, imprima
//esse array e a palavra na nova ordem.
//Ex.:
//Entrada: estudar
//Array: {5, 19, 20, 21, 4, 1, 18}
//Array ordenado: {1, 4, 5, 18, 19, 20, 21}
//Saída: aderstu.

import java.util.Arrays;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Imprima uma palavra: ");
        String palavra = leitor.nextLine();

        char[] caract = palavra.toCharArray();
        int[] arnumero = new int[caract.length];
        boolean[] printed = new boolean[caract.length];
        System.out.println("Entrada: " + palavra);

        for (int i = 0; i < caract.length; i++) {
            arnumero[i] = (int) caract[i] - 96;
        }
        System.out.println("Array: " + Arrays.toString(arnumero));
        for (int i = 0; i < arnumero.length; i++) {
            if (i != arnumero.length - 1) {

            }
        }


        Arrays.sort(arnumero);

        System.out.print("Array ordenado:{ ");

        for (int i = 0; i < arnumero.length; i++) {
            if (i != arnumero.length - 1) {
                System.out.print(arnumero[i] + ", ");
            } else {
                System.out.print(arnumero[i] + "}");
            }
        }

        System.out.println();
        System.out.print("Saida: ");
        for (int i = 0; i < arnumero.length; i++) {
            for (int j = 0; j < caract.length; j++) {
                if ((int) caract[j] - 96 == arnumero[i] && !printed[j]) {
                    System.out.print(caract[j]);
                    printed[j] = true;


                }
            }
        }
    }
}