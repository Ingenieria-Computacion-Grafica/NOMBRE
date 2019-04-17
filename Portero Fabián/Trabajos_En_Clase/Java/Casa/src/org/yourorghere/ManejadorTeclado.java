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
        Escenario.cam=1;
    }
    if (e.getKeyChar()=='2'){
        Escenario.cam=2;
      
        //To change body of generated methods, choose Tools | Templates.
    }
    
       if (e.getKeyChar()=='3'){
        Escenario.cam=3;
    }
       
       if (e.getKeyChar()=='4'){
        Escenario.cam=4;
    }
        if (e.getKeyChar()=='5'){
        Escenario.cam=5;
    }
    }
    
 @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            Escenario.trasladaX+=0.1;
           
        }
        
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            Escenario.trasladaX-=0.1;
           
        }
        
        if(e.getKeyCode()== KeyEvent.VK_UP){
            Escenario.trasladaY+=0.1;
           
        }
        
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
            Escenario.trasladaY-=0.1;
           
        }
        
        
        if(e.getKeyCode()== KeyEvent.VK_D){
            Escenario.escalaX+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_A){
            Escenario.escalaX-=1f;
            
        }
         
        if(e.getKeyCode()== KeyEvent.VK_W){
            Escenario.escalaY+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_S){
            Escenario.escalaY-=1f;
           
        }
         
        if(e.getKeyCode()== KeyEvent.VK_R){
            Escenario.rotarX+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_T){
            Escenario.rotarX-=1f;
            
        }
         
        if(e.getKeyCode()== KeyEvent.VK_Y){
            Escenario.rotarY+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_U){
            Escenario.rotarY-=1f;
           
        }
         
         if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
            Escenario.trasladaX=0;
            Escenario.trasladaY=0;
            Escenario.escalaX=1;
            Escenario.escalaY=1;
            Escenario.rotarX=0;
            Escenario.rotarY=0;

        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
    

    
    
