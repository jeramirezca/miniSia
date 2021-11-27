
package Logica;
import Datos.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class asignar {
    public static void main(String args[]) {

    }
    //Nota sobre este metodo: ya deberían existir 3 objetos de subsidios, de modo que se unan al mismo objeto los estudiantes.
    //Objetos definidos:

    Subsidio tipoA = new Subsidio("A", 450.340, 2);
    Subsidio tipoB = new Subsidio("B", 100.340, 1);
    Subsidio tipoC = new Subsidio("C", 320.340, 3);
    
    public Subsidio buscarSubsidio(String nombre, ArrayList<Subsidio> subsidios){
       int i = 0;
       int n = subsidios.size();
       while( i<n && (subsidios.get(i).getTipo() != nombre) ){
           i ++;
       }
       Subsidio subsidioEncontrado = new Subsidio();
       if(i<n){
           subsidioEncontrado = subsidios.get(i);
       }
       return subsidioEncontrado;
    }
    
    public void asignarSubsidio(Estudiante solicitante, Subsidio tipo) {

        // Parte estudiante
        ArrayList<Subsidio> subsidiosDelEstudiante = solicitante.getSubsidios();
        subsidiosDelEstudiante.add(tipo);
        solicitante.setSubsidios(subsidiosDelEstudiante);
        //Parte Subsidio
        ArrayList<Estudiante> solicitantesSubsidio = tipo.getBeneficiarios();
        solicitantesSubsidio.add(solicitante);
        tipo.setBeneficiarios(solicitantesSubsidio);

    }
    
    public Estudiante buscarEstudiante (Grupo grupoAsignar, int idEstudiante){
        ArrayList<Estudiante> alumnosPorCalificar = grupoAsignar.getEstudiantes();
        int i = 0;
        int n = alumnosPorCalificar.size();
        while( i<n && ( alumnosPorCalificar.get(i)).getID() != idEstudiante ){
            i ++;
        }
        Estudiante estudiante = new Estudiante(); 
        if(i<n){
            estudiante = alumnosPorCalificar.get(i);
        }
        return estudiante;
    }  
    
    public Nota asignarNotaPorEstudiante (Estudiante estudiante, int calificacion) {
        Nota notaEstudiante = new Nota(calificacion, estudiante);
        
        return notaEstudiante;
    }
    
    public Grupo buscarGrupo (Profesor consultor, int numero){
        ArrayList<Grupo> gruposProfe = consultor.getCursos();
        int i = 0;
        int n = gruposProfe.size();
        while( i<n && ( gruposProfe.get(i)).getNumero() != numero ){
            i ++;
        }
        Grupo encontrado = new Grupo();
        if( i<n ){
            encontrado = gruposProfe.get(i);
        }
        return encontrado;
    }  
    
    /*  
    public ArrayList<Nota> asignarNota(Grupo grupoAsignar, int calificacion){
        
       ArrayList comprobante_notas = new ArrayList<Nota>();
        
       HashMap  notasGrupales = new HashMap <String, Object> ();
       ArrayList<Estudiante> alumnos_por_Calificar = grupoAsignar.getEstudiantes();
        
        for (Estudiante alumno: alumnos_por_Calificar){
            if( buscarEstudiante(grupoAsignar, alumno.getID()) ){}
            Nota nota = new Nota(calificacion,alumno);
            String identificacion = String.valueOf(alumno.getID());
            notasGrupales.put(identificacion, nota);
            comprobante_notas.add(nota);
        }
        
        grupoAsignar.setNotasGrupo(notasGrupales);
        return comprobante_notas;
    }*/
    
    //Para cambiar notas es necesario el documento del estudiante, y el grupo
    
    /*
    public ArrayList<Nota> cambiarNota(Grupo grupo_asignar, int ID_solicitante) {
        Scanner sc = new Scanner(System.in);
        ArrayList comprobante_notas = new ArrayList<Nota>();
        Estudiante solicitante = new Estudiante();
        HashMap notas_Grupales = grupo_asignar.getNotasGrupo();
        ArrayList<Estudiante> alumnos_por_Calificar = grupo_asignar.getEstudiantes();
        
        //´primero hallamos el estudiante al cual le cambiaremos la nota, dentro de los estudiantes del grupo
        for (Estudiante alumnos: alumnos_por_Calificar){
            if(alumnos.getID()== ID_solicitante){
                solicitante = alumnos;
            }
        }
        
        //despues si le cambiamos la nota. Para esto tenemos que eliminar la nota actual, y reemplazarla con la nueva

        for (Estudiante alumno : alumnos_por_Calificar) {
            if (alumno == solicitante) {
                notas_Grupales.remove(alumno);
                System.out.println("Cambiar la  Nota del estudiante: " + alumno.getNombre());
                int calificacion = sc.nextInt();
                Nota nota = new Nota(calificacion, alumno);
                String identificacion = String.valueOf(alumno.getID());
                notas_Grupales.put(identificacion, nota);
                comprobante_notas.add(nota);
            }

        }
        
        grupo_asignar.setNotasGrupo(notas_Grupales);
        return comprobante_notas;
    } 
    */
  
           

   }
