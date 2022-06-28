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
public class NaveNoTripulada extends Nave implements NaveInterfaz
{   
    private String autonomia;
    private String cargo;

    public String getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public NaveNoTripulada(String cohete,String nombre, float peso, float altura, float velocidad) {
        super(cohete,nombre, peso, altura, velocidad);
    }

    @Override
    public void potenciaCohete() {
        System.out.println("El HTV 4 tiene cuatro motores principales HBT-5 de 500 N de empuje "
                + "fabricados por IHI Aerospace, además de 28 propulsores (situados en parejas) de "
                + "120 N para controlar la actitud del vehículo (RCS, Reaction Control System). A partir"
                + " del HTV 3, los motores de control de actitud son de fabricación japonesa (IHI Aerospace) "
                + "y son 10 newton más potentes que los "
                + "del HTV 1 y HTV 2, fabricados por la compañía norteamericana Aerojet.");
        }

    @Override
    public void capacidadCarga() {
        System.out.println("Capacidad de carga es de 6 toneladas");
    }
    
}
