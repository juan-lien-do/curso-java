package org.example.paquetepractica;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Factura {
    LocalDateTime fechaHoraEmision;
    Long numero;
    Estado estadoFactura;
    List<DetallePedido> detalleFactura;
}
