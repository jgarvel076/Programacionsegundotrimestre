import java.util.Arrays;

public class ejemplo9clonarArray {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = a.clone();
        System.out.print(Arrays.toString(a));
        System.out.println(a);
        System.out.print(Arrays.toString(b));
        System.out.println(b);

        Persona p1 = new Persona("p1");
        Persona p2 = new Persona("p2");
        Persona p3 = new Persona("p3");
        Personas[] personasA = {p1,p2,p3};
        Personas[] persoanasB = personasA.clone();

        System.out.print(Arrays.toString(personasA));
        System.out.println(personasA);
        System.out.print(Arrays.toString(personasB));
        System.out.println(personasB);

        for (persona p: personasA) {
            System.out.println(personasA[i]);
        }
    }
}
