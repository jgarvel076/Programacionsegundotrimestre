import java.util.TreeSet;

public class todo {
    //actividad 1:
    public class Actividad5_1 {
        public static void main(String[] args) {
            TreeSet<Persona> Personas = new TreeSet<>(); //ordenar por orden alfabetico y por edad en caso de igual nombre
            Persona Manolo = new Persona("Manolo", 24);
            Persona Adri = new Persona("Adri", 31);
            Persona Pepa = new Persona("Pepa", 14);
            Persona Ricky = new Persona("Ricky", 18);

            Personas.add(Manolo);
            Personas.add(Ricky);
            Personas.add(Pepa);
            Personas.add(Adri);

            System.out.println(Personas);


        }
    }


}
