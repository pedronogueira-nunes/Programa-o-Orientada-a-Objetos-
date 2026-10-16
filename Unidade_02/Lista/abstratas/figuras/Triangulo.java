package Unidade_02.Lista.abstratas.figuras;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double lado2;
    private double lado3;
    private double altura;

    public Triangulo(double base, double lado2, double lado3, double altura) {
        this.base = base;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }

    public double calculaPerimetro() {
        return base + lado2 + lado3;
    }

    public double calcularArea() {
        return (base/2) * altura;
    }

    public String toString() {
        return "Base: " + base + "\tAltura: " + altura;
    }

    public String descricao() {
        String descricao = "Triângulo\n" + toString();
        descricao += "\nPerimetro: " + calculaPerimetro() + "\nArea: " + calcularArea();
        return  descricao;
    }

}
