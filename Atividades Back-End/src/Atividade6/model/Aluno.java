package Atividade6.model;

public class Aluno {
    String nome;
    private int[] notas = new int[3];
    private float media;
    private boolean estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Aluno(String nome, int[] notas, float media, boolean estado){
        this.nome = nome;
        this.notas = notas;
        this.media = media;
        this.estado = estado;
    }
}
