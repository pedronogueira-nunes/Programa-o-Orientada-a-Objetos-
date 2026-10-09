public class PiSobreSeis {
    public static void main(String[] args) {
        double[] termosDaSerie = new double[1000000];

        for(int i = 0; i < termosDaSerie.length; i++) {
            termosDaSerie[i] = 1.0/Math.pow(i + 1, 2.0);
        }

        for(int i = 10; i < termosDaSerie.length; i++) {
            calculaEMostraSomatorio(termosDaSerie, i);
        }
    }

    public static void calculaEMostraSomatorio(double[] vetor, int num) {
        double soma = 0.0;
        for(int i =0; i < num; i++) {
            soma += vetor[i];
        }
        System.out.println(soma);
    }
}