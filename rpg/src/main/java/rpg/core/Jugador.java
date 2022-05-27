package rpg.core;

public class Jugador extends Personaje{

    private int idClase, idRaza;
    private String clase, raza;

    public Jugador(String nombre, int nivel, int[] stats) {
        super(nombre, nivel, stats);
    }

    public void claseBarbaro(){
        strScore = 20;
        dexScore = 18;
        conScore = 16;
        intScore = 12;
        wisScore = 10;
        charScore = 14;
    }

    public void clasePaladin(){
        
    }

    public void clasePicaro(){

    }

    public void claseMago(){

    }
    
}
