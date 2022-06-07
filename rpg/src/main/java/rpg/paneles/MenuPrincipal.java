package rpg.paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuPrincipal extends JPanel implements ItemListener{

    JLabel lblBackground;

    JPanel pnlHeroe, pnlMonstruo;
    JLabel lblHeroe, lblMonstruo, lblNivel, lblNombre, lblSpriteHeroe, lblSpriteMonstruo;
    JComboBox<String> cbHeroe, cbMonstruo;
    String[] listaHeroes = {"Bárbaro", "Paladín", "Pícaro", "Mago"};
    String[] listaMonstruos = {"Goblin", "Lobo", "Oso"};
    JTextField txtNivelHeroe, txtNivelMonstruo;

    JLabel lblBattle, lblOpciones;

    public MenuPrincipal(){
        this.setLayout(null);
        this.setSize(900, 800);
        this.setLocation(0, 0);

        //Boton Battle!
        lblBattle = new JLabel();
        lblBattle.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/btnBattle.png")));
        lblBattle.setSize(lblBattle.getPreferredSize().width, lblBattle.getPreferredSize().height);
        lblBattle.setLocation(296, 600);
        lblBattle.addMouseListener(new MouseHandler());
        lblBattle.addMouseMotionListener(new MouseHandler());
        add(lblBattle);

        //Boton Opciones
        lblOpciones = new JLabel();
        lblOpciones.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/btnOpciones.png")));
        lblOpciones.setSize(lblOpciones.getPreferredSize().width, lblOpciones.getPreferredSize().height);
        lblOpciones.setLocation(288, 670);
        lblOpciones.addMouseListener(new MouseHandler());
        lblOpciones.addMouseMotionListener(new MouseHandler());
        add(lblOpciones);

        //Panel Heroe
        pnlHeroe = new JPanel();
        pnlHeroe.setSize(250, 550);
        pnlHeroe.setLocation(50, 50);
        pnlHeroe.setBackground(new Color(1f, 1f, 1f, .6f));
        add(pnlHeroe);
            //Label heroe
        lblHeroe = new JLabel("ELIGE TU HÉROE");
        lblHeroe.setHorizontalAlignment(JLabel.CENTER);
        lblHeroe.setFont(new Font("Arial", Font.PLAIN, 20));
        lblHeroe.setSize(250, 50);
        lblHeroe.setLocation(0, 50);
        pnlHeroe.add(lblHeroe);
            //Combobox heroe
        cbHeroe = new JComboBox<>(listaHeroes);
        cbHeroe.setSelectedIndex(0);
        cbHeroe.setMaximumRowCount(5);
        cbHeroe.setSize(cbHeroe.getPreferredSize().width, cbHeroe.getPreferredSize().width);
        cbHeroe.setLocation(10, 200);
        cbHeroe.addItemListener(this);
        pnlHeroe.add(cbHeroe);
            //Label nivel
        lblNivel = new JLabel("ELEGIR NIVEL");
        lblNivel.setHorizontalAlignment(JLabel.CENTER);
        lblNivel.setFont(new Font("Arial", Font.PLAIN, 20));
        lblNivel.setSize(250, 50);
        lblNivel.setLocation(0, 200);
        pnlHeroe.add(lblNivel);
            //Textfield nivel
        txtNivelHeroe = new JTextField("1");
        txtNivelHeroe.setSize(50, 50);
        txtNivelHeroe.setLocation(100, 250);
        pnlHeroe.add(txtNivelHeroe);
            //Label Icono
        lblSpriteHeroe = new JLabel();
        lblSpriteHeroe.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/IconBarbaro.jpg")));
        lblSpriteHeroe.setSize(120, 120);
        lblSpriteHeroe.setLocation(65, 400);
        pnlHeroe.add(lblSpriteHeroe);


        //Panel Monstruo
        pnlMonstruo = new JPanel();
        pnlMonstruo.setSize(250, 550);
        pnlMonstruo.setLocation(600, 50);
        pnlMonstruo.setBackground(new Color(1f, 1f, 1f, .6f));
        add(pnlMonstruo);
            //Label Monstruo
        lblMonstruo = new JLabel("ELIGE TU RIVAL");
        lblMonstruo.setHorizontalAlignment(JLabel.CENTER);
        lblMonstruo.setFont(new Font("Arial", Font.PLAIN, 20));
        lblMonstruo.setSize(250, 50);
        lblMonstruo.setLocation(0, 50);
        pnlMonstruo.add(lblMonstruo);
            //Combobox Monstruo
        cbMonstruo = new JComboBox<>(listaMonstruos);
        cbMonstruo.setSelectedIndex(0);
        cbMonstruo.setMaximumRowCount(5);
        cbMonstruo.setSize(cbMonstruo.getPreferredSize().width, cbMonstruo.getPreferredSize().width);
        cbMonstruo.setLocation(10, 200);
        cbMonstruo.addItemListener(this);
        pnlMonstruo.add(cbMonstruo);
            //Label Nivel
        lblNivel = new JLabel("ELEGIR NIVEL");
        lblNivel.setHorizontalAlignment(JLabel.CENTER);
        lblNivel.setFont(new Font("Arial", Font.PLAIN, 20));
        lblNivel.setSize(250, 50);
        lblNivel.setLocation(0, 200);
        pnlMonstruo.add(lblNivel);
            //Textfield nivel
        txtNivelMonstruo = new JTextField("1");
        txtNivelMonstruo.setSize(50, 50);
        txtNivelMonstruo.setLocation(100, 250);
        pnlMonstruo.add(txtNivelMonstruo);
            //Label sprite
        lblSpriteMonstruo = new JLabel();
        lblSpriteMonstruo.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/IconBarbaro.jpg")));
        lblSpriteMonstruo.setSize(120, 120);
        lblSpriteMonstruo.setLocation(65, 400);
        pnlMonstruo.add(lblSpriteMonstruo);

        //Fondo
        lblBackground = new JLabel();
        lblBackground.setIcon(new ImageIcon(Intro.class.getResource("/rpg/recursos/MenuBackground.gif")));
        lblBackground.setSize(900, 800);
        lblBackground.setLocation(0, 0);
        add(lblBackground);
        

    }
    
    private class MouseHandler extends MouseAdapter {

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            if (e.getSource() == lblBattle){
                lblBattle.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/btnBattleMO.png")));
            }

            if (e.getSource() == lblOpciones){
                lblOpciones.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/btnOpcionesMO.png")));
            }
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
            if (e.getSource() == lblBattle){
                lblBattle.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/btnBattle.png")));
            }

            if (e.getSource() == lblOpciones){
                lblOpciones.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/btnOpciones.png")));
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == cbHeroe){
            ArrayList<ImageIcon> clases = new ArrayList<ImageIcon>();
            clases.add(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/IconBarbaro.jpg")));
            clases.add(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/IconPaladin.jpg")));
            clases.add(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/IconPicaro.jpg")));
            clases.add(new ImageIcon(MenuPrincipal.class.getResource("/rpg/recursos/IconMago.jpg")));

            lblSpriteHeroe.setIcon(clases.get(cbHeroe.getSelectedIndex()));
        }
        
    }
}
