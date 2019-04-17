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



/**
 * NombreBryan.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class NombreBryan implements GLEventListener {

    public static void main(String[] args) {
        Frame frame = new Frame("Bryan Camacho");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new NombreBryan());
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
        gl.glClearColor(0.25f, 0.0f, 1, 0.0f);
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
        glu.gluPerspective(90.0f, h, 1.0, 20.0);
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
        gl.glLineWidth(4);
        gl.glTranslatef(-1.5f, 0.0f, -6.0f);

        // Drawing Using Triangles
        
        //Letra B
        
        gl.glBegin(GL.GL_LINES);
            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(-2, -1);
            gl.glVertex2f(-2, 2);

            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(-2, 2);
            gl.glVertex2f(0, 2);

            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(0, 2);
            gl.glVertex2f(0, 0.5f);

            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(0, 0.5f);
            gl.glVertex2f(-2, 0.5f);

            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(-0.25f, 0.5f);
            gl.glVertex2f(-0.25f, -1);

            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(-0.25f, -1);
            gl.glVertex2f(-2, -1);

        //Letra R
        
            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(0.5f, 2);
            gl.glVertex2f(0.5f, -1);

            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(0.5f, 2);
            gl.glVertex2f(2.5f, 2);

            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(2.5f, 2);
            gl.glVertex2f(2.5f, 0.5f);

            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(2.5f, 0.5f);
            gl.glVertex2f(0.5f, 0.5f);

            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(0.5f, 0.5f);
            gl.glVertex2f(2.5f, -1);
        
        //Letra Y
        
            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(4, -1);
            gl.glVertex2f(4, 0.5f);

            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(4, 0.5f);
            gl.glVertex2f(3, 2);

            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(4, 0.5f);
            gl.glVertex2f(5, 2);

        //Letra A

            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(5, -1);
            gl.glVertex2f(6, 2);

            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(7, -1);
            gl.glVertex2f(6, 2);

            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(5.5f, 0.5f);
            gl.glVertex2f(6.5f, 0.5f);

        //Letra N

            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(7.5f, 2);
            gl.glVertex2f(7.5f, -1);

            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(9.5f, 2);
            gl.glVertex2f(9.5f, -1);

            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(7.5f, 2);
            gl.glVertex2f(9.5f, -1);

        //APELLIDO
        
        //Letra J

            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(-4, -1.5f);
            gl.glVertex2f(-4, -4.5f);

            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(-5, -1.5f);
            gl.glVertex2f(-3, -1.5f);

            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(-4, -4.5f);
            gl.glVertex2f(-5, -4.5f);
            
            //Letra A
            
            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(-2.5f, -4.5f);
            gl.glVertex2f(-1.5f, -1.5f);
            
            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(-0.5f, -4.5f);
            gl.glVertex2f(-1.5f, -1.5f);
            
            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(-2, -3);
            gl.glVertex2f(-1, -3);
            
            //Letra Y
            
            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(1, -4.5f);
            gl.glVertex2f(1, -3);
            
            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(1, -3);
            gl.glVertex2f(0, -1.5f);
            
            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(1, -3);
            gl.glVertex2f(2, -1.5f);
            
            //Letra A
            
            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(2.5f, -4.5f);
            gl.glVertex2f(3.5f, -1.5f);
            
            gl.glColor3f(1, 1, 1);
            gl.glVertex2f(4.5f, -4.5f);
            gl.glVertex2f(3.5f, -1.5f);
            
            gl.glColor3f(1, 0, 0);
            gl.glVertex2f(3, -3);
            gl.glVertex2f(4, -3);
        gl.glEnd();
        
        // Move the "drawing cursor" to another position
        gl.glTranslatef(3.0f, 0.0f, 0.0f);
        // Draw A Quad
        /*gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(0.5f, 0.5f, 1.0f);    // Set the current drawing color to light blue
            gl.glVertex3f(-1.0f, 1.0f, 0.0f);  // Top Left
            gl.glVertex3f(1.0f, 1.0f, 0.0f);   // Top Right
            gl.glVertex3f(1.0f, -1.0f, 0.0f);  // Bottom Right
            gl.glVertex3f(-1.0f, -1.0f, 0.0f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        */
        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

