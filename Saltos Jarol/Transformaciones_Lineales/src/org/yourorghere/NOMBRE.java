/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

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


/**
 *
 * @author UCE
 */
public class NOMBRE extends JFrame{
    static  GL gl;
    static GLU glu;
    
    public  NOMBRE(){
        setTitle("Puntos");
        setSize(700,700);
        
        // Intancia de clase GraphicListener
        
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas= new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
        
    }
    
    public static void main(String args[]){
        NOMBRE frame = new NOMBRE();
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
            gl.glColor3f(1,0,0);
            // Creacion
            // Letra J
            gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(10, 140);
                gl.glVertex2d(30, 140);
                gl.glVertex2d(20, 140);
                gl.glVertex2d(20, 110);
                gl.glVertex2d(10, 110);
                gl.glVertex2d(20, 110);
                

            gl.glEnd();
            // Letra A
             gl.glColor3f(0,0,1);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(40,110);
                gl.glVertex2d(40,140);
                gl.glVertex2d(40,140);
                gl.glVertex2d(60,140);
                gl.glVertex2d(60,140);
                gl.glVertex2d(60,110);
                gl.glVertex2d(40,120);
                gl.glVertex2d(60,120);
            gl.glEnd();
            
             // Letra R
             gl.glColor3f(0,1,0);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(70,110);
                gl.glVertex2d(70,140);
                gl.glVertex2d(70,140);
                gl.glVertex2d(90,140);
                gl.glVertex2d(90,140);
                gl.glVertex2d(90,125);
                gl.glVertex2d(90,125);
                gl.glVertex2d(70,125);
                gl.glVertex2d(70,125);
                gl.glVertex2d(90,110);
            gl.glEnd();
            
            // Letra O
             gl.glColor3f(1,1,0);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(100,110);
                gl.glVertex2d(100,140);
                gl.glVertex2d(100,140);
                gl.glVertex2d(120,140);
                gl.glVertex2d(120,140);
                gl.glVertex2d(120,110);
                gl.glVertex2d(100,110);
                gl.glVertex2d(120,110);

            gl.glEnd();
            // Letra L
            gl.glColor3f(1,.5F,.2f);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(130,110);
                gl.glVertex2d(130,140);
                gl.glVertex2d(130,110);
                gl.glVertex2d(150,110);
            gl.glEnd();
            
            // Letra S
            gl.glColor3f(.1f,1,.7f);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(10,100);
                gl.glVertex2d(30,100);
                gl.glVertex2d(10,100);
                gl.glVertex2d(10,85);
                gl.glVertex2d(10,85);
                gl.glVertex2d(30,85);
                gl.glVertex2d(30,85);
                gl.glVertex2d(30,70);
                gl.glVertex2d(30,70);
                gl.glVertex2d(30,70);
                gl.glVertex2d(30,70);
                gl.glVertex2d(10,70);

            gl.glEnd();
             
            // Letra A
            gl.glColor3f(0,0,1);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(40,70);
                gl.glVertex2d(40,100);
                gl.glVertex2d(40,100);
                gl.glVertex2d(60,100);
                gl.glVertex2d(60,100);
                gl.glVertex2d(60,70);
                gl.glVertex2d(40,80);
                gl.glVertex2d(60,80);
            gl.glEnd();
            // Letra L
            gl.glColor3f(1,1,0);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(70,70);
                gl.glVertex2d(70,100);
                gl.glVertex2d(70,70);
                gl.glVertex2d(90,70);
            gl.glEnd();
            
            // Letra T
            gl.glColor3f(0,1,1);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(90,100);
                gl.glVertex2d(110,100);
                gl.glVertex2d(100,100);
                gl.glVertex2d(100,70);
            gl.glEnd();
            
            // Letra O
             gl.glColor3f(1,0,0);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(120,70);
                gl.glVertex2d(120,100);
                gl.glVertex2d(120,100);
                gl.glVertex2d(140,100);
                gl.glVertex2d(140,100);
                gl.glVertex2d(140,70);
                gl.glVertex2d(120,70);
                gl.glVertex2d(140,70);

            gl.glEnd();
            
            // Letra S
            gl.glColor3f(1,1,0);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(150,100);
                gl.glVertex2d(170,100);
                gl.glVertex2d(150,100);
                gl.glVertex2d(150,85);
                gl.glVertex2d(150,85);
                gl.glVertex2d(170,85);
                gl.glVertex2d(170,85);
                gl.glVertex2d(170,70);
                gl.glVertex2d(170,70);
                gl.glVertex2d(170,70);
                gl.glVertex2d(170,70);
                gl.glVertex2d(150,70);

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
