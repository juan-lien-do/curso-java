package org.example.paqueteextra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Moto implements SePuedeGuardarEnGarage {
    private String marcaRuedas;
}
