package Agregacao;

public class Curso {
    private String nome;
    private Professor[] professores;
    private int quantidade;

    public Curso(String nome, int quantidade) {
        this.nome = nome;
        this.professores = new Professor[quantidade];
        this.quantidade = 0;
    }

    public void adicionarProfessor(Professor professor) {
        if (professor == null) {
            System.out.println("Professor inválido");
            return;
        }
        if (quantidade == professores.length) {
            System.out.println("Curso cheio");
            return;
        }
        for (int i = 0; i < quantidade; i++) {
            if (professores[i].equals(professor)) {
                System.out.println("O professor já está no curso");
                return;
            }
        }
        professores[quantidade] = professor;
        quantidade++;
    }

    public void removerProfessor(Professor professor) {
        for (int i = 0; i < quantidade; i++) {
            if (professores[i].equals(professor)) {
                for (int j = i; j < quantidade - 1; j++) {
                    professores[j] = professores[j + 1];
                }
            }
            quantidade--;
            professores[quantidade] = null;
            return;
        }
        System.out.println("Professor não encontrado");
    }

    public void listarProfessores() {
        System.out.println("Professores de " + nome + ":");
        if (quantidade == 0) {
            System.out.println(" (NENHUM!)");
        }
        for (int i = 0; i < quantidade; i++) {
            professores[i].imprimirProfessores();
        }
    }

}
