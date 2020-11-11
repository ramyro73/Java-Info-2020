import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();
        switch (numero){
            case 1:
                System.out.println("domigo");
                break;
            case 2:
                System.out.println("lunes");
                break;    
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero incorrecto de dia");
                break;
        }
    }
    
}
