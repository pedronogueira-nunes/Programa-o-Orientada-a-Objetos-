package triangulo;

public class DemoTriangulo {
    public static void main(String[] args) {
        Triangulo t1, t2, t3;
        t1 = new Triangulo();
        t1.inicializaTriangulo(3F, 4F, 5F, "Triangulo Retangulo");
        t2 = new Triangulo();
        t2.inicializaTriangulo(3F, 4F, 5F, "Triangulo Retangulo");
        t3 = t1;
        System.out.println(t1 == t2);
        System.out.println(t1 == t3);
    }
}
