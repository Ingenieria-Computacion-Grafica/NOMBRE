package org.yourorghere;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johis
 */
public class Mosaico {
    
    float x,y;
    public  GL gl;
    public GLU glu;
    
    public  Mosaico(float x,float y, GL gl){
        this.x = x;
        this.y = y;
        this.gl = gl;
        
        
    }
    
   
    
   

      
        public void display() {
            
            
//            gl.glClearColor(0, 0, 1, 0);
            
           
            
            
            // Creación del Cuadrado
            // Definir el grosor de la linea
            gl.glLineWidth(7);
            
           
            gl.glBegin(gl.GL_QUADS);
                gl.glColor3f(1,1,1);
                gl.glVertex2d(10, 20);
                gl.glVertex2d(10, 140);
                gl.glVertex2d(180, 140);
                gl.glVertex2d(180, 20);
          

            gl.glEnd();
//             Creación del Triangulo
             
             gl.glBegin(gl.GL_TRIANGLES);
                gl.glColor3f(0,0,0);
                gl.glVertex2d(10,20);
                gl.glVertex2d(10,140);
                gl.glVertex2d(180,140);
//               

            gl.glEnd();
            
              gl.glColor3f(1,1,0);
             gl.glBegin(gl.GL_QUADS);
              
                gl.glVertex2d(123, 20);
                gl.glVertex2d(123, 100);
                gl.glVertex2d(180, 100);
                gl.glVertex2d(180, 20);
          

            gl.glEnd();
            
            
            gl.glColor3f(1,0,0);
            gl.glBegin(gl.GL_QUADS);
                
                gl.glVertex2d(28, 33);
                gl.glVertex2d(10, 75);
                gl.glVertex2d(105, 140);
                gl.glVertex2d(123, 100);
          

            gl.glEnd();
             
        }

    

}
