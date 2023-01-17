package Semana6;

public class AmbitoVariable {
    static int numero = 10; // creacion de variable global.
    public static void  cambiar_valor(){
        numero=numero +15;
        int valor = 5;
    }
    public static void cambiar_valor(int numero){
      numero = numero+50;

    }

    public static void main(String[] args) {
        cambiar_valor();
        System.out.println("El numevo valor de numero =" + numero);
        AmbitoVariable mivarible = new AmbitoVariable();
        mivarible.cambiar_valor(100);
        System.out.println("El nuevo valor de numero es =" + numero);
        int indice = 0;
        for ( indice = 0; indice < 5; indice++) {
            System.out.println("repeticion" + indice);
        }
        System.out.println("el valor final de indice " + indice);

    }
}
