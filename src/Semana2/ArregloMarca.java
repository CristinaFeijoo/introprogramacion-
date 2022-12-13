package Semana2;

import java.util.Scanner;

/**
 * programa que solicite el nombre de n marcas de vehiculos y las almacene en un arreglo finalmente el progrma debe
 * mostrar el nombre de las marcas almacenadas
 */

public class ArregloMarca {
    public static void main(String[] args) {
        String marcas [];
        System.out.println("¿cuantas marcas de vehiculo va a ingresar :3?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();
        marcas =  new String[n];//creamos el arreflo con n elementos
        for (int indice = 0; indice < n; indice++) {
            System.out.println("ingrese el nombre de la marca" + (indice+1));
            String marca = teclado.nextLine();
                    marcas[indice]= marca;
        }
        System.out.println("lista de marcas ingresadas");
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println(marcas[indice]+"\t");
        }
        // operacion de busqueda
        System.out.println("que nombre de marca quiere buscar");
        String marca_busqueda= teclado.nextLine().toUpperCase();
        for (int indice = 0; indice < n; indice++) {
           if (marca_busqueda.equals(marcas[indice] )){
               System.out.println("Marca encontrada");
               System.out.println("se encuentra en el indice : "+ indice);
               break;
           }
        }
    }
}
