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
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            Main.trasladaX+=0.1;
           
        }
        
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            Main.trasladaX-=0.1;
           
        }
        
        if(e.getKeyCode()== KeyEvent.VK_UP){
            Main.trasladaY+=0.1;
           
        }
        
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
            Main.trasladaY-=0.1;
           
        }
        
        
        if(e.getKeyCode()== KeyEvent.VK_D){
            Main.escalaX+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_A){
            Main.escalaX-=1f;
            
        }
         
        if(e.getKeyCode()== KeyEvent.VK_W){
            Main.escalaY+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_S){
            Main.escalaY-=1f;
           
        }
         
        if(e.getKeyCode()== KeyEvent.VK_R){
            Main.rotarX+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_T){
            Main.rotarX-=1f;
            
        }
         
        if(e.getKeyCode()== KeyEvent.VK_Y){
            Main.rotarY+=1f;
            
        }
        
         if(e.getKeyCode()== KeyEvent.VK_U){
            Main.rotarY-=1f;
           
        }
         
         if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
            Main.trasladaX=0;
            Main.trasladaY=0;
            Main.escalaX=1;
            Main.escalaY=1;
            Main.rotarX=0;
            Main.rotarY=0;

        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
    

    
    
