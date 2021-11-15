/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Grupo {
    private int numero;
    private int cupos;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<String> horario;
    private Materia asignatura;
    private HashMap<String,Nota> notasGrupo;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numeroGrupo) {
        this.numero = numeroGrupo;
    }

    public int getCupos() {
        return this.cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<String> getHorario() {
        return this.horario;
    }

    public void setHorario(ArrayList<String> horario) {
        this.horario = horario;
    }

    public Materia getAsignatura() {
        return this.asignatura;
    }

    public void setAsignatura(Materia asignatura) {
        this.asignatura = asignatura;
    }

    public HashMap<String, Nota> getNotasGrupo() {
        return this.notasGrupo;
    }

    public void setNotasGrupo(HashMap<String, Nota> notasGrupo) {
        this.notasGrupo = notasGrupo;
    }
    
    public Grupo(Profesor profe, int numero, ArrayList<String> horario, int cupos, 
    Materia asignatura, ArrayList<Estudiante> estudiantes, HashMap<String,Nota> notas ){
        this.setProfesor(profe);
        this.setNumero(numero);
        this.setHorario(horario);
        this.setCupos(cupos);
        this.setAsignatura(asignatura);
        this.setEstudiantes(estudiantes);
        this.setNotasGrupo(notas);
    }
    
    public Grupo(Profesor profe, int numero, ArrayList<String> horario, int cupos, 
            Materia asignatura, ArrayList<Estudiante> estudiantes){
        this(profe, numero,horario,cupos,asignatura,
                estudiantes,new HashMap<String,Nota>());
    }
    public Grupo(Profesor profe, int numero, ArrayList<String> horario, int cupos,
            Materia asignatura){
        this(profe, numero,horario,cupos,asignatura,
                new ArrayList<Estudiante>(),new HashMap<String,Nota>());
    }
    public Grupo(Profesor profe, int numero, ArrayList<String> horario, int cupos){
        this(profe, numero,horario,cupos,new Materia(),
                new ArrayList<Estudiante>(),new HashMap<String,Nota>());
    }
    public Grupo(Profesor profe, int numero, ArrayList<String> horario){
        this(profe, numero,horario,-1,new Materia(),
                new ArrayList<Estudiante>(),new HashMap<String,Nota>());
    }
    public Grupo(Profesor profe, int numero){
        this(profe, numero,new ArrayList<String>(),-1,new Materia(),
                new ArrayList<Estudiante>(),new HashMap<String,Nota>());
    }
    public Grupo(Profesor profe){
        this(profe,-1,new ArrayList<String>(),-1,new Materia(),
                new ArrayList<Estudiante>(),new HashMap<String,Nota>());
    }
    public Grupo(){
        this(new Profesor(),-1,new ArrayList<String>(),-1,new Materia(),
                new ArrayList<Estudiante>(),new HashMap<String,Nota>());
    }
    
    @Override
    
    public String toString(){
        String cadena = "Materia: " + asignatura.getNombre() + 
                " Profesor a cargo: " + profesor.getNombre() 
                + " Grupo numero: " + String.valueOf(numero) + " Horario: " 
                + horario + " Cupos: " + String.valueOf(cupos);
        return cadena;
    }
}
