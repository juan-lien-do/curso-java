package org.example.paquetepractica;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Pizza {
    String nombre;
    Double precio;
    VariedadPizza variedadPizza;
    TamanoPizza tamanoPizza;
    TipoPizza tipoPizza;

}
