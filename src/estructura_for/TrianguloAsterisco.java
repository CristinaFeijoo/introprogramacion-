package estructura_for;


import java.util.Scanner;

public class TrianguloAsterisco {
    System.out.println("ingrese el numero de filas");

    Scanner teclado = new Scanner(System.in);
         int filas = teclado.nextInt();
       // System.out.println("ingrese el numero de columnas:");
        // int columnas = teclado.nextInt();
         for(int fila = 1; fila<=filas; fila++){//controlamos numero de filas
             String fila_asteriscos="";
        for(int col =1; col<=fila; col++){//controlamos numero de columnas
            fila_asteriscos=fila_asteriscos + "*";

        }
         }
}