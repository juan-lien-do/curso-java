package org.example.paquetepractica;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class TipoPizza {
    String descripcion;
    String nombre;
}
