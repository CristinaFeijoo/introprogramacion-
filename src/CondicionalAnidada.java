import java.util.Scanner;

import java.text.DecimalFormat;
public class CondicionalAnidada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR MAYORIA DE EDAD");
        System.out.println("ingrese su edad");
        double edad = teclado.nextFloat();
        if (edad > 0 && edad <= 0.1) {
            System.out.println(" eres menor de edad");

        }
    }
}

