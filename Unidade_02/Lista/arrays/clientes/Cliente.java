package Unidade_02.Lista.arrays.clientes;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String toString() {
        return "Cliente: " + nome + " ID: " + id + " Idade: " + idade + " Telefone: " + telefone + "\n";
    }

}
