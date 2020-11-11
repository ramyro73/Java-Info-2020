import java.util.*;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero a calcular: ");
        int numero = scan.nextInt();
        scan.close();
        
        for (int i=1; i<= 10; i++){
            System.out.println(numero + " * " + i + " = " + numero*i);
        }  

    }
    
}