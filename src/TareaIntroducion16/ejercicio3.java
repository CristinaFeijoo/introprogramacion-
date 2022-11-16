package TareaIntroducion16;
import java.util.Scanner;
public class ejercicio3 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese dos numeros enteros");
            int num_1 = teclado.nextInt();
            int num_2 = teclado.nextInt();
            if (num_1 >= num_2) && (num_1%num_2=0) {
                System.out.println("El numero numero menor es divisor del mayor");
            }else if (num_2 >= num_1) && (num_2%num_1=0){
                System.out.println("El numero mayor es divisor del menor");
                else
                System.out.println("Error");
            }
        }
    }

