package rpg.core;

public class Personaje {
    
    private String nombre;
    private int strScore, dexScore, conScore, intScore, wisScore, charScore;
    private int strMod, dexMod, conMod, intMod, wisMod, charMod;


    public Personaje(String nombre, int[] stats){

    }

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
