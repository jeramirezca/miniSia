/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package data;
import java.util.ArrayList;

public class Profesor{
    private String nombre;
    private int edad;
    private int ID;
    private String email;
    private ArrayList<Grupo> cursos;
    private String clave;
    //METODOS GET Y SET
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre( ){
        return this.nombre;
    }
    
    public void setEdad (int edad){
            this.edad = edad;
    }
    
    public int getEdad( ){
        return this.edad;
    }
    
    public void setID (int ID ){
             this.ID = ID;
    }
    
    public int getID ( ){
        return this.ID;
    }
    
    public void setEmail (String email ){
           this.email= email;
    }
    
    public String getEmail( ){
        return this.email;
    }
    
    public void setCursos (ArrayList<Grupo> cursosDictados){
        this.cursos = cursosDictados;
    }
    
    public ArrayList<Grupo> getGrupo( ){
        return this.cursos;
    }
    
    public void setClave (String clave){
        this.clave = clave;
    }
    
    public String getClave (){
        return this.clave;
    }

    
}
