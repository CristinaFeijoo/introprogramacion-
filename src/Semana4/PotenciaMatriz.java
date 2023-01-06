package Semana4;

import java.util.Scanner;

public class PotenciaMatriz {
    public static void main(String[] args) {
        int matriz[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };//dimension de la matriz 3x3
        int filas = matriz.length;
        int cols = matriz[0].length;
        int matriz_potencia[][] = new int[filas][cols];
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el valor de la potencia");
        int potencia = teclado.nextInt();
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                matriz_potencia[fila][col] = (int) Math.pow(matriz[fila][col], potencia);
                System.out.print(matriz_potencia[fila][col] + "\t");
            }
            System.out.print("\n");

        }
    }
}