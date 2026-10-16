package Unidade_02.Praticas.abstratas.controle;

public abstract class Veiculo {
    private int capacidade;

    public Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    

    @Override
    public String toString() {
        return "Veiculo [capacidade=" + capacidade + "]";
    }



    public abstract void moverFrente();
    
}
