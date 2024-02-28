package model;

public class Odontologo {

    private  Integer numMatricula;
    private String nombre;

    private String apellido;

    public Odontologo() {
    }

    public Odontologo(Integer numMatricula, String nombre, String apellido) {
        this.numMatricula = numMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(Integer numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }







}

