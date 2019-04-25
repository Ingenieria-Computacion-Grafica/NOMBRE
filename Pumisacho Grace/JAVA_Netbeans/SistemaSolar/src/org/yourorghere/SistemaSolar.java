package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;


/**
 *
 * @author Grace Mireya Pumisacho
 */
public class SistemaSolar implements GLEventListener {
    
    public static int cam=1;
    public ManejadorTeclado mt;
//    public float aumento=0.01f;
     Cubo camara;
     Mundo mundo1;



    public static void main(String[] args) {
        Frame frame = new Frame("ESCENARIO GRACE");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new SistemaSolar());
        frame.add(canvas);
        frame.setSize(960, 700);
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
        gl.setSwapInterval(1);//refrescar el monitor
        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
        gl.glEnable(GL.GL_DEPTH_TEST);///test de profundidad

        mt = new ManejadorTeclado();
        drawable.addKeyListener(mt);
        
        mundo1=new Mundo(0,0,0,0.1f,.1f,.1f,0,0,0,gl);
        camara=new Cubo(5,5,5, 0,1,0,1,1,1,0,0,0,gl);

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
        glu.gluPerspective(90.0f, h, 1.0, 400.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();
        // Move the "drawing cursor" around
       // gl.glTranslatef(-1.5f, 0.0f, -6.0f);
        GLU glu=new GLU();
 
            //gl.glLoadIdentity();
            if (cam==1){
                glu.gluLookAt(-60,20,camara.z, 0,0, 0, 0, 1, 0);
                if(camara.z<8){
                    camara.z+=-1;       // aumento.ry+=0.5;
              }
              
            }
            
            if(cam==2){
                glu.gluLookAt(-105,50,0, 0, 0, 0, 0, 1, 0);
            }
            
            if(cam==3){
                glu.gluLookAt(15,20,-150, 0,30,-10, 0, 1, 0);
            }
            
            if(cam==4){
                glu.gluLookAt(70,1,30, 0,0,0, 0, 1, 0);
            }
            if(cam==5){
                glu.gluLookAt(0,70,100,0,0,0,0,1,0);
            }
            if(cam==6){
                glu.gluLookAt(0,200,0,1,0,0,0,1,0);
            }           
            if(cam==7){
                glu.gluLookAt(camara.x,20,camara.z, 0,0, 0, 0, 1, 0);
                if(camara.z<8){
                    camara.z+=-0.5; 
////                   // aumento.ry+=0.5;
              }
                
                if(camara.x<4){
                    camara.x+=-1; 
////                   // aumento.ry+=0.5;
              }
            }           
        gl.glFlush();
        
        mundo1.display();
        
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

