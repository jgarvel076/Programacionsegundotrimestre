import java.io.File;
import java.io.IOException;

public class ejercicio8 {
    public static void main(String[] args) {
        try {
            // Crear un fichero
            File miFichero = new File("C:\\Users\\1DAW_2223_08\\Desktop");
            miFichero.createNewFile();

            //

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}