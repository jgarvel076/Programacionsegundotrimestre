package Practica6;

import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args) {
        //Scanner para decir numero de discos
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cunatos discos tienes? --> ");
        int discos = sc.nextInt();
        sc.close();
        resolverTorres(discos, "A", "C", "B");
    }
    public static void resolverTorres(int n, String inicio, String fin, String medio) {
        if (n == 1) {
            System.out.println("El disco 1 se mueve desde " + inicio + " hasta " + fin);

        //recursividad para cambiar posiciones de discos
        } else {
            resolverTorres(n - 1, inicio, medio, fin);
            System.out.println("El disco " + n + " se mueve desde " + inicio + " hasta " + fin);
            resolverTorres(n - 1, medio, fin, inicio);
        }
    }
}

