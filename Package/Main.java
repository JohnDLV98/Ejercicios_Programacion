package Package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        do {
            System.out.println("Que ejercicio desea realizar: Escriba 2, 3 o 4");
            System.out.println("Escriba 0 para salir");
            System.out.println();
            n = entrada.nextInt();
            switch (n) {
                case 2:
                    
                        System.out.println();
                        System.out.println("Ingrese el número 0 para salir");
                        System.out.println("Ingrese Número entero mayor a 0 y menor que 101 : ");
                        int n1 = entrada.nextInt();
                        System.out.println();

                        if (n1 == 0) {
                            System.out.println("Saliendo");
                            break;
                        }
                        if (n1 < 1 || n1 > 100) {
                            System.out.println("El numero: " + n1 + ", está fuera del rango");
                            System.out.println("Vuelva a empezar");
                        } else {
                            if ((n1 % 2) != 0) {
                                System.out.println("El numero: " + n1 + ", Es IMPAR y RARO");
                            } else {
                                if (n1 >= 2 && n1 <= 5) {
                                    System.out.println("El numero: " + n1 + ", Es PAR Y NO RARO");
                                } else if (n1 >= 6 && n1 <= 20) {
                                    System.out.println("El numero: " + n1 + ", Es PAR Y RARO");
                                } else {
                                    System.out.println("El numero: " + n1 + ", Es PAR Y NO RARO");
                                }
                            }
                        }
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    int count = 1;
                    System.out.println("Ingrese numero del 1 al 9: ");
                    int piramide = entrada.nextInt();
                    System.out.println();

                    if (piramide < 1 || piramide > 9) {
                        System.out.println("FUERA DEL RANGO, VUELVA A EMPEZAR");
                    }
                    for (int i = 1; i < piramide; ++i) {

                        for (int j = 1; j <= i; j++) {

                            System.out.print(count + " ");

                        }

                        System.out.println();
                        count++;
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Escriba dos numeros: ");
                    double num1 = entrada.nextInt();
                    double num2 = entrada.nextInt();
                    System.out.println();
                    System.out.println("Suma = " + (num1 + num2) + "  Resta = " + (num1 - num2) + "  Multiplicación = "
                            + (num1 * num2) + "  División = " + (num1 / num2));
                    System.out.println();
                    break;
                default:
                    System.out.println("OPCIÓN INCORRECTA, VUELVA A EMPEZAR");
                    System.out.println();
                    break;
            }
        } while (n != 0);

    }

    // int n = entrada.nextInt();
    // int[] arr = new int[n];

    // for(int i=0; i<n; i++){
    // System.out.println("Escriba numero para añadir: ");
    // int a = entrada.nextInt();
    // arr[i] = a;
    // }
    // System.out.println();
    // System.out.print(" [");
    // for(int j=0;j<n; j++){
    // System.out.print(" '"+ arr[j] + "' ");
    // }

    // System.out.println("] ");

    // int[] arrinv = new int[n];

    // arrinv= invertirArreglo(arr);

    // System.out.println();
    // System.out.print(" [");
    // for(int k=0;k<n; k++){
    // System.out.print(" '"+ arrinv[k] + "' ");
    // }

    // System.out.println("] ");
    // }

    // public static int[] invertirArreglo(int[] arreglo) {
    // int temporal;
    // int longitudDeArreglo = arreglo.length;

    // for (int x = 0; x < longitudDeArreglo / 2; x++) {

    // temporal = arreglo[x];

    // int indiceContrario = longitudDeArreglo - x - 1;

    // arreglo[x] = arreglo[indiceContrario];

    // arreglo[indiceContrario] = temporal;
    // }

    // return arreglo;

}
