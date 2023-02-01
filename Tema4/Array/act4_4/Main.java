package act4_4;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Julián",18);
        Persona persona2 = new Persona("Jose Juan",34);
        Persona persona3 = new Persona("Idelfonso",24);
        Persona[] personas = {persona1,persona2,persona3};
        for (Persona x: personas){
            System.out.println(x);
        }
    }
}
