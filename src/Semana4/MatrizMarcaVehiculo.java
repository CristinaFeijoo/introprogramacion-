package Semana4;

import java.util.Locale;
import java.util.Scanner;

public class MatrizMarcaVehiculo {
    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el numero de filas");
         int filas = teclado.nextInt();
        System.out.println("ingrese el numero de columnas");
        int cols = teclado.nextInt();
        String marcas [][] = new String[filas][cols]; // establecemos dimension
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                System.out.println("ingrese el valor para posicion ["+fila +"]["+ cols +"]");
                marcas[fila][col]= teclado.nextLine();

            }
        }
        boolean salir=false;
        while (!salir){//salir  ==  false
            System.out.println("Digite 1 para realizar una busqueda: ");
            System.out.println("Digite 2 para modificar un valor: ");
            System.out.println("Digite 3 para eliminar un valor: ");
            System.out.println("Digite 4 para visualizar la matriz: ");
            System.out.println("Digite 5 para salir: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("HA SELECCIONADO LA OPERACION BUSQUEDA");
                    System.out.println("¿que marca buscas? :3");
                    String marca_buscada= teclado.nextLine().toLowerCase();
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if (marcas[fila][col].equals(marca_buscada));
                            System.out.println("Si se encontro la marca"+ marca_buscada);
                            System.out.println("en la posicion ["+fila+"]["+col+"]");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Has seleccionado la operacion de modificación");
                    System.out.println("Ingrese la fila que desea modificar");
                    int fila = teclado.nextInt();
                    System.out.println("Ingrese la columna que desea modificar");
                    int col = teclado.nextInt();
                    System.out.println("¿Cuál es la marca que va a ingresar?");
                    marcas[fila][col] = teclado.nextLine();
                    break;
                case 3:
                    System.out.println("HA SELECSIONADO LA OPERACION ELIMINACION");
                    System.out.println("que marca va a eliminar");
                    String marca_a_eliminar = teclado.nextLine().toLowerCase();
                    for (fila = 0; fila < filas; fila++) {
                        for ( col = 0; col < cols; col++) {
                            if(marcas[fila][col].equals(marca_a_eliminar)){
                                marcas[filas][col]="";
                            }
                        }
                    }
                case 4:
                    System.out.println("Has seleccionado la operación lectura de la matriz");
                    for (fila = 0; fila < filas; fila++) {
                        for (col = 0; col < cols; col++) {
                            System.out.print(marcas[fila][col] +"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Chaowo");
                    salir=false;
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
        }

        }
    }
    }
