package Lista;

import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args){
        int num1, num2, num3, som, med;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite três valores: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();

        som = soma(num1, num2, num3);
        med = media(num1, num2, num3);

        System.out.println("Os resultados são:");
        System.out.println("Soma = " + som);
        System.out.println("Média = " + med);

        entrada.close();
    }

    public static int soma(int n1, int n2, int n3){
        return(n1 + n2 +n3);
    }

    public static int media(int n1, int n2, int n3){
        return((n1 + n2 + n3)/3);
    }
}
