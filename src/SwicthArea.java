import java.util.Scanner;

public class SwicthArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese opcion 1,2,3");
        int opcion = teclado.nextInt();
        switch  (opcion){
            case 1:
                System.out.println("AREA DEL TRIANGULO");
                System.out.println("INgrese la base");
                double base = teclado.nextDouble();
                System.out.println("INgrese la altura");
                double altura = teclado.nextDouble();
                double area_triangulo =(base * altura)/2;
                System.out.println("el area del triangulo es  " +area_triangulo);
                break;
            case 2:
                System.out.println("AREA DE LA CIRCUFERENCIA");
                System.out.println("Valor de PI"+ Math.PI);
                System.out.println("INgrese el radio");
                double radio = teclado.nextDouble();
                double area_circuferencia =Math.PI*(radio * radio);
                System.out.println("el area de la circuferencia es  "+area_circuferencia);
                break;
            case 3 :
                System.out.println("AREA DEL CUADRADO");
                System.out.println("ingrese el valor del lado");
                double lado = teclado.nextDouble();
                double area_cuadrado = (lado * lado);
                System.out.println("el area del cuadrado es  " +area_cuadrado);
                break;
                }
        }
    }

