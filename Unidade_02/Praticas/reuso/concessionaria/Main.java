package Unidade_02.Praticas.reuso.concessionaria;

public class Main {
    public static void main(String[] args) {
        AutomovelDeLuxo l = new AutomovelDeLuxo(2025, "Ferrari",
     "Vermalho", true, true, true, true);

     System.out.println(l);
     System.out.println("Custo: " + l.quantoCusta());
    }

    
}
