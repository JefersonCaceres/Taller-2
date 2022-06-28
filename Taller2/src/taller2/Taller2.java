/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Navas JC
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Nave> estructura = new ArrayList<Nave>();

    public static void main(String[] args) throws IOException {
        //  cohete,nombre, peso, altura, velocidad

        boolean seguir = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"

        while (seguir) {
            System.out.println("Vamos a Crear una Nave Espacial  " + "\n");

            System.out.println("Escoja la nave espacial que quieres crear" + "\n" + "\n" + "1. Nave Satelite"
                    + "\n" + "2. Nave tripulada" + "\n" + "3. Nave no tripulada" + "\n" + "4. Nave Lanzadera" + "\n" + "0. Cerrar "
            );
            System.out.println("Que nave vamos a crear...");
            String entrada = br.readLine();

            int numero = Integer.parseInt(entrada);

            if (numero > 4 || numero < 0) {
                System.out.println("debes escoger un numero de la lista");

            } else if (numero == 1) {
                NaveSateliteSputnik satelite
                        = new NaveSateliteSputnik("cohete de tierra", "Sputnik", 80f, 2.9f, 8000f);
                estructura.add(satelite);
                for (Nave estructura : estructura) {
                    System.out.print(estructura.nombre + "\n" + estructura.cohete + "\n" + estructura.peso + " Kg" + "\n" + estructura.altura + " metros" + "\n" + estructura.velocidad + " m/s" + "\n");
                }

                String dato = "obtener información de las capas altas de la atmósfera y el campo electromagnético de nuestro planeta.";
                String diseñoNave = "una esfera de aluminio del tamaño de una pelota de laya -apenas 58 centímetros de diámetro- de poco más de 80 kilos, con cuatro largas y finas antenas.";
                satelite.setMision(dato);
                satelite.setDiseño(diseñoNave);
                //System.out.println(satelite);
                System.out.println("Capacidad de Carga" + "\n");
                satelite.capacidadCarga();
                System.out.println("Potencia del cohete" + "\n");
                satelite.potenciaCohete();
                System.out.println("Su mision es:" + "\n");
                System.out.println(satelite.getMision() + "\n" + "Su diseño: " + "\n" + satelite.getDiseño());

            } else if (numero == 2) {
                NaveLanzadera spaceX
                        = new NaveLanzadera("los propulsores SuperDraco", "SpaceX", 549054f , 70f, 34800f);
                estructura.add(spaceX);
                for (Nave estructura : estructura) {
                    System.out.print(estructura.nombre + "\n" + estructura.cohete + "\n" + estructura.peso + " Kg" + "\n" + estructura.altura + " metros" + "\n" + estructura.velocidad + " m/s" + "\n");
                }

                String motor = " 1 Merlin 1D+ Vacuum ";
                String lugar = "Cabo Cañaveral SLC-40 Base Vandenberg SLC-4E Centro Espacial Kennedy LC-39A";
                spaceX.setTipoMotor(motor);
                spaceX.setLugarLanzamiento(lugar);
                //System.out.println(satelite);
                System.out.println("Capacidad de Carga" + "\n");
                spaceX.capacidadCarga();
                System.out.println("Potencia del cohete" + "\n");
                spaceX.potenciaCohete();
                System.out.println("El tipo de motor:" + "\n");
                System.out.println(spaceX.getTipoMotor()+ "\n" + "Fue lanzado : " + "\n" + spaceX.getLugarLanzamiento());
            } else if (numero == 3) {
                NaveNoTripulada htv
                        = new NaveNoTripulada("cohete H-IIA", " vehículo de transferencia H-II, o HTV", 10500f, 9.5f, 1986f);
                estructura.add(htv);
                for (Nave estructura : estructura) {
                    System.out.print(estructura.nombre + "\n" + estructura.cohete + "\n" + estructura.peso + " Kg" + "\n" + estructura.altura + " metros" + "\n" + estructura.velocidad + " m/s" + "\n");
                }

                String dato = "Nave espacial no tripulada que tiene como objetivo dar suministro al módulo japonés Kibō de la Estación Espacial Internacional, y al resto de la estación, si es necesario.";
                String autonomia = "Vuelo en solitario de unas 100 horas, en reposo más de una semana, acoplado con la ISS unos 30 días";
                htv.setCargo(dato);
                htv.setAutonomia(autonomia);
                //System.out.println(satelite);
                System.out.println("Capacidad de Carga" + "\n");
                htv.capacidadCarga();
                System.out.println("Potencia del cohete" + "\n");
                htv.potenciaCohete();
                System.out.println("Su mision es :" + "\n");
                System.out.println(htv.getCargo() + "\n" + "Su autonomia es: " + "\n" + htv.getAutonomia()+ "\n");
            } else if (numero == 4) {
                NaveTripulada eei
                        = new NaveTripulada("Proton", "Estación Espacial Internacional", 419725f, 73f, 27600f);
                estructura.add(eei);
                for (Nave estructura : estructura) {
                    System.out.print(estructura.nombre + "\n" + estructura.cohete + "\n" + estructura.peso + " Kg" + "\n" + estructura.altura + " metros" + "\n" + estructura.velocidad + " km/h" + "\n");
                }

                String objetivo = "La ISS se construyó originalmente con la intención de ser un laboratorio, observatorio y fábrica a la vez que provee transporte, mantenimiento y una base en la órbita terrestre baja para misiones a la Luna, Marte y asteroides. ";
                   eei.setObjetivo(objetivo);
                //System.out.println(satelite);
               
                System.out.println("Su objetivo es:" + "\n");
                System.out.println(eei.getObjetivo() + "\n" );

            } else if (numero == 0) {
                seguir = false;
            }

            // System.out.println("Escogiste " + numero);
        }
    }

}
