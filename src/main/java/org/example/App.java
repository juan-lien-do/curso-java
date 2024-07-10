package org.example;

import org.example.paqueteextra.*;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        /*
        // patron singleton
        BDSingleton baseDatos = BDSingleton.getInstance();

        System.out.println(baseDatos.hashCode());

        BDSingleton baseDatos2 = BDSingleton.getInstance();
        System.out.println(baseDatos2.hashCode());

        BDSingleton baseDatos3 = BDSingleton.getInstance();
        System.out.println(baseDatos3.hashCode());

        BDSingleton baseDatos4 = BDSingleton.getInstance();
        System.out.println(baseDatos4.hashCode());
*/

        // patron chainbuilder

        Auto nuevoAuto = Auto.builder()
                .ano(1997)
                .color("Azul")
                .nombreModelo("Siena")
                .nombreMarca("Fiat")
                .build();

        //System.out.println(nuevoAuto.toString());





        Moto moto = new Moto("Michelin");

        Garage<SePuedeGuardarEnGarage> garage1 = new Garage<SePuedeGuardarEnGarage>();
        garage1.setUbicacion("San Martin 1546");
        garage1.guardarNuevo(moto);
        garage1.guardarNuevo(nuevoAuto);
        System.out.println(garage1);

    }
}
