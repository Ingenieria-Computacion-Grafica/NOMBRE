package org.yourorghere;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
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
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
/**
 * CuboCam.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class CuboCam extends JFrame implements  KeyListener {
   public CUBO cubo, cam;
    public static int NoCam=1;
    
    public boolean Estado=false;
    public float i=0;
    static  GL gl;
//    static GLU glu;
    

    public CuboCam(){
//        setTitle("Puntos");
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
    
    public static void main(String[] args) {
        
         CuboCam frame = new CuboCam();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                       
 
    }
 public class GraphicListener implements GLEventListener{

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
//          gl.glEnable(GL.GL_DEPTH_TEST);
//        gl.glEnable(GL.GL_BLEND);
//        gl.glBlendFunc(GL.GL_SRC_ALPHA,GL.GL_ONE_MINUS_SRC_ALPHA);      

        cubo=new CUBO (0,0,-6,0,0,0,1,1,0,1,1,1,gl);
        cam=new CUBO(0,0,0,.2f,.6f,0,0,0,0,.2f,.2f,.2f,gl);
//                cam=new CUBO(-5,0,0,1f,1f,1,0,0,0,.2f,.2f,.2f,gl);

    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        
   

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
                    gl.glLoadIdentity();
            
        GLU glu= new GLU ();       

                glu.gluLookAt(cam.x,cam.y,cam.z,cubo.setx(cubo.getx()),cubo.sety(cubo.gety()),cubo.setz(cubo.getz()),0,1,0);
//                glu.gluLookAt(cubo.setx(cubo.getx()),cubo.sety(cubo.gety()),cubo.setz(cubo.getz()),cam.x,cam.y,cam.z,0,1,0);
//        LoadIdentity();
        cubo.display();
        cubo.x=(float) Math.cos(i)*4;
        cubo.x=(float) Math.sin(i)*4;
        i+=0.01f;
        cam.display();
        cam.x=(float) Math.cos(i)*4;
        cam.y=(float) Math.sin(i)*4;

//        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
    
 }
    public void keyTyped(KeyEvent e) {
        
        
    }    

    public void keyPressed(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.


        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
           cam.x+=0.1;
            System.out.println("Valor en la traslacion de X: "+cam.x);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            cam.x-=0.1;
            cam.setx(cam.getx());
            System.out.println("Valor en la traslacion de X: "+cam.x);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_UP){
            cam.y+=0.1;
            cam.sety(cam.gety());
            System.out.println("Valor en la traslacion de Y: "+cam.y);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
            cam.y-=0.1;
            cam.sety(cam.gety());
            System.out.println("Valor en la traslacion de Y: "+cam.y);
        }
        if(e.getKeyCode()== KeyEvent.VK_X){
            cam.z+=0.1;
            cam.setz(cam.getz());
            System.out.println("Valor en la traslacion de Z: "+cam.z);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_Z){
            cam.z-=0.1;
            cam.setz(cam.getz());
            System.out.println("Valor en la traslacion de Z: "+cam.z);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_D){
            cam.w+=.4f;
         
            System.out.println("Valor en la escalacion de x: "+cam.w);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_A){
            cam.w-=.4f;
            System.out.println("Valor en la escalacion de x: "+cam.w);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_W){
            cam.h+=.4f;
            System.out.println("Valor en la escalacion de y: "+cam.h);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_S){
            cam.h-=.4f;
            System.out.println("Valor en la escalacion de y: "+cam.h);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_R){
            cam.rx+=.4f;
            cam.setrx(cam.getrx());
            System.out.println("Valor en la rotacion de x: "+cam.rx);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_T){
            cam.rx-=.4f;
            cam.setrx(cam.getrx());
            System.out.println("Valor en la rotacion de x: "+cam.rx);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_Y){
            cam.ry+=.4f;
            cam.setry(cam.getry());
            System.out.println("Valor en la rotacion de y: "+cam.ry);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_U){
            cam.ry-=.4f;
            cam.setry(cam.getry());
            System.out.println("Valor en la rotacion de y: "+cam.ry);
        }
         
         if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
            cam.x=0;
            cam.y=0;
            cam.w=1;
            cam.h=1;
            cam.rx=0;
            cam.ry=0;
            cam.rz=0;

        }
    }

    public void keyReleased(KeyEvent ke) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

