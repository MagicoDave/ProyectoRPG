
package rpg;

import javax.swing.JFrame;

import rpg.paneles.*;

public class Application {
  public static void main(String[] args) {
    
      RpgBattler prueba = new RpgBattler();

      prueba.setVisible(true);
      prueba.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

      
  }
}
