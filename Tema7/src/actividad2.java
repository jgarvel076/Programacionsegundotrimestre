import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class actividad2 {
    public static void main(String[] args) {
        try {
            File carpeta = new File("C:\\Users\\1DAW_2223_14");
            if (!carpeta.exists()) {
                carpeta.mkdir();
            }
            File file1 = new File("C:\\Users\\1DAW_2223_08\\alumnos.txt");
            if (!file1.exists()) {
                file1.createNewFile();
            }
            FileWriter escribir = new FileWriter(file1);
            BufferedWriter buffer = new BufferedWriter(escribir);
            buffer.write("Diego \n");
            buffer.write("Victor \n");
            buffer.write("Ricardo \n");
            buffer.write("Adrián \n");
            buffer.write("Pablo \n");
            buffer.write("Juan Manuel Saborido \n");
            buffer.write("Dani \n");
            buffer.write("Antonio \n");
            buffer.write("Jorge \n");
            buffer.write("Juan Maria \n");
            buffer.write("Johnatan \n");
            buffer.write("Juan Manuel Herrera \n");
            buffer.write("Julián \n");

            buffer.close();



            File file2 = new File("C:\\Users\\1DAW_2223_08\\prog_codificado.txt");
            file1.renameTo(file2);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
