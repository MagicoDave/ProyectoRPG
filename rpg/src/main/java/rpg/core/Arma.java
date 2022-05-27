package rpg.core;

public class Arma extends Equipo{
    
    public Arma(String nombre, String tipoDaño, int daño){
        this.nombre = nombre;
        this.tipoDaño = tipoDaño.toUpperCase();
        this.daño = daño;
    }

    
}
