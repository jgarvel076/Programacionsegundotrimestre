import java.sql.SQLOutput;
import java.util.Arrays;

public class RESUMEN_DE_TODO {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(a.length);
        //devuelve la longitud del array

        System.out.println(Arrays.toString(a));
        //convirte un entero en una cadena de caracteres

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //Ordena los elementos en orden ascendente


        int[] b = a.clone();
        System.out.println(Arrays.toString(b));
        //clone crea una copia del arreglo

        int[] c = a.clone();
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.equals(a, c));
        //Compara dos arrays para verificar si son iguales
        //También existe el equalIgnoreCase el cual comparará string sin deferenciar entre mayúsculas y minúsuculas

        Arrays.fill(a, 10);
        System.out.println(Arrays.toString(a));
        //llena el array con un valor especifico(en este caso 10)

        int[] d = Arrays.copyOf(a, 10);
        System.out.println(Arrays.toString(d));
        //crea una copia de un arreglo con una longitud especifica(en este caso 10), donde los nuevos valores tendrán por defecto 0

        int[] e = Arrays.copyOfRange(a, 3, 6);
        System.out.println(Arrays.toString(e));
        //copia una seccion de un arreglo en uno nuevo.
        //Este devuelve un nuevo arreglo que contiene la seccion del arreglo original que se ha indicado,
        //el nuevo arreglo tendra una longitud from-to en este caso una medida de 3.

    }
}

public class InsercionArray {
    public static void main(String[] args) {
        int a = 8;
        int[] in = {7,1,5,2};
        int pos = 3;

        int[] out2 = insertar(in, e, pos);
        System.out.println(Arrays.toString(out2));
    }

    static int [] insertar(int [] in, int e, int pos){
        int [] out = new int [in.length +1];

        for (int i = 1; i < in.length; i++){
            out = Arrays.copyOf(in, 5);
            if (i ==pos){
                out[pos +1] = e;
            }
        }
        in= out;
        return out;
    }
}
//Insercion de un elemento nuevo en un array
//e --> NUEVO NUMERO QUE INTRODUCIMOD
//pos --> posicion donde introducioms e


public class EliminacionArray {
    public static void main(String[] args) {
        int [] in ={5, 46, 3, 9};
        int pos = 1;
        System.out.println(Arrays.toString(in));
        int[] print = eliminarArray(in, pos);
        System.out.println(Arrays.toString(print));
    }

    static int[] eliminarArray(int [] in , int pos){
        int [] out = new int[in.length -1];
        System.arraycopy(in, 0, out, 0, pos);
        System.arraycopy(in, +1, out, pos, in.length - pos -1);
        return out;
    }
}
//Elimina una posicion de la array
//el elemento copia hasta la posicion 0 y depues copia el array saltando la que borramos


public class IntercambioArray{
    public static void main(String[] args){
        int [] a = {7, -2, 5, 0, 6};
        System.out.println(Arrays.toString(intercambio(a)));
    }

    static int[] intercambio (int[] src) {
        int[] dest = src.clone();
        dest[0] = dest[dest.length -1];
        for (int i =dest.length -1; i < 0; i--) {
            dest[i] = dest[i-1];
        }
        return dest;
    }
}
//Intercambiar posicion array
//se cambian un paso a la izquierda

public class valueOfparse{
    public static void main(String[] args){
        int [] a = {7, -2, 5, 0, 6};
        Integer integer = Integer.valueOf(2);
        int n = Integer.parseInt("1");
        System.out.println(n + 1);
        System.out.println(b);
        Long.parseLong("254645148");
        Double.parseDouble("2.2");
        float parseFloat("");
    }

}