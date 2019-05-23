package org.yourorghere;

import com.sun.opengl.util.Animator;
import com.sun.opengl.util.GLUT;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;



/**
 * Casa.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Casa implements GLEventListener {

     public static ManejadorTeclado mt;   
    public  Movil casa1;
    Casa1 casa, casa2;
    LUZ luz0, luz1;
     GLUT glut;
           float [] position_luz0={-2,4,-6};  //declaramos un arreglo
//        float [] ambient_luz0={.5f,.5f,.5f}; 
        float [] ambient_luz0={.1f,.1f,.1f}; 
        float [] specular_luz0={.57f,.57f,.57f};     
        //float [] diffuse_luz0={.0025f,.0025f,0.0025f}; //esta vale
        float [] diffuse_luz0={.55f,.55f,0.55f};//esta es para ver 

                   float [] position_luz1={0,4,-6};  //declaramos un arreglo
//        float [] ambient_luz0={.5f,.5f,.5f}; 
        float [] ambient_luz1={.5f,.5f,0f}; 
        float [] specular_luz1={.57f,.57f,0f};     
        //float [] diffuse_luz0={.0025f,.0025f,0.0025f}; //esta vale
        float [] diffuse_luz1={.55f,0,0f};//esta es para ver 
    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Casa());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

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
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glEnable(GL.GL_BLEND);
        gl.glBlendFunc(GL.GL_SRC_ALPHA,GL.GL_ONE_MINUS_SRC_ALPHA);
        gl.glEnable(GL.GL_LIGHTING);     //ACTIVAMOS LAS LUCES del parametro GlOBAL, Deja de funcionar el Color3f
        gl.glEnable(GL.GL_LIGHT0); 
        gl.glEnable(GL.GL_LIGHT1);
        Materiales.diccionario(gl);
        luz0= new LUZ( position_luz0,ambient_luz0,diffuse_luz0,specular_luz0,GL.GL_LIGHT0,gl);
        luz1= new LUZ( position_luz1,ambient_luz1,diffuse_luz1,specular_luz1,GL.GL_LIGHT1,gl);
        casa1=new DibujarCasa(0,0,-6,0,0,0,1,1,1,gl);
         try {
             casa=new Casa1(1,0,-6,1,1,1,0,0,0,gl);
         } catch (IOException ex) {
             Logger.getLogger(Casa.class.getName()).log(Level.SEVERE, null, ex);
         }
         try {
             casa2=new Casa1(-1,0,-8,.5f,.5f,.5f,0,-90,0,gl);
         } catch (IOException ex) {
             Logger.getLogger(Casa.class.getName()).log(Level.SEVERE, null, ex);
         }

         mt= new ManejadorTeclado(casa1);
        drawable.addKeyListener(mt);  
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        glut=new GLUT();
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
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();

//            casa.izquierda();
//            System.out.println("Valor en la traslacion de X: "+casa.getx());
//        }
//        casa1.display();

       casa.display();
       casa2.display();
       casa.ry+=.5f;
              luz1.position[1]=casa.y+2f;
        luz1.position[0]=casa.x-1;
        luz1.position[2]=casa.z;
        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

