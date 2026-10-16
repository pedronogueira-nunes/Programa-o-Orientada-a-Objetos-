package Unidade_02.Praticas.abstratas.controle;

public abstract class Terrestre extends Veiculo {
    private int qtdrodas;

    public Terrestre(int capacidade, int qtdrodas) {
        super(capacidade);
        this.qtdrodas = qtdrodas;
    }

    @Override
    public String toString() {
        return "Terrestre [qtdrodas=" + qtdrodas + ", toString()=" + super.toString() + "]";
    }
    
}
