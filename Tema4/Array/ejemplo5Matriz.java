import java.util.Arrays;

public class ejemplo5Matriz {
    public static void main(String[] args) {
        String[][] matrizDeLetras = {{"A","B","C"},{"D","E","F"},{"G","H","I"}};
        for ( int i = 0; i<= matrizDeLetras.length - 1; i++) {
            System.out.println(Arrays.toString(matrizDeLetras[i]));
        }

        for(int i = 0; i < matrizDeLetras.length; i++) {
            for (int j = 0; j < matrizDeLetras[1].length; j++) {
                System.out.print(matrizDeLetras[i][j]);
            }
        }

        int i=0;
        while (i<matrizDeLetras[i].length) {
            System.out.println(matrizDeLetras[i]);
            i++;
        }
    }
}
