import java.util.*;
public class Ejercicio5Ver2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar =0;
        int numero ;
        do{

            System.out.println("Ingrese numero a calcular: ");
            numero = scan.nextInt();
            
            
            for (int i=1; i<= 10; i++){
                System.out.println(numero + " * " + i + " = " + numero*i);
            }  

            System.out.println("Desea seguir? --1 Si --2 No --");
            continuar = scan.nextInt();
        }while(continuar != 2);
        
        scan.close();
    }
    
}