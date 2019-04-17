/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Jarol Saltos
 */
public class ManejadorTeclado implements KeyListener{

    Movil casa;
    
    public Boolean[] EstadoTeclado;

    public ManejadorTeclado(Movil casa) {
        this.casa = casa;
        EstadoTeclado = new Boolean[1000];
    }
  
    


    public void keyTyped(KeyEvent e) {
       
//        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
//           casa.derecha();
//            System.out.println("Valor en la traslacion de X: "+casa.getx());
//        }
//        
//        if(e.getKeyCode()== KeyEvent.VK_LEFT){
//            casa.izquierda();
//            System.out.println("Valor en la traslacion de X: "+casa.getx());
//        }
//        
//        if(e.getKeyCode()== KeyEvent.VK_UP){
//            casa.getup();
//            System.out.println("Valor en la traslacion de Y: "+casa.getup());
//        }
//        
//        if(e.getKeyCode()== KeyEvent.VK_DOWN){
//            casa.getdown();
//            System.out.println("Valor en la traslacion de Y: "+casa.getdown());
//        }
//        if(e.getKeyCode()== KeyEvent.VK_X){
//            casa.avanzar();
//            System.out.println("Valor en la traslacion de Y: "+casa.getz());
//        }
//        
//        if(e.getKeyCode()== KeyEvent.VK_Z){
//            casa.retroceder();
//            System.out.println("Valor en la traslacion de Y: "+casa.getz());
//        }
//        
//        if(e.getKeyCode()== KeyEvent.VK_D){
//            casa.getw2();
//         
//            System.out.println("Valor en la escalacion de x: "+casa.getw2());
//        }
//        
//         if(e.getKeyCode()== KeyEvent.VK_A){
//            casa.getw1();
//            System.out.println("Valor en la escalacion de x: "+casa.getw1());
//        }
//         
//        if(e.getKeyCode()== KeyEvent.VK_W){
//            casa.geth2();
//            System.out.println("Valor en la escalacion de y: "+casa.geth2());
//        }
//        
//         if(e.getKeyCode()== KeyEvent.VK_S){
//            casa.geth1();
//            System.out.println("Valor en la escalacion de y: "+casa.geth1());
//        }
//         
//        if(e.getKeyCode()== KeyEvent.VK_R){
//            casa.getrx();
//            System.out.println("Valor en la rotacion de x: "+ casa.getrx());
//        }
//        
//         if(e.getKeyCode()== KeyEvent.VK_T){
//            casa.getrx1();
//            System.out.println("Valor en la rotacion de x: "+casa.getrx1());
//        }
//         
//        if(e.getKeyCode()== KeyEvent.VK_Y){
//            casa.getry();
//            System.out.println("Valor en la rotacion de y: "+casa.getry());
//        }
//        
//         if(e.getKeyCode()== KeyEvent.VK_U){
//            casa.getry1();
//            System.out.println("Valor en la rotacion de y: "+casa.getry1());
//        }
//         
//         if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
//            casa.setx(0);
//            casa.sety(0);
//            casa.setw1(1);
//            casa.seth1(1);
//            casa.setrx(0);
//            casa.setry(0);
//            casa.setrz(0);
//            
//
//        }
 EstadoTeclado[e.getKeyChar()]=true;    
    }
    

    public void keyPressed(KeyEvent e) {
 if(e.getKeyCode()== KeyEvent.VK_RIGHT){
           casa.izquierda();
            System.out.println("Valor en la traslacion de X: "+casa.getx());
        }
        
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            casa.derecha();
            System.out.println("Valor en la traslacion de X: "+casa.getx());
        }
        
        if(e.getKeyCode()== KeyEvent.VK_UP){
            casa.up();
            System.out.println("Valor en la traslacion de Y: "+casa.gety());
        }
        
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
            casa.down();
            System.out.println("Valor en la traslacion de Y: "+casa.gety());
        }
        if(e.getKeyCode()== KeyEvent.VK_X){
            casa.avanzar();
            System.out.println("Valor en la traslacion de Y: "+casa.getz());
        }
        
        if(e.getKeyCode()== KeyEvent.VK_Z){
            casa.retroceder();
            System.out.println("Valor en la traslacion de Y: "+casa.getz());
        }
        
        if(e.getKeyCode()== KeyEvent.VK_D){
            casa.w2();
         
            System.out.println("Valor en la escalacion de x: "+casa.getw());
        }
        
         if(e.getKeyCode()== KeyEvent.VK_A){
            casa.w1();
            System.out.println("Valor en la escalacion de x: "+casa.getw());
        }
         
        if(e.getKeyCode()== KeyEvent.VK_W){
            casa.h2();
            System.out.println("Valor en la escalacion de y: "+casa.geth());
        }
        
         if(e.getKeyCode()== KeyEvent.VK_S){
            casa.h1();
            System.out.println("Valor en la escalacion de y: "+casa.geth());
        }
         
        if(e.getKeyCode()== KeyEvent.VK_R){
            casa.getrx();
            System.out.println("Valor en la rotacion de x: "+ casa.getrx());
        }
        
         if(e.getKeyCode()== KeyEvent.VK_T){
            casa.getrx1();
            System.out.println("Valor en la rotacion de x: "+casa.getrx1());
        }
         
        if(e.getKeyCode()== KeyEvent.VK_Y){
            casa.getry();
            System.out.println("Valor en la rotacion de y: "+casa.getry());
        }
        
         if(e.getKeyCode()== KeyEvent.VK_U){
            casa.getry1();
            System.out.println("Valor en la rotacion de y: "+casa.getry1());
        }
         
         if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
            casa.setx(0);
            casa.sety(0);
            casa.setw1(1);
            casa.seth1(1);
            casa.setrx(0);
            casa.setry(0);
            casa.setrz(0);
            

        }
    }

    public void keyReleased(KeyEvent ke) {
        EstadoTeclado[ke.getKeyChar()]=false;    
    }
    
}
