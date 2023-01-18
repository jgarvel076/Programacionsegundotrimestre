public class ejemplo3metodoconarray {
    int x = 0;
    int y = 2;
    String z = "hola";
    private Double[] arrayDeEntrada;
    int[][] datosRetorno = metodo(x, y, z, arrayDeEntrada);

    static int[][] metodo(int x, int y, String z, Double[] arrayDeEntrada) {
        return new int[2][2];
    }
}
