package Lista;

import java.util.Scanner;

public class CDU {
    public static void main(String[] args){
        int c, d, u, r;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número no formato CDU: ");
        c = entrada.nextInt();
        if(c >= 0 && c <= 999) {
            d = c % 100;
            c = c / 100;
            u = d % 10;
            d = d / 10;
            System.out.println("O numero no formato UCD é: " + u + c + d);
        } else {
            System.out.println("Erro");
        }
    }
}
