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

public class Main implements GLEventListener {
    


   
  Cubo miCubo;
   
 public static  float trasladaX=0;
  public static float trasladaY=0;
    
  public static    float escalaX=1;
  public static   float escalaY=1;
    
  public static   float rotarX=0;
  public static    float rotarY=0;
   public static    float rotarZ=0;
     public static int cam = 3;
     public ManejadorTeclado mt;
    
    
    public static void main(String[] args) {
          
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Main());
        frame.add(canvas);
        frame.setSize(800,800);
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
        gl.glClearColor(0f,0f,0f,0);
      // gl.glClearColor(0, 0, 0,0);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
        
        gl.glEnable(GL.GL_DEPTH_TEST);
        
               mt = new ManejadorTeclado();
         drawable.addKeyListener(mt);
       
       
       miCubo = new Cubo(gl,0,0,0,0,1,0,1,1,1,0,0,0);
         
        
   
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
        glu.gluPerspective(45.0f, h, 2, 150.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
        
        
    }



    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        
        
        gl.glLoadIdentity();
        GLU glu= new GLU ();
        
             if(cam ==3){
            glu.gluLookAt(0,0,-10, 0, 0, 0, 0, 1, 0);
           
       }
        
         
             gl.glTranslatef(trasladaX, trasladaY, 0);
             gl.glScalef(escalaX, escalaY, 1);    
             gl.glRotatef(rotarX, 1, 0, 0);
             gl.glRotatef(rotarY, 0, 1, 0);
             gl.glRotatef(rotarZ, 0, 0, 1);
         
               miCubo.display();
                 
             
                  

        gl.glFlush();
        
        
        
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    
 
}

