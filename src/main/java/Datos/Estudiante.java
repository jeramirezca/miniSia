/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Datos;
import java.util.ArrayList;
import java.util.Random;

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
    public int randomID(){
        Random randomGenerator = new Random();
        int id = randomGenerator.nextInt(1000);
        return id;
    }
    
    public String randomUsuario(String nombre){
        Random randomGenerator = new Random();
        int finalPart = randomGenerator.nextInt(100);
        String usuario = nombre.concat(String.valueOf(finalPart));
        return usuario;
    }
    
    public Estudiante(){
        this("Desconocido",-1,new Papito(),"1234",new ArrayList<Materia>(),
                new ArrayList<Subsidio>(), new ArrayList<Grupo>());
    }
    public Estudiante(String nombre){
        this(nombre,-1,new Papito(),"1234", new ArrayList<Materia>(),
                new ArrayList<Subsidio>(), new ArrayList<Grupo>());    
    }
    public Estudiante(String nombre, int edad){
        this(nombre,edad,new Papito(),"1234", new ArrayList<Materia>(),
                new ArrayList<Subsidio>(), new ArrayList<Grupo>());
    }
    
    public Estudiante(String nombre,int edad,Papito acudiente){
        this(nombre,edad,acudiente,"1234", new ArrayList<Materia>(),
                new ArrayList<Subsidio>(), new ArrayList<Grupo>());
    }
    public Estudiante(String nombre,int edad,Papito acudiente, 
            ArrayList<Materia> materias){
        this(nombre,edad,acudiente,"1234", materias, new ArrayList<Subsidio>(),
                new ArrayList<Grupo>());
    }
    public Estudiante(String nombre,int edad,Papito acudiente, 
            ArrayList<Materia> materias, ArrayList<Subsidio> subsidiosRecibidos){
        this(nombre,edad,acudiente,"1234", materias, subsidiosRecibidos, 
                new ArrayList<Grupo>() );
    }
    public Estudiante(String nombre,int edad,Papito acudiente, 
            ArrayList<Materia> materias, ArrayList<Subsidio> subsidiosRecibidos,
            ArrayList<Grupo> gruposAtendidos){
        this(nombre,edad,acudiente,"1234", materias, subsidiosRecibidos, 
                gruposAtendidos);
    }
    
    public Estudiante(String nombre, int edad, Papito acudiente, String clave,
            ArrayList<Materia> materias, ArrayList<Subsidio> subsidiosRecibidos,
            ArrayList<Grupo> gruposAtendidos){
        int id = randomID();
        String usuario = randomUsuario(nombre);
        this.setNombre(nombre);
        this.setEdad(edad);
        this.setUsuario(usuario);
        this.setID(id);
        this.setAcudiente(acudiente);
        this.setMateriasInscritas(materias);
        this.setSubsidios(subsidiosRecibidos);
        this.setAtiende(gruposAtendidos); 
        this.setClave(clave);
    }
    
    public String convertirLista(ArrayList lista){
    String cadena = "";
    cadena += "[";
    if(!lista.isEmpty()){
        Object obj = lista.get(0); 
        if(obj.getClass() == Subsidio.class){
            for(Object objeto: lista){
                Subsidio subsidio = (Subsidio) objeto;
                cadena += subsidio.getTipo() + " ";
            }
        }else{
            for(Object objeto: lista){
                Materia materia = (Materia) objeto;
                cadena += materia.getNombre() + " ";
            }
        }
    }
    cadena += "]";
        
    return cadena;
    }
    
    
    
    
    @Override
    public String toString(){
        String materias = convertirLista(materiasInscritas);
        String subsidiosEstudiante = convertirLista(subsidios);
        String cadena = "Estudiante: " + nombre + " Edad: " +
                String.valueOf(edad) + " años " + " Acudiente: " 
                + acudiente.getNombre() +" usuario: "+ usuario + 
                " Identificacion: " + String.valueOf(ID) + 
                " Materias inscritas: " + materias
                + " Subsidios que recibe: " + subsidiosEstudiante;
        return cadena;       
             
    }
   
    
    
  
  
}
