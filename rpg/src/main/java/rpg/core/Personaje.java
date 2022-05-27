package rpg.core;

import java.util.ArrayList;

public class Personaje {
    
    private String nombre;
    public int nivel;
    private int strScore, dexScore, conScore, intScore, wisScore, charScore; //Stats base
    private int strTemp, dexTemp, conTemp, intTemp, wisTemp, charTemp; //Stats temporales
    public int vidaBase, vidaActual, iniciativa, tiradaAtk, armadura, aptitud;
    public ArrayList<Habilidades> listaHabilidades;
    public ArrayList<Equipo> listaEquipo;


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
    public int getStrMod(){return getStatMod(strScore + strTemp);}
    public int getDexMod(){return getStatMod(dexScore + dexTemp);}
    public int getConMod(){return getStatMod(conScore + conTemp);}
    public int getIntMod(){ return getStatMod(intScore + intTemp);}
    public int getWisMod(){return getStatMod(wisScore + wisTemp);}
    public int getCharMod(){return getStatMod(charScore + charTemp);}

    //Set y get nombre
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    //Set y get stats, base y temporales
    public int getStrScore(){return strScore;}
    public int getDexScore(){return dexScore;}
    public int getConScore(){return conScore;}
    public int getIntScore(){return intScore;}
    public int getWisScore(){return wisScore;}
    public int getCharScore(){return charScore;}
    public void setStrScore(int strScore){this.strScore = strScore;}
    public void setDexScore(int dexScore){this.dexScore = dexScore;}
    public void setConScore(int conScore){this.conScore = conScore;}
    public void setIntScore(int intScore){this.intScore = intScore;}
    public void setWisScore(int wisScore){this.wisScore = wisScore;}
    public void setCharScore(int charScore){this.charScore = charScore;}
    public int getStrTemp(){return strTemp;}
    public int getDexTemp(){return dexTemp;}
    public int getConTemp(){return conTemp;}
    public int getIntTemp(){return intTemp;}
    public int getWisTemp(){return wisTemp;}
    public int getCharTemp(){return charTemp;}
    public void setStrTemp(int strTemp){this.strTemp = strTemp;}
    public void setDexTemp(int dexTemp){this.dexTemp = dexTemp;}
    public void setConTemp(int conTemp){this.conTemp = conTemp;}
    public void setIntTemp(int intTemp){this.intTemp = intTemp;}
    public void setWisTemp(int wisTemp){this.wisTemp = wisTemp;}
    public void setCharTemp(int charTemp){this.charTemp = charTemp;}


    /**
     * Obtener modificador estadística
     * @param stat Stat de la que se quiere obtener el modificador
     * @return Modificador
     */
    public int getStatMod(int stat){
        int statMod = 0;

        if (stat == 1){statMod = -5;}
        if (stat > 1 && stat < 4){statMod = -4;}
        if (stat > 3 && stat < 6){statMod = -3;}
        if (stat > 5 && stat < 8){statMod = -2;}
        if (stat > 7 && stat < 10){statMod = -1;}
        if (stat > 9 && stat < 12){statMod = 0;}
        if (stat > 11 && stat < 14){statMod = +1;}
        if (stat > 13 && stat < 16){statMod = +2;}
        if (stat > 15 && stat < 18){statMod = +3;}
        if (stat > 17 && stat < 20){statMod = +4;}
        if (stat > 19 && stat < 22){statMod = +5;}
        if (stat > 21 && stat < 24){statMod = +6;}
        if (stat > 23 && stat < 26){statMod = +7;}
        if (stat > 25 && stat < 28){statMod = +8;}
        if (stat > 27 && stat < 30){statMod = +9;}
        if (stat >= 30){statMod = +10;}

        return statMod;
    }
    
}
