import java.io.*;
public class Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Creo objeto que voy a serialziar para escribirlo en un fichero
        ObjetoSerializable os1 = new ObjetoSerializable();

        // Creo fichero
        FileOutputStream fos = new FileOutputStream("C:\\Users\\1DAW_2223_13\\Downloads//objeto.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Serializar el objeto
        oos.writeObject(os1);

        // Cierro el flujo para que se escriba en el fichero
        oos.close();

        // Leer fichero al Objeto
        FileInputStream fis = new FileInputStream("C:\\Users\\1DAW_2223_13\\Downloads//objeto1.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Desearizar el contenido del fichero (bytes) a un Object
        ObjetoSerializable osSalida = (ObjetoSerializable)ois.readObject();

        System.out.println("Atributo 1: " + osSalida.atributo1);
        System.out.println("Atributo 2: " + osSalida.atributo2);
        System.out.println("Atributo 3: " + osSalida.atributo3);

        ois.close();
    }
}


