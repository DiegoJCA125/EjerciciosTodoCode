package vectores;

import java.util.Scanner;

public class Vectores {
    
    public static void main(String[] args) {
        int vector [] = new int [4];
        
        //ASIGNACION
        vector[0] = 2;
        vector[1] = 35;
        vector[2] = 48;
        vector[3] = 150;
        
        //asignacion por teclado
        Scanner teclado = new Scanner(System.in);
            for (int i=0; i<vector.length; i++) {
                System.out.println("Ingrese el valo para el indice " + i);
                vector[i] = teclado.nextInt();
            }
        
        //recorrido del vector
        for (int i=0; i<vector.length; i++){
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado un " + vector[i]);
            System.out.println("---------------------------");
        }
    } 
}
