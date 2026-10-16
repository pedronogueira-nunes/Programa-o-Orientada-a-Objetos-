package triangulo;
public class Triangulo {
    private float l1;
    private float l2;
    private float l3;
    @SuppressWarnings("unused")
	private String desc;

    public void inicializaTriangulo(float lado1, float lado2, float lado3, String descricao) {
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        desc = descricao;
    }

    public float calculaPerimetro() {
        return (l1 + l2 + l3);
    }
}
