import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EjercicioListas {
    public static void main(String[] args) {


        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Mercedes-Benz");
        cars.add("Ford");
        System.out.println(cars);

        Set<String> motorbike = new HashSet<>();
        motorbike.add("Honda");
        motorbike.add("Yamaha");
        motorbike.add("BMW");
        System.out.println(motorbike);
    }

    public static void reverse(List<?> list) {

    }
}
