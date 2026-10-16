package Unidade_02.Lista.abstratas.figuras;

public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calculaCircunferencia() {
        return 2 * 3.14 * raio;
    }

    public double calculaArea() {
        return 3.14 * (raio * raio);
        
    }

    public String toString() {
        return "Raio: " + raio;
    }

    public String descricao() {
        String descricao = "Circulo\n" + toString();
        descricao += "\nCircunferência: " + calculaCircunferencia() + "\nArea: " + calculaArea();
        return descricao;
    }
}
