package circulo;

public class Circulo {
    private float raio;
    public static final double pi = 3.14;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public double calculaPerimetro() {
        return(2 * pi * raio);
    }

}
