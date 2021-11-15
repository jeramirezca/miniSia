/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Datos;
import java.util.ArrayList;
import java.util.Random;
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
    
    public ArrayList<Grupo> getCursos( ){
        return this.cursos;
    }
    
    public void setClave (String clave){
        this.clave = clave;
    }
    
    public String getClave (){
        return this.clave;
    }
    
    public int randomID(){
        Random randomGenerator = new Random();
        int id = randomGenerator.nextInt(1000);
        return id;
    }
    public Profesor(String nombre, int edad, String gmail,
            ArrayList<Grupo> cursos, String clave){
        
        int id = randomID();
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setID(id);
        this.setEmail(gmail);
        this.setCursos(cursos);
        this.setClave(clave);
    }
    public Profesor(String nombre, int edad, String gmail, 
            ArrayList<Grupo> cursos){
        this(nombre, edad, gmail,cursos,"1234");
    }
    public Profesor(String nombre, int edad, String gmail){
        this(nombre, edad, gmail,new ArrayList<Grupo>(),"1234");
    }
    public Profesor(String nombre, int edad){
        this(nombre, edad, "desconocido@gmail.com",new ArrayList<Grupo>(),"1234");
    }
    public Profesor(String nombre){
        this(nombre, -1, "desconocido@gmail.com", new ArrayList<Grupo>(),"1234");
    }
    public Profesor(){
        this("desconocido", 12, "desconocido@gmail.com", new ArrayList<Grupo>(),"1234");
    }
    
    @Override
    public String toString(){
        String cursosDictados = "[ ";
        for(Object objeto: cursos ){
            Grupo curso = (Grupo) objeto;
            cursosDictados += curso.getAsignatura().getNombre() + " grupo "
                    + String.valueOf(curso.getNumero()) + " ";

        }

        cursosDictados += "]";
        
        String cadena = "Profesor: " + nombre + " edad: " + String.valueOf(edad)
                + " Correo institucional: " + email + " cursos a cargo: " 
                + cursosDictados;
        return cadena;
    }
    
}
