package Ejercicios;

import java.util.Scanner;

public class EjercicioRepetitiva {
    public static void main(String[] args) {
        //Ingreso el limite
        System.out.println("Ingrese el limite hasta que el programa quiere contar");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        int cont = 1;

        while (cont <= limite){
            System.out.println(cont);
            cont ++;
        }
    }
}
