package Composicao.Test;

import Composicao.Avaliacao;

public class TestAvaliacoesQuestoes {
    public static void main(String[] args) {

        Avaliacao prova1 = new Avaliacao("de Orientação ao Objeto - Unidade 1", 10);

        prova1.adicionarQuestao("O que é paradigma de programação?", 2.5);
        prova1.adicionarQuestao("O que é encapsulamento?", 3.0);
        prova1.adicionarQuestao("Diferencie agregação e composição", 4.5);

        prova1.imprimirQuestoes();
        System.out.println("Total: " + prova1.calcularPontuacaoTotal());

        prova1.removerQuestao("O que é paradigma de programação?");
        System.out.println("=== depois de remover uma questão ===");
        prova1.imprimirQuestoes();
        System.out.println("Total: " + prova1.calcularPontuacaoTotal());
    }
}
