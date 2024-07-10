package org.example.paqueteextra;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BDSingleton {
    private String URL;
    private String password;
    private String usuario;
    private static BDSingleton bdSingleton;

    public static BDSingleton getInstance(){
        if (bdSingleton == null){
            bdSingleton = new BDSingleton();
            bdSingleton.setURL("localhost:25655");
            bdSingleton.setPassword("12345678");
            bdSingleton.setUsuario("principal");
        }
        return bdSingleton;
    }

    public String getNombreUsuarioMejorRankeado(){
        return "nombre de ejemplo";
    }

    private BDSingleton() {
    }
}
