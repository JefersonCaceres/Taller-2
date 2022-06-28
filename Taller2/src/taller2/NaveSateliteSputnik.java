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
public class NaveSateliteSputnik extends Nave implements NaveInterfaz

{
     private String mision;
     private String diseño;

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    public NaveSateliteSputnik( String cohete, String nombre, float peso, float altura, float velocidad) {
        super(cohete, nombre, peso, altura, velocidad);
        
    }

    

    
  
    

    @Override
    public void potenciaCohete() {
        System.out.println("Cohete de esta nave satelite tiene una fuerza de NH4CIO4+AI");
    
    }

    @Override
    public void capacidadCarga() {
        System.out.println("Esta nave nos va a permitir llevar un satelite a orbita");
    }
    
}
