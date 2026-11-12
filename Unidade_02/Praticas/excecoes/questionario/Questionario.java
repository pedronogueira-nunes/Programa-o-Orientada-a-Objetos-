package Unidade_02.Praticas.excecoes.questionario;

public class Questionario {
    public static void main(String[] args) {
        int resp[] = {0, 2, 3, 5, 1, 1, 14, 3, 3, 2};
        int cont[] = new int[6];
        for(int i = 0; i < cont.length; i++) {
            cont[i] = 0;
        }
        for(int r : resp) {
            try{
            cont[r]++;
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("A resposta " + r + " é invalida. " +
                "A resposta foi ignorada");
            }
        }
        for(int i = 0; i < cont.length; i++) {
            System.out.println(i + ":" + cont[i]);
        }
    }
}