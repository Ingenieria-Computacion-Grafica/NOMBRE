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
import java.lang.Math;
import java.math.MathContext;

/**
 * Casa.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Casa implements GLEventListener {

    ObjCubo bloque, puerta, vi, vd;
    Cilindro techo;   
    
    public static int apuntador=1;
    
    ManejadorTeclado mt;

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
//        System.err.println("INIT GL IS: " + gl.getClass().getName());
        gl.glEnable(GL.GL_DEPTH_TEST);
        
        this.mt = new ManejadorTeclado();
        drawable.addKeyListener(mt);

        this.bloque = new ObjCubo(gl, 0, 0, -4, 1.2f, 1.2f, 1.2f, 0, 0, 0, 1, 1, 1);
        this.puerta = new ObjCubo(gl, 0, -0.6f, -2.79f, 0.3f, 0.6f, 0, 0, 0, 0, 0, 0, 0);
        this.vi = new ObjCubo(gl, -0.65f, 0.45f, -2.79f, 0.3f, 0.3f, 0, 0, 0, 0, 0, 0, 0);
        this.vd = new ObjCubo(gl, 0.65f, 0.45f, -2.79f, 0.3f, 0.3f, 0, 0, 0, 0, 0, 0, 0);
        this.techo = new Cilindro(gl, 0, 1.2f, -4, 1.65f, 1.65f, 1, -90, 0, 45, 0, 0, 0, 4, 4, 0, 1);
        
        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.75f, 1f, 0.0f);
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
        glu.gluPerspective(45, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();
        
//        glu.gluLookAt(0, 0, 0, 0, 0, -8, 0, 1, 0);
//        
//        
//        if (camara==1) {
//            glu.gluLookAt(x+=0.5f, y, z, 0, 0, -8, 0, 1, 0);
//        }
//        if (camara==2) {
//            glu.gluLookAt(x-=0.5f, y, z, 0, 0, -8, 0, 1, 0);
//        }
//        if (camara==3) {
//            glu.gluLookAt(x, y+=0.5f, z, 0, 0, -8, 0, 1, 0);
//        }
//        if (camara==4) {
//            glu.gluLookAt(x, y-=0.5f, z, 0, 0, -8, 0, 1, 0);
//        }
//        if (camara==5) {
//            glu.gluLookAt(x, y, z+=0.5f, 0, 0, -8, 0, 1, 0);
//        }
//        if (camara==6) {
//            glu.gluLookAt(x, y, z-=0.5f, 0, 0, -8, 0, 1, 0);
//        }
        
        if (apuntador==1) {
            glu.gluLookAt(0, 0, 0, 0, 0, -12, 0, 1, 0);
//            System.out.println("Pos en x = "+x);
        }
        if (apuntador==2) {
            glu.gluLookAt(-5, 0, -8, 0, 0, -12, 0, 1, 0);
//            System.out.println("Pos en x = "+x);
        }
        if (apuntador==3) {
            glu.gluLookAt(5, 0, -16, 0, 0, -12, 0, 1, 0);
//            System.out.println("Pos en y = "+y);
        }
        if (apuntador==4) {
            glu.gluLookAt(0, 0, -18, 0, 0, -12, 0, 1, 0);
//            System.out.println("Pos en y = "+y);
        }
        if (apuntador==5) {
            glu.gluLookAt(0, 8, -12, 0, 0, -12, 0, 0, 1);
//            System.out.println("Pos en z = "+z);
        }
        if (apuntador==6) {
            glu.gluLookAt(4, 4, -12, 0, 0, -12, 0, 1, 0);
//            System.out.println("Pos en z = "+z);
        }
        if (apuntador==7) {
            glu.gluLookAt(0, -5, -12, 0, 0, -12, 0, 0, -1);
//            System.out.println("Pos en z = "+z);
        }

        // Move the "drawing cursor" around
        
        gl.glTranslatef(0f, 0.0f, -8);
        
//        this.cam.ManejoCamara();

        this.bloque.Display();
        this.puerta.Display();
        this.vi.Display();
        this.vd.Display();
        this.techo.Display();
        // Done Drawing The Quad
//        gl.glEnd();

        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

