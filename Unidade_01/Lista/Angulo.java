package Lista;

import java.util.Scanner;

public class Angulo {
    public static void main(String[] args){
        double ang, rad, cos, sin, tan, cossec, sec, cotan;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um ângulo em graus: ");
        ang = entrada.nextDouble();

        rad = Math.toRadians(ang);
        cos = Math.cos(rad);
        sin = Math.sin(rad);
        tan = Math.tan(rad);
        cossec = (1/sin);
        sec = (1/cos);
        cotan = (cos/sin);

        System.out.printf("Ângulo em radianos: %.2f\n", rad);
        System.out.printf("Seno: %.2f \tCosseno: %.2f \tTangente: %.2f\n", sin, cos, tan);
        System.out.printf("Secante: %.2f \tCossecante: %.2f \tCotangente: %.2f\n", sec, cossec, cotan);

        entrada.close();
    }
}
