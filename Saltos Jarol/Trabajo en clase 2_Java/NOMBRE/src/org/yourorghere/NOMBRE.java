/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.KeyEvent;
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

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Llamar las funciones viculada a las transformaciones
import com.sun.opengl.util.Animator;


/**
 *
 * @author UCE
 */
public class NOMBRE extends JFrame implements KeyListener{
     static  GL gl;
    static GLU glu;   
      public static  float trasladaX=0;
    public static  float trasladaY=0;
    
    public static  float escalaX=1;
    public static  float escalaY=1;
    
    public static  float rotarX=0;
    public static  float rotarY=0;
    
    

    
    public  NOMBRE(){
        setTitle("Puntos");
        setSize(700,700);
        setLocation(10,40);
       
        // Intancia de clase GraphicListener
        
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas= new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
          Animator animator = new Animator(canvas);
        animator.start();
        
                addKeyListener(this); // Para que canvas reconozca las pulsaciones del teclado
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
            
            //Para evitar el rastro de movimiento , al trasladar el objeto
            // Limpia el bufer para no tener rastro
            gl.glClear(gl.GL_COLOR_BUFFER_BIT);
            
            // Establecer color de fondo de la ventana de colores RGB
            gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            
            // Establecer los parametros de la proyección
            gl.glMatrixMode(gl.GL_PROJECTION);
            gl.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                        // Creación de linea
            // Definir el grosor de la linea
            gl.glLineWidth(2f);
            // Definir el grosor de los puntos
            gl.glPointSize(3.0f);
            gl.glColor3f(.05f,1,0);
            
            // Matriz Indentidad -- importante
            gl.glLoadIdentity();
            
            
            gl.glTranslatef(trasladaX-.9f, trasladaY-.5f, 0);
            gl.glScalef(escalaX/110, escalaY/100, 0);
            gl.glRotatef(rotarX, 1, 0, 0);
            gl.glRotatef(rotarY, 0, 1, 0);
            // Creacion
            // Letra J
            
            gl.glPushMatrix();
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
            gl.glFlush();
            
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
            gl.glFlush();
            gl.glPopMatrix();

            
        }

        @Override
        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
            
        }

        @Override
        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
            
        }


    }



    public void keyTyped(KeyEvent e) {
        
        
    }    

    public void keyPressed(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.


        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            NOMBRE.trasladaX+=0.1;
            System.out.println("Valor en la traslacion de X: "+trasladaX);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            NOMBRE.trasladaX-=0.1;
            System.out.println("Valor en la traslacion de X: "+trasladaX);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_UP){
            NOMBRE.trasladaY+=0.1;
            System.out.println("Valor en la traslacion de Y: "+trasladaX);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
            NOMBRE.trasladaY-=0.1;
            System.out.println("Valor en la traslacion de Y: "+trasladaX);
        }
        
        
        if(e.getKeyCode()== KeyEvent.VK_D){
            NOMBRE.escalaX+=.4f;
            System.out.println("Valor en la escalacion de x: "+trasladaX);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_A){
            NOMBRE.escalaX-=.4f;
            System.out.println("Valor en la escalacion de x: "+trasladaX);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_W){
            NOMBRE.escalaY+=.4f;
            System.out.println("Valor en la escalacion de y: "+trasladaX);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_S){
            NOMBRE.escalaY-=.4f;
            System.out.println("Valor en la escalacion de y: "+trasladaX);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_R){
            NOMBRE.rotarX+=.4f;
            System.out.println("Valor en la rotacion de x: "+trasladaX);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_T){
            NOMBRE.rotarX-=.4f;
            System.out.println("Valor en la rotacion de x: "+trasladaX);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_Y){
            NOMBRE.rotarY+=.4f;
            System.out.println("Valor en la rotacion de y: "+trasladaX);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_U){
            NOMBRE.rotarY-=.4f;
            System.out.println("Valor en la rotacion de y: "+trasladaX);
        }
         
         if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
            NOMBRE.trasladaX=0;
            NOMBRE.trasladaY=0;
            NOMBRE.escalaX=1;
            NOMBRE.escalaY=1;
            NOMBRE.rotarX=0;
            NOMBRE.rotarY=0;

        }
    }

    public void keyReleased(KeyEvent ke) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
