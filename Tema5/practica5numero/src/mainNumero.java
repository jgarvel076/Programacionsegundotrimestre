import java.util.List;

public class mainNumero {
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.colar(0);
        cola.colar(1);
        cola.colar(2);
        cola.colar(3);
        cola.colar(4);
        cola.colar(5);
        cola.colar(6);


        System.out.print("Quitamos");
        cola.descolar();
        System.out.println(cola);

        System.out.print("primer puesto:");
        cola.frente();

        System.out.print("resto: ");
        cola.resto();

        System.out.print("Cola limpia");
        cola.limpiar();
        System.out.println(cola);

        System.out.print("vacia");
        System.out.println(cola.vacia());

        System.out.print("longitud de la cola: ");
        cola.longitud();


        //pila

        System.out.println("Pila");

        pila pila = new pila();


        System.out.print("Quitamos el ultimo elemento ");
        pila.desapilar();
        System.out.println(pila);

        System.out.print("ultimo elemento ");
        pila.cima();

        System.out.print("Limpiamos ");
        pila.limpiar();
        System.out.println(pila);


        System.out.print("Vacia");
        System.out.println(pila.vacia());

        System.out.print("Pintamos la longitud: ");
        pila.longitud();

    }
}

