package org.example.paquetepractica;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Pedido {
    Long numeroPedido;
    LocalDateTime fechaHoraCreacion;
    LocalDateTime fechaHoraEntrega;
    String nombreCliente;
    List<DetallePedido> detallePedidos;
    List<CambioEstadoPedido> cambioEstadoPedidos;

    public Double calcTotalPedido() {
        return detallePedidos.stream().map(x -> x.calcTotalItem()).mapToDouble(Double::valueOf).sum();
    }

    public Long cuantoTiempoPorEstado(String estado) {
        return this.cambioEstadoPedidos.stream().filter(x -> Objects.equals(x.getEstado().getNombre(), estado)).map(CambioEstadoPedido::calcularDuracion).mapToLong(Long::valueOf).sum();
    }
}
