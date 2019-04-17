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
import com.sun.opengl.util.GLUT;



/**
 * FigurasGLU.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class FigurasGLU implements GLEventListener {
    
    public static int numcamara=1;
    ManejadorTeclado mt;
    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new FigurasGLU());
        frame.add(canvas);
        frame.setSize(1280, 960);
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
//        System.err.println("INIT GL IS: " + gl.getClass().getName());
        // Enable VSync
        
        this.mt = new ManejadorTeclado();
        drawable.addKeyListener(mt);
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_FLAT); // try setting this to GL_FLAT and see what happens.
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
        glu.gluPerspective(90.0f, h, 1.0, 150.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        GLUT glut = new GLUT();
        

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity
        
        gl.glLoadIdentity();
        gl.glColor3f(1, 0, 0);
        gl.glTranslatef(-20, 0, -40);
        gl.glScalef(3, 3, 3);
        glut.glutWireCylinder(3, 9, 50, 25);
        
        gl.glLoadIdentity();
        gl.glColor3f(1, 0, 1);
        gl.glTranslatef(0, 0, -45);
        gl.glRotatef(180, 1, 0, 0);
        gl.glScalef(12, 12, 12);
        glut.glutWireCone(3, 15, 20, 25);
        
        gl.glLoadIdentity();
        gl.glColor3f(1, 0, 0.5f);
        gl.glTranslatef(15, 5, -20);
        gl.glRotatef(-30, 1, 0, 0);
        glut.glutSolidTorus(1, 5, 2, 15);
        
        gl.glLoadIdentity();
        gl.glColor3f(1, 1, 1);
        gl.glTranslatef(0, 0, -18);
        glut.glutWireTeapot(3.5f);
        
        gl.glLoadIdentity();
        gl.glColor3f(1, 1, 0);
        gl.glTranslatef(0, 40, -60);
        glut.glutWireSphere(10, 50, 50);
        
        gl.glLoadIdentity();
        gl.glColor3f(0.5f, 1, 1);
        gl.glTranslatef(15, -5, -50);
        gl.glScalef(1, 1, 15);
        glut.glutWireCube(5);
        
        gl.glLoadIdentity();
        gl.glColor3f(0.5f, 1, 0);
        gl.glTranslatef(-3, -5, -16);
        gl.glScalef(1, 1, 10);
        glut.glutWireSphere(1, 20, 20);
        
        if (numcamara==1) {
            glu.gluLookAt(-20, 0, -70, -20, 0, -40, 0, 1, 0);
        }
        if (numcamara==2) {
            glu.gluLookAt(0, 20, -45, 0, 0, -45, 0, 1, 0);
        }
        if (numcamara==3) {
            glu.gluLookAt(0, 40, -18, 0, 0, -18, 0, 0, 1);
        }
        if (numcamara==4) {
            glu.gluLookAt(0, -40, -18, 0, 0, -18, 0, 0, -1);
        }
        if (numcamara==5) {
            glu.gluLookAt(-40, 0, -18, 0, 0, -18, 0, 1, 0);
        }
        if (numcamara==6) {
            glu.gluLookAt(40, 0, -18, 0, 0, 0, -18, 1, 0);
        }
        
        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

