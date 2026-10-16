package Unidade_02.Praticas.reuso.Praticas.empresa;

public class Pessoa {
    private String nome;
    private String identidade;

    public Pessoa(String nome, String identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    public String getNome() {
        return  nome;
    }    

    public String getIdentidade() {
        return  identidade;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", identidade=" + identidade + "]";
    }   

}
