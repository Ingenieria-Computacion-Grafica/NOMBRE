package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;



/**
 * Personaje.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Personaje implements GLEventListener {
    public static int numcamara=1;
    ManejadorTeclado mt;
    
//    private static  float trasladaX=0;
//    private static  float trasladaY=0;
//    
//    private static  float escalaX=1;
//    private static  float escalaY=1;
//    
//    private static  float rotarX=0;
//    private static  float rotarY=0;
//    private static  float rotarZ=0;
    
    CrearPersonaje uno, dos, tres;
    Piso piso;
    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Personaje());
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
        
        this.mt = new ManejadorTeclado();
        drawable.addKeyListener(mt);
        
        this.piso = new Piso(gl, -5, 0, -50, 1, 1, 3, 0, 0, 0);
        
        this.uno = new CrearPersonaje(1, 1, -12, 1, 1, 1, 0, 0, 0, gl);
        this.dos = new CrearPersonaje(-5, 1, -17, 1, 1, 1, 0, 0, 0, gl);
        this.tres = new CrearPersonaje(6, 1, -7, 1, 1, 1, 0, 180, 0, gl);
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
        glu.gluPerspective(90.0f, h, 1.0, 20);
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
        
//            gl.glRotatef(rotarX, 1, 0, 0);
//            gl.glRotatef(rotarY, 0, 1, 0);
//            gl.glRotatef(rotarY, 0, 0, 1);
//        
        if (numcamara == 1) {
            glu.gluLookAt(0, 1, 0 , 0, 1, -12, 0, 1, 0);
        }
        if (numcamara == 2) {
            glu.gluLookAt(-4, -1, -7 , 0, -1, -12, 0, 1, 0);
        }
        if (numcamara == 3) {
            glu.gluLookAt(4, -1, -17 , 0, -1, -12, 0, 1, 0);
        }
        if (numcamara == 4) {
           glu.gluLookAt(0, -1, -17 , 0, 1, -12, 0, 1, 0);
        }
        if (numcamara == 5) {
            glu.gluLookAt(0, 5, -7, 0, 1, -12, 0, 1, 0);
        }
        if (numcamara == 6) {
            glu.gluLookAt(0, 2, -4, 0, 1, -12, 0, 1, 0);
        }
//        if (numcamara == 7) {
//            glu.gluLookAt(cohete.x, cohete.y, cohete.z-2 , 0, 0, -75, 0, 0.5f, 0.5f);
//        }
//        if (numcamara == 8) {
//            glu.gluLookAt(0, 75, -37.5f, 0, 0, -37.5f, 1, 0, 0);
//        }

        // Move the "drawing cursor" around
//        
        this.uno.Display();
        this.uno.Bailar();
        
        this.dos.Display();
        this.dos.Avanzar();
        
        this.tres.Display();
        this.tres.Regresar();
        
        this.piso.Display();

        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
    
////     @Override
//    public void keyTyped(KeyEvent e) {
//        
//    }
//
////    @Override
//    public void keyPressed(KeyEvent e) {
////        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
////            trasladaX+=0.1;
////            System.out.println("Valor en la traslacion de X: "+trasladaX);
////        }
////        
////        if(e.getKeyCode()== KeyEvent.VK_LEFT){
////            trasladaX-=0.1;
////            System.out.println("Valor en la traslacion de X: "+trasladaX);
////        }
////        
////        if(e.getKeyCode()== KeyEvent.VK_UP){
////            trasladaY+=0.1;
////            System.out.println("Valor en la traslacion de Y: "+trasladaY);
////        }
////        
////        if(e.getKeyCode()== KeyEvent.VK_DOWN){
////            trasladaY-=0.1;
////            System.out.println("Valor en la traslacion de Y: "+trasladaY);
////        }
////        
////        
////        if(e.getKeyCode()== KeyEvent.VK_D){
////            escalaX+=1f;
////            System.out.println("Valor en la escalacion de x: "+escalaX);
////        }
////        
////         if(e.getKeyCode()== KeyEvent.VK_A){
////            escalaX-=1f;
////            System.out.println("Valor en la escalacion de x: "+escalaX);
////        }
////         
////        if(e.getKeyCode()== KeyEvent.VK_W){
////            escalaY+=1f;
////            System.out.println("Valor en la escalacion de y: "+escalaY);
////        }
////        
////         if(e.getKeyCode()== KeyEvent.VK_S){
////            escalaY-=1f;
////            System.out.println("Valor en la escalacion de y: "+escalaY);
////        }
//         
//        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
//            rotarX+=1f;
//            System.out.println("Valor en la rotacion de x: "+rotarX);
//        }
//        
//         if(e.getKeyCode()== KeyEvent.VK_LEFT){
//            rotarX-=1f;
//            System.out.println("Valor en la rotacion de x: "+rotarX);
//        }
//         
//        if(e.getKeyCode()== KeyEvent.VK_UP){
//            rotarY+=1f;
//            System.out.println("Valor en la rotacion de y: "+rotarY);
//        }
//        
//        if(e.getKeyCode()== KeyEvent.VK_DOWN){
//            rotarY-=1f;
//            System.out.println("Valor en la rotacion de y: "+rotarY);
//        }
//         
//        if(e.getKeyCode()== KeyEvent.VK_R){
//            rotarZ+=1f;
//            System.out.println("Valor en la rotacion de y: "+rotarZ);
//        }
//        
//        if(e.getKeyCode()== KeyEvent.VK_F){
//            rotarZ-=1f;
//            System.out.println("Valor en la rotacion de y: "+rotarZ);
//        }
//         
//        if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
////            trasladaX=0;
////            trasladaY=0;
////            escalaX=1;
////            escalaY=1;
//            rotarX=0;
//            rotarY=0;
//
//        }
//        
//    }
//
////    @Override
//    public void keyReleased(KeyEvent e) {
//        
//    }
}

