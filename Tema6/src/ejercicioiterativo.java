public class ejercicioiterativo {
    public static void main(String[] args) {
        factorial(5);
    }

    private static void factorial(int i) {
        int fac = (i -1) * i;
        int resultado = 0;
        while (fac > 0) {
            System.out.println(resultado);
            resultado= fac + fac +fac +fac;
        }
    }
}
