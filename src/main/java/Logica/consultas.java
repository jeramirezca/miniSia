
package Logica;

import Datos.*;
import java.util.ArrayList;
import java.util.HashMap;

public class consultas {
    
    public ArrayList<String> consultarNotas(Estudiante estudiante, Materia asignatura){
        String id = String.valueOf(estudiante.getID());
        ArrayList notaEstudiante = new ArrayList();
        ArrayList<Grupo> grupos = estudiante.getAtiende();
        int i = 0;
        int n = grupos.size();
        boolean bandera = true;
        while(i<n && bandera){
            if( grupos.get(i).getAsignatura() == asignatura) {
                HashMap notas = grupos.get(i).getNotasGrupo(); 
                Nota nota = (Nota) notas.get(id);
                String aniadido = "Materia: " + asignatura.getNombre() + "\n" +
                        nota.toString();
                notaEstudiante.add(aniadido);
                bandera = false;
            }
            i ++;
        }
        
        return notaEstudiante;  
    }
    
    public ArrayList<String> consultarNotas(Estudiante estudiante){
        String id = String.valueOf(estudiante.getID());
        ArrayList<String> notasEstudiante = new ArrayList();
        ArrayList<Grupo> grupos = estudiante.getAtiende();
        HashMap notasDelGrupo;
        for(Object grupo : grupos){
            Grupo grupoDelEstudiante = (Grupo) grupo;
            notasDelGrupo = grupoDelEstudiante.getNotasGrupo();
            Nota notaEstudiante = (Nota) notasDelGrupo.get(id);
            String aniadido = "Materia: " + grupoDelEstudiante.getAsignatura().getNombre()
                    + notaEstudiante.toString();
            notasEstudiante.add(aniadido); 
        }
        return notasEstudiante;
    }
    
    
    public ArrayList<String> consultarNotas(Papito acudiente){
        ArrayList<Estudiante> acudidos = acudiente.getAcudeA();
        ArrayList<String> notasEstudiantes = new ArrayList();
        for(Object objeto:acudidos){
            Estudiante estudiante = (Estudiante) objeto;
            String cadena = estudiante.getNombre() + ": ";
            cadena += String.join(" ", consultarNotas(estudiante)); 
            notasEstudiantes.add(cadena);
           
        } 
        
        return notasEstudiantes;
    }
    

    
 //codigo de simon
    public ArrayList<ArrayList<String>> recorrerArregloHorario(ArrayList<Grupo> grupos){
        ArrayList<ArrayList<String>> horario = new ArrayList();
        for(Object grupo : grupos){
            Grupo grupoObjeto = (Grupo) grupo;
            String nombreMateria = grupoObjeto.getAsignatura().getNombre();
            ArrayList<String> horarioGrupo = grupoObjeto.getHorario();
            for(int i=0; i<5; i++){
                if( !(horarioGrupo.get(i).equals("")) ){
                    String aux = nombreMateria + ": " + horarioGrupo.get(i);
                    horarioGrupo.remove(i);
                    horarioGrupo.add(i,aux);
                }
            }
            horario.add(horarioGrupo);
        }
        return horario;
    }
    
    public ArrayList<String> consultarHorario(Estudiante estudiante){
        
        ArrayList<Grupo> grupos = estudiante.getAtiende();
        ArrayList<ArrayList<String> > horario = recorrerArregloHorario(grupos);
        ArrayList<String> sumaHorario = new ArrayList<String>();
        
        for(int j=0; j<5; j++){
            String aux = "";
            for(int i=0; i<horario.size(); i++){
                aux += horario.get(i).get(j) + " ";
            }
            sumaHorario.add(aux);
        }
 
        return sumaHorario;
        
    }
    
    //codigo de simon
    public ArrayList<String> consultarHorario(Profesor profe){
        ArrayList<Grupo> grupos = profe.getCursos();
        ArrayList<ArrayList<String> > horario = recorrerArregloHorario(grupos);
        ArrayList<String> sumaHorario = new ArrayList<String>();
        
        for(int j=0; j<5; j++){
            String aux = "";
            for(int i=0; i<horario.size(); i++){
                aux += horario.get(i).get(j) + " ";
            }
            sumaHorario.add(aux);
        }
        
        return sumaHorario;
        
    }
    
