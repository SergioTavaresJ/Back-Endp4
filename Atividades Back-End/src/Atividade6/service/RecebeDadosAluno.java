package Atividade6.service;

import Atividade6.model.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecebeDadosAluno {
    Scanner leitor = new Scanner(System.in);
    List<Aluno> alunos = new ArrayList<>();

    public List<Aluno> nomeDoAluno(){
        while (true){
            System.out.println("Digite o nom do Aluno: ");
            String nome = leitor.nextLine();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            int[] notas = new int[3];
            float media = 0;
            float soma = 0;
            float mediaGeral = 0;
            int divisor = 0;
            boolean estado = false;

            for(int i =0; i < 3; i++){
                divisor +=1;
                System.out.println("Digite a " + (i + 1) + "°Nota de" + nome + ": ");
                notas[i] = leitor.nextInt();
                soma += notas[i];
                media = soma/notas.length;

                leitor.nextLine();
                mediaGeral += media;
                mediaGeral /= divisor;
            }
            Aluno novoAluno = new Aluno(nome, notas, media, estado);
            alunos.add(novoAluno);
        }
        return alunos;
    }
    public float mediaDaTurma(){
        float somarMedias = 0;
        for(Aluno aluno :alunos){
            somarMedias += aluno.getMedia();
        }
        return somarMedias;
    }
}
