package rpg.core;

import java.util.ArrayList;
import rpg.libreria.*;

public class Personaje {
    
    private String nombre;
    public int nivel;
    public int strScore, dexScore, conScore, intScore, wisScore, charScore; //Stats base
    public int strTemp, dexTemp, conTemp, intTemp, wisTemp, charTemp; //Stats temporales
    public int vidaBase, vidaActual, iniciativa, modArma, armadura, aptitud;
    public ArrayList<Habilidades> listaHabilidades;


    public Personaje(String nombre, int nivel, int[] stats){
        this.nombre = nombre;
        this.nivel = nivel;
        strScore = stats[0];
        dexScore = stats[1];
        conScore = stats[2];
        intScore = stats[3];
        wisScore = stats[4];
        charScore = stats[5];
        strTemp = 0;
        dexTemp = 0;
        conTemp = 0;
        intTemp = 0;
        wisTemp = 0;
        charTemp = 0;
        
    }

    //Get modStat
    public int getStrMod(){return Libreria.getStatMod(strScore + strTemp);}
    public int getDexMod(){return Libreria.getStatMod(dexScore + dexTemp);}
    public int getConMod(){return Libreria.getStatMod(conScore + conTemp);}
    public int getIntMod(){ return Libreria.getStatMod(intScore + intTemp);}
    public int getWisMod(){return Libreria.getStatMod(wisScore + wisTemp);}
    public int getCharMod(){return Libreria.getStatMod(charScore + charTemp);}

    //Set y get nombre
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    
}
