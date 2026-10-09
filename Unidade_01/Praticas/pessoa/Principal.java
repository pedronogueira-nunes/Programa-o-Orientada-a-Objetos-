package pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria", 1.65F);
        System.out.println(pessoa.toString());
        pessoa.setAltura(1.5F);
        System.out.println("Nova altura: " + pessoa.getAltura());
        pessoa.setAltura(1.9F);
        System.out.println("Noma altura 2: " + pessoa.getAltura());

        Pessoa pessoa2 = new Pessoa("João", 1.6F);
        System.out.println(pessoa2.toString());
    }
}
