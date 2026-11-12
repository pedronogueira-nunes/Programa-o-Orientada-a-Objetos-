package Unidade_02.Praticas.excecoes.divisao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n, d, resp;

        try {
        System.out.print("Numerador: ");
        n = ent.nextInt();

        System.out.print("Denominador: ");
        d = ent.nextInt();

        resp = divisao(n, d);
        
        System.out.println(n + "/" + d + " = " + resp);
        
        } catch(ArithmeticException e) {
            System.out.println("Divisão por zero não é possível");
        } catch(InputMismatchException e) {
            System.out.println("Numerador e denominador devem ser inteiros");
        } finally {
            System.out.println("Encerrando programa");
            ent.close();
        }
        
    }

    public static int divisao(int num, int den) {
        return (num/den);
    }
}
