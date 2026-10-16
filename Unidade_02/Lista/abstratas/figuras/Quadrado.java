package Unidade_02.Lista.abstratas.figuras;

public class Quadrado extends FiguraGeometrica {
    private double tamLado;

    public Quadrado(double tamLado) {
        this.tamLado = tamLado;
    }

    public double calculaPerimetro() {
        return 4 * tamLado;
    }

    public double calculaArea() {
        return tamLado * tamLado;
    }

    public String toString() {
        return "Tamanho dos lados: " + tamLado;
    }

    public String descricao() {
        String descricao = "Quadrado\n" + toString();
        descricao += "\nPerimetro: " + calculaPerimetro() + "\nArea: " + calculaArea();
        return descricao;
    }

}
