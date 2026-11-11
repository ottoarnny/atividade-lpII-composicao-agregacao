package Composicao;

public class Questao {
    private String enunciado;
    private double pontuacao;

    public Questao(String enunciado, double pontuacao) {
        this.enunciado = enunciado;
        this.pontuacao = pontuacao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void imprimir() {
        System.out.println(" " + enunciado + " (" + pontuacao + " pts)");
    }
}
