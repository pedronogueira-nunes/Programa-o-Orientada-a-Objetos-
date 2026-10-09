package Unidade_02.pascal;

import java.util.Scanner;;

public class pascal {
    public static void main(String[] args) {
        int linhas;
        Scanner ent = new Scanner(System.in);

        System.out.println("Linhas: ");
        linhas = ent.nextInt();

        int tri[][] = new int[linhas][];

        for(int l = 0; l < tri.length; l++) {
            tri[l] = new int[l+2];
            tri[l][0] = 1;
            tri[l][l+1] = 1;
            if(l == 0) continue;
            for(int c = 1; c <= l; c++) {
                tri[l][c] = tri[l-1][c] + tri[l-1][c-1];
            }
        }

        for(int l = 0; l <tri.length; l++) {
            for(int c = 0; c < tri[l].length; c++) {
                System.out.printf("%d ", tri[l][c]);
            }
            System.out.print("\n");
        }

        ent.close();

    }

    
}