package rpg.paneles;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Intro extends JFrame{

    JLabel lblTitulo;
    JLabel lblPulsaTecla;
    JLabel lblBackground;

    

    MenuPrincipal menuPrincipal;

    public Intro(){
        super("Intro");
        this.setLayout(null);
        this.setSize(900, 800);
        this.setLocation(200, 200);
        addKeyListener(new KeyHandler());

        menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(false);
        menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblTitulo = new JLabel();
        lblTitulo.setIcon(new ImageIcon(Intro.class.getResource("/rpg/recursos/IntroTitulo.png")));
        lblTitulo.setLocation(150, 100);
        lblTitulo.setSize(lblTitulo.getPreferredSize().width, lblTitulo.getPreferredSize().height);
        lblTitulo.setVisible(true);
        add(lblTitulo);

        lblPulsaTecla = new JLabel();
        lblPulsaTecla.setIcon(new ImageIcon(Intro.class.getResource("/rpg/recursos/IntroPulsaTecla.png")));
        lblPulsaTecla.setLocation(160, 400);
        lblPulsaTecla.setSize(lblPulsaTecla.getPreferredSize().width, lblPulsaTecla.getPreferredSize().height);
        lblPulsaTecla.setVisible(true);
        add(lblPulsaTecla);

        lblBackground = new JLabel();
        lblBackground.setIcon(new ImageIcon(Intro.class.getResource("/rpg/recursos/IntroBackground.gif")));
        lblBackground.setSize(900, 800);
        lblBackground.setLocation(0, 0);
        add(lblBackground);

    }
    

    private class KeyHandler extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e) {
            
            
            menuPrincipal.setVisible(true);
            dispose();
        }
    }
}
