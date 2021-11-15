/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
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
    
    public Materia(int codigo, String nombre, int creditos, ArrayList<Grupo> grupos){
        this.setCodigo(codigo);
        this.setNombre(nombre);
        this.setCreditos(creditos);
        this.setGrupos(grupos);
    }
    public Materia(int codigo, String nombre, int creditos){
        this(codigo,nombre,creditos,new ArrayList<Grupo>());
    }
    public Materia(int codigo, String nombre){
        this(codigo,nombre,0,new ArrayList<Grupo>());
    }
    public Materia(int codigo){
        this(codigo,"desconocido",0,new ArrayList<Grupo>());
    }
    public Materia(){
        this(00000,"desconocido",0,new ArrayList<Grupo>());
    }
    
    
    @Override
    
    public String toString(){
        String cadena = "Materia: " + nombre + " Codigo: " + String.valueOf(codigo)
                + " Numero de creditos: " + String.valueOf(creditos) + 
                " Grupos: Hay " + String.valueOf(grupos.size());
        return cadena;
    }
}
