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
        setAptitud(2);
        setVidaBase(12 + getConMod() * getNivel()); // Los bárbaros consiguen 12 puntos de golpe (vida) máximos por nivel
        setvidaActual(getVidaBase());

        //Inventario
        Arma hachaBarbara = new Arma("Gran Hacha Bárbara", "CORTANTE", Libreria.roll1d12(), false);
        listaEquipo.add(hachaBarbara);

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
        setAptitud(2);
        setVidaBase(10 + getConMod() * getNivel()); // Los paladines consiguen 10 puntos de golpe (vida) máximos por nivel
        setvidaActual(getVidaBase());

        //Inventario
        Arma maza = new Arma("Maza", "APLASTANTE", Libreria.roll1d6(), false);
        Armadura escudo = new Armadura("Escudo", 2);
        Armadura cotaMalla = new Armadura("Cota de Malla", 16);
        listaEquipo.add(maza);
        listaEquipo.add(escudo);
        listaEquipo.add(cotaMalla);

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
        setAptitud(2);
        setVidaBase(8 + getConMod() * getNivel()); // Los pícaros consiguen 8 puntos de golpe (vida) máximos por nivel
        setvidaActual(getVidaBase());

        //Inventario
        Arma estoque = new Arma("Estoque", "PERFORANTE", Libreria.roll1d8(), true);
        Armadura armaduraCuero = new Armadura("Armadura de cuero", 11);
        listaEquipo.add(estoque);
        listaEquipo.add(armaduraCuero);

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
        setAptitud(2);
        setVidaBase(6 + getConMod() * getNivel()); // Los magos consiguen 6 puntos de golpe (vida) máximos por nivel
        setvidaActual(getVidaBase());

        //Inventario
        Arma baston = new Arma("Bastón", "CONTUNDENTE", Libreria.roll1d6(), false);
        listaEquipo.add(baston);

    }
    
}
