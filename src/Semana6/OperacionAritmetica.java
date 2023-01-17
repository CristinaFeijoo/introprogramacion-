package Semana6;

import java.util.Scanner;

/**
 * programa para realizar operaciones matematicas
 */
public class OperacionAritmetica {
    // creacion de variables globales
    int  n1;
    int n2;

    /**
     * Metodo para realizar la suma de dos numeros enteros
     * @param n1
     * @param n2
     * @return
     */
    public int sumar(int n1,int n2){
         return (n1+n2);
    }

    /**
     * Metdo para realizar la resta de dos numeros
     * @param n1
     * @param n2
     * @return
     */
    public int restar (int n1,int n2){
        return (n1-n2);
    }

    /**
     * metodo para ,multiplicaion de dos numerowos
     * @param n1
     * @param n2
     */
    public void multiplcar(int n1,int n2){
        System.out.println("la multiplicacion es : "+ (n1*n2));

    }

    /**
     * metodo para la division de 2 numerowos
     */
    public void dividir (){
        if (n2 > 0){
        System.out.println("la division es :" + (n1/n2));
    }else{
        System.out.println("division por cero no existe");
    }
}
    public void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        boolean interruptor= true ;
        while (interruptor){
            System.out.println("digite 0 para salir");
            System.out.println("digite 1 para sumar 2 numeros");
            System.out.println("digite 2 para restar 2 numeros");
            System.out.println("digite 3 para multiplicar 2 numeros");
            System.out.println("digite 4 para dividir 2 numeros");
            int opcion = teclado.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Salir");
                    interruptor=false;
                    break;
                case 1:
                    ingresar_numeros();
                    System.out.println("La suma es:" + sumar(n1,n2));
                    break;
                case 2:
                    ingresar_numeros();
                    System.out.println("La resta es: "+ restar(n1,n2));
                    break;
                case 3:
                    ingresar_numeros();
                    multiplcar(n1,n2);
                    break;
                case 4:
                    ingresar_numeros();
                    dividir();
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        }
    }
    public void ingresar_numeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero:" );
        n1= teclado.nextInt();
        System.out.println("ingrese el segundo numero:");
        n2= teclado.nextInt();
    }

    public static void main(String[] args) {
        OperacionAritmetica mivariable = new OperacionAritmetica();
        mivariable.ejecutar();
    }
}

