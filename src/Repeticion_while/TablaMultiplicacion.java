package Repeticion_while;


/**
 * Genarar la tabla de multiplicar hasta el 10 de un numero ingresado por teclado
 */

import javax.swing.*;
import java.util.jar.JarOutputStream;

import static java.lang.String.*;

public class TablaMultiplicacion {
    public static void main(String[] args) {
        //System.out.println("Programa para generar la tabla de multiplicar ");
        JOptionPane.showMessageDialog(null,"Programa para generar la tabla de multiplicar ");
        String num =  JOptionPane.showInputDialog("ingrese un numero");
        int contador =1 ;
        String acumulador = "";
        while (contador <= 10){
            int mult = Integer.parseInt(num) * contador; //convertir valor string a int
            String salida = num +"x" + String.valueOf(contador)+"= "+ String.valueOf(mult)+ "\n";
            acumulador = acumulador + salida;
            contador = contador + 1;
        }
        JOptionPane.showMessageDialog(null, acumulador);
    }
}
