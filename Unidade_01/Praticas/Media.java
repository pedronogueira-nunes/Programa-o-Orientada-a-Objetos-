import java.util.Scanner;
public class Media {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args){
        double d1, d2, d3;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primero número");
        d1 = entrada.nextDouble();
        System.out.print("");
        d2 = entrada.nextDouble();
        System.out.print("");
        d3 = entrada.nextDouble();
    }
    public static double media(double d1, double d2, double d3){
        double m = (d1+d2+d3)/3;
        return(m);
    }
}
