package Unidade_02.Praticas.abstratas.controle;

public class Aviao extends Aereo {
    private String cadAviao;

    public Aviao(int capacidade, String cadAviao, String cadAnac) {
        super(capacidade, cadAnac);
        this.cadAviao = cadAviao;
    }

    public void moverFrente() {
        System.out.println("O avião se moveu para frente");
    }

    @Override
    public String toString() {
        return "Aviao [cadAviao=" + cadAviao + ", toString()=" + super.toString() + "]";
    }
    
}
