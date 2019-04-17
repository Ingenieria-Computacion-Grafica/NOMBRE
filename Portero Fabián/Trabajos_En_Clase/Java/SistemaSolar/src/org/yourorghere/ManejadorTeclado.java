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
        SistemaSolar.cam=1;
    }
    if (e.getKeyChar()=='2'){
        SistemaSolar.cam=2;
      
        //To change body of generated methods, choose Tools | Templates.
    }
    
       if (e.getKeyChar()=='3'){
        SistemaSolar.cam=3;
    }
       
       if (e.getKeyChar()=='4'){
        SistemaSolar.cam=4;
    }
        if (e.getKeyChar()=='5'){
        SistemaSolar.cam=5;
    }
    }
    

    public void keyPressed(KeyEvent e) {

        
        
        
         if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            SistemaSolar.trasladaX+=0.2;
           
        }
        
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            SistemaSolar.trasladaX-=0.5;
           
        }
        
        if(e.getKeyCode()== KeyEvent.VK_UP){
            SistemaSolar.trasladaY+=0.5;
           
        }
        
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
            SistemaSolar.trasladaY-=0.5;
           
        }
        
        
        if(e.getKeyCode()== KeyEvent.VK_D){
            SistemaSolar.escalaX+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_A){
            SistemaSolar.escalaX-=1f;
            
        }
         
        if(e.getKeyCode()== KeyEvent.VK_W){
            SistemaSolar.escalaY+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_S){
            SistemaSolar.escalaY-=1f;
           
        }
         
        if(e.getKeyCode()== KeyEvent.VK_R){
            SistemaSolar.rotarX+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_T){
            SistemaSolar.rotarX-=1f;
            
        }
         
        if(e.getKeyCode()== KeyEvent.VK_Y){
            SistemaSolar.rotarY+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_U){
            SistemaSolar.rotarY-=1f;
           
        }
         
         if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
            SistemaSolar.trasladaX=0;
            SistemaSolar.trasladaY=0;
            SistemaSolar.escalaX=1;
            SistemaSolar.escalaY=1;
            SistemaSolar.rotarX=0;
            SistemaSolar.rotarY=0;

        }
    }

    public void keyReleased(KeyEvent e) {
    
    }
    
    

    
    
//      
//    
//}

    
}