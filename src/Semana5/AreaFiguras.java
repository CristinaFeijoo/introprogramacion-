package Semana5;

import java.util.Scanner;

public class AreaFiguras {
    public static void main(String[] args) {
        System.out.println("Programa para encontrar areas de las siguientes figuras");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la accion que quiere realizar");
        System.out.println("Presione 1 para el area de una circuferencia");
        System.out.println("Presione 2 para el area de un cuadrado");
        System.out.println("Presione 3 para el area de un cilindro");
        int option = teclado.nextInt();
        seleccionar_figura(option);
    }
    public static void  seleccionar_figura (int opcion){
        Scanner teclado = new Scanner(System.in);
        switch (opcion){
            case 1 :
                System.out.println("ingrese el valor del radio");
                double radio = teclado.nextInt();
                double area= obtener_area_circuferencia(radio);
                System.out.println("el area es" +area);

        }
    }
    public static double obtener_area_circuferencia(double radio) {
            double area= Math.PI + Math.pow(radio,2);
            return area;
}
public double obtener_area_cuadrado(double lado){
            double area = lado *lado;
            return area;
        }
}

