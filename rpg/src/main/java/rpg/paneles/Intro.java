package rpg.paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Intro extends JPanel{

    JLabel lblTitulo;
    JLabel lblPulsaTecla;
    JLabel lblBackground;
    Timer timer;
    

    MenuPrincipal menuPrincipal;

    public Intro(){
        this.setLayout(null);
        this.setSize(900, 800);
        this.setLocation(0, 0);

        //Título
        lblTitulo = new JLabel();
        lblTitulo.setIcon(new ImageIcon(Intro.class.getResource("/rpg/recursos/IntroTitulo.png")));
        lblTitulo.setLocation(150, 100);
        lblTitulo.setSize(lblTitulo.getPreferredSize().width, lblTitulo.getPreferredSize().height);
        lblTitulo.setVisible(true);
        add(lblTitulo);

        //Pulsa tecla
        lblPulsaTecla = new JLabel();
        lblPulsaTecla.setIcon(new ImageIcon(Intro.class.getResource("/rpg/recursos/IntroPulsaTecla.png")));
        lblPulsaTecla.setLocation(160, 400);
        lblPulsaTecla.setSize(lblPulsaTecla.getPreferredSize().width, lblPulsaTecla.getPreferredSize().height);
        lblPulsaTecla.setVisible(true);
        add(lblPulsaTecla);

        //Fondo
        lblBackground = new JLabel();
        lblBackground.setIcon(new ImageIcon(Intro.class.getResource("/rpg/recursos/IntroBackground.gif")));
        lblBackground.setSize(900, 800);
        lblBackground.setLocation(0, 0);
        add(lblBackground);

        timer = new Timer(500, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (lblPulsaTecla.isVisible()){
                    lblPulsaTecla.setVisible(false);
                } else {
                    lblPulsaTecla.setVisible(true);
                }   
            }
            
        });
        timer.start();

    }
}
