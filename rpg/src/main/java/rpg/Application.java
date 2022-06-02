
package rpg;

import javax.swing.JFrame;

import rpg.paneles.*;

public class Application {
  public static void main(String[] args) {
    
      Intro intro = new Intro();
      MenuPrincipal menuPrincipal = new MenuPrincipal();

      intro.setVisible(true);
      intro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
  }
}
