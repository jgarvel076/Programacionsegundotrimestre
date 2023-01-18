package ejemplo1;

public class ejemploPolimorfismo {

    public static void main(String[] args) {
        Superclase s;
        s = new SubclaseA();
        s.metodo();

        s = new SubclaseB();
        s.metodo();
    }
}
