package Unidade_02.Praticas.tabuleiro;

public class JogoDeDamas {
    private static final int linhas = 8;
    private static final int colunas = 8;
    private char tabuleiro[][];

    public JogoDeDamas() {
        this.tabuleiro = new char[linhas][colunas];
        for(int l = 0; l < linhas; l++) {
            for(int c = 0; c < colunas; c++) {
                tabuleiro[l][c] = '.';
            }
        }

        for(int l = 0; l < 3; l++) {
            int inicio = (l%2 == 0)? 1 : 0;
            for(int c = inicio; c < colunas; c+=2) {
                tabuleiro[l][c] = 'x';
            }
        }

        for(int l = 5; l < linhas; l++) {
            int inicio = (l%2 == 0)? 1 : 0;
            for(int c = inicio; c < colunas; c+= 2) {
                tabuleiro[l][c] = 'o';
            }
        }

    }

    public String toString() {
        String res = "";
        for(int l = 0; l < linhas; l++) {
            for(int c = 0; c < colunas; c++) {
                res += tabuleiro[l][c] + " ";
            }
            res += "\n";
        }
        return res;
    }

}