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
//    EscenarioAnimado principal;
    public ManejadorTeclado(/*EscenarioAnimado principal*/) {
//        this.principal = principal;
    }
    
        public void keyTyped(KeyEvent e){
            if (e.getKeyChar()=='a') {
                FigurasGLU.numcamara = 1;    
            }
            if (e.getKeyChar()=='s') {
                FigurasGLU.numcamara = 2;    
            }
            if (e.getKeyChar()=='d') {
                FigurasGLU.numcamara = 3;    
            }
            if (e.getKeyChar()=='f') {
                FigurasGLU.numcamara = 4;    
            }
            if (e.getKeyChar()=='g') {
                FigurasGLU.numcamara = 5;    
            }
            if (e.getKeyChar()=='h') {
                FigurasGLU.numcamara = 6;    
            }

        }
            
        public void keyPressed(KeyEvent e){
            
        }
        
        public void keyReleased(KeyEvent e){
        
        }
    
}
