package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import java.lang.Math.* ;

public class SistemaSolar implements GLEventListener {

    Esfera Sol,Mercurio,Venus,Tierra,Marte,Jupiter,Saturno,Urano,Neptuno;
    
    float rme,rve,rti,rma,rju,rsa,rur,rne,x,y,z;
    
    
     public static  float trasladaX=0;
  public static float trasladaY=0;
    
  public static    float escalaX=1;
  public static   float escalaY=1;
    
  public static   float rotarX=0;
  public static    float rotarY=0;
   public static    float rotarZ=0;

    int a = 5;
    public static int cam = 1;
    public ManejadorTeclado mt;
    float i=0,b1=-40,b2=30;
    int j=0;
    int [] posx = {1,2,3,4};
     int [] posy= {1,2,3,4};
    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new SistemaSolar());
        frame.add(canvas);
        frame.setSize(800, 800);
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
        gl.glClearColor(0, 0, 0,0);
      // gl.glClearColor(0, 0, 0,0);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
        
        gl.glEnable(GL.GL_DEPTH_TEST);
        
          mt = new ManejadorTeclado();
         drawable.addKeyListener(mt);
          
        //sol
         Sol = new Esfera(gl, 1,50,50, 0,0,0,20,20,20 ,0,0,0,0,0,0);
        //Planetas 
          Mercurio = new Esfera(gl, 1,50,50, 0,0,0,2,2,2 ,0,0,0,0,0,0);
           Venus = new Esfera(gl, 1,50,50, 0,0,0,2.5f,2.5f,2.5f ,0,0,0,0,0,0);
            Tierra = new Esfera(gl, 1,50,50, 0,0,0,3.5f,3.5f,3.5f ,0,0,0,0,0,0);
             Marte = new Esfera(gl, 1,50,50, 0,0,0,4,4,4 ,0,0,0,0,0,0);
              Jupiter = new Esfera(gl, 1,50,50, 0,0,0,7,7,7 ,0,0,0,0,0,0);
               Saturno = new Esfera(gl, 1,50,50, 0,0,0,5,5,5 ,0,0,0,0,0,0);
                Urano = new Esfera(gl, 1,50,50, 0,0,0,2,2,2 ,0,0,0,0,0,0);
                 Neptuno = new Esfera(gl, 1,50,50, 0,0,0,1.5f,1.5f,1.5f ,0,0,0,0,0,0);
        
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
        glu.gluPerspective(45.0f, h, 1.0, 1000.0);
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

        
       if(cam ==1){
            glu.gluLookAt(0,600,0, 0, -1, 0, 0, 0, 1);

       }
       if(cam ==2){
            glu.gluLookAt(0,400,200, 0, 0, 0, 1, 0, 1);
           
       }
       if(cam ==3){
            glu.gluLookAt(0,300,-600, 0, -1, 0, 0, 1, 0);
           
       }
   
       
         
           gl.glTranslatef(trasladaX, trasladaY, 0);
             gl.glScalef(escalaX, escalaY, 1);    
             gl.glRotatef(rotarX, 1, 0, 0);
             gl.glRotatef(rotarY, 0, 1, 0);
             gl.glRotatef(rotarZ, 0, 0, 1);
           
             
  
             
             //Sol
             
             
                gl.glPushMatrix();
                gl.glColor3f(1,1,0);
                gl.glTranslatef(0,0,0);
                gl.glRotatef(180,0,0,0);
                gl.glScalef(1,1,1);
                    Sol.display();
                gl.glPopMatrix();
                
            //Planetas
                //Mercurio
                gl.glPushMatrix(); 
                gl.glColor3f(0,1,0);                
                gl.glRotatef(rme+=1f,0,1,0);
                gl.glScalef(1,1,1);
                gl.glTranslatef(30,0,30);
                    Mercurio.display();
                gl.glPopMatrix();        
             
               
                //Venus
                gl.glPushMatrix();  
                gl.glColor3f(0,0,0);                
                gl.glRotatef(rve+=0.5,0,1,0);
                gl.glScalef(1,1,1);
                gl.glTranslatef(-65,0,-65);
                   Venus.display();
                gl.glPopMatrix(); 
                
                
             
              
                //Tierra
                gl.glPushMatrix();
                gl.glColor3f(1,0,1);                
//                gl.glRotatef(ry+=0.01f,0,1,0);
                gl.glRotatef(rti+=0.25f,0,1,0);
                gl.glScalef(1,1,1);
                gl.glTranslatef(-35,0,100);
//                    gl.glTranslatef(2*(float) Math.cos(20),0,45*(float )Math.sin(20));
                   Tierra.display();
                gl.glPopMatrix();
                
                 //Marte
                gl.glPushMatrix(); 
                gl.glColor3f(1,0,0);                
                gl.glRotatef(rma+=0.10f,0,1,0);
                gl.glScalef(1,1,1);
                gl.glTranslatef(100,0,-75);
                   Marte.display();
                gl.glPopMatrix();
                
                 //Jupiter
                gl.glPushMatrix();
                gl.glColor3f(0.5f,0.5f,0.25f);                
                gl.glRotatef(rju+=0.1f,0,1,0);
                gl.glScalef(1,1,1);
                gl.glTranslatef(150,0,45);
                   Jupiter.display();
                gl.glPopMatrix();
                
                 //Saturno
                gl.glPushMatrix();
                gl.glColor3f(1,1,1);                
                gl.glRotatef(rsa+=0.05f,0,1,0);
                gl.glScalef(1,1,1);
                gl.glTranslatef(175,0,-100);
                   Saturno.display();
                gl.glPopMatrix();
                
                 //Urano
                gl.glPushMatrix();
                gl.glColor3f(0.8f,0.125f,0.3f);                
                gl.glRotatef(rur+=0.025f,0,1,0);
                gl.glScalef(1,1,1);
                gl.glTranslatef(-200,0,0);
                   Urano.display();
                gl.glPopMatrix();
                
                 //Neptuno
                gl.glPushMatrix();
                gl.glColor3f(0,0,1);                
                gl.glRotatef(rne+=0.01f,0,1,0);
                gl.glScalef(1,1,1);
                gl.glTranslatef(225,0,0);
                   Neptuno.display();
                gl.glPopMatrix();

 
        gl.glFlush();
        
        
        
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}
