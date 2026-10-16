package Unidade_02.Praticas.reuso.Praticas.concessionaria;

public class Automovel {
    private int ano;
    private String modelo;
    private String cor;

    public Automovel(int ano, String modelo, String cor) {
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
    }

    public float quantoCusta() {
        return (ano<2010 ? 35000 : 80000);
    }
    
    @Override
    public String toString() {
        return "Automovel [ano=" + ano + ", modelo=" + modelo + ", cor=" + cor + "]";
    }

    
}
