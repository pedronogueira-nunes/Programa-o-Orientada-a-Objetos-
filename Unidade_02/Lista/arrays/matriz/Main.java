package Unidade_02.Lista.arrays.matriz;

public class Main {
    public static void main(String[] args) {
        Matriz m = new Matriz(5.2F, 0, 44, 3);
        float det;
        det = m.determinante();

        System.out.println(m.toString());
        System.out.println("Determinante da matriz: " + det);

    }
}
