package rpg.libreria;

public class Libreria {
    
    /**
     * Dados (1d2, 1d3, 1d4, 1d6, 1d8, 1d10, 1d12, 1d20)
     * @return Un número aleatorio entre los valores del dado
     */
    public static int roll1d2(){return (int)(Math.random() * 1 + 1);}
    public static int roll1d3(){return (int)(Math.random() * 2 + 1);}
    public static int roll1d4(){return (int)(Math.random() * 3 + 1);}
    public static int roll1d6(){return (int)(Math.random() * 5 + 1);}
    public static int roll1d8(){return (int)(Math.random() * 7 + 1);}
    public static int roll1d10(){return (int)(Math.random() * 9 + 1);}
    public static int roll1d12(){return (int)(Math.random() * 11 + 1);}
    public static int roll1d20(){return (int)(Math.random() * 19 + 1);}

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
    }

    
}
