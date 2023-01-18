public class TestImpresiones {
    public static void main(String[] args) {
        Imprimible print1 = new Impresora();
        print1.imprime();
        print1.borrar();
        print1.imprime();
        print1.establecerContenido("Esto es un test");

        System.out.println("");

        Imprimible print2 = new Consola();
        print2.imprime();
        print2.borrar();
        print2.establecerContenido("Esto es un test");
    }
}

