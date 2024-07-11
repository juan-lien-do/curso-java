package org.example;

import org.example.paqueteextra.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

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
        /*

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
        System.out.println(garage1);*/

        //LocalDate fechaActual = LocalDate.now();

        //LocalDateTime fechaHoraActual = LocalDateTime.now();
        //LocalDate fechaEnDosSemanas = fechaActual.getDayOfYear()
        //System.out.println(fechaHoraActual.plusHours(27));


        /*long currentMilliseconds = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < 1000000; i++) {
            sb.append('O');
        }
        String respuesta = sb.toString();*/
/*
        String respuesta = "";

        for (int i = 0; i < 1000000; i++) {
            respuesta = respuesta + "O";
        }*/
/*
        long lastMilliseconds = System.currentTimeMillis();


        System.out.println(lastMilliseconds - currentMilliseconds);*/

        /*
        AutoBuilder ab = Auto.builder()
                .ano(1997)
                .color("Azul")
                .nombreModelo("Siena")
                .nombreMarca("Fiat");

        Auto auto1 = ab.build();
        Auto auto2 = ab.build();
        Auto auto3 = ab.build();

        List<Auto> listaAutos = new ArrayList<>();

        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto3);

        //listaAutos.get(2);

        for (Auto autoActual : listaAutos) {
            System.out.println(autoActual.getColor());
        }*/

        /*
        List<Integer> lista = new ArrayList<>();
        lista.addAll(Arrays.asList(new Integer[]{1,5,8,7,5,987,9,8,7,8,5,5,4,7,85,564,6}));

        System.out.println(eliminarRepetidos(lista));
        */

        int valor = 6;
        Integer valorPorReferencia = valor;
        int otroValor = valorPorReferencia;
        int valorMaximo = Integer.MAX_VALUE;

        valorMaximo++;
        System.out.println(valorMaximo);

        /*
        TODAS LAS WRAPPER CLASSES

        Long
        Integer
        Boolean
        Character
        Float
        Double
        */


        /*
        List<Integer> lista = new ArrayList<>();
        lista.addAll(Arrays.asList(new Integer[]{1,2,5,4,8,9,6,3,7}));


        List<Integer> listaMayorATres = lista.stream().filter(x -> x > 3).toList();
        long cantidadFinal = listaMayorATres.stream().count();

        System.out.println(cantidadFinal);*/



    }

    public static List<Integer> eliminarRepetidos(List<Integer> lista) {

        Map<Integer, Boolean> mapa = new HashMap<>();

        for (Integer entero : lista) {
            if (!mapa.containsKey(entero)){
                mapa.put(entero, Boolean.TRUE);
            }
        }

        return mapa.keySet().stream().toList();

    }
}
