package atividade01_exercicio07.entidades;


import java.time.LocalDate;


public class DataEmprestimo {
    private LocalDate dataSaida;
    private LocalDate dataVolta;

    public DataEmprestimo(LocalDate dataSaida, LocalDate dataVolta) {
        this.dataSaida = dataSaida;
        this.dataVolta = dataVolta;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(LocalDate dataVolta) {
        this.dataVolta = dataVolta;
    }
}
