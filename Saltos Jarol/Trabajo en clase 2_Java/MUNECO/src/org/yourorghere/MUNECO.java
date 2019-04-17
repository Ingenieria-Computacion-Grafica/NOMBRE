package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Llamar las funciones viculada a las transformaciones
import com.sun.opengl.util.Animator;

/**
 * MUNECO.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class MUNECO extends JFrame implements  KeyListener {
    
    static  GL gl;
    static GLU glu;   
      public static  float trasladaX=0;
    public static  float trasladaY=0;
    
    public static  float escalaX=1;
    public static  float escalaY=1;
    
    public static  float rotarX=0;
    public static  float rotarY=0;
    DibujoMuneco munec;
    
    
public  MUNECO(){
        setTitle("Puntos");
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
       MUNECO frame = new MUNECO();
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
        munec=new DibujoMuneco(0,0,0,1,1,1,0,0,0,gl);
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
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        
        
           
        
            
            //Para evitar el rastro de movimiento , al trasladar el objeto
            // Limpia el bufer para no tener rastro
            gl.glClear(gl.GL_COLOR_BUFFER_BIT);
            
            // Establecer color de fondo de la ventana de colores RGB
            gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            
            // Establecer los parametros de la proyección
            gl.glMatrixMode(gl.GL_PROJECTION);
            gl.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                        // Creación de linea
            // Definir el grosor de la linea
            gl.glLineWidth(2f);
            // Definir el grosor de los puntos
            gl.glPointSize(3.0f);
            
            
            // Matriz Indentidad -- importante
            gl.glLoadIdentity(); 
//            GLU glu = new GLU();
//            glu.gluLookAt(0,0,2,munec.x,munec.y,munec.z,0,1,0);
            
            munec.display();
//            
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
 }

    public void keyTyped(KeyEvent ke) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void keyPressed(KeyEvent e) {

        
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            munec.x+=0.1;
            munec.setx(munec.getx());

            System.out.println("Valor en la traslacion de X: "+munec.x);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
           munec.x-=0.1;
           munec.setx(munec.getx());
            System.out.println("Valor en la traslacion de X: "+munec.x);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_UP){
            munec.y+=0.1;
            munec.sety(munec.gety());
            System.out.println("Valor en la traslacion de Y: "+munec.y);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
            munec.y-=0.1;
            munec.sety(munec.gety());
            System.out.println("Valor en la traslacion de Y: "+munec.y);
        }
        
        
        if(e.getKeyCode()== KeyEvent.VK_D){
            munec.w+=.4f;
            System.out.println("Valor en la escalacion de x: "+munec.w);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_A){
            munec.w-=.4f;
            System.out.println("Valor en la escalacion de x: "+munec.w);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_W){
            munec.h+=.4f;
            System.out.println("Valor en la escalacion de y: "+munec.h);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_S){
            munec.h-=.4f;
            System.out.println("Valor en la escalacion de y: "+munec.h);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_R){
            munec.rx+=.4f;
            System.out.println("Valor en la rotacion de x: "+munec.rx);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_T){
            munec.rx-=.4f;
            System.out.println("Valor en la rotacion de x: "+munec.rx);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_Y){
            munec.ry+=.4f;
            System.out.println("Valor en la rotacion de y: "+munec.ry);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_U){
            munec.ry-=.4f;
            System.out.println("Valor en la rotacion de y: "+munec.ry);
        }
         
         if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
            munec.x=0;
            munec.y=0;
            munec.w=1;
            munec.h=1;
            munec.rx=0;
            munec.ry=0;

        }   
    }

    public void keyReleased(KeyEvent ke) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

