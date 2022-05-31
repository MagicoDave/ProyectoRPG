package rpg.core;

public class Arma extends Equipo{
    
    public Arma(String nombre, String tipoDaño, int daño, boolean sutil){
        this.nombre = nombre;
        this.tipoDaño = tipoDaño.toUpperCase();
        this.daño = daño;
        this.sutil = sutil;
    }

    
}
