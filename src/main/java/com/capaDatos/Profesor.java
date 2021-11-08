/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.capaDatos;
import java.util.ArrayList;

/**
 *
 *en las listas toca devolver todos los elementos
 */
public class Profesor{
    private String nombre;
    private int edad;
    private String ID;
    private String email;
    private ArrayList<Grupo> cursos;
    private String clave;
    //METODOS GET Y SET
    
    public void setNombre (String a){
        this.nombre = a;
    }
    
    public String getNombre ( ){
        return this.nombre;
    }
    
        public void setEdad (int i){
            this.edad = i;
    }
    
    public int getEdad ( ){
        return this.edad;
    }
    
        public void setID (String ID ){
             this.ID = ID;
    }
    
    public String getID ( ){
        return this.ID;
    }
    
        public void setEmail (String a ){
           this.email=a;
    }
    
    public String getEmail ( ){
        return this.email;
    }
    
    //GET Y SET PARA LOS ARRAYLIST
    //PARA LOS get ES indispensable tener el indice de cada elemento
    //recuerda que a los set se les da de argumento un objeto.
        public void setGrupo (Grupo e){
              this.cursos.add(e);
    }
    
    public ArrayList<Grupo> getGrupo ( ){
        return cursos;
    }
    
       public void setClave (String e){
              clave=e;
    }
    
    public String getClave (){
        return clave;
    }


    
    
}
