package circulo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pi: " + Circulo.pi);

        Circulo circ1 = new Circulo(1.0F);
        System.out.println("Perimetro 1: " + circ1.calculaPerimetro());

        Circulo circ2 = new Circulo(2.0F);
        System.out.println("Perimetro 1: " + circ2.calculaPerimetro());

    }
}
