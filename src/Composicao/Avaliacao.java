package Composicao;

public class Avaliacao {
    private String titulo;
    private Questao[] questoes;
    private int quantidade;

    public Avaliacao(String titulo, int capacidade) {
        this.titulo = titulo;
        this.questoes = new Questao[capacidade];
        this.quantidade = 0;
    }

    public void adicionarQuestao(String enunciado, double pontuacao) {
        if (quantidade == questoes.length) {
            System.out.println("Avaliação cheia");
            return;
        }
        questoes[quantidade] = new Questao(enunciado, pontuacao);
        quantidade++;
    }

    public void removerQuestao(String enunciado) {
        for (int i = 0; i < quantidade; i++) {
            if (questoes[i].getEnunciado().equals(enunciado)) {
                for (int j = i; j < quantidade - 1; j++) {
                    questoes[j] = questoes[j + 1];
                }
                quantidade--;
                questoes[quantidade] = null;
                return;
            }
        }
        System.out.println("Questão não encontrada");
    }

    public void imprimirQuestoes() {
        System.out.println("Avaliação " + titulo);
        if (quantidade == 0) {
            System.out.println(" (NENHUMA QUESTÃO)");
        }
        for (int i = 0; i < quantidade; i++) {
            System.out.println((i + 1) + ")");
            questoes[i].imprimir();
        }
    }

    public double calcularPontuacaoTotal() {
        double total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += questoes[i].getPontuacao();
        }
        return total;
    }


}
