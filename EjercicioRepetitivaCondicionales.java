package Ejercicios;

import java.util.Scanner;

public class EjercicioRepetitivaCondicionales {
    public static void main(String[] args) {
        //Ejercicio de maraton
        //pedir datos de las personas identificacion, nombre y edad
        //determinar a que categoria va a inscribirse
        //informar a la persona
        //no sabemos la cantidad de personas

        System.out.println("Ingrese la identificación de la persona");
        Scanner teclado = new Scanner(System.in);
        String id = teclado.nextLine();

        System.out.println("Ingrese el nombre de la persona");
        String nombre = teclado.nextLine();

        System.out.println("Ingrese la edad de la persona");
        Scanner teclado2 = new Scanner(System.in);
        int edad = teclado2.nextInt();

        while ((!id.equals("0")) || (!nombre.equalsIgnoreCase("fin"))){

            if (edad >= 6 && edad <= 10){
                System.out.println("La categoría es de Menores de 6 a 10 Años");
            }
            else {
                if (edad >= 11 && edad <= 17){
                    System.out.println("La categoría es Menores de 11 a 17 Años");
                }
                else {
                    if (edad >= 18 && edad <= 30){
                        System.out.println("La categoría es Juveniles (Entre 18 a 30 Años)");
                    }
                    else {
                        if (edad >= 31 && edad <= 50){
                            System.out.println("La categoría es Adultos (Entre 31 a 50 Años)");
                        }
                        else {
                            if (edad >= 51){
                                System.out.println("La categoría es de Adultos Mayores (Mayor a 51 Años)");
                            }
                            else {
                                System.out.println("La persona no cuenta con al edad para participar");
                            }
                        }
                    }
                }
            }
            System.out.println("Ingrese la identificación de la persona");
            id = teclado.nextLine();
            System.out.println("Ingrese el nombre de la persona");
            nombre = teclado.nextLine();
            System.out.println("Ingrese la edad de la persona");
            edad = teclado2.nextInt();
            System.out.println("------------------");
            System.out.println("Identificación: " + id);
            System.out.println("Nombre: " + nombre);
        }

    }
}

