package Agregacao.Test;

import Agregacao.Professor;
import Agregacao.Curso;

public class TestCursosProfessores {
    public static void main(String[] args) {

        Professor p1 = new Professor("Ana", "Mecatrônica");
        Professor p2 = new Professor("Cleber", "Ciência da Computação");

        Curso si = new Curso("Sistemas de Informação", 4);
        Curso cc = new Curso("Ciência da Computação", 4);

        si.adicionarProfessor(p1);
        si.adicionarProfessor(p2);
        cc.adicionarProfessor(p2);

        si.listarProfessores();
        System.out.println("==========");
        cc.listarProfessores();

        si.removerProfessor(new Professor("Ana", "Mecatrônica"));
        System.out.println("==========\n");
        System.out.println("=== depois de remover o objeto p1 ===");
        si.listarProfessores();
        cc.listarProfessores();
    }
}
