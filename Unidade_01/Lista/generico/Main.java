package Lista.generico;

public class Main {
    public static void main(String[] args) {
        Generico<Integer> g1 = new Generico<>(2, 4, 7);
        System.out.println(g1.Iguais());

        Generico<Double> g2 = new Generico<>(2.2, 2.3, 2.2);
        System.out.println(g2.Iguais());

        Generico<String> g3 = new Generico<>("Pedro", "João", "Paulo");
        g3.mostrarAtributo();

    }
}
