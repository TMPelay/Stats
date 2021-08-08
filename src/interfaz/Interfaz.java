package interfaz;

import com.google.gson.Gson;
import datos.*;
import funciones.*;

public class Interfaz {
    public static void main(String[] args) {
        
        double experiencia, fuerza, velocidad, inteligencia, defensa, vitalidad, magia;
        
        Stats est = new Stats(0,0,0,0,0,0,0);
        Leer leer = new Leer();        
        Escribir escribir = new Escribir();
        
        est.setFuerza(50);
        est.setVitalidad(100);
        est.setExperiencia(1000);
        est.setDefensa(35);
        est.setInteligencia(80);
        est.setVelocidad(60);
        est.setMagia(15);
        
        fuerza = est.getFuerza(); vitalidad = est.getVitalidad(); experiencia = est.getExperiencia();
        defensa = est.getDefensa(); inteligencia = est.getInteligencia(); velocidad = est.getVelocidad();
        magia = est.getMagia();
        
        escribir.Escribir(fuerza, vitalidad, experiencia, defensa, inteligencia, velocidad, magia);
        leer.Leer();
        
        System.out.println("ex " + leer.experiencia);
        System.out.println("hp " + leer.vitalidad);
        System.out.println("fr " + leer.fuerza);
        System.out.println("df " + leer.defensa);
        System.out.println("vl " + leer.velocidad);
        System.out.println("iq " + leer.inteligencia);
        System.out.println("mp " + leer.magia);        
        
        Gson gson = new Gson();
        String  json = gson.toJson(leer.contenido);
    }
}
