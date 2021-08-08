package funciones;

import com.google.gson.Gson;
import java.io.*;
import java.nio.file.*;
import java.util.Map;

public class Leer {

    public String contenido = "";
    public double experiencia, fuerza, velocidad, inteligencia, defensa, vitalidad, magia;

    public void Leer(){
        try{
            Reader read = Files.newBufferedReader(Paths.get("/home/tomas/Programacion/Java/NetBeans/Stats/src/datos/Estadisticas.json"));
            Gson gson = new Gson();
            Map<?,?> map = gson.fromJson(read, Map.class);
            experiencia = (double) map.get("experiencia");
            vitalidad = (double) map.get("vitalidad");
            fuerza = (double) map.get("fuerza");
            defensa = (double) map.get("defensa");
            velocidad = (double) map.get("velocidad");
            inteligencia = (double) map.get("inteligencia");
            magia = (double) map.get("magia");
        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }
    }
}



//    public void Leer() {
//        try {
//            FileReader fr = new FileReader("/home/tomas/Programacion/Java/NetBeans/Stats/src/datos/Estadisticas.json");
//            int valor = fr.read();
//            while (valor != -1) {
//                contenido = contenido + (char)valor;
//                valor = fr.read();
//            }           
//            fr.close();
//        } catch (IOException e) {
//            System.out.println("Error E/S: " + e);
//        }
//    }
//    
