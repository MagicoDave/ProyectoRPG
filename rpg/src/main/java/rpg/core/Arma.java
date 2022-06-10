package rpg.core;

public class Arma extends Equipo{

    public String tipoDaño; //Puede ser perforante, contundente o cortante
    public int daño;
    public boolean sutil;
    
    public Arma(String nombre, String tipoDaño, int daño, boolean sutil){
        this.nombre = nombre;
        this.tipoDaño = tipoDaño.toUpperCase();
        this.daño = daño;
        this.sutil = sutil;
    }

    
}
