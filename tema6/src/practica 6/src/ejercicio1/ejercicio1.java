package ejercicio1;
import java.io.IOException;


public class ejercicio1 {
    public static void main(String[] args) {
        try {
            metodoExcepcion();
        } catch (excepcion e) {
            System.out.println("Ocurrio excepcion propia: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ocurrio una excepción: " + e.getMessage());
        }
    }
    public static void metodoExcepcion() throws excepcion, IOException {
        throw new excepcion("excepción propia");
    }
}
