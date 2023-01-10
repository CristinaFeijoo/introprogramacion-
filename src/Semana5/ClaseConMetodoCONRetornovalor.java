package Semana5;

import java.util.Scanner;

public class ClaseConMetodoCONRetornovalor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para sumar 2 numeros");
        System.out.println("ingrese el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero ");
        int num2 =teclado.nextInt();
        int resultado=sumar(num1,num2); //LLamamos el metodo y recibimos el valor
        //System.out.println("la suma es:" + resultado);
        //sumar_dos_numeros(num1,num2);
        double promedio=obtener_promedio(resultado,2);
        System.out.println(promedio);
    }

    /**
     * Esre metodo realiza la suma de dos numeros
     * @param n1
     * @param n2
     * @return
     */
    public static int sumar (int n1,int n2){
        int resultado = n1 + n2;
        return n1;
    }
    public static void  sumar_dos_numeros (int n1,int n2){
        int resultado =n1 + n2;
        System.out.println("la suma de los numero es" + resultado);
    }

    public static double obtener_promedio(int suma_total, int cantidad_num) {
        double promedio= (double) suma_total/(double) cantidad_num;
        return promedio;
    }
    public static int sumar (int n1 ,int n2 ,int n3){
        int resultado= n1+n2+n3;
        re
    }
}
