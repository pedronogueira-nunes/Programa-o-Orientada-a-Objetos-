package Unidade_02.Praticas.abstratas.controle;

public class Bicicleta extends Terrestre {
    private String cor;

    public Bicicleta(int capacidade, int qtdrodas, String cor) {
        super(capacidade, qtdrodas);
        this.cor = cor;
    }

    public void moverFrente() {
        System.out.println("A bicicleta se moveu para frente");
    }

    @Override
    public String toString() {
        return "Bicicleta [cor=" + cor + ", toString()=" + super.toString() + "]";
    }

}
