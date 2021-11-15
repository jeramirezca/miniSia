/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

public class Nota {
    private int valor;
    private Estudiante estudiante;

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Estudiante getEstudiante() {
        return this.estudiante;
    }

    public void setEstudiante(Estudiante estudianteCalificado) {
        this.estudiante = estudianteCalificado;
    }
    
    public Nota(int valor, Estudiante estudiante){
        this.setValor(valor);
        this.setEstudiante(estudiante);
    }
    public Nota(int valor){
        this(valor,new Estudiante());
    }
    public Nota(){
        this(0,new Estudiante());
    }
    
    @Override
    public String toString(){
        String cadena = " La nota es: " +
                String.valueOf(valor);
        return cadena;
    }
  
}
