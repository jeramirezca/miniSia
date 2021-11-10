/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package data;
import java.util.ArrayList;

public class Papito{
    private String nombre;
    private int ID;
    private ArrayList<Estudiante> acudeA;
    
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setID( int id){
        this.ID = id;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public void setAcudeA (ArrayList<Estudiante> acudeA){
        this.acudeA = acudeA;
    }
    
    public ArrayList<Estudiante> getAcudeA(){
        return this.acudeA;
    }
    
    
}
