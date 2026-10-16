package Unidade_02.Praticas.reuso.empresa;

public class ChefeDeDepartamento extends Funcionario {
    @SuppressWarnings("unused")
	private String departamento;

    public ChefeDeDepartamento(String nome, String identidade, float salario, String departamento) {
        super(nome, identidade, salario);
        this.departamento = departamento;
    }

    
}
