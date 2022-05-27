package rpg.libreria;

public class Libreria {
    
    public int roll1d2(){
        return (int)(Math.random() * 1 + 1);
    }
    
    public int roll1d3(){
        return (int)(Math.random() * 2 + 1);
    }

    public int roll1d4(){
        return (int)(Math.random() * 3 + 1);
    }

    public int roll1d6(){
        return (int)(Math.random() * 5 + 1);
    }

    public int roll1d8(){
        return (int)(Math.random() * 7 + 1);
    }

    public int roll1d10(){
        return (int)(Math.random() * 9 + 1);
    }

    public int roll1d12(){
        return (int)(Math.random() * 11 + 1);
    }

    public int roll1d20(){
        return (int)(Math.random() * 19 + 1);
    }
}
