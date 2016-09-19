package com.company;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class SeguridadSocial {
    private List<Persona> personasList;
    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social


    public void altaPersona(Persona persona) {

        boolean eq = false;

        for(int i=0;i<personasList.size();i++){
            if(personasList.equals(personasList.get(i))) {
                eq=true;
                break;
            }

        }
        if(eq == false){personasList.add(persona);}

    }

    public void bajaPersona(String dni) {
        boolean eq = false;
        int i=0;
        for(i=0;i<personasList.size();i++){
            if(dni.equals(personasList.get(i).getDNI())) {
                eq=true;
                break;
            }

        }
        if(eq == false){personasList.remove(i);}
    }

    public Persona obtenerPersonaPorDNI(String dni) {
        return dni;
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
    }

    public List<Persona> obtenerTodas(){
    }

    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}