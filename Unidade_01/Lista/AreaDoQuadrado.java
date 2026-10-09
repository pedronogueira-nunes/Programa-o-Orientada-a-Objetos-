package Lista;

import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        int num, area;

        System.out.print("Digite o valor de um lado do quadrado: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();

        area = quadrado(num);
        System.out.println("A área do quadrado de lado " + num + " = " + area);

        entrada.close();
    }

    public static int quadrado(int n){
        return(n * n);
    }
}
