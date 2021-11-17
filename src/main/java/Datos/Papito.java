/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Datos;
import java.util.ArrayList;
import java.util.Random;

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
    
    public int randomID(){
        Random randomGenerator = new Random();
        int id = randomGenerator.nextInt(1000);
        return id;
    }
    
    public Papito(String nombre, ArrayList<Estudiante> acudientede){
        int id = randomID();
        this.setID(id);
        this.setAcudeA(acudientede);
        this.setNombre(nombre);
    }
    public Papito(String nombre){
        this(nombre,new ArrayList<Estudiante>());
    }
    public Papito(){
        this("desconocido",new ArrayList<Estudiante>());
    }
    
    @Override
    
    public String toString(){
        String acudidos = "[";
        for(Object objeto: acudeA){
            Estudiante acudido = (Estudiante) objeto;
            acudidos += acudido.getNombre() + " ";
        }     
        acudidos += "]";
        
        String cadena = "El acudiente " + nombre + " de identificacion "
        + String.valueOf(ID) + " acude a los estudiantes : " + acudidos;
        
        return cadena;
    }
}
