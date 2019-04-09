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

public class Figuras {
    
    float x,y;
    public  GL gl;
    public GLU glu;
    
    public  Figuras(float x,float y, GL gl){
        this.x = x;
        this.y = y;
        this.gl = gl;
        
        
    }
    
   
    
   

      
        public void display() {
            
            
//            gl.glClearColor(0, 0, 1, 0);
            
           
            
            
            // Creación del Cuadrado
            // Definir el grosor de la linea
//            gl.glLineWidth(7);
            
           gl.glColor3f(1,1,1);
            gl.glBegin(gl.GL_QUADS);
                
                gl.glVertex2d(50, 20);
                gl.glVertex2d(50, 140);
                gl.glVertex2d(150, 140);
                gl.glVertex2d(150, 20);
                
                
               
                

            gl.glEnd();
            // Creación del Triangulo
              gl.glColor3f(0,0,0);
             gl.glBegin(gl.GL_TRIANGLES);
               
                gl.glVertex2d(60,30);
                gl.glVertex2d(100,130);
                gl.glVertex2d(140,30);
//               

            gl.glEnd();
            
            

             
        }

    

        
        
    }
    



