package Lista;

import java.util.Scanner;

public class Graus {
    public static void main(String[] args){
        double c, f;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a temperatura em C°: ");
        c = entrada.nextDouble();

        f = 1.8 * c + 32;
        System.out.printf("A temperatura em fahrenhait e aproximadamente: %.2f", f);

        entrada.close();
    }
}
