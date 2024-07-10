package org.example.paqueteextra;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Garage<T extends SePuedeGuardarEnGarage> {
    private String ubicacion;
    private List<T> listaObjetosGuardados;
    public void guardarNuevo(T t){
        if (listaObjetosGuardados == null){
            listaObjetosGuardados = new ArrayList<T>();
        }
        listaObjetosGuardados.add(t);
    }
}
