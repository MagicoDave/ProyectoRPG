package rpg.paneles;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import rpg.core.Arma;
import rpg.core.Enemigo;
import rpg.core.Jugador;

public class Batalla extends JPanel{
    
    JLabel lblBackground;

    JButton btnAtacar, btnPoder, btnDefender, btnMenuPrincipal;

    JLabel lblEnemigo;

    JPanel pnlInterfaz, pnlDialogo;

    Jugador heroe;
    Enemigo monstruo;

    public Batalla(){
        this.setLayout(null);
        this.setSize(900, 800);
        this.setLocation(0, 0);

        //pnlInterfaz
        pnlInterfaz = new JPanel();
        pnlInterfaz.setSize(800, 250);
        pnlInterfaz.setLocation(50, 500);
        pnlInterfaz.setVisible(true);
        pnlInterfaz.setBackground(new Color(1f, 1f, 1f, .6f));
        pnlInterfaz.setLayout(null);
        add(pnlInterfaz);

        //Fondo
        lblBackground = new JLabel();
        lblBackground.setIcon(new ImageIcon(Intro.class.getResource("/rpg/recursos/resizedBatalla.gif")));
        lblBackground.setSize(900, 800);
        lblBackground.setLocation(0, 0);
        add(lblBackground);
    }

    public void batalla(){
        
        do {
            
        } while (heroe.getvidaActual() <= 0 || monstruo.getvidaActual() <= 0);
    }

    public void turnoJugador(){
        
    }

    public void turnoMonstruo(){
        
        Arma armaMonstruo = null;

        for (int i = 0; i < monstruo.listaEquipo.size(); i++){
            if (monstruo.listaEquipo.get(i).getClass() == Arma.class){
                armaMonstruo = (Arma) monstruo.listaEquipo.get(i);
            }
        }

        int tirada = monstruo.atacar(0, armaMonstruo);

        if (tirada >= heroe.getArmadura()){
            heroe.setvidaActual(heroe.getvidaActual() - monstruo.dañoAtaque(armaMonstruo));
        }

    }
}
