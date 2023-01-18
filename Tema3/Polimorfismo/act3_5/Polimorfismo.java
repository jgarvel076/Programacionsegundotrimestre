package act3_5;

public class Polimorfismo {
    public static void main(String[] args) {
        Superclase s;

        s = new SubclaseA();
        s.metodo();

        s = new SubclaseB();
        s.metodo();

        s = new Superclase();
        s.metodo();

    }
}