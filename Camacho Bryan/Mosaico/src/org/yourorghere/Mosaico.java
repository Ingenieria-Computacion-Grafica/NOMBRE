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
import javax.swing.JFrame;



/**
 * Mosaico.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Mosaico implements GLEventListener {

    Estrella e1, e2, e3, e4, e5;
//    static float x, y, w, h, rx, ry;
//    ManejadorTeclado mt;
    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Mosaico());
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
        gl.glEnable(GL.GL_DEPTH_TEST);
        
//        this.mt = new ManejadorTeclado();
        this.e1 = new Estrella(gl, 0, 0, -3, 0.25f, 0.25f, 0.25f, 0, 0, 0);
        this.e2 = new Estrella(gl, -3, 2, -5, 0.15f, 0.15f, 0.25f, 0, 0, 0);
        this.e3 = new Estrella(gl, -3, -3, -5, 0.15f, 0.15f, 0.25f, 0, 0, 0);
        this.e4 = new Estrella(gl, 3, 3, -5, 0.15f, 0.15f, 0, 0.25f, 0, 0);
        this.e5 = new Estrella(gl, 3, -2, -5, 0.15f, 0.15f, 0.25f, 0, 0, 0);
        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
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
        glu.gluPerspective(78.0f, h, 1.0, 20.0);
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
//        gl.glTranslatef(-1.5f, 0.0f, -6.0f);

        gl.glBegin(GL.GL_TRIANGLE_STRIP);
        
        gl.glColor3f(0.9f, 0.9f, 0);
        gl.glVertex3f(-7, 0, -6);
        gl.glVertex3f(-7, 5, -6);
        gl.glVertex3f(-4, 0, -6);
        
        gl.glColor3f(0.95f, 0.95f, 0);
        gl.glVertex3f(-7, 5, -6);
        gl.glVertex3f(-4, 0, -6);
        gl.glVertex3f(-4, 5, -6);
        
        gl.glColor3f(0.9f, 0.9f, 0);
        gl.glVertex3f(-4, 0, -6);
        gl.glVertex3f(-4, 5, -6);
        gl.glVertex3f(-1, 0, -6);
        
        gl.glColor3f(0.95f, 0.95f, 0);
        gl.glVertex3f(-4, 5, -6);
        gl.glVertex3f(-1, 0, -6);
        gl.glVertex3f(-1, 5, -6);
        
        gl.glColor3f(0.9f, 0.9f, 0);
        gl.glVertex3f(-1, 0, -6);
        gl.glVertex3f(-1, 5, -6);
        gl.glVertex3f(2, 0, -6);
        
        gl.glColor3f(0.95f, 0.95f, 0);
        gl.glVertex3f(-1, 5, -6);
        gl.glVertex3f(2, 0, -6);
        gl.glVertex3f(2, 5, -6);
        
        gl.glColor3f(0.9f, 0.9f, 0);
        gl.glVertex3f(2, 0, -6);
        gl.glVertex3f(2, 5, -6);
        gl.glVertex3f(5, 0, -6);
        
        gl.glColor3f(0.95f, 0.95f, 0);
        gl.glVertex3f(2, 5, -6);
        gl.glVertex3f(5, 0, -6);
        gl.glVertex3f(5, 5, -6);
        
        gl.glColor3f(0.9f, 0.9f, 0);
        gl.glVertex3f(5, 0, -6);
        gl.glVertex3f(5, 5, -6);
        gl.glVertex3f(8, 0, -6);
        
        gl.glColor3f(0.95f, 0.95f, 0);
        gl.glVertex3f(5, 5, -6);
        gl.glVertex3f(8, 0, -6);
        gl.glVertex3f(8, 5, -6);
        
        gl.glColor3f(0.95f, 0.95f, 0);
        gl.glVertex3f(5, 0, -6);
        gl.glVertex3f(8, 0, -6);
        gl.glVertex3f(8, -5, -6);
        
        gl.glColor3f(0.9f, 0.9f, 0);
        gl.glVertex3f(5, 0, -6);
        gl.glVertex3f(8, -5, -6);
        gl.glVertex3f(5,-5, -6);
        
        gl.glColor3f(0.95f, 0.95f, 0);
        gl.glVertex3f(5, 0, -6);
        gl.glVertex3f(5,-5, -6);
        gl.glVertex3f(2, 0, -6);
        
        gl.glColor3f(0.9f, 0.9f, 0);
        gl.glVertex3f(5,-5, -6);
        gl.glVertex3f(2, 0, -6);
        gl.glVertex3f(2,-5, -6);
        
        gl.glColor3f(0.95f, 0.95f, 0);
        gl.glVertex3f(2, 0, -6);
        gl.glVertex3f(2,-5, -6);
        gl.glVertex3f(-1, 0, -6);
        
        gl.glColor3f(0.9f, 0.9f, 0);
        gl.glVertex3f(2,-5, -6);
        gl.glVertex3f(-1, 0, -6);
        gl.glVertex3f(-1,-5, -6);
        
        gl.glColor3f(0.95f, 0.95f, 0);
        gl.glVertex3f(-1, 0, -6);
        gl.glVertex3f(-1,-5, -6);
        gl.glVertex3f(-4, 0, -6);
        
        gl.glColor3f(0.9f, 0.9f, 0);
        gl.glVertex3f(-1,-5, -6);
        gl.glVertex3f(-4, 0, -6);
        gl.glVertex3f(-4,-5, -6);
        
        gl.glColor3f(0.95f, 0.95f, 0);
        gl.glVertex3f(-4, 0, -6);
        gl.glVertex3f(-4,-5, -6);
        gl.glVertex3f(-7, 0, -6);
        
        gl.glColor3f(0.9f, 0.9f, 0);
        gl.glVertex3f(-4,-5, -6);
        gl.glVertex3f(-7, 0, -6);
        gl.glVertex3f(-7,-5, -6);
        
    gl.glEnd();
        
        this.e1.Display();
        this.e1.Navegar();
//        this.e1.Crecer();
        
        this.e2.Display();
        this.e2.Navegar();
        this.e2.MoverI();
        
        this.e3.Display();
        this.e3.Navegar();
        this.e3.MoverI();
//        
        this.e4.Display();
        this.e4.Navegar();
        this.e4.MoverD();
        
        this.e5.Display();
        this.e5.Navegar();
        this.e5.MoverD();
        
        
//        gl.glLineWidth(4);
//        // Drawing Using Triangles
//        gl.glBegin(GL.GL_QUADS);
//            gl.glColor3f(0, 1, 0);
//            gl.glVertex2f(-3, -1);
//            gl.glColor3f(1, 1, 0);
//            gl.glVertex2f(-3, 2);
//            gl.glColor3f(0, 1, 0);
//            gl.glVertex2f(0, 2);
//            gl.glColor3f(1, 1, 0);
//            gl.glVertex2f(0, -1);
//        gl.glEnd();
//        
//        gl.glBegin(GL.GL_TRIANGLES);
//            gl.glColor3f(1, 0, 1);
//            gl.glVertex2d(3, -1);
//            gl.glVertex2d(4.5f, 2);
//            gl.glVertex2d(6, -1);
//        gl.glEnd();
        
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

