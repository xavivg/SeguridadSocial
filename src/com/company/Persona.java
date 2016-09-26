package com.company;

/**
 * Created by usu26 on 19/09/2016.
 */
public class Persona {

    private String DNI;
    private String numSS;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Double salario;


    public Persona(String DNI,String numSS, String nombre, String apellido, Integer edad, Double salario) {

        this.DNI = DNI;
        this.numSS = numSS;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;

    }
public Persona(){}

    public String getDNI() {
        return DNI;
    }

    public String getNumSS() {
        return numSS;
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

    public Double getSalario() {
        return salario;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (DNI != null ? !DNI.equals(persona.DNI) : persona.DNI != null) return false;
        return numSS != null ? numSS.equals(persona.numSS) : persona.numSS == null;

    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", numSS='" + numSS + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }
}
