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
                Cubo.numcamara = 1;    
            }
            if (e.getKeyChar()=='s') {
                Cubo.numcamara = 2;    
            }
            if (e.getKeyChar()=='d') {
                Cubo.numcamara = 3;    
            }
            if (e.getKeyChar()=='w') {
                Cubo.numcamara = 4;    
            }
//            if (e.getKeyChar()=='w') {
//                Cubo.numcamara = 5;    
//            }
//            if (e.getKeyChar()=='e') {
//                Personaje.numcamara = 6;    
//            }
//            if (e.getKeyChar()=='t') {
//                Personaje.numcamara = 7;    
//            }
//            if (e.getKeyChar()=='y') {
//                Personaje.numcamara = 8;    
//            }
        }
            
        public void keyPressed(KeyEvent e){
            
        }
        
        public void keyReleased(KeyEvent e){
        
        }
    
}
