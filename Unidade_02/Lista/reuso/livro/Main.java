package Unidade_02.Lista.reuso.livro;

public class Main {
    public static void main(String[] args) {
        LivroBiblioteca b1 = new LivroBiblioteca(1, "M", "Comedia", "11/12");
        LivroLivraria l1 = new LivroLivraria(2, "N", "Suspense", 15.5F);

        System.out.println(b1.toString());
        System.out.println(l1.toString());
    }
}
