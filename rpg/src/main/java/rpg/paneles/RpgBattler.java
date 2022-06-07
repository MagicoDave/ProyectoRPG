package rpg.paneles;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RpgBattler extends JFrame{
 
    Intro intro;
    MenuPrincipal menuPrincipal;

    public RpgBattler(){
        super("RPG Battler");
        this.setLayout(null);
        this.setSize(900, 800);
        this.setLocation(200, 200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                int res = JOptionPane.showConfirmDialog(
                    null, 
                    "¿Deseas cerrar RPG Battler?", 
                    "Aviso", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE);
                if (res == JOptionPane.YES_OPTION){
                    e.getWindow().dispose();
                }
            }
        });

        //Intro
        intro = new Intro();
        intro.addKeyListener(new KeyHandler());
        intro.setVisible(true);
        intro.setFocusable(true);
        add(intro);

        //Menú Principal
        menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(false);
        add(menuPrincipal);
    }

    private class KeyHandler extends KeyAdapter{

        @Override
        public void keyPressed(KeyEvent e) {
            
            if (e.getSource() == intro){
                menuPrincipal.setVisible(true);
                intro.setVisible(false);
                intro.timer.stop();
            }
            
        }
    }
}
