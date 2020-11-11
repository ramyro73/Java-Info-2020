import java.util.*;
public class Ejercicio3Ver3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar = 0;
        int nota;

        do{
        System.out.println("Ingrese Su Nota");
        nota = scan.nextInt();
        
        System.out.print("Calificacion: ");
        
        calcularNota(nota);
        

        System.out.println("Desea seguir? --1 Si --2 No --");
        continuar = scan.nextInt();
        }while (continuar != 2);
        
        
        scan.close();
        
    }
    public static void calcularNota(int nota) {
        
        if(nota > 92) {
            System.out.println("Excelente");
        }
        else if (nota> 84) {
            System.out.println("Sobresaliente");
        }
        else if (nota> 74){
            System.out.println("Distinguido");
        }
        else if (nota> 59) {
            System.out.println("Bueno");
        }
        else{
            System.out.println("Desaprobado");
        }
    }
}