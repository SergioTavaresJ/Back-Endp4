//Escreva um código que tenha uma classe chamada Aluno, que receba três notas do tipo inteiro
//e o nome do aluno do tipo String.
//Pergunte ao usuário o nome do aluno e as três notas, continue pedindo alunos e notas até que o
//usuário digite “sair” como nome do aluno.
//Quando o usuário digitar “sair”, imprima a nota e média das notas de todos os alunos.
//Imprimir a média geral da turma.
//Imprimir a quantidade de alunos reprovados e aprovado (média >= 6 aprovado).
//Imprimir os nomes dos alunos aprovados
//Imprimir os nomes dos alunos reprovados

package Atividade6;

import Atividade6.model.Aluno;
import Atividade6.service.ImpDadosAluno;
import Atividade6.service.RecebeDadosAluno;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RecebeDadosAluno recebeDadosAluno = new RecebeDadosAluno();
        List<Aluno> alunos = recebeDadosAluno.nomeDoAluno();
        float mediaTurma = recebeDadosAluno.mediaDaTurma();
        System.out.printf("\nMédia da Turma %.2f\n" , mediaTurma);

        ImpDadosAluno imprimirDadosAluno = new ImpDadosAluno();
        imprimirDadosAluno.lerDadosAluno(alunos);
    }
}
