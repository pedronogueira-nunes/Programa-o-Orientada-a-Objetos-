package Unidade_02.Praticas.reuso.Praticas.concessionaria;

public class AutomovelBasico extends Automovel {
    private boolean airbag;
    private boolean radio;

    public AutomovelBasico(int ano, String modelo, String cor, boolean airbag, boolean radio) {
        super(ano, modelo, cor);
        this.airbag = airbag;
        this.radio = radio;
    }

    public float quantoCusta() {
        float custo = super.quantoCusta();
        if(airbag) custo += 1000;
        if(radio) custo += 1000;
        return  custo;
    }

    @Override
    public String toString() {
        return super.toString() + "AutomovelBasico [airbag=" + airbag + ", radio=" + radio + "]";
    }

    
}
