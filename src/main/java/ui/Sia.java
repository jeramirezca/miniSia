package ui;
import java.util.Scanner;

public class Sia {

    public static void main(String[] args) {
        System.out.println("BIENVENID@");
        System.out.println("Ingresa el número del tipo que eres");
        System.out.println("1.Estudiante");
        System.out.println("2.Profesora o profesor");
        System.out.println("3.Acudiente");
        
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        
        System.out.println("Ingresa tu nombre de usuario:");
        String usuario = sc.nextLine();
        System.out.println("Ingresa tu contraseña:");
        String password = sc.nextLine();
        
        switch (opcion) {
            case 1:
                if(true){
                    System.out.println("Bienvenido "+usuario);
                }   break;
            case 2:
                if(true){
                    System.out.println("Bienvenido "+usuario);
                }   break;
            default:
                if(true){
                    System.out.println("Bienvenido "+usuario);
                }   break;
        }
         
    }
    
}
