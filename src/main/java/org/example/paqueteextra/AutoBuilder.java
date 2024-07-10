package org.example.paqueteextra;

public class AutoBuilder {
    private Auto auto;

    public AutoBuilder ano(int ano){
        this.auto.setAno(ano);
        return this;
    }
    public AutoBuilder color(String color){
        this.auto.setColor(color);
        return this;
    }
    public AutoBuilder nombreMarca(String nombreMarca){
        this.auto.setNombreMarca(nombreMarca);
        return this;
    }
    public AutoBuilder nombreModelo(String nombreModelo){
        this.auto.setNombreModelo(nombreModelo);
        return this;
    }

    public Auto build(){
        return this.auto;
    }

    public AutoBuilder() {
        this.auto = new Auto();
    }
}
