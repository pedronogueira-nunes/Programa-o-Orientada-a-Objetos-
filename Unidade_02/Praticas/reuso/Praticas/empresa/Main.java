package Unidade_02.Praticas.reuso.Praticas.empresa;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Pedro", "092372847");
        Funcionario f = new Funcionario("Ana", "982436237436", 1234.5F);
        ChefeDeDepartamento c = new ChefeDeDepartamento("Paulo", "411525526532",
        2565.8F, "TI");

        System.out.println("Pessoa: " + p);
        System.out.println("Funcionario: " + f);
        System.out.println("Chefe de  Departamento:" + c);
    }
}
