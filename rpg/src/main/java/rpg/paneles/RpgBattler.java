package rpg.paneles;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import rpg.core.*;

public class RpgBattler extends JFrame {

    Intro intro;
    MenuPrincipal menuPrincipal;
    Batalla batalla;

    public RpgBattler() {
        super("RPG Battler");
        this.setLayout(null);
        this.setSize(900, 800);
        this.setLocation(200, 200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int res = JOptionPane.showConfirmDialog(
                        null,
                        "¿Deseas cerrar RPG Battler?",
                        "Aviso",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (res == JOptionPane.YES_OPTION) {
                    e.getWindow().dispose();
                }
            }
        });

        // Panel Intro
        intro = new Intro();
        for (Component c : intro.getComponents()) {
            c.addKeyListener(new KeyHandler());
        }
        intro.addKeyListener(new KeyHandler());
        intro.setVisible(true);
        intro.setFocusable(true);
        add(intro);

        // Panel Menú Principal
        menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(false);
        menuPrincipal.lblBattle.addMouseListener(new MouseHandler());
        add(menuPrincipal);

        // Panel Batalla
        batalla = new Batalla();
        for (Component c : batalla.getComponents()) {
            c.addKeyListener(new KeyHandler() {
                @Override
                public void keyReleased(KeyEvent e) {
                    System.err.println("TEcla: " + e.getKeyCode());

                    if (e.getSource() == batalla) {
                        System.err.println("PANEL");
                        batalla.setVisible(false);
                        menuPrincipal.setVisible(true);
                    }
                }
            });
        }
        batalla.addKeyListener(new KeyHandler() {
            @Override
            public void keyReleased(KeyEvent e) {
                System.err.println("TEcla: " + e.getKeyCode());

                if (e.getSource() == batalla) {
                    System.err.println("PANEL");
                    batalla.setVisible(false);
                    menuPrincipal.setVisible(true);
                }
            }
        });
        batalla.setVisible(false);
        batalla.setFocusable(true);
        add(batalla);

        //TODO Para solucionar el problema del listener, podemos añadirlo directamente a la clase
        // principal RpgBattler y luego gestionar eventos en función de que panel esté visible
    }

    private class KeyHandler extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            System.err.println("TEcla: " + e.getKeyCode());

            if (e.getSource() == intro) {
                menuPrincipal.setVisible(true);
                intro.setVisible(false);
                intro.setFocusable(false);
                intro.timer.stop();
            }
            // TODO Preguntar a Curro
            /*if (e.getSource() == batalla) {
                System.err.println("PANEL");
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    System.err.println("ESC");
                    batalla.setVisible(false);
                    menuPrincipal.setVisible(true);
                }
                batalla.setVisible(false);
                menuPrincipal.setVisible(true);
            }*/
        }
    }

    private class MouseHandler extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {

            if (e.getSource() == menuPrincipal.lblBattle){

                int nivelHeroe = 1;
                int nivelMonstruo = 1;
                String nombreHeroe = menuPrincipal.txtNombreHeroe.getText();

                try {
                    nivelHeroe = Integer.parseInt(menuPrincipal.txtNivelHeroe.getText());
                } catch (NumberFormatException ex) {
                    System.err.println("No se pudo convertir el nivel del héroe a número entero");
                    nivelHeroe = 1;
                }

                try {
                    nivelMonstruo = Integer.parseInt(menuPrincipal.txtNivelMonstruo.getText());
                } catch (NumberFormatException ex) {
                    System.err.println("No se pudo convertir el nivel del monstruo a número entero");
                    nivelMonstruo = 1;
                }

                if (nombreHeroe.isBlank()){
                    nombreHeroe = "Perico Palotes";
                }

                batalla.heroe = new Jugador(nombreHeroe, nivelHeroe);
                batalla.monstruo = new Enemigo(menuPrincipal.cbMonstruo.getSelectedItem().toString(), nivelMonstruo);

                if (menuPrincipal.cbHeroe.getSelectedItem() == "Bárbaro"){
                    batalla.heroe.claseBarbaro();
                } else if (menuPrincipal.cbHeroe.getSelectedItem() == "Paladín"){
                    batalla.heroe.clasePaladin();
                } else if (menuPrincipal.cbHeroe.getSelectedItem() == "Pícaro"){
                    batalla.heroe.clasePicaro();
                } else if (menuPrincipal.cbHeroe.getSelectedItem() == "Mago"){
                    batalla.heroe.claseMago();
                }

                if (menuPrincipal.cbMonstruo.getSelectedItem() == "Goblin"){
                    batalla.monstruo.goblin();
                } else if (menuPrincipal.cbMonstruo.getSelectedItem() == "Lobo"){
                    batalla.monstruo.lobo();
                } else if (menuPrincipal.cbMonstruo.getSelectedItem() == "Oso"){
                    batalla.monstruo.oso();
                }

                System.err.println("Nombre héroe: " + batalla.heroe.getNombre()
                + "\nClase héroe: " + batalla.heroe.getClase()
                + "\nNivel héroe: " + batalla.heroe.getNivel()
                + "\nNombre monstruo: " + batalla.monstruo.getNombre()
                + "\nNivel monstruo: " + batalla.monstruo.getNivel());

                menuPrincipal.setEnabled(false);
                menuPrincipal.setVisible(false);
                batalla.setVisible(true);
                batalla.setFocusable(true);


            }
        }
    }
}
