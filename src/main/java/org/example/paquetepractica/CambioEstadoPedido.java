package org.example.paquetepractica;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CambioEstadoPedido {
    LocalDateTime fechaHoraInicio;
    LocalDateTime fechaHoraFin;
    Estado estado;

    public boolean esEstadoActual(){
        return fechaHoraFin == null;
    }

    public Long calcularDuracion(){
        return ChronoUnit.MINUTES.between(fechaHoraInicio, fechaHoraFin == null ? LocalDateTime.now() : fechaHoraFin);
    }
}

