package Logica;

import Datos.Estudiante;
import Datos.Materia;
import java.util.ArrayList;


public class Actualizaciones {
    public void inscribirMateria(Estudiante estudiante, Materia asignatura){
        ArrayList<Materia> materiasActuales = estudiante.getMateriasInscritas();
        materiasActuales.add(asignatura);
        estudiante.setMateriasInscritas(materiasActuales);
    }
    
    public void cambioClave(Estudiante estudiante, String nuevaClave){
        estudiante.setClave(nuevaClave);
    }
}
 