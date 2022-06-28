/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author Navas JC
 */
public class NaveTripulada extends Nave {
    private String objetivo;

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    public NaveTripulada(String cohete, String nombre, float peso, float altura, float velocidad) {
        super(cohete, nombre, peso, altura, velocidad);
    }


   
    
}
