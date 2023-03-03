import java.util.TreeSet;

public class Actividad5_1 {
    public static void main(String[] args) {
        TreeSet<Persona> Personas = new TreeSet<>(); //ordenar por orden alfabetico y por edad en caso de igual nombre
        Persona Manolo = new Persona("Juan", 34);
        Persona Adri = new Persona("Alberto", 21);
        Persona Pepa = new Persona("Josefa", 64);
        Persona Ricky = new Persona("Raul", 13);

        Personas.add(Manolo);
        Personas.add(Ricky);
        Personas.add(Pepa);
        Personas.add(Adri);

        System.out.println(Personas);


    }
}
