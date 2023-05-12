package Practica6;

import java.io.IOException;


public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            metodoExcepcion();
        } catch (Excepcion e) {
            System.out.println("Se produjo mi excepción: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
    }
    public static void metodoExcepcion() throws Excepcion, IOException {
        throw new Excepcion("Se produjo un error");
    }
}
