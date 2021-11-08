/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.capaDatos;
import java.util.ArrayList;
/**
 *
 * @author juan manuel
 */
public class Grupo {
    private int codigo;
    private int cupos;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;
    private String[] horario;
    private Materia asignatura;
    private ArrayList<Nota> notasGrupo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String[] getHorario() {
        return horario;
    }

    public void setHorario(String[] horario) {
        this.horario = horario;
    }

    public Materia getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Materia asignatura) {
        this.asignatura = asignatura;
    }

    public ArrayList<Nota> getNotasGrupo() {
        return notasGrupo;
    }

    public void setNotasGrupo(ArrayList<Nota> notasGrupo) {
        this.notasGrupo = notasGrupo;
    }
}
