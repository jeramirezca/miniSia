/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Datos;
import java.util.ArrayList;
import java.util.Random;

public class Papito{
    private String nombre;
    private String usuario;
    private String clave;
    private int ID;
    private ArrayList<Estudiante> acudeA;
    
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getUsuario(){
        return this.usuario;
    }
    
    public void setClave(String clave){
        this.clave = clave;
    }
    
    public String getClave(){
        return this.clave;
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
    
    public String randomUsuario(String nombre){
        Random randomGenerator = new Random();
        int finalPart = randomGenerator.nextInt(100);
        String usuario = nombre.concat(String.valueOf(finalPart));
        return usuario;
    }
    
    public int randomID(){
        Random randomGenerator = new Random();
        int id = randomGenerator.nextInt(500-202) + 202; //genera valores entre 200 y 500 para la id del papito
        return id;
    }
    
    public Papito(String nombre, ArrayList<Estudiante> acudientede, String clave){
        int id = randomID();
        String randomUser = randomUsuario(nombre);
        this.setID(id);
        this.setAcudeA(acudientede);
        this.setNombre(nombre);
        this.setClave(clave);
        this.setUsuario(randomUser);
    }
    public Papito(String nombre){
        this(nombre,new ArrayList<Estudiante>(), "1234");
    }
    public Papito(){
        this("desconocido",new ArrayList<Estudiante>(), "1234");
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
        + String.valueOf(ID) + " Usuario: " + usuario + " Contraseña: " + 
                clave + " acude a los estudiantes : " + acudidos;
        
        return cadena;
    }
}
