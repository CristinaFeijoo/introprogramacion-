package Semana4;

import java.util.Scanner;

public class matrizEscritura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros[][] = new int[3][2];
        int filas = numeros.length;
        int columnas = numeros[1].length;
        numeros[1][1] = 5;
        numeros[2][0] = 9;
        //operacion escritura de una matriz
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println("ingresa una edad [" + fila+"][" + col +"];");
                int edad = teclado.nextInt();
                numeros[filas][col] = edad;
            }
            System.out.println("\n");
        }
        //operacion lectura de una matriz
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++)
                System.out.println(numeros[fila][col] + " \t");

        }
    }
}