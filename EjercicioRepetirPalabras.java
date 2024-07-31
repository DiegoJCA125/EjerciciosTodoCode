package Ejercicios;

import java.util.Scanner;

public class EjercicioRepetirPalabras {
    public static void main(String[] args) {

        System.out.println("Ingrese la palabra");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.next();

        while (!palabra.equalsIgnoreCase("salir")){
            System.out.println("La palabra es: " + palabra);

            System.out.println("Ingrese la palabra");
            palabra = teclado.next();
        }
    }
}
