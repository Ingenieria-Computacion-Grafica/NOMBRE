/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

/**
 *
 * @author UCE
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

public class MOSAICO extends JFrame{
    
     static  GL gl;
    static GLU glu;
    
    public  MOSAICO(){
        setTitle("Puntos");
        setSize(1000,700);
        
        // Intancia de clase GraphicListener
        
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas= new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
        
    }
    
    public static void main(String args[]){
        MOSAICO frame = new MOSAICO();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public class GraphicListener implements GLEventListener{

        @Override
        public void init(GLAutoDrawable arg0) {
            // Activar propiedades 
            gl= arg0.getGL();
            gl.glEnable(gl.GL_BLEND);
            gl.glBlendFunc(gl.GL_SRC_ALPHA,gl.GL_ONE_MINUS_CONSTANT_ALPHA);
            
        }

        @Override
        public void display(GLAutoDrawable arg0) {
            glu = new GLU();
            gl = arg0.getGL();
            
            gl.glClearColor(0, 0, 1, 0);
            
            // Establecer los parametros de la proyección
            gl.glMatrixMode(gl.GL_PROJECTION);
            glu.gluOrtho2D(0,200,0 ,150);
            
            // Creación de linea
            // Definir el grosor de la linea
            gl.glLineWidth(7);
//            gl.glColor3f(1,0,0);
            // Creacion
            // CUADRADO
//            gl.glBegin(gl.GL_LINES);
//                gl.glVertex2d(10, 60);
//                gl.glVertex2d(10, 100);
//                gl.glVertex2d(10, 100);
//                gl.glVertex2d(50, 100);
//                gl.glVertex2d(50, 100);
//                gl.glVertex2d(50, 60);
//                gl.glVertex2d(50, 60);
//                gl.glVertex2d(10, 60);
//            gl.glEnd();
            // TRIANGULO
//             gl.glColor3f(0,0,1);
//             gl.glBegin(gl.GL_TRIANGLES);
//                gl.glVertex2d(0,700);
//                gl.glVertex2d(10,10);
//                gl.glVertex2d(50,50);
//               // gl.glVertex2d(110,10);
//
//            gl.glEnd();

//           gl.glBegin(gl.GL_LINES);
//                gl.glVertex2d(10, 10);
//                gl.glVertex2d(10, 140);
//                gl.glVertex2d(190, 140);
//                gl.glVertex2d(10, 140);
//                gl.glVertex2d(10, 10);
//                gl.glVertex2d(190, 10);
//                gl.glVertex2d(190, 10);
//                gl.glVertex2d(190, 140);
//                
//                
//                gl.glVertex2d(10, 10);
//                gl.glVertex2d(190, 140);
//                
//                gl.glVertex2d(10, 85);
//                gl.glVertex2d(85, 140);
//                
//                gl.glVertex2d(10, 85);
//                gl.glVertex2d(40, 32);
//
//                gl.glVertex2d(85, 140);
//                gl.glVertex2d(117, 87);
//                
//                gl.glVertex2d(117, 87);
//                gl.glVertex2d(117, 10);
//                
//                gl.glVertex2d(117, 87);
//                gl.glVertex2d(190, 87);          
//            gl.glEnd();
            
            gl.glBegin(gl.GL_QUADS);
                gl.glColor3f(.5f,.3f,0);
                gl.glVertex2d(117, 87);
                gl.glVertex2d(117, 10);
                gl.glVertex2d(190, 10);
                gl.glVertex2d(190, 87);
                    
            gl.glEnd();  
            gl.glBegin(gl.GL_QUADS);
                gl.glColor3f(.5f,0,0.3f);
                
                gl.glVertex2d(10, 85);
                gl.glVertex2d(85, 140);
                gl.glVertex2d(117, 87);
                gl.glVertex2d(40, 32);
                 
            gl.glEnd();  
            
           gl.glBegin(gl.GL_TRIANGLES);
                gl.glColor3f(0,1,0.3f);
                
                gl.glVertex2d(10, 10);
                gl.glVertex2d(10, 85);
                gl.glVertex2d(40, 32);
             
            gl.glEnd();  
            
            gl.glBegin(gl.GL_TRIANGLES);
                gl.glColor3f(0.7f,.4f,0.3f);
                
                gl.glVertex2d(10, 10);
                gl.glVertex2d(117, 87);
                gl.glVertex2d(117, 10);
             
            gl.glEnd();     
            
           gl.glBegin(gl.GL_TRIANGLES);
                gl.glColor3f(0.1f,0,0.3f);
                
                
                gl.glVertex2d(10, 85);
                gl.glVertex2d(10, 140);
                gl.glVertex2d(85, 140);
             
            gl.glEnd();    
            
           gl.glBegin(gl.GL_TRIANGLES);
                gl.glColor3f(1f,0,0.3f);
             
                gl.glVertex2d(85, 140);
                gl.glVertex2d(190, 140);
                gl.glVertex2d(117, 87);
            gl.glEnd();  
            
            gl.glBegin(gl.GL_TRIANGLES);
                gl.glColor3f(0f,1,0.5f);
                
                gl.glVertex2d(117, 87);
                gl.glVertex2d(190, 140);
                gl.glVertex2d(190, 87);
                
            gl.glEnd();     
            
        }

        @Override
        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
            
        }

        @Override
        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
            
        }
        
    }
    
}


