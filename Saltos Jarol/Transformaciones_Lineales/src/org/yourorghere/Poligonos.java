/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.awt.Window;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author UCE
 */
public class Poligonos extends JFrame{
  static  GL gl;
    static GLU glu;
    
    public  Poligonos(){
        setTitle("Puntos");
        setSize(700,700);
        
        // Intancia de clase GraphicListener
        
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas= new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
        
    }
    
    public static void main(String args[]){
        Poligonos frame = new Poligonos();
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
            gl.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
            
            // Creación de linea
            // Definir el grosor de la linea
            gl.glLineWidth(2f);
            gl.glPointSize(3.0f);
            gl.glColor3f(.05f,1,0);
            
//            // Creacion
//            // Cuadrados
//            gl.glBegin(gl.GL_QUADS);
//                gl.glVertex2d(.3f, .3f);
//                gl.glVertex2d(.3f, .6f);
//                gl.glVertex2d(.6f, .6f);
//                gl.glVertex2d(.6f, .3f);
//                
//                
//
//            gl.glEnd();
//            
//            
//            // Poligonos
//                gl.glBegin(gl.GL_QUADS);
//                gl.glVertex2d(.3f, .3f);
//                gl.glVertex2d(.3f, .6f);
//                gl.glVertex2d(.6f, .6f);
//                gl.glVertex2d(.6f, .3f);
//                
//                // Estable la cara que se desea pintar y la forma en la que se desa pintar
//            gl.glEnd();
            
            gl.glPolygonMode(GL.GL_FRONT,GL.GL_FILL);
            gl.glColor3f(1.0f, 0.0f, 0.0f); // Rojo
            DibujarHexagono(gl,0.4f, 0.6f, .5f, 0.6f, 0.6f, 0.7f, 0.5f, 0.8f, 0.4f, 0.8f, 0.3f, 0.7f);
            
            
            
            gl.glFlush();

             
        }

        public void DibujarHexagono(GL gl,float x1, float y1,float x2, float y2,float x3, float y3,float x4, float y4,float x5, float y5,float x6, float y6){
            gl.glBegin(gl.GL_POLYGON);
            gl.glVertex2d(x1, y1);
            gl.glVertex2d(x2, y2);
            gl.glVertex2d(x3, y3);
            gl.glVertex2d(x4, y4);
            gl.glVertex2d(x5, y5);
            gl.glVertex2d(x6, y6);
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
