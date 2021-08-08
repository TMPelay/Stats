package funciones;

import java.io.*;

public class Escribir {
    
    public void Escribir(double experiencia, double vitalidad, double fuerza, double defensa, double velocidad, double inteligencia, double magia) {
        try{
            FileWriter fw = new FileWriter("/home/tomas/Programacion/Java/NetBeans/Stats/src/datos/Estadisticas.json");
            fw.write("");
            fw.write("{\"fuerza\":"+ fuerza +",\"vitalidad\":"+ vitalidad +",\"experiencia\":"+ experiencia +",\"defensa\":"+ defensa +",\"inteligencia\":"+ inteligencia +",\"velocidad\":"+ velocidad +",\"magia\":"+ magia +"}");
            fw.close(); 
        } catch (IOException e) {
                System.out.println("Error E/S: " + e);
        }
    }
}
