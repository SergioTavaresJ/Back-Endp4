//Escreva um código que receba um nome completo em forma de String e mostre as iniciais
//do nome.
//Ex.:
//Entrada: Demetrius de Castro do Amaral
//Saída: D.C.A

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu Nome completo: ");

        String nomeCompleto = leitor.nextLine();
        leitor.close();

        String[] nome = nomeCompleto.split(" ");
        String iniciais = "";

        for (int i = 0; i < nome.length; i++) {
            iniciais += nome[i].charAt(0);
            if (i != nome.length - 1) {
                iniciais += ".";
            }

        }
        System.out.println("Senhor(a):" + iniciais.toUpperCase());
    }
}