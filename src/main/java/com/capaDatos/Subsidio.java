/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.capaDatos;
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
}
