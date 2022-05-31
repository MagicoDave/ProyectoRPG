package rpg.core;

import rpg.libreria.Libreria;

public class Jugador extends Personaje{

    String nombreClase;

    public Jugador(String nombre, int nivel, int[] stats) {
        super(nombre, nivel, stats);
    }

    public void claseBarbaro(){

        //Inicializar stats
        setNivel(1);
        nombreClase = "Bárbaro";
        setStrScore(20);
        setDexScore(16);
        setConScore(18);
        setIntScore(12);
        setWisScore(10);
        setCharScore(14);

        //Inventario
        Arma hachaBarbara = new Arma("Gran Hacha Bárbara", "CORTANTE", Libreria.roll1d12());
    }

    public void clasePaladin(){

        //Inicializar stats
        setNivel(1);
        nombreClase = "Paladín";
        setStrScore(16);
        setDexScore(14);
        setConScore(20);
        setIntScore(10);
        setWisScore(12);
        setCharScore(18);

        //Inventario
        Arma maza = new Arma("Maza", "APLASTANTE", Libreria.roll1d6());
        Armadura escudo = new Armadura("Escudo", 2);
        Armadura cotaMalla = new Armadura("Cota de Malla", 16);

    }

    public void clasePicaro(){

        //Inicializar stats
        setNivel(1);
        nombreClase = "Pícaro";
        setStrScore(12);
        setDexScore(20);
        setConScore(14);
        setIntScore(18);
        setWisScore(10);
        setCharScore(16);

        //Inventario

        //Daño y armadura
    }

    public void claseMago(){

        //Inicializar stats
        setNivel(1);
        nombreClase = "Mago";
        setStrScore(14);
        setDexScore(12);
        setConScore(16);
        setIntScore(20);
        setWisScore(18);
        setCharScore(10);

        //Inventario

        //Daño y armadura
    }
    
}
