package Unidade_02.media;

public class Media {
    public static void main(String[] args) {
        System.out.print(media(4.5, 5.5, 6.7));
    }

    /* public static double media(double[] d) {
        double soma = 0;
        for(double e : d) {
            soma += e;
        }
        return soma/d.length;
    } */

    public static double media(double... d) {
        double soma = 0;
        for(double e : d) {
            soma += e;
        }
        return soma/d.length;
    }
    
}