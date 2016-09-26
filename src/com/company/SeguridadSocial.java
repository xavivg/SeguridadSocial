package com.company;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class SeguridadSocial {
    private List<Persona> personasList; /*Private para evitar que pueda ser modificado desde otro archivo que no sea este*/

    public SeguridadSocial() {
        personasList = new ArrayList<>();
    }

    // Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social


    public void altaPersona(Persona persona) {

        boolean eq = false;

        for (int i = 0; i < personasList.size(); i++) {  /*<-- persona personaactual : personalist --> for each*/
            if (personasList.equals(personasList.get(i))) { //TODO: hacer el equals por separado, no se contempla la opcion de que coincida uno si y el otro no
                eq = true;
                break;
            }

        }
        if (eq == false) {
            personasList.add(persona);
        }

    }

    public void bajaPersona(String dni) {
        boolean eq = false;
        int i = 0;
        for (i = 0; i < personasList.size(); i++) {
            if (dni.equals(personasList.get(i).getDNI())) {
                eq = true;
                break;
            }

        }
        if (eq == false) {
            personasList.remove(i);
        }
    }

    public Persona obtenerPersonaPorDNI(String dni) {
        boolean eq = false;
        int i = 0;
        for (i = 0; i < personasList.size(); i++) {
            if (dni.equals(personasList.get(i).getDNI())) {
                eq = true;
                break;
            }
        }
        if (eq == false) {
            return null;
        } else {
            return personasList.get(i);
        }

    }

    public Persona obtenerPersonaPorNumSS(String numSS) {

        boolean eq = false;
        int i = 0;
        for (i = 0; i < personasList.size(); i++) {
            if (numSS.equals(personasList.get(i).getNumSS())) {
                eq = true;
                break;
            }
        }
        if (eq == false) {
            return null;
        } else {
            return personasList.get(i);
        }
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max) {
        List<Persona> salarios = new ArrayList<>();
        boolean eq = false;
        int i = 0;
        double salario;
        for (i = 0; i < personasList.size(); i++) {
           salario = personasList.get(i).getSalario();
            if (salario == min || salario > min && salario < max || salario == max) {
                salarios.add(personasList.get(i));
                eq = true;
                break;
            }
        }
        if (eq == false) {
            return null;
        } else {
            return salarios;
        }
    }


    public List<Persona> obtenerPersonasMayoresQue(int edad){
        List<Persona> edades = new ArrayList<>();
        boolean eq = false;
        int i = 0;
        int año;
        for (i = 0; i < personasList.size(); i++) {
            if(edad < personasList.get(i).getEdad()){
                edades.add(personasList.get(i));
            }
        }
        return edades;
    }

    public List<Persona> obtenerTodas(){
        return personasList;
    }

    public Persona[] obtenersalariomaxymin(){
        int i = 0;
        Persona personamax = new Persona();
        Persona personamin = new Persona();
        for (i = 0; i < personasList.size(); i++) {

            if(personamin.getSalario()>personasList.get(i).getSalario()){
                personamin = personasList.get(i);
            }
            if(personamax.getSalario()<personasList.get(i).getSalario()){
                personamax = personasList.get(i);
            }
        }

        return new Persona[] {personamax, personamin};
    }
    @Override
    public String toString() {
        return "SeguridadSocial{" +
                "personasList=" + personasList +
                '}';
    }
}