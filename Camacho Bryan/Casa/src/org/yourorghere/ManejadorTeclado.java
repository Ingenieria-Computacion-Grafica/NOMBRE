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
                Casa.apuntador = 1;    
            }
            if (e.getKeyChar()=='s') {
                Casa.apuntador = 2;    
            }
            if (e.getKeyChar()=='d') {
                Casa.apuntador = 3;    
            }
            if (e.getKeyChar()=='f') {
                Casa.apuntador = 4;    
            }
            if (e.getKeyChar()=='g') {
                Casa.apuntador = 5;    
            }
            if (e.getKeyChar()=='h') {
                Casa.apuntador = 6;    
            }
            if (e.getKeyChar()=='j') {
                Casa.apuntador = 7;    
            }
        }
            
        public void keyPressed(KeyEvent e){
            
        }
        
        public void keyReleased(KeyEvent e){
        
        }
    
}
