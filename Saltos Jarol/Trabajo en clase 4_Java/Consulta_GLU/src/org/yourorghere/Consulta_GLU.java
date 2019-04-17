package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.nio.file.Files.size;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import com.sun.opengl.util.GLUT;
import java.awt.event.KeyEvent;
import javax.media.opengl.GLCapabilities;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.event.KeyListener;




/**
 * Consulta_GLU.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Consulta_GLU extends JFrame implements  KeyListener {
    public static int ncam=1;
    GLUT glut;
    ESFERA esfera, dodecaetlon, cam;
    CILINDRO cilindro, cono, cubo;
    float rot, i;
    
   


    public Consulta_GLU(){
//        setTitle("Puntos");
        setSize(700,700);
        setLocation(10,40);
       
        // Intancia de clase GraphicListener
        
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas= new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
          Animator animator = new Animator(canvas);
        animator.start();
        
                addKeyListener(this); // Para que canvas reconozca las pulsaciones del teclado
        
    }
    
    public static void main(String[] args) {
        
         Consulta_GLU frame = new Consulta_GLU();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                       
 
    }
 public class GraphicListener implements GLEventListener{
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
        
        
        esfera=new ESFERA(0,0,-6,1,1,1,0,0,0,1,1,0,gl,.5f,20,20);
        dodecaetlon=new ESFERA(-2,0,-6,1,1,1,0,0,0,0,1,0,gl,.5f,7,7);
        cam=new ESFERA(-4,1,-4,1,1,1,0,0,0,0,1,0,gl,.5f,7,7);
        cilindro=new CILINDRO(2f,0,-6,1,1,1,0,45,0,1,0,1,gl,.5f,.2f,2f,20,20);
        cono=new CILINDRO(-2f,1,-6,1,1,1,0,45,0,0,1,1,gl,.5f,0f,1f,20,20);
        cubo=new CILINDRO(4f,1,-6,1,1,1,0,45,0,1,.2f,.5f,gl,.5f,.5f,1f,4,1);
        
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
 GLU glu= new GLU ();       
             if(ncam==1){
                glu.gluLookAt(cam.x,cam.y,cam.z,cubo.x,cubo.y,cubo.z,0,1,0);}
             if(ncam==2){
                glu.gluLookAt(cam.x,cam.y,cam.z,esfera.x,esfera.y,esfera.z,0,1,0);}
             if(ncam==3){
                glu.gluLookAt(cam.x,cam.y,cam.z,cono.x,cono.y,cono.z,0,1,0);}
             if(ncam==4){
                glu.gluLookAt(cam.x,cam.y,cam.z,cilindro.x,cilindro.y,cilindro.z,0,1,0);}
             if(ncam==5){
                glu.gluLookAt(cam.x,cam.y,cam.z,dodecaetlon.x,dodecaetlon.y,dodecaetlon.z,0,1,0);}
             if(ncam==6){
                glu.gluLookAt(cam.x,cam.y,cam.z,0,-.2f,cubo.z,0,1,0);}
        // Move the "drawing cursor" around
        gl.glTranslatef(0,.3f,0);
        dodecaetlon.display();
        dodecaetlon.ry+=.4f;
        dodecaetlon.rx+=.3f;
        esfera.display();
        cilindro.display();
        cono.display();
        cubo.display();
       gl.glPushMatrix();
       gl.glTranslatef(-1.5f,-.3f,-6);
       gl.glColor3f(1,1,1);
       gl.glRotatef(rot, 1, .5f, 0);
       glut.glutWireSphere(.5f, 25, 25);
       glut.glutWireDodecahedron();
       gl.glPopMatrix();
       
   
       gl.glPushMatrix();
       gl.glTranslatef(1.5f,-.6f,-6);
       gl.glColor3f(1,0,1);
       gl.glRotatef(rot,.5f,1,0);
        glut.glutWireOctahedron();

         glut.glutWireTetrahedron() ;
         gl.glTranslatef(0,-.2f,0);
         gl.glColor3f(1,1,0);
          glut.glutWireTeapot(.4f);
          
          gl.glTranslatef(-2,+.8f,3);
         gl.glColor3f(1,1,0);
          glut.glutWireIcosahedron();
          gl.glPopMatrix();
          cam.x=(float) Math.cos(i)*4;
        cam.y=(float) Math.sin(i)*4;
       rot+=.2f;
       i+=.01f;
        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
    
     }
    public void keyTyped(KeyEvent e) {
        
        if(e.getKeyChar()=='1'){
            Consulta_GLU.ncam=1;
        
    }
    
        if (e.getKeyChar()=='2'){
        Consulta_GLU.ncam=2;
    }
          if (e.getKeyChar()=='3'){
        Consulta_GLU.ncam=3;
    }
          if(e.getKeyChar()=='4'){
            Consulta_GLU.ncam=4;
        
    }
    
        if (e.getKeyChar()=='5'){
        Consulta_GLU.ncam=5;
    }
          if (e.getKeyChar()=='6'){
        Consulta_GLU.ncam=6;
    }
        
    }    

    public void keyPressed(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.


        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
           cam.x+=0.1;
            System.out.println("Valor en la traslacion de X: "+cam.x);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            cam.x-=0.1;
            cam.setx(cam.getx());
            System.out.println("Valor en la traslacion de X: "+cam.x);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_UP){
            cam.y+=0.1;
            cam.sety(cam.gety());
            System.out.println("Valor en la traslacion de Y: "+cam.y);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
            cam.y-=0.1;
            cam.sety(cam.gety());
            System.out.println("Valor en la traslacion de Y: "+cam.y);
        }
        if(e.getKeyCode()== KeyEvent.VK_X){
            cam.z+=0.1;
            cam.setz(cam.getz());
            System.out.println("Valor en la traslacion de Z: "+cam.z);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_Z){
            cam.z-=0.1;
            cam.setz(cam.getz());
            System.out.println("Valor en la traslacion de Z: "+cam.z);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_D){
            cam.w+=.4f;
         
            System.out.println("Valor en la escalacion de x: "+cam.w);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_A){
            cam.w-=.4f;
            System.out.println("Valor en la escalacion de x: "+cam.w);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_W){
            cam.h+=.4f;
            System.out.println("Valor en la escalacion de y: "+cam.h);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_S){
            cam.h-=.4f;
            System.out.println("Valor en la escalacion de y: "+cam.h);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_R){
            cam.rx+=.4f;
            cam.setrx(cam.getrx());
            System.out.println("Valor en la rotacion de x: "+cam.rx);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_T){
            cam.rx-=.4f;
            cam.setrx(cam.getrx());
            System.out.println("Valor en la rotacion de x: "+cam.rx);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_Y){
            cam.ry+=.4f;
            cam.setry(cam.getry());
            System.out.println("Valor en la rotacion de y: "+cam.ry);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_U){
            cam.ry-=.4f;
            cam.setry(cam.getry());
            System.out.println("Valor en la rotacion de y: "+cam.ry);
        }
         
         if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
            cam.x=0;
            cam.y=0;
            cam.w=1;
            cam.h=1;
            cam.rx=0;
            cam.ry=0;
            cam.rz=0;

        }
    }

    public void keyReleased(KeyEvent ke) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

