package rpg.core;

public class Armadura extends Equipo{
    
    public int armadura;
    public boolean pesada;

    public Armadura (String nombre, int armadura, boolean pesada){
        this.nombre = nombre;
        this.armadura = armadura;
        this.pesada = pesada;
    }
}
