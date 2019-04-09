/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.yourorghere;

/**
 *
 * @author Johis
 */

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Nomb {
    float x,y;
    public  GL gl;
    public GLU glu;
    
    public  Nomb(float x,float y, GL gl){
        this.x = x;
        this.y = y;
        this.gl = gl;
        
        
        
    }
    
  
    
        public void display() {
            
            
            
            
            
            
            // Creación de las figuras
            // Definir el grosor de la linea
            gl.glLineWidth(19);
            
            // Creacion
            // Letra J

            gl.glBegin(gl.GL_LINES);
                gl.glColor3f(1,0,0);
                gl.glVertex2d(10, 130);
                gl.glVertex2d(30, 130);
                gl.glVertex2d(20, 130);
                gl.glVertex2d(20, 100);
                gl.glVertex2d(10, 100);
                gl.glVertex2d(20, 100);
                

            gl.glEnd();
            // Letra O
//             
             gl.glBegin(gl.GL_LINES); 
                gl.glColor3f(1,1,0);
                gl.glVertex2d(40,130);
                gl.glVertex2d(40,100);
                gl.glVertex2d(40,100);
                gl.glVertex2d(60,100);
                gl.glVertex2d(60,100);
                gl.glVertex2d(60,130);
                gl.glVertex2d(40,130);
                gl.glVertex2d(60,130);
            gl.glEnd();
            
             // Letra H
//             
             gl.glBegin(gl.GL_LINES);
                gl.glColor3f(1,1,0);
                gl.glVertex2d(70,130);
                gl.glVertex2d(70,100);
                gl.glVertex2d(90,130);
                gl.glVertex2d(90,100);
                gl.glVertex2d(90,115);
                gl.glVertex2d(70,115);
            gl.glEnd();
            
//            Letra A
//             
             gl.glBegin(gl.GL_LINES);
                gl.glColor3f(1,1,0);
                gl.glVertex2d(120,130);
                gl.glVertex2d(120,100);
                gl.glVertex2d(120,130);
                gl.glVertex2d(100,130);
                gl.glVertex2d(100,130);
                gl.glVertex2d(100,100);
                gl.glVertex2d(120,115);
                gl.glVertex2d(100,115);
            gl.glEnd();
            
            // Letra N
//             
             gl.glBegin(gl.GL_LINES);
                gl.glColor3f(1,0,0);
                gl.glVertex2d(150,130);
                gl.glVertex2d(150,100);
                gl.glVertex2d(150,100);
                gl.glVertex2d(130,130);
                gl.glVertex2d(130,100);
                gl.glVertex2d(130,130);

            gl.glEnd();
//  Letra A
//             
             gl.glBegin(gl.GL_LINES);
                gl.glColor3f(1,0,1);
                gl.glVertex2d(180,130);
                gl.glVertex2d(180,100);
                gl.glVertex2d(180,130);
                gl.glVertex2d(160,130);
                gl.glVertex2d(160,130);
                gl.glVertex2d(160,100);
                gl.glVertex2d(180,115);
                gl.glVertex2d(160,115);
            gl.glEnd();
            
//             letra c
             
             gl.glBegin(gl.GL_LINES);
                gl.glColor3f(0,1,1);
                gl.glVertex2d(10,90);
                gl.glVertex2d(10,60);
                gl.glVertex2d(10,60);
                gl.glVertex2d(30,60);        
                gl.glVertex2d(10,90);
                gl.glVertex2d(30,90);
            gl.glEnd();
//            letra r
             
             gl.glBegin(gl.GL_LINES);
                gl.glColor3f(0,1,1);
                gl.glVertex2d(40,90);
                gl.glVertex2d(40,60);
                gl.glVertex2d(40,75);
                gl.glVertex2d(60,75);        
                gl.glVertex2d(40,90);
                gl.glVertex2d(60,90);
                gl.glVertex2d(60,90);
                gl.glVertex2d(60,75); 
                gl.glVertex2d(40,75);
                gl.glVertex2d(60,60); 
                
             gl.glEnd();
//              letra  I
   
             gl.glBegin(gl.GL_LINES);
                gl.glColor3f(0,1,1);
                gl.glVertex2d(80,90);
                gl.glVertex2d(80,60);
                gl.glVertex2d(70,60);
                gl.glVertex2d(90,60);        
                gl.glVertex2d(70,90);
                gl.glVertex2d(90,90);
            gl.glEnd();
            
            
//            letra O
              
             gl.glBegin(gl.GL_LINES); 
                gl.glColor3f(0,1,1);
                gl.glVertex2d(100,90);
                gl.glVertex2d(100,60);
                gl.glVertex2d(100,60);
                gl.glVertex2d(120,60); 
                gl.glVertex2d(120,60);
                gl.glVertex2d(120,90); 
                gl.glVertex2d(100,90);
                gl.glVertex2d(120,90);

            gl.glEnd();
            
//             letra l
              
             gl.glBegin(gl.GL_LINES);
                gl.glColor3f(0,1,1);
                gl.glVertex2d(130,90);
                gl.glVertex2d(130,60);
                gl.glVertex2d(130,60);
                gl.glVertex2d(140,60);        

            gl.glEnd();
            
//             letra l
              
             gl.glBegin(gl.GL_LINES);
                gl.glColor3f(0,1,1);
                gl.glVertex2d(150,90);
                gl.glVertex2d(150,60);
                gl.glVertex2d(150,60);
                gl.glVertex2d(160,60);        

            gl.glEnd();
            
//             letra O
              
             gl.glBegin(gl.GL_LINES);
                gl.glColor3f(0,1,1);
                gl.glVertex2d(170,90);
                gl.glVertex2d(170,60);
                gl.glVertex2d(170,60);
                gl.glVertex2d(190,60); 
                gl.glVertex2d(190,60);
                gl.glVertex2d(190,90); 
                gl.glVertex2d(170,90);
                gl.glVertex2d(190,90);

            gl.glEnd();
            
            
             
        }

        
    }
    