    public ArrayList< ArrayList<String> > consultarHorario(Papito acudiente){
        ArrayList<Estudiante> acudidos = acudiente.getAcudeA();
        ArrayList< ArrayList<String> > horarioEstudiantes = new ArrayList();
        for(Object objeto:acudidos){
            Estudiante estudiante = (Estudiante) objeto;
            ArrayList<String> cadena = consultarHorario(estudiante); 
            horarioEstudiantes.add(cadena);          
        }    
        return horarioEstudiantes;
    }
    
    //codigo de simon
    public ArrayList<Profesor> consultarProfes(Estudiante estudiante){
        ArrayList<Profesor> profesores = new ArrayList();
        ArrayList<Grupo> grupos = estudiante.getAtiende();
        for(Object grupo : grupos){
            Grupo grupoEstudiante = (Grupo) grupo;
            Profesor profe = grupoEstudiante.getProfesor();
            profesores.add(profe);
        }    
        return profesores;
    }
    
    /*
    public ArrayList<ArrayList> consultarProfes(Papito acudiente){
        ArrayList<Estudiante> acudidos = acudiente.getAcudeA();
        ArrayList<ArrayList> profesYestudiantes = new ArrayList();
        for(Object objeto:acudidos){            
            Estudiante estudiante = (Estudiante) objeto;
            ArrayList lista = new ArrayList();
            String nombreEstudiante = estudiante.getNombre() + ": ";
            lista.add(nombreEstudiante);
            ArrayList<Profesor> profesores = consultarProfes(estudiante); 
            lista.add(profesores);
            profesYestudiantes.add(lista);
        }    
        return profesYestudiantes;
    }*/
    
    
    //codigo mio
    public String consultarSubsidio(Estudiante consultor) {
        String respuesta = "";

        if (consultor.getSubsidios().isEmpty()) {
            respuesta = "Usted no tiene subsidios asignados";
        } else {
            ArrayList<Subsidio> Lista_subsidios = consultor.getSubsidios();

            for (Subsidio i : Lista_subsidios) {
                //String elemento = " ";
                int j = 1;
                String valor_monetario = String.valueOf(i.getValor());
                String duracion = String.valueOf(i.getDuracionSemestres());
                String personas_usando = String.valueOf(i.getBeneficiarios().size());

                respuesta += "\nSUBSIDIO" + j + ":"
                        + " \nTipo: " + i.getTipo()
                        + " \nValor asignado: " + valor_monetario
                        + " \nDuracion semestral: " + duracion
                        + " \nPersonas usando este subsidio: " + personas_usando;

                //respuesta.add(elemento);
                ++ j;
            }

        }
        return respuesta;
    }
    
/*
    //MEtodo 1: con estudiante y documento del profesor
    public String consultarProfesor(int documento_profe,Estudiante consultor){
        String respuesta = " ";
        Profesor consultado = new Profesor();
  
        //Si solo tenemos el documento, buscaremos en los grupos del estudiante el profesor que le coincida el documento
        for( Grupo grupo_estudiante : consultor.getAtiende()){
            Profesor buscando = grupo_estudiante.getProfesor();
            if(buscando.getID() == documento_profe) {
                consultado = buscando;
                
            }
        }
        
        respuesta += "Nombre: " + consultado.getNombre()+
                "\n Edad: "+ consultado.getEdad()+
                "\n Email: "+ consultado.getEmail()
                +"\n Grupos dictados: " + consultado.getCursos() ; 
         
        return respuesta;
    }
    
    //Metodo 2: con grupo
        public String consultarProfesor(Grupo grupo_consultor){
        String respuesta = " ";
        Profesor consultado = grupo_consultor.getProfesor();
  
     
        
        respuesta += "Nombre: " + consultado.getNombre()+
                "\n Edad: "+ consultado.getEdad()+
                "\n Email: "+ consultado.getEmail()
                +"\n Grupos dictados: " + consultado.getCursos() ; 
         
        return respuesta;
    
    }
*/
    
    public Grupo buscarGrupo (Estudiante consultor, int numero){
        Grupo encontrado = new Grupo();
        ArrayList<Grupo> gruposEstudiante = consultor.getAtiende();
        for(Grupo buscando: gruposEstudiante){
            if(buscando.getNumero()== numero){
                encontrado =  buscando;
            }
        }
        return encontrado;
    }

}
