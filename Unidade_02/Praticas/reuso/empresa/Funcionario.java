package Unidade_02.Praticas.reuso.empresa;

public class Funcionario extends Pessoa {
    private float salario;

    public Funcionario(String nome, String identidade, float salario) {
        super(nome, identidade);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }
}
