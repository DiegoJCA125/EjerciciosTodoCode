package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        //declaracion
        int matriz [][] = new int [3][3];
        
        Scanner teclado = new Scanner(System.in);
        //asignacion manual
        for (int f=0; f<3; f++){ // f= fila | c= columna
            for (int c=0; c<3; c++){
                System.out.println("Ingrese el valor de posicion Fila: " + f + " y de la Columna: " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }
        
        //Recoriendo la matriz
        for (int f=0; f<3; f++){ // f= fila | c= columna
            for (int c=0; c<3; c++){
                System.out.println("El valor de la posicion Fila: " + f + " y de Columna: " + c);
                System.out.println("Es de: " + matriz[f][c]);
            }
        }
    } 
}