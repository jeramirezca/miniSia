/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.capaDatos;
import java.util.ArrayList;

public class Estudiante{
    private String nombre;
    private int edad;
    private String usuario;
    private Papito acudiente;
    private int ID;
    private ArrayList<Grupo> atiende;
    private ArrayList<Materia> materiasInscritas;
    private ArrayList<Subsidio> subsidios;
    private String clave;

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

    public ArrayList<Grupo> getAtiende(){
        return this.atiende;
    }
    public void setAtiende(ArrayList<Grupo> gruposAtendidos){
        this.atiende = gruposAtendidos;
    }

    public ArrayList<Materia> getMateriasInscritas(){
        return this.materiasInscritas;
    }
    public void setMateriasInscritas(ArrayList<Materia> materiasEstudiante){
        this.materiasInscritas = materiasEstudiante;
    }

    public ArrayList<Subsidio> getSubsidios(){
        return this.subsidios;
    }
    public void setSubsidios(ArrayList<Subsidio> subsidiosEstudiante){
        this.subsidios = subsidiosEstudiante;
    }

    public String getClave(){
        return this.clave;
    }
    public void setClave(String clave){
        this.clave = clave;
    }
  
}
