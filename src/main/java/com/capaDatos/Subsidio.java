/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.capaDatos;
import java.util.ArrayList;
/**
 *
 * @author juan manuel
 */
public class Subsidio {
     private String tipo;
    private double valor;
    private int duraciónSemestres;
    private ArrayList<Estudiante> beneficiarios;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDuraciónSemestres() {
        return duraciónSemestres;
    }

    public void setDuraciónSemestres(int duraciónSemestres) {
        this.duraciónSemestres = duraciónSemestres;
    }

    public ArrayList<Estudiante> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(ArrayList<Estudiante> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }
}
