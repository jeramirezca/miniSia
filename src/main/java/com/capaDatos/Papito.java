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
public class Papito{
    private String nombre;
    private String ID;
    private ArrayList<Estudiante> acudiente;
    
    public void setNombre( String a){
        this.nombre = a;
    }
    
    public String getNombre( String a){
        return this.nombre;
    }
    
       public void setID( String a){
        this.ID = a;
    }
    
    public String getID( String a){
        return this.ID;
    }
    
    public void setAcudiente(Estudiante a){
        acudiente.add(a);
    }
    
    public Estudiante getAcudiente(int a){
        return acudiente.get(a);
    }
    
    
}
