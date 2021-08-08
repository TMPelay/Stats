package datos;

public class Stats {
    
    private double experiencia, fuerza, velocidad, inteligencia, defensa, vitalidad, magia;
    
    public Stats(double experiencia, double fuerza, double velocidad, double inteligencia, double defensa, double vitalidad, double magia){
        this.experiencia = experiencia;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.inteligencia = inteligencia;
        this.defensa = defensa;
        this.vitalidad = vitalidad;
        this.magia = magia;
    }

    public double getExperiencia() {
        return experiencia;
    }

    public double getFuerza() {
        return fuerza;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getInteligencia() {
        return inteligencia;
    }

    public double getDefensa() {
        return defensa;
    }

    public double getVitalidad() {
        return vitalidad;
    }

    public double getMagia() {
        return magia;
    }

    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public void setVitalidad(double vitalidad) {
        this.vitalidad = vitalidad;
    }

    public void setMagia(double magia) {
        this.magia = magia;
    }
    
    
}
