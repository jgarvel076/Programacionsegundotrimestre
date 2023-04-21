public class Recursividad {
    public static void main (String[] args) {
        cuentaAtras(10);
    }

    private static void cuentaAtras(int i) {
        if (i > 0) { //caso recursivo
            System.out.println(i);
            cuentaAtras(i - 1);
        } else //caso base
            System.out.println("Fin");
    }
}
