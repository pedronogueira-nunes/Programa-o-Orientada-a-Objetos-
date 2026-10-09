import java.text.DecimalFormat;
public class Velocidade {
    public static void main(String[] args){
        float kmh = 0.0F, mps, mph, pps;
        DecimalFormat df = new DecimalFormat("00.00");

        System.out.println("KM/H");
        while(kmh <= 50.0F){
            mps = 0.2778F*kmh;
            mph = 0.6214F*kmh;
            pps = 0.9113F*kmh;
            System.out.println("| "+ df.format(kmh) +" | "+ df.format(mps) +" | "+ df.format(mph) +" | "+ df.format(pps) +" |");
            kmh += 0.5F;
        }
    }
}
