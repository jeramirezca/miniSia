/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.capaDatos;
import java.util.ArrayList;
/**
 *
 * @author juan manuel
 */
public class Estudiante{
   private String nombre;
    private int edad;
    private String usuario;
    private Papito acudiente;
    private int ID;
    private ArrayList<Grupo> atiende;
    private ArrayList<Materia> materiasInscritas;
    private ArrayList<Subsidio> subsidios;
    private ArrayList<Nota> notas;

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombreEstudiante){
        this.nombre = nombreEstudiante;
    }

    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int edadEstudiante){
        this.edad = edadEstudiante;
    }

    public String getUsuario(){
        return this.usuario;
    }
    public void setUsuario(String usuarioEstudiante){
        this.usuario = usuarioEstudiante;
    }

    public Papito getAcudiente(){
        return this.acudiente;
    }
    public void setAcudiente(Papito acudienteEstudiante){
        this.acudiente = acudienteEstudiante;
    }

    public int getID(){
        return this.ID;
    }
    public void setID(int idEstudiante){
        this.ID = idEstudiante;
    }

    public Grupo getAtiende(int indice){
        return this.atiende.get(indice);
    }
    public void setAtiende(Grupo grupoAtendido){
        this.atiende.add(grupoAtendido);
    }

    public Materia getMateriasInscritas(int indice){
        return this.materiasInscritas.get(indice);
    }
    public void setMateriasInscritas(Materia materiaEstudiante){
        this.materiasInscritas.add(materiaEstudiante);
    }

    public Subsidio getSubsidios(int indice){
        return this.subsidios.get(indice);
    }
    public void setSubsidios(Subsidio subsidioEstudiante){
        this.subsidios.add(subsidioEstudiante);
    }

    public Nota getNotas(int indice){
        return this.notas.get(indice);
    }
    public void setNotas(Nota notaestudiante){
        this.notas.add(notaestudiante);
    }
    
}
