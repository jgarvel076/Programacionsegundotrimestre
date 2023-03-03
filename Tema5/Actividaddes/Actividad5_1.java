import java.util.TreeSet;

public class Actividad5_1 {
    public static void main(String[] args) {
        TreeSet<Persona> Personas = new TreeSet<>(); //ordenar por orden alfabetico y por edad en caso de igual nombre
        Persona Juan = new Persona("Juan", 34);
        Persona Alberto = new Persona("Alberto", 21);
        Persona Josefa = new Persona("Josefa", 64);
        Persona Raul = new Persona("Raul", 13);

        Personas.add(Juan);
        Personas.add(Alberto);
        Personas.add(Josefa);
        Personas.add(Raul);

        System.out.println(Personas);


    }
}
