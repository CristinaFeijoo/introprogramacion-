import java.util.Scanner;

public class CondicionalDoble {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("PROGRAMA PARA DETERMINAR MAYORIA DE EDAD");
        System.out.println("ingrese su edad");
        int edad = teclado.nextInt();
        boolean evaluacion = (edad >=18);
        if (evaluacion){
            System.out.println(" eres mayor de edad");
            System.out.println(" estas casi listo para ir a la universidad");
        }else{
            System.out.println("Aun eres mayor de edad");

        }
    }
}

