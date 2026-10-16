package Unidade_02.Praticas.abstratas.controle;

public class Barco extends Aquatico {
    private String codIdentificacao;

    public Barco(int capacidade, float profundidade, String codIdentificacao) {
        super(capacidade, profundidade);
        this.codIdentificacao = codIdentificacao;
    }

    public void moverFrente() {
        System.out.println("O barco se moveu para frente");
    }

    @Override
    public String toString() {
        return "Barco [codIdentificacao=" + codIdentificacao + ", toString()=" + super.toString() + "]";
    }
    
}
