package rpg.core;

import java.util.ArrayList;
import rpg.libreria.*;

public class Personaje {
    
    private String nombre, clase;
    private int nivel;
    private int strScore, dexScore, conScore, intScore, wisScore, charScore; //Stats base
    private int strTemp, dexTemp, conTemp, intTemp, wisTemp, charTemp; //Stats temporales
    private int vidaBase, vidaActual, iniciativa, aptitud;
    public ArrayList<Habilidades> listaHabilidades;
    public ArrayList<Equipo> listaEquipo;
    public ArrayList<Poder> listaPoderes;


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
        listaEquipo = new ArrayList<Equipo>();
        listaPoderes = new ArrayList<Poder>();
    }

    public Personaje(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;
        listaEquipo = new ArrayList<Equipo>();
        listaPoderes = new ArrayList<Poder>();
    }

    /**
     * Atacar con el arma seleccionada
     * @param ventaja 0: Sin ventaja, 1: Ventaja, 2: Desventaja
     * @param arma El arma con la que se realiza el ataque
     * @return Resultado
     */
    public int atacar(int ventaja, Arma arma){
        int stat = 0;
        if (arma.sutil){
            if (getDexMod() >= getStrMod()){
                stat = getDexMod();
            } else {
                stat = getStrMod();
            }
        } else {
            stat = getStrMod();
        }
        return Libreria.roll(Libreria.roll1d20(), ventaja, stat, getAptitud());
    }


    /**
     * Tirada de daño de ataque con arma
     * @param arma El arma con la que se realiza el ataque
     * @return Resultado
     */
    public int dañoAtaque(Arma arma){
        int stat = 0;
        if (arma.sutil){
            if (getDexMod() >= getStrMod()){
                stat = getDexMod();
            } else {
                stat = getStrMod();
            }
        } else {
            stat = getStrMod();
        }

        return arma.daño + stat;
    }

    /**
     * Get armadura
     * @return Recorre toda la armadura equipada en {@link #listaEquipo} y devuelve la armadura total.
     *         Si es bárbaro, está sujeta a reglas especiales. El mínimo (si no se tiene armadura, por ejemplo)
     *         es 10 + el mod de destreza.
     */
    public int getArmadura(){

        int armaduraTotal = 0;

        for (int i = 0; i < listaEquipo.size(); i++){
            if (listaEquipo.get(i).getClass() == Armadura.class){
                armaduraTotal += ((Armadura) listaEquipo.get(i)).armadura;
                if (!((Armadura) listaEquipo.get(i)).pesada){
                    armaduraTotal += getDexMod();
                }
            }

            if (getClase() == "Bárbaro"){
                if (armaduraTotal < 10 + getDexMod() + getConMod()){
                    armaduraTotal = 10 + getDexMod() + getConMod();
                }
            }

            if (armaduraTotal < 10 + getDexMod()){
                armaduraTotal = 10 + getDexMod();
            } 
        }

        return armaduraTotal;
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

    //Set y get clase
    public String getClase(){return clase;}
    public void setClase(String clase){this.clase = clase;}

    //Set y get nivel
    public int getNivel(){return nivel;}
    public void setNivel(int nivel){this.nivel = nivel;}

    //Set y get stats
    public int getStrScore(){return strScore;}
    public int getDexScore(){return dexScore;}
    public int getConScore(){return conScore;}
    public int getIntScore(){return intScore;}
    public int getWisScore(){return wisScore;}
    public int getCharScore(){return charScore;}
    public int getStrTemp(){return strTemp;}
    public int getDexTemp(){return dexTemp;}
    public int getConTemp(){return conTemp;}
    public int getIntTemp(){return intTemp;}
    public int getWisTemp(){return wisTemp;}
    public int getCharTemp(){return charTemp;}
    public void setStrScore(int strScore){this.strScore = strScore;}
    public void setDexScore(int dexScore){this.dexScore = dexScore;}
    public void setConScore(int conScore){this.conScore = conScore;}
    public void setIntScore(int intScore){this.intScore = intScore;}
    public void setWisScore(int wisScore){this.wisScore = wisScore;}
    public void setCharScore(int charScore){this.charScore = charScore;}
    public void setStrTemp(int strTemp){this.strTemp = strTemp;}
    public void setDexTemp(int dexTemp){this.dexTemp = dexTemp;}
    public void setConTemp(int conTemp){this.conTemp = conTemp;}
    public void setIntTemp(int intTemp){this.intTemp = intTemp;}
    public void setWisTemp(int wisTemp){this.wisTemp = wisTemp;}
    public void setCharTemp(int charTemp){this.charTemp = charTemp;}

    //Set y get vida base y actual
    public int getVidaBase(){return vidaBase;}
    public void setVidaBase(int vidaBase){this.vidaBase = vidaBase;}
    public int getvidaActual(){return vidaActual;}
    public void setvidaActual(int vidaActual){this.vidaActual = vidaActual;}

    //Set y get iniciativa
    public int getIniciativa(){return iniciativa;}
    public void setIniciativa(int iniciativa){this.iniciativa = iniciativa;}

    //Set y get aptitud
    public int getAptitud(){return aptitud;}
    public void setAptitud(int aptitud){this.aptitud = aptitud;}




    
}
