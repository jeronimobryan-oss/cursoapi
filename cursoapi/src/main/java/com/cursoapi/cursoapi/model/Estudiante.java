package com.cursoapi.cursoapi.model;

public class Estudiante {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String matricula;

    public Estudiante(String nombre, String apellido, Integer edad, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.matricula = matricula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public Integer getEdad() {
        return edad;
    }
    public String getMatricula() {
        return matricula;
    }
}
