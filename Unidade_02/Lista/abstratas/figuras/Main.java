package Unidade_02.Lista.abstratas.figuras;

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(4);
        Quadrado q1 = new Quadrado(2);
        Triangulo t1 = new Triangulo(2, 1.2, 1, 2.5);

        System.out.println(c1.descricao());
        System.out.println(t1.descricao());
        System.out.println(q1.descricao());
    }
}
