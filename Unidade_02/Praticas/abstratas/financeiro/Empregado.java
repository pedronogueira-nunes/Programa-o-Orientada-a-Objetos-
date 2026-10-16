package Unidade_02.Praticas.abstratas.financeiro;

public abstract class Empregado implements Pagavel {
    @SuppressWarnings("unused")
	private String nome;
    @SuppressWarnings("unused")
	private String ctps;
    
    public Empregado(String nome, String ctps) {
        this.nome = nome;
        this.ctps = ctps;
    }

}
