package com.company;

public class Main {
    public static void main(String[] args) {
        SeguridadSocialHashMap seguridadSocial = new SeguridadSocialHashMap();

        Persona jose = new Persona("39425364H", "111111111", "Jose", "Tomás", 35, 45000.00);
        Persona maria =  new Persona("39425654W", "33333333", "Maria", "Gallego", 55, 61300.20);
        Persona carlos = new Persona("39425355Q", "22222222", "Carlos", "Torres", 22, 23000.00);
        Persona anna = new Persona("39425987J", "444444444", "Anna", "Pina", 26, 17654.88);
        Persona anna2 = new Persona("39425987J", "444444444", "Anna", "Pina", 26, 17654.88);
        System.out.println("obtener todas"+ seguridadSocial.obtenerTodas());

        seguridadSocial.altaPersona(jose);
        seguridadSocial.altaPersona(maria);
        seguridadSocial.altaPersona(carlos);
        seguridadSocial.altaPersona(anna);
        seguridadSocial.altaPersona(anna2);
        System.out.println("Altas a la seguridad social: " + seguridadSocial.obtenerTodas());
        System.out.println("ana1 " + seguridadSocial.obtenerPersonaPorDNI("39425987J"));

        System.out.println("obtener todas"+ seguridadSocial.obtenerTodas());
        System.out.println("Baja a la seguridad social: " + anna);
        seguridadSocial.bajaPersona(anna.getDNI());
        System.out.println(seguridadSocial.obtenersalariomaxymin());

        System.out.println("Lista de afiliados a la S.S.: " + seguridadSocial.obtenerTodas());

        System.out.println("obtenerPersonaPorDNI: " + seguridadSocial.obtenerPersonaPorDNI(jose.getDNI()));

        System.out.println("obtenerPersonaPorNumSS: " + seguridadSocial.obtenerPersonaPorNumSS(maria.getNumSS()));

        System.out.println("obtenerPersonasRangoSalarial: " + seguridadSocial.obtenerPersonasRangoSalarial(23000.00, 45000.00));

        System.out.println("obtenerPersonasMayoresQue: " + seguridadSocial.obtenerPersonasMayoresQue(25));




    }
}
