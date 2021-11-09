/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.capaDatos;
import java.util.ArrayList;

public class Materia {
    private int codigo;
    private String nombre;
    private int creditos;
    private ArrayList<Grupo> grupos;

    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int codigoMateria){
        this.codigo = codigoMateria;
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombreMateria){
        this.nombre = nombreMateria;
    }

    public int getCreditos(){
        return this.creditos;
    }
    public void setCreditos(int creditosMateria){
        this.creditos = creditosMateria;
    }

    public ArrayList<Grupo> getGrupos(){
        return this.grupos;
    }
    public void setGrupos(ArrayList<Grupo> gruposMateria){
        this.grupos = gruposMateria;
    }
}
