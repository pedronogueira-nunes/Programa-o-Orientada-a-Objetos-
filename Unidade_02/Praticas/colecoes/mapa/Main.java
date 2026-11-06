import java.util.TreeMap;

public class Main{
    public static void main(String[] args) {
        String texto = "THE CAT Lili has a cat His name is Guga Guga is a cute cat" +
        "He jumps on the sofa. DRINK BABY MILK\r\n";
        String palavras[] = texto.split(" ");

        TreeMap<String, Integer> mapa = new TreeMap<>();

        for(String palavra : palavras) {
            String palavraMin = palavra.toLowerCase();
            if(mapa.containsKey(palavraMin)) {
                int qtd = mapa.get(palavraMin);
                mapa.put(palavraMin, ++qtd);
            }
            else {
                mapa.put(palavraMin, 1);
            }
        }

        for (String palavra : mapa.keySet()) {
            System.out.println(palavra + " : " + mapa.get(palavra));
        }
    }
}