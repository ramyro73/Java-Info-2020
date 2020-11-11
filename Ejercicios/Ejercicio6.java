import java.util.*;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int seguir = 1;
        
        while (seguir == 1){
            System.out.println("Ingrese un numero: ");
            numero = scan.nextInt();
            System.out.println(numero);
            System.out.println("Desea seguir? --1 Si --2 No --");
            seguir = scan.nextInt();
        }
        scan.close();
    }

}
