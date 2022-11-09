import java.util.Scanner;

/**
 * Programa para determinar si una persona es mayor de edad
 */

public class CondicionalSimple {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR MAYORIA DE EDAD");
        System.out.println("ingrese su edad");
        int edad = teclado.nextInt();
        if(edad >=18){
            System.out.println(" eres mayor de edad");
            System.out.println(" estas casi listo para ir a la universidad");


        }
    }
}
