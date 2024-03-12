//Escrever um código que receba um número inteiro e informe se ele é um número primo.

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {



        Scanner leitor = new Scanner(System.in);
        int numeroPrimo;
        int nDivisor = 0;

        System.out.println("Digite um numero");
        numeroPrimo = leitor.nextInt();

        for(int i = 1; i <= numeroPrimo; i++){
            if(numeroPrimo % i == 0){
                nDivisor++;
            }
        }

        if(nDivisor == 2){
            System.out.println("O numero digitado é primo!");
        } else {
            System.out.println("O numero digitado não é primo!");
        }
    }

}
