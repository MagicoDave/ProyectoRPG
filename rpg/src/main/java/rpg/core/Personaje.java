package rpg.core;

import java.util.ArrayList;

public class Personaje {
    
    private String nombre;
<<<<<<< Updated upstream
    public int nivel;
    private int strScore, dexScore, conScore, intScore, wisScore, charScore; //Stats base
    private int strTemp, dexTemp, conTemp, intTemp, wisTemp, charTemp; //Stats temporales
    public int vidaBase, vidaActual, iniciativa, tiradaAtk, armadura, aptitud;
    public ArrayList<Habilidades> listaHabilidades;
    public ArrayList<Equipo> listaEquipo;
=======
    private int nivel;
    private int strScore, dexScore, conScore, intScore, wisScore, charScore; //Stats base
    private int strTemp, dexTemp, conTemp, intTemp, wisTemp, charTemp; //Stats temporales
    private int vidaBase, vidaActual, iniciativa, modArma, armadura, aptitud;
    private ArrayList<Habilidades> listaHabilidades;
>>>>>>> Stashed changes


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
<<<<<<< Updated upstream
=======
    }

    /**
     * Tirada 
     * @param dados función con la tirada de dados deseada
     * @param ventaja 0: Sin ventaja, 1: Ventaja, 2: Desventaja
     * @param modStat modificador de la stat relevante
     * @param aptitud aptitud de competencia (si lo hay)
     * @return resultado
     */
    public static int roll(int dados, int ventaja, int modStat, int aptitud){
        
        int tirada = 0;
        int tirada1 = roll(dados, 0, modStat, aptitud);
        int tirada2 = roll(dados, 0, modStat, aptitud);

        if (ventaja == 1){
            if (tirada1 >= tirada2){
                tirada = tirada1;
            } else {
                tirada = tirada2;
            }
        } else if (ventaja == 2){
            if (tirada1 <= tirada2){
                tirada = tirada1;
            } else {
                tirada = tirada2;
            }
        } else if (ventaja == 0){
            tirada = dados + ventaja + modStat + aptitud;
        }

        return tirada;
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
    //Set y get stats, base y temporales
=======
    //Set y get nivel
    public int getNivel(){return nivel;}
    public void setNivel(int nivel){this.nivel = nivel;}

    //Set y get stats
>>>>>>> Stashed changes
    public int getStrScore(){return strScore;}
    public int getDexScore(){return dexScore;}
    public int getConScore(){return conScore;}
    public int getIntScore(){return intScore;}
    public int getWisScore(){return wisScore;}
    public int getCharScore(){return charScore;}
<<<<<<< Updated upstream
    public void setStrScore(int strScore){this.strScore = strScore;}
    public void setDexScore(int dexScore){this.dexScore = dexScore;}
    public void setConScore(int conScore){this.conScore = conScore;}
    public void setIntScore(int intScore){this.intScore = intScore;}
    public void setWisScore(int wisScore){this.wisScore = wisScore;}
    public void setCharScore(int charScore){this.charScore = charScore;}
=======
>>>>>>> Stashed changes
    public int getStrTemp(){return strTemp;}
    public int getDexTemp(){return dexTemp;}
    public int getConTemp(){return conTemp;}
    public int getIntTemp(){return intTemp;}
    public int getWisTemp(){return wisTemp;}
    public int getCharTemp(){return charTemp;}
<<<<<<< Updated upstream
=======
    public void setStrScore(int strScore){this.strScore = strScore;}
    public void setDexScore(int dexScore){this.dexScore = dexScore;}
    public void setConScore(int conScore){this.conScore = conScore;}
    public void setIntScore(int intScore){this.intScore = intScore;}
    public void setWisScore(int wisScore){this.wisScore = wisScore;}
    public void setCharScore(int charScore){this.charScore = charScore;}
>>>>>>> Stashed changes
    public void setStrTemp(int strTemp){this.strTemp = strTemp;}
    public void setDexTemp(int dexTemp){this.dexTemp = dexTemp;}
    public void setConTemp(int conTemp){this.conTemp = conTemp;}
    public void setIntTemp(int intTemp){this.intTemp = intTemp;}
    public void setWisTemp(int wisTemp){this.wisTemp = wisTemp;}
    public void setCharTemp(int charTemp){this.charTemp = charTemp;}


<<<<<<< Updated upstream
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
=======


>>>>>>> Stashed changes
    
}
