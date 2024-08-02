package vectores;

import java.util.Scanner;

public class EjercicioVector {
    public static void main(String[] args) {
        int vector [] = new int [15];
        Scanner teclado = new Scanner (System.in);
        
        for (int i=0; i<15; i++){
            System.out.println("Ingrese un numero para el Vector");
            vector[i] = teclado.nextInt();   
        }
        //Recorre y contar cuantos numeros 3 hay
        int cont = 0;
        
        for (int i=0; i<15; i++){
            if(vector[i] == 3){
                cont = cont + 1;
            }
        }
        System.out.println("La cantidad de numero 3 que hay en el Vector es : " + cont);
    }
}