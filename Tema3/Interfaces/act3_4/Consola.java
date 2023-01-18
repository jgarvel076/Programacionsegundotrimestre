public class Consola implements Borrable, Imprimible{
    static String contenido = "contenido";

  String pantalla = "$ hola";

    @Override
    public void borrar(){
        System.out.println("*");
    }

    @Override
    public void establecerContenido() {
        System.out.println("$" + contenido);
    }

    @Override
    public void imprime() {
        System.out.printf("'%$'" + pantalla);
    }

    @Override
    public void establecerContenido(String a) {

    }
}
