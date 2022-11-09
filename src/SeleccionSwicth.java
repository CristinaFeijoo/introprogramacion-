import java.util.Scanner;

/**
 * uwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwuwu owo
 *
 */

public class SeleccionSwicth {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 7");
        int option = teclado.nextInt();
        switch (option){
            case 1 :
                System.out.println("LUNES");
                break;
            case 2 :
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4 :
                System.out.println("JUEVES");
                break;
            case 5 :
                System.out.println("VIERNES");
                break;
            case 6 :
                System.out.println("SABADO");
                break;
            case 7 :
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("OPCION INCORRECTA");
        }
    }
}
