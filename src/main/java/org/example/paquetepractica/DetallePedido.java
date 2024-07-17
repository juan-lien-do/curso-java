package org.example.paquetepractica;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DetallePedido {
    private Long cantidad;
    private Double precio;
    private Estado estadoDP;
    private Pizza pizza;

    public Double calcTotalItem(){
        return cantidad * precio;
    }

}
