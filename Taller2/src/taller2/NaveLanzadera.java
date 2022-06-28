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
public class NaveLanzadera extends Nave implements NaveInterfaz
{
    private String tipoMotor;
    private String lugarLanzamiento;

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getLugarLanzamiento() {
        return lugarLanzamiento;
    }

    public void setLugarLanzamiento(String lugarLanzamiento) {
        this.lugarLanzamiento = lugarLanzamiento;
    }

    public NaveLanzadera(String cohete, String nombre, float peso, float altura, float velocidad) {
        super(cohete, nombre, peso, altura, velocidad);
    }

    @Override
    public void potenciaCohete() {
        System.out.println("Cohete de esta nave satelite tiene una fuerza de 7.607 kN (n. m.)");
    }

    @Override
    public void capacidadCarga() {
        System.out.println("capacidad de carga es de 13800 ");
    }

  
}
