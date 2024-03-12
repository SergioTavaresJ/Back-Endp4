package Atividade6.service;

import Atividade6.model.Aluno;

import java.util.List;

public class ImpDadosAluno {
    public void lerDadosAluno(List<Aluno> alunos) {
        System.out.println("Boletim escolar do Aluno: ");
        for (Aluno aluno : alunos) {
            System.out.println(" \nNome do aluno: " + aluno.getNome().toUpperCase());

            int[] notas = aluno.getNotas();
            for (int i =0; i< notas.length; i++) {
                System.out.println((i + 1) + " nota: " + notas[i]);
            }
            System.out.printf("\nMédia final: %.1f", aluno.getMedia());
            System.out.println();
        }
        imprimirAlunos(alunos);
    }
    public void imprimirAlunos(List<Aluno> alunos){
        int aprovados =0;
        int reprovados =0;

        System.out.println("\nAlunos aprovados: ");
        for(Aluno aluno :alunos){
            if(aluno.getMedia() >= 6.0){
                System.out.println("Nome:" +aluno.getNome()+ ", Média: " +aluno.getMedia());
                aprovados++;
            }else {
                reprovados++;
            }
        }
        System.out.println("\nAlunos reprovados: ");
        for (Aluno aluno : alunos){
            if (aluno.getMedia() <6.0){
                System.out.println("Nome: " + aluno.getNome() + ", Média: " + aluno.getMedia());
            }
        }
        System.out.println("\nTotal aprovados: " + aprovados+ "\nTotal reprovados: " +reprovados);
    }
}
