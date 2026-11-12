package Unidade_02.Lista.arrays.matriz;

public class Matriz {
    float[][] matriz = new float[2][2];

    public Matriz(float n1, float n2, float n3, float n4) {
        matriz[0][0] = n1;
        matriz[0][1] = n2;
        matriz[1][0] = n3;
        matriz[1][1] = n4;
    }

    public float determinante() {
        float n1 = matriz[0][0];
        float n2 = matriz[0][1];
        float n3 = matriz[1][0];
        float n4 = matriz[1][1];

        return n1 * n4 - n2 * n3;
    }

    public String toString() {
        float n1 = matriz[0][0];
        float n2 = matriz[0][1];
        float n3 = matriz[1][0];
        float n4 = matriz[1][1];

        return "|" + n1 + "|" + n2 + "|\n" + "|" + n3 + "|" + n4 + "|";
    }

}