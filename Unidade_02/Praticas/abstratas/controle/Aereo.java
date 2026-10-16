package Unidade_02.Praticas.abstratas.controle;

public abstract class Aereo extends Veiculo {
    private String cadAnac;

    public Aereo(int capacidade, String cadAnac) {
        super(capacidade);
        this.cadAnac = cadAnac;
    }

    @Override
    public String toString() {
        return "Aereo [cadAnac=" + cadAnac + ", toString()=" + super.toString() + "]";
    }

}
