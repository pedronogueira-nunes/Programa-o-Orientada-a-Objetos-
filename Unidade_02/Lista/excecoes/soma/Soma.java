package Unidade_02.Lista.excecoes.soma;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int result;

        result = obterIntValido();
        System.out.println("Resultado: " + result);
        
    }

    public static int obterIntValido() {
        Scanner ent = new Scanner(System.in);
        int num1, num2;
        try{
        System.out.print("Informe um número ");
        num1 = ent.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("O número deve ser um inteiro");
            System.out.print("Informe o número ");
            num1 = ent.nextInt();
        }
        try{
        System.out.print("Informe um número ");
        num2 = ent.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("O número deve ser um inteiro");
            System.out.print("Informe o número ");
            num2 = ent.nextInt();
        } finally {
            ent.close();
        }
        return (num1 + num2);
    }

}
