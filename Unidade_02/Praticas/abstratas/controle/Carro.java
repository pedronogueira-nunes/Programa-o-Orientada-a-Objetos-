package Unidade_02.Praticas.abstratas.controle;

public class Carro extends Terrestre {
    private String placa;

    public Carro(int capacidade, int qtdrodas, String placa) {
        super(capacidade, qtdrodas);
        this.placa = placa;
    }

    public void moverFrente() {
        System.out.println("O carro se moveu para frente");
    }

    @Override
    public String toString() {
        return "Carro [placa=" + placa + ", toString()=" + super.toString() + "]";
    }

    
    
}
