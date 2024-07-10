package org.example.paqueteextra;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Auto implements SePuedeGuardarEnGarage {
    private int ano;
    private String nombreMarca;
    private String nombreModelo;
    private String color;

    public static AutoBuilder builder(){
        return new AutoBuilder();
    }

}
