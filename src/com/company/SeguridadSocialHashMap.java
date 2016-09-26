package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by usu26 on 23/09/2016.
 */
public class SeguridadSocialHashMap {

    private Map<String, Persona> personaMapDni = new HashMap<>();
    private Map<String, Persona> personaMapSs = new HashMap<>();

    public void altaPersona(Persona persona) {
        if (!personaMapDni.containsKey(persona.getDNI()) && !personaMapSs.containsKey(persona.getNumSS())) {

            personaMapDni.put(persona.getDNI(), persona);
            personaMapSs.put(persona.getNumSS(), persona);
        }

    }

    //  personaMapDni.keySet(); obtener todas las keys
    // personaMapDni.values(); obtener todos los valores de las KEY
    // personaMapDni.remove(dni); borrar objeto a partir de la KEY
    public void bajaPersona(String dni) {

        if (personaMapDni.containsKey(dni)) {
            personaMapSs.remove(personaMapDni.get(dni).getNumSS());
            personaMapDni.remove(dni);
        }

    }

    public Persona obtenerPersonaPorDNI(String dni) {
        return personaMapDni.get(dni);
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {

        return personaMapSs.get(numSS);
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max) {
        List<Persona> salarios = new ArrayList<>();

        for (Persona persona : personaMapDni.values()){
            if(persona.getSalario()>= min && persona.getSalario()<= max){
                salarios.add(persona);
            }
        }
        return salarios;
    }
    public List<Persona> obtenerPersonasMayoresQue(int edad) {
        List<Persona> edades = new ArrayList<>();

        for (Persona persona : personaMapDni.values()){
            if(persona.getEdad()>=edad){
                edades.add(persona);
            }
        }

        return edades;

    }
    public List<Persona> obtenerTodas() {
        List<Persona> all = new ArrayList<>();
        for (Persona persona : personaMapDni.values()) {

            all.add(persona);
        }
        return all;
    }
    public Persona[] obtenersalariomaxymin() {
        int i = 0;
        Persona personamax = new Persona();
        Persona personamin = new Persona();
        for (Persona persona : personaMapDni.values() ) {

            if(personamin.getSalario()>personaMapDni.get(i).getSalario()){
                personamin = personaMapDni.get(i);
            }
            if(personamax.getSalario()<personaMapDni.get(i).getSalario()){
                personamax = personaMapDni.get(i);
            }
        }
        return new Persona[] {personamax, personamin};
    }

}

