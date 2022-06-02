package rpg.paneles;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuPrincipal extends JFrame{

    JLabel prueba;

    public MenuPrincipal(){
        super("Menu Principal");
        this.setLayout(null);
        this.setSize(900, 800);
        this.setLocation(200, 200);

        prueba = new JLabel("Estás en el menú principal");
        prueba.setSize(prueba.getPreferredSize().width, prueba.getPreferredSize().height);
        prueba.setLocation(400, 350);
        prueba.setVisible(true);
        add(prueba);
        

    }
    
}
