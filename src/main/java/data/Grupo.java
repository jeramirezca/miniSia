/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.util.ArrayList;

public class Grupo {
    
    private int numero;
    private int cupos;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;
    private String[] horario;
    private Materia asignatura;
    private ArrayList<Nota> notasGrupo;

    public int getNumero() {
        return this.numero;
    }

    public void setCodigo(int numeroGrupo) {
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

    public String[] getHorario() {
        return this.horario;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }

    public Materia getAsignatura() {
        return this.asignatura;
    }

    public void setAsignatura(Materia asignatura) {
        this.asignatura = asignatura;
    }

    public ArrayList<Nota> getNotasGrupo() {
        return this.notasGrupo;
    }

    public void setNotasGrupo(ArrayList<Nota> notasGrupo) {
        this.notasGrupo = notasGrupo;
    }
}
