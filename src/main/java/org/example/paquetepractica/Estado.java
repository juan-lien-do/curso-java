package org.example.paquetepractica;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Estado {
    private String ambito;
    private String descripcion;
    private String nombre;
    public boolean esAmbitoDetallePedido() {
        return Objects.equals(ambito, "DETALLEPEDIDO");
    }

    public boolean esAmbitoFactura() {
        return Objects.equals(ambito, "FACTURA");
    }

    public boolean esAmbitoPedido() {
        return Objects.equals(ambito, "PEDIDO");
    }

    public boolean esCancelado(){
        return Objects.equals(nombre, "CANCELADO");
    }


}
