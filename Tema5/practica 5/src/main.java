package src;import java.util.Stack;

public class main {
    public static void main(String[] args) {
        cola colaPersonas = new cola();

        persona Julia = new persona("Julia");
        persona Juan = new persona("Juan");
        persona Paca = new persona("Paca");
        persona Alonso = new persona("Alonso");
        persona Nano = new persona("Nano");
        persona Josefa = new persona("Josefa");

        System.out.print("Quitamos a Julia ");
        colaPersonas.descolar();
        System.out.println(colaPersonas);

        System.out.print("primera persona: ");
        colaPersonas.frente();

        System.out.print("todas las personas menos Juan: ");
        colaPersonas.resto();

        System.out.print("Cola limpia");
        colaPersonas.limpiar();
        System.out.println(colaPersonas);

        System.out.print("vacia");
        System.out.println(colaPersonas.vacia());

        System.out.print("longitud de la cola: ");
        colaPersonas.longitud();


        //pila

        System.out.println("Pila");

        pila pilaPersonas = new pila();


        System.out.print("Añadimos personas a la pila: ");
        pilaPersonas.apilar(Julia);
        pilaPersonas.apilar(Juan);
        pilaPersonas.apilar(Paca);
        pilaPersonas.apilar(Alonso);
        pilaPersonas.apilar(Nano);
        pilaPersonas.apilar(Josefa);
        System.out.println(pilaPersonas);

        System.out.print("Quitamos el ultimo elemento ");
        pilaPersonas.desapilar();
        System.out.println(pilaPersonas);

        System.out.print("ultimo elemento ");
        pilaPersonas.cima();

        System.out.print("Limpiamos ");
        pilaPersonas.limpiar();
        System.out.println(pilaPersonas);


        System.out.print("Vacia");
        System.out.println(pilaPersonas.vacia());

        System.out.print("Pintamos la longitud: ");
        pilaPersonas.longitud();

    }
}
