/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Logica;
import Datos.*;
import java.util.ArrayList;

/**
 *
 * @author juan manuel
 */
public class asignar {
//esto no es relevante
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }
    //Nota sobre este metodo: ya deberían existir 3 objetos de subsidios, de modo que se unan al mismo objeto los estudiantes.
    //Objetos definidos:

    Subsidio tipoA = new Subsidio("A", 450.340, 2);
    Subsidio tipoB = new Subsidio("B", 100.340, 1);
    Subsidio tipoC = new Subsidio("C", 320.340, 3);

    public boolean asignarSubsidio(Estudiante solicitante, Subsidio tipo) {

        // Parte estudiante
        ArrayList<Subsidio> subsidiosDelEstudiante = solicitante.getSubsidios();
        subsidiosDelEstudiante.add(tipo);
        solicitante.setSubsidios(subsidiosDelEstudiante);
        //Parte Subsidio
        ArrayList<Estudiante> solicitantesSubsidio = tipo.getBeneficiarios();
        solicitantesSubsidio.add(solicitante);
        tipo.setBeneficiarios(solicitantesSubsidio);

        return true;

    }
    
    public asignarNota(Grupo grupo_asignar){
        
    }
    
    
}
