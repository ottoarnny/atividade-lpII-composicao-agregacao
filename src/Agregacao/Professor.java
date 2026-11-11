package Agregacao;

public class Professor {
    private String nome;
    private String areaFormacao;

    public Professor(String nome, String areaFormacao) {
        this.nome = nome;
        this.areaFormacao = areaFormacao;
    }

    public boolean equals(Professor outro) {
        if (outro == null) {
            return false;
        }
        return this.nome.equals(outro.nome) && this.areaFormacao.equals(outro.areaFormacao);
    }

    public void imprimirProfessores() {
        System.out.println(" " + nome + " | " + areaFormacao);
    }

}
