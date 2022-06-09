package rpg.paneles;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Batalla extends JPanel{
    
    JLabel lblBackground;

    public Batalla(){
        this.setLayout(null);
        this.setSize(900, 800);
        this.setLocation(0, 0);

        //Fondo
        lblBackground = new JLabel();
        lblBackground.setIcon(new ImageIcon(Intro.class.getResource("/rpg/recursos/resizedBatalla.gif")));
        lblBackground.setSize(900, 800);
        lblBackground.setLocation(0, 0);
        add(lblBackground);
    }
}
