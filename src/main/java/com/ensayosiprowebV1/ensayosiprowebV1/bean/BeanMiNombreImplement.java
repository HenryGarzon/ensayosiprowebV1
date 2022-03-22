package com.ensayosiprowebV1.ensayosiprowebV1.bean;

public class BeanMiNombreImplement implements BeanMiNombre{

    @Override
    public String imprimirMiNombre(String nombre) {

        return "Soy "+nombre;
    }
}
