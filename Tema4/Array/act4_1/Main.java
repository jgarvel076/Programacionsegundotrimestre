package act4_1;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        String s = "buenos dias";

        System.out.println(s);

        int[][] retorno = a(x, s);

        System.out.println(x);
        System.out.println(s);
    }
    static int [][] a(int x, String s){
        s = "buenas noches";
        for (x = 1; x <= 2 ; x++ ){
            System.out.println(s);
            System.out.println("x: " + x);
        }
        return new int[0][0];
    }
}
