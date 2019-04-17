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
                SistemaSolar.numcamara = 1;    
            }
            if (e.getKeyChar()=='s') {
                SistemaSolar.numcamara = 2;    
            }
            if (e.getKeyChar()=='d') {
                SistemaSolar.numcamara = 3;    
            }
            if (e.getKeyChar()=='w') {
                SistemaSolar.numcamara = 4;    
            }
            if (e.getKeyChar()=='e') {
                SistemaSolar.numcamara = 5;    
            }
            if (e.getKeyChar()=='r') {
                SistemaSolar.numcamara = 6;    
            }
//            if (e.getKeyChar()=='t') {
//                EscenarioAnimado.numcamara = 7;    
//            }
//            if (e.getKeyChar()=='y') {
//                EscenarioAnimado.numcamara = 8;    
//            }
        }
            
        public void keyPressed(KeyEvent e){
            
        }
        
        public void keyReleased(KeyEvent e){
        
        }
    
}
