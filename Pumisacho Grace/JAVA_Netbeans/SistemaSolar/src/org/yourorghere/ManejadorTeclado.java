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
public class ManejadorTeclado implements KeyListener{
    

    public ManejadorTeclado (){

    }

    
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar()=='1'){
             SistemaSolar.cam=1;
        }
    
        if (e.getKeyChar()=='2'){
            SistemaSolar.cam=2;
        }
        
        if (e.getKeyChar()=='3') {
            SistemaSolar.cam=3;          
        }
        
        if (e.getKeyChar()=='4') {
            SistemaSolar.cam=4;          
        }
        
        if (e.getKeyChar()=='5') {
            SistemaSolar.cam=5;          
        }
       
        
       
        if (e.getKeyChar()=='6') {
            SistemaSolar.cam=6;          
        }
        
        if (e.getKeyChar()=='7') {
            SistemaSolar.cam=7;          
        }
//        
//        if (e.getKeyChar()=='8') {
//            Grace.cam=8;          
//        }
//        
//        if (e.getKeyChar()=='9') {
//            Grace.cam=9;          
//        }
//        
//        if (e.getKeyChar()=='0') {
//            Grace.cam=0;          
//        }
 }
   
    

    
    public void keyPressed(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void keyReleased(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
