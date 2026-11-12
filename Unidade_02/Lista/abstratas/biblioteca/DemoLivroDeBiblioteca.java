package Unidade_02.Lista.abstratas.biblioteca;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca l1 = new LivroDeBiblioteca("O pequeno gigante", "João", 120, 2026, "Prateleira 1", "...");
        System.out.println(l1.estaEmprestado());
        l1.empresta();
        System.out.println(l1.estaEmprestado());
        

    }
}
