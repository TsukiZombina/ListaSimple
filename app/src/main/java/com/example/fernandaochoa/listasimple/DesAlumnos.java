package com.example.fernandaochoa.listasimple;

/**
 * Created by Fernanda Ochoa on 07/07/2015.
 */
public class DesAlumnos {

    private String nombre;
    private String cinta;
    private int icono;

    public DesAlumnos(String nombre, String cinta, int icono) {
        this.nombre = nombre;
        this.cinta = cinta;
        this.icono = icono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCinta(String cinta) {
        this.cinta = cinta;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCinta() {
        return cinta;
    }

    public int getIcono() {
        return icono;
    }
}
