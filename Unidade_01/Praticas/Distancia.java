import java.util.Scanner;

public class Distancia {
    public static void main(String[] args){
        double x1, y1, x2, y2, d;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor de x1: ");
        x1 =entrada.nextDouble();
        System.out.print("Digite o valor de y1: ");
        y1 = entrada.nextDouble();
        System.out.print("Digite o valor de x2: ");
        x2 = entrada.nextDouble();
        System.out.print("Digite o valor de y2: ");
        y2 = entrada.nextDouble();
        d = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));

        System.out.println(d);

        entrada.close();
    }
}
