import java.util.Map;
import java.util.TreeMap;

public class Actividad5_3 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 12, 11, 13, 14, 4, 6, 2, 5, 3};

        Map<Integer, Integer> contador = new TreeMap<>();

        for (int numero : numeros) {

            if (contador.containsKey(numero)) {
                contador.put(numero, contador.get(numero) + 1);
            }

            else {
                contador.put(numero, 1);
            }
        }


        for (Map.Entry<Integer, Integer> entrada : contador.entrySet()) {
            System.out.println("El número " + entrada.getKey() + " aparece " + entrada.getValue() + " veces");
        }
    }
}

