package Logica;

import Datos.*;
import java.util.ArrayList;


public class Actualizaciones {
    
    public Materia buscarMateria(String nombre, ArrayList<Materia> materias){
       int i = 0;
       int n = materias.size();
       while( i<n && !(materias.get(i).getNombre().equals(nombre) ) ){
           i ++;
       }
       Materia materiaEncontrada = new Materia();
       if(i<n){
           materiaEncontrada = materias.get(i);
       }
       return materiaEncontrada;
    }
    public void inscribirMateria(Estudiante estudiante, Materia asignatura){
        ArrayList<Materia> materiasActuales = estudiante.getMateriasInscritas();
        materiasActuales.add(asignatura);
        estudiante.setMateriasInscritas(materiasActuales);
    }
    
    public void cambioClave(Estudiante estudiante, String nuevaClave){
        estudiante.setClave(nuevaClave);
    }
    
    public void cambioClave(Profesor profe, String nuevaClave){
        profe.setClave(nuevaClave);
    }
    public void cambioClave(Papito papito, String nuevaClave){
        papito.setClave(nuevaClave);
    }
}
 