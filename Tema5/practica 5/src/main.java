import java.util.Stack;

public class main {
    public static void main(String[] args) {
        cola colaPersonas = new cola();

        persona ana = new persona("Julia");
        persona berto = new persona("Juan");
        persona cristina = new persona("Paca");
        persona daniel = new persona("Alonso");
        persona zoe = new persona("Nano");
        persona luis = new persona("Josefa");

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
        pilaPersonas.apilar(ana);
        pilaPersonas.apilar(berto);
        pilaPersonas.apilar(cristina);
        pilaPersonas.apilar(daniel);
        pilaPersonas.apilar(zoe);
        pilaPersonas.apilar(luis);
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
