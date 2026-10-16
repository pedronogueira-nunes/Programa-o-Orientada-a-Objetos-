package Unidade_02.Lista.abstratas.empresa;

public class Funcionario {
    private String nome;
    private String funcao;
    private float salario;

    public Funcionario(String nome, String funcao, float salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.funcao = "Estagiario";
        this.salario = salario;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.funcao = "Estagiario";
        this.salario = 2.00F;
    }

    public String toString() {
        return "Nome: " + nome + "\nFunção: " + funcao + "\nSalario: " + calculaSalario();
    }

    public float calculaSalario() {
        return salario * 220;
    }
}
