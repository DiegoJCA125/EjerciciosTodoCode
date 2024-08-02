package matrices;

import java.util.Scanner;

public class EjercicioMatrices {
    public static void main (String[] args){
        
        Double matriz [][] = new Double [4][4];
        Scanner teclado = new Scanner(System.in);
        Double suma = 0.0;
        
        //For para cargar la matriz
        for (int f=0; f<4; f++){
            for (int c=0; c<3; c++){
                System.out.println("Ingrese el Alumno N " + f);
                matriz[f][c] = teclado.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma = 0.0;
        }
            
        //For para correr la matriz    
        for (int f=0; f<4; f++){
            System.out.println("Las notas del Alumno N " + f + " son: ");
            for (int c=0; c<3; c++){
                System.out.println("Notas N " + c + matriz[f][c]);
            }
            System.out.println("El promedio de las notas es de: " + matriz[f][3]);
        }
    }
}
