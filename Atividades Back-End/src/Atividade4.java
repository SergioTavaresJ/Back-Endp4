//4o Escreva um código que receba uma String qualquer e a imprima de forma invertida.
//Ex.:
//Entrada: estude java
//Saída: avaj edutse

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite Alguma coisa!");
        String texto = leitor.nextLine();
        leitor.close();

        String invertido = reverse(texto);
        System.out.println("" + invertido);
    }

    public static String reverse (String texto) {
        StringBuilder sb = new StringBuilder(texto);
        return sb.reverse().toString();
    }
}

