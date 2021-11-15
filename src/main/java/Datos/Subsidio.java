/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import java.util.ArrayList;

public class Subsidio {
    private String tipo;
    private double valor;
    private int duracionSemestres;
    private ArrayList<Estudiante> beneficiarios;

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDuracionSemestres() {
        return this.duracionSemestres;
    }

    public void setDuraciónSemestres(int duracionSemestres) {
        this.duracionSemestres = duracionSemestres;
    }

    public ArrayList<Estudiante> getBeneficiarios() {
        return this.beneficiarios;
    }

    public void setBeneficiarios(ArrayList<Estudiante> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }
    
    public Subsidio(String tipo, double valor, int duracion, 
            ArrayList<Estudiante> beneficiarios){
        this.setTipo(tipo);
        this.setValor(valor);
        this.setDuraciónSemestres(duracion);
        this.setBeneficiarios(beneficiarios);    
    }
    public Subsidio(String tipo, double valor, int duracion){
        this(tipo, valor, duracion, new ArrayList<Estudiante>());
    }
    public Subsidio(String tipo, double valor){
        this(tipo, valor, 0, new ArrayList<Estudiante>());
    }
    public Subsidio(String tipo){
        this(tipo, 00000.0, 0, new ArrayList<Estudiante>());
    }
    public Subsidio(){
        this("desconocido", 00000.0, 0, new ArrayList<Estudiante>());
    }
    
    @Override
    
    public String toString(){
     String cadena = "Subsidio tipo: " + tipo + " valor: " + valor + 
             " tiempo del beneficio: " + String.valueOf(duracionSemestres); 
     
     return cadena;
    }
}
