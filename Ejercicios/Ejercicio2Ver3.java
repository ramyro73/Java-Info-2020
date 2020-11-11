
import java.util.*;


public class Ejercicio2Ver3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar =0;
        do{ 
            
            System.out.println("Ingrese Primer Numero: ");
            int a = scan.nextInt();
            System.out.println("Ingrese Segundo Numero: ");
            int b = scan.nextInt();
            System.out.println("Ingrese Tercer Numero: ");
            int c = scan.nextInt();
            
            mostrarNumero(a, b, c);
            System.out.println("Desea seguir? --1 Si --2 No --");
            continuar = scan.nextInt();
          } while(continuar != 2);
        scan.close();
    }
    public static void mostrarNumero(int a, int b, int c) {
        System.out.println("El primer numero ingresado es: " + a);
        System.out.println("El segundo numero ingresado es: " + b);
        System.out.println("El tercer numero ingresado es: " + c);
        
    }

}
