package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import com.sun.opengl.util.Animator;
import com.sun.opengl.util.GLUT;
import javax.media.opengl.glu.GLUquadric;


/**
 * SistemaSolar.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Main implements GLEventListener {

    GLUT glut;
    float angley=0, anglex=0; 
    Esphera esfera;
  
    public static int cam = 3;
     public ManejadorTeclado mt;
       
    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Main());
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
        
        
         mt = new ManejadorTeclado();
         drawable.addKeyListener(mt);
       
      
       esfera=new Esphera(gl,1,70,70,1,1,-10,1,0f,1);
       
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();//gracias a GL en drawable se dibuja
         GLU glu = new GLU();
        glut = new GLUT();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 100.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
       
        //esfera usando glu
        gl.glLoadIdentity();
        
        GLU glu= new GLU ();
           
       if(cam ==1){
            glu.gluLookAt(-20,100,-10, -20, 0, 0, 0, 1, 0);

       }
       if(cam ==2){
            glu.gluLookAt(-50,2,10f, 0, 0, 6, 0, 1, 0);
           
       }
       if(cam ==3){
            glu.gluLookAt(30,2,10f, 0, 0, 6, 0, 1, 0);
           
       }
   
         if(cam ==4){
            glu.gluLookAt(40,15,5, -1, -1, 0, 0, 1, 0);
           
       }
         
         if(cam ==5){
                glu.gluLookAt(0,1,-15, 0, 0, 0, 0, 1, 0);
           
       }
         
         
       gl.glColor3f(1,0,0);
       gl.glTranslatef(0,0,-10);
       esfera.display();
       
       
       
       //octaedro GLUT
       gl.glLoadIdentity();
       gl.glColor3f(0,1,0);
       gl.glTranslatef(-2,0,-10);
       glut.glutSolidSphere(.5f, 10, 10);
       
       
       
        gl.glLoadIdentity();
       gl.glColor3f(0,0,1);
       gl.glTranslatef(2,-1,-10);
       glut.glutSolidTeapot(.5f);
       
        gl.glLoadIdentity();
       gl.glColor3f(1,1,0);
       gl.glTranslatef(4,2,-10);
       glut.glutSolidTetrahedron();
       
        gl.glLoadIdentity();
       gl.glColor3f(0,1,1);
       gl.glTranslatef(-4,0,-10);
       glut.glutSolidCube(.5f);
       
      //  glut.glutSolidTeapot(2);
        
        
        // Flush all drawing operations to the graphics card
        gl.glFlush();
        
        
    }
    

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

