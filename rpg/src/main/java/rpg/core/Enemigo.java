package rpg.core;

import rpg.libreria.Libreria;

public class Enemigo extends Personaje{

    public String especie;

    public Enemigo(String nombre, int nivel) {
        super(nombre, nivel);
    }

    public void goblin(){

        //Inicializar stats
        especie = "Goblin";
        setStrScore(8);
        setDexScore(14);
        setConScore(10);
        setIntScore(10);
        setWisScore(8);
        setCharScore(8);
        setAptitud(2);
        setVidaBase(7 + getConMod() * getNivel()); // Los goblins consiguen 7 puntos de golpe (vida) máximos por nivel
        setvidaActual(getVidaBase());

        //Inventario
        Arma cuchillo = new Arma("Cuchillo", "CORTANTE", Libreria.roll1d4(), true);
        listaEquipo.add(cuchillo);
    }

    public void lobo(){

        //Inicializar stats
        especie = "Lobo";
        setStrScore(12);
        setDexScore(15);
        setConScore(12);
        setIntScore(3);
        setWisScore(12);
        setCharScore(6);
        setAptitud(2);
        setVidaBase(10 + getConMod() * getNivel()); // Los lobos consiguen 10 puntos de golpe (vida) máximos por nivel
        setvidaActual(getVidaBase());

        //Inventario
        Arma mordiscoLobo = new Arma("Mordisco de lobo", "PERFORANTE", Libreria.roll1d4(), true);
        listaEquipo.add(mordiscoLobo);
    }

    public void oso(){

        //Inicializar stats
        especie = "Oso";
        setStrScore(19);
        setDexScore(10);
        setConScore(16);
        setIntScore(2);
        setWisScore(13);
        setCharScore(7);
        setAptitud(2);
        setVidaBase(18 + getConMod() * getNivel()); // Los osos consiguen 18 puntos de golpe (vida) máximos por nivel
        setvidaActual(getVidaBase());

        //Inventario
        Arma garrasOso = new Arma("Garras de oso", "CORTANTE", Libreria.roll1d8(), false);
        Armadura pielDeOso = new Armadura("Piel de oso", 11, true);
        listaEquipo.add(garrasOso);
        listaEquipo.add(pielDeOso);
    }

    
    
}
