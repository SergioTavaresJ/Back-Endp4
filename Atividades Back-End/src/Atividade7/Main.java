package atividade01_exercicio07;

import atividade01_exercicio07.entidades.Cliente;
import atividade01_exercicio07.entidades.DataEmprestimo;
import atividade01_exercicio07.entidades.Endereco;
import atividade01_exercicio07.entidades.Livros;
import atividade01_exercicio07.serviceDTO.EmprestimosDTO;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dataSaida = LocalDate.now();
        LocalDate dataVolta = dataSaida.plusMonths(1);

        DataEmprestimo emprestimo = new DataEmprestimo(dataSaida, dataVolta);
        Livros livros = new Livros("O dia do Curinga ", "Jostein Gaarder ", 341, "Schwarcz S.A. - São Paulo");
        Endereco endereco = new Endereco("58800000 ", "Corda ", "Rua da Corda Bamba ", 3000);
        Cliente cliente = new Cliente("Klébio Costa ", "00000000000 ", LocalDate.of(1500, 1, 1), "(83)99090-0000", endereco, livros, new DataEmprestimo(dataSaida, dataVolta));

        EmprestimosDTO dto = new EmprestimosDTO(
            cliente.getNome(),
            cliente.getLivros().getNome(),
            cliente.getEmprestimo().getDataSaida(),
            cliente.getEmprestimo().getDataVolta()
        );
        System.out.println("Nome do Cliente: "+ dto.getNomeDoCliente());
        System.out.println("Nome do livro: "+ dto.getNomeDoLivro());
        System.out.println("Data do emprestimo: "+ dto.getDataEmprestimo());
        System.out.println("Data de devolução: "+ dto.getDevolucao());
    }
}
