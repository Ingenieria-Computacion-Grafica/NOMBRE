/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author fing.labcom
 */
public class ManejadorTeclado implements KeyListener {

    public void keyTyped(KeyEvent e) {
        
          if (e.getKeyChar()=='1'){
        Main.cam=1;
    }
    if (e.getKeyChar()=='2'){
        Main.cam=2;
      
        //To change body of generated methods, choose Tools | Templates.
    }
    
       if (e.getKeyChar()=='3'){
        Main.cam=3;
    }
       
       if (e.getKeyChar()=='4'){
        Main.cam=4;
    }
        if (e.getKeyChar()=='5'){
        Main.cam=5;
    }
    }
    
 @Override
    public void keyPressed(KeyEvent e) {
      
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
    

    
    
