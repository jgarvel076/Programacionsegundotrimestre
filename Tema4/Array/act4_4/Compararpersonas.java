package act4_4;

public class Compararpersonas {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "p1";
        Persona p2 = new Persona();
        p2.nombre = "p1";

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}
