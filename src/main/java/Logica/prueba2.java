
package Logica;
import Logica.consultas;
import Datos.*;
import Datos.Subsidio;
import UI.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class prueba2 {

    //CREACIÓN DE LAS MATERIAS Y SUBSIDIOS
    
    /*Se crean en esta clase para que puedan ser utilizadas 
    en la interfaz inscribir materias y la interfaz pedir subsidio
    */
    
    public static Materia materia1prueba = new Materia(10001, "Cálculo integral", 4);
    public static Materia materia2prueba = new Materia(34005, "Programación de computadores", 3);
    
    public static ArrayList<Materia> materias = new ArrayList(Arrays.asList(
    materia1prueba,materia2prueba));
    
    public static Subsidio subsidio1prueba = new Subsidio("Transporte", 82.500, 1);
           // ,beneficiariosSubsidio1);
    public static Subsidio subsidio2prueba = new Subsidio("Alimenticio", 120.700, 2);
            //,beneficiariosSubsidio2);
    public static ArrayList<Subsidio> subsidios = new ArrayList(Arrays.asList(
    subsidio1prueba,subsidio2prueba));
    
    // INSTANCIACIÓN DE LAS INTERFACES
    public static void CrearLogin(){
        LoginMain login = new LoginMain();
        login.setVisible(true);
    }
 
    public static void CrearInterfazEst(){
        InterfazEstudiante estudianteFrame = new InterfazEstudiante();
        estudianteFrame.setVisible(true);
    
    }

    public static void CrearInterfazProf(){
        InterfazProfesor profesorFrame = new InterfazProfesor();
        profesorFrame.setVisible(true);
    }
    
    public static void CrearInterfazPapa(){
        InterfazPapito papitoFrame = new InterfazPapito();
        papitoFrame.setVisible(true);
    }
    

    
    public static void MostrarLogin(LoginMain login){
        login.setVisible(true);
    }
    
    

    }
    
