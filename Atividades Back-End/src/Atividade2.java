//Escrever um código que sorteie um número randômico de 0 a 1000, peça um número inteiro
//neste intervalo, se o usuário errar, informar se o valor sorteado é maior ou menor que o
//informado e solicitar outro número do usuário até que ele acerte o número. Quando acertar,
//informar a quantidade de palpites que ele informou até acertar.


import java.util.Random;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        int numeroEscolhido = random.nextInt(1001);
        int tentativas = 0;
        int chute;

        while (true){
            System.out.println("Digite um número de 0 a 1000: ");
            chute = leitor.nextInt();
            tentativas++;

            if(chute == numeroEscolhido){
                System.out.println("Parabéns você acertou o número! \n"  + tentativas + " tentativas foram preciso!" );
                break;
            } else {

                if (chute < numeroEscolhido){
                    System.out.println("O número informado é menor! Tente novamente ");
                } else {
                    System.out.println("O número informado é maior! Tente novamente" );
                }
            }

        }


    }
}
