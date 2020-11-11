import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Primer Numero: ");
        int a = scan.nextInt();
        System.out.println("Ingrese Segundo Numero: ");
        int b = scan.nextInt();
        System.out.println("Ingrese Tercer Numero: ");
        int c = scan.nextInt();
        
        System.out.println("El primer numero ingresado es: " + a);
        System.out.println("El segundo numero ingresado es: " + b);
        System.out.println("El tercer numero ingresado es: " + c);
        scan.close();
    }
    
}
