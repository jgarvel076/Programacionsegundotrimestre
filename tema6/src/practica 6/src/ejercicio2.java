import java.util.Scanner;

public class ejercicio2{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de discos: ");
        int discos = sc.nextInt();
        sc.close();
        torre(discos, "1", "2", "3");
    }
    public static void torre(int n, String salida, String meta, String comodin) {
        if (n == 1) {
            System.out.println("disco 1 desde " + salida + " hasta " + meta);
            return;
        }
        torre(n - 1, salida, comodin, meta);
        System.out.println(" disco " + n + " desde " + salida + " hasta " + meta);
        torre(n - 1, comodin, meta, salida);
    }
}

