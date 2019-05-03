/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.util.ArrayList;
import java.util.Random;
import javax.media.opengl.GL;

/**
 *
 * @author Grace Mireya Pumisacho
 */
public class Mundo {
    
    float x,y,z;
    float w,h,d;
    float rx,ry,rz;
    GL gl;
   // float color=0;  
    //Borde Luna;
    Cubo piso;



 
    Esfera circulo;
    Esfera1 bol;
    
    RuedaMoscovita moscobita;
    RuedaMoscovita moscobita2;
    Cilindro BaseP;

    Estrella estrella;


    Cubo cubin;
    Cubo calleA,calleB,calleC,calleD,calleE,calleF,calleG;


    public ArrayList<Cubo>linea = new ArrayList<Cubo>();
    public ArrayList<Estrella>estrellitas = new ArrayList<Estrella>();

    Rueda ruedita;
    Rueda ruedita2;


    public Mundo(float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, GL gl) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.h = h;
        this.d = d;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.gl = gl;
        
     
        estrella=new Estrella(20,50f,-15,5,5,5,0,0,0,gl);
        bol = new Esfera1(0,10,0, 1f,1f,0,8,30,30, 90,0,0,gl);
       
        piso= new Cubo(0,-0.25f,0,   0.439f,0.502f,0.565f,     150,0.5f,200,  0,0,0,gl);
      //  MM= new CentroMundo(0,9.9f,0, 1.5f,1.5f,1.5f, 0,0,0,gl);
      //  centro = new Bola(0,0.03f,0, 0.737f,0.753f,0.753f, 15,0,15, 0,0,0,gl);
        ruedita = new Rueda(0,10,0, 2.8f,2.8f,2.8f,90,0,0,gl);
        
        ruedita2 = new Rueda(0,10,0, 4f,4f,4f,90,0,45,gl);
      

        circulo = new Esfera(2,2,2, 1,0,2, 1, 5,2 ,90,90,0,gl);
      //  BaseP = new Cilindro(5,4.5f,-3, 0.294f,0,0.510f, 0.2f,1.5f, 6,4,4, 90,0,0,gl);
        moscobita = new RuedaMoscovita(35,19.5f,15, 2f,2f,2f,0,45,0,gl);
        moscobita2 = new RuedaMoscovita(-5,19.5f,50, 2f,2f,2f,0,45,0,gl);
        
     
//******ESTRELLAS        
        Random rnd = new Random();
        for (int i = -400; i < 400; i++) {
            estrellitas.add(new Estrella(rnd.nextInt(300),100,rnd.nextInt(300), 1,0.8f,1, 0,0,0,gl));  
        }
        for (int i = -400; i < 400; i++) {
                estrellitas.add(new Estrella(-rnd.nextInt(300),100,-rnd.nextInt(300), 0.8f,1,1, 0,0,0,gl));
        }
        for (int i = -400; i < 400; i++) {
                estrellitas.add(new Estrella(-rnd.nextInt(300),100,rnd.nextInt(300), 1,1,0.8f, 0,0,0,gl));
        }
        for (int i = -400; i < 400; i++) {
                estrellitas.add(new Estrella(rnd.nextInt(300),100,-rnd.nextInt(300), 1,1,1, 0,0,0,gl));
        }
        
       //Abaj
        for (int i = -400; i < 400; i++) {
            estrellitas.add(new Estrella(rnd.nextInt(300),-100,rnd.nextInt(300), 1,0.8f,1, 0,0,0,gl));  
        }
        for (int i = -200; i < 400; i++) {
                estrellitas.add(new Estrella(-rnd.nextInt(300),-100,-rnd.nextInt(300), 0.8f,1,1, 0,0,0,gl));
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(-rnd.nextInt(300),-100,rnd.nextInt(300), 1,1,0.8f, 0,0,0,gl));
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(rnd.nextInt(300),-100,-rnd.nextInt(300), 1,1,1, 0,0,0,gl));
        }
             
        
        //DER
        for (int i = -200; i < 200; i++) {
            estrellitas.add(new Estrella(100,rnd.nextInt(300),rnd.nextInt(300), 1,0.8f,1, 0,0,0,gl));  
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(100,-rnd.nextInt(300),-rnd.nextInt(300), 0.8f,1,1, 0,0,0,gl));
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(100,-rnd.nextInt(300),rnd.nextInt(300), 1,1,0.8f, 0,0,0,gl));
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(100,rnd.nextInt(300),-rnd.nextInt(300), 1,1,1, 0,0,0,gl));
        }
        
        
        //IZQ
        
        for (int i = -200; i < 200; i++) {
            estrellitas.add(new Estrella(-100,rnd.nextInt(300),rnd.nextInt(300), 1,0.8f,1, 0,0,0,gl));  
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(-100,-rnd.nextInt(300),-rnd.nextInt(300), 0.8f,1,1, 0,0,0,gl));
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(-100,-rnd.nextInt(300),rnd.nextInt(300), 1,1,0.8f, 0,0,0,gl));
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(-100,rnd.nextInt(300),-rnd.nextInt(300), 1,1,1, 0,0,0,gl));
        }
        
        
        //L1
        for (int i = -200; i < 200; i++) {
            estrellitas.add(new Estrella(rnd.nextInt(300),rnd.nextInt(300),100, 1,0.8f,1, 0,0,0,gl));  
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(-rnd.nextInt(300),-rnd.nextInt(300),100, 0.8f,1,1, 0,0,0,gl));
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(rnd.nextInt(300),-rnd.nextInt(300),100, 1,1,0.8f, 0,0,0,gl));
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(-rnd.nextInt(300),rnd.nextInt(300),100, 1,1,1, 0,0,0,gl));
        }
        
        //L2
        
                for (int i = -200; i < 200; i++) {
            estrellitas.add(new Estrella(rnd.nextInt(300),rnd.nextInt(300),-100, 1,0.8f,1, 0,0,0,gl));  
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(-rnd.nextInt(300),-rnd.nextInt(300),-100, 0.8f,1,1, 0,0,0,gl));
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(rnd.nextInt(300),-rnd.nextInt(300),-100, 1,1,0.8f, 0,0,0,gl));
        }
        for (int i = -200; i < 200; i++) {
                estrellitas.add(new Estrella(-rnd.nextInt(300),rnd.nextInt(300),-100, 1,1,1, 0,0,0,gl));
        }
        
        
        
    }
    
    
    
    
    
    
    public void display(){
         
        for(Estrella c:estrellitas){
           c.display();
           c.ry+=0.1;
           c.rz+=0.1;
           
        }            

            estrella.display();
            bol.display();
           // moscobita.display();
           // moscobita2.display();
            ruedita.display();
           // ruedita2.display();
 
        
            
    }
}


