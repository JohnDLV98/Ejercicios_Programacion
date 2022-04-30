package Package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);    
    System.out.println("Ingrese cantidad de numeros que desee: ");       
          
        int n = entrada.nextInt(); 
    int[] arr = new int[n];

    for(int i=0; i<n; i++){
        System.out.println("Escriba numero para añadir: ");
        int a = entrada.nextInt(); 
        arr[i] = a;
    }
        System.out.println();
        System.out.print(" [");
        for(int j=0;j<n; j++){
            System.out.print(" '"+ arr[j] + "' ");
        } 

        System.out.println("] ");

        int[] arrinv = new int[n];

        arrinv= invertirArreglo(arr);

        System.out.println();
        System.out.print(" [");
        for(int k=0;k<n; k++){
            System.out.print(" '"+ arr[k] + "' ");
        } 

        System.out.println("] ");
    }

    public static int[]  invertirArreglo(int[] arreglo) {
        int temporal; 
        int longitudDeArreglo = arreglo.length;

        for (int x = 0; x < longitudDeArreglo / 2; x++) {
          
          temporal = arreglo[x];
          
          int indiceContrario = longitudDeArreglo - x - 1;
          
          arreglo[x] = arreglo[indiceContrario];
          
          arreglo[indiceContrario] = temporal;
        }
        
        return arreglo;
      }
}
