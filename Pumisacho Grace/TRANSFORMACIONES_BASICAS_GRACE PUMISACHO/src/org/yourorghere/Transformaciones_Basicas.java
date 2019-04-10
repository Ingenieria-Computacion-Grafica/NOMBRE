package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

// Librerias para teclas
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Llamar las funciones viculada a las transformaciones
import com.sun.opengl.util.Animator;

/**
 *
 * @author UCE
 */
public class Transformaciones_Basicas extends JFrame implements KeyListener{
    
    static  GL gl;
    static GLU glu;
    
    // Variables para las transformaciones
    
    private static  float trasladaX=0;
    private static  float trasladaY=0;
    
    private static  float escalaX=1;
    private static  float escalaY=1;
    
    private static  float rotarX=0;
    private static  float rotarY=0;
    
    public  Transformaciones_Basicas(){
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
    
    public static void main(String args[]){
        Transformaciones_Basicas frame = new Transformaciones_Basicas();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

   
    
    public class GraphicListener implements GLEventListener{

        @Override
        public void init(GLAutoDrawable arg0) {
            // Activar propiedades 
            gl= arg0.getGL();
            gl.glEnable(gl.GL_BLEND);
            gl.glBlendFunc(gl.GL_SRC_ALPHA,gl.GL_ONE_MINUS_CONSTANT_ALPHA);
            
        }

        @Override
        public void display(GLAutoDrawable arg0) {
            glu = new GLU();
            gl = arg0.getGL();
            
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
            gl.glLineWidth(5f);
            // Definir el grosor de los puntos
            gl.glPointSize(3.0f);
//            gl.glColor3f(.05f,1,0);
            
            // Matriz Indentidad -- importante
            gl.glLoadIdentity();
            
            // Aplicar movimiento al cuadrado
            gl.glTranslatef(trasladaX-1, trasladaY-1, 0);
            gl.glScalef(escalaX/100, escalaY/100, 0);
            gl.glRotatef(rotarX, 1, 0, 0);
            gl.glRotatef(rotarY, 0, 1, 0);
            
            // Creacion
            // Cuadrados
                         gl.glBegin(gl.GL_QUADS);
             gl.glColor3f(1,0f,0.3f);
                gl.glVertex2d(67,100);
                gl.glVertex2d(100,68);
                gl.glVertex2d(43,30);
                gl.glVertex2d(10,64);    
            gl.glEnd();
            

            gl.glBegin(gl.GL_LINES);
            gl.glColor3f(1,0f,1f);
                gl.glVertex2d(10, 100);
                gl.glVertex2d(150, 100);
                gl.glVertex2d(150, 10);
                gl.glVertex2d(10, 10);
                gl.glVertex2d(150, 100);
                gl.glVertex2d(150, 10);
                gl.glVertex2d(10, 10);
                gl.glVertex2d(10, 100);
               
            gl.glEnd();
            

             gl.glBegin(gl.GL_QUADS);
             gl.glColor3f(.09f,1,1);
                gl.glVertex2d(150,10);
                gl.glVertex2d(150,68);
                gl.glVertex2d(100,68);
                gl.glVertex2d(100,10);    
            gl.glEnd();
            
            
            gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(10, 10);
                gl.glVertex2d(150, 100);
            gl.glEnd();
            
            
            gl.glBegin(gl.GL_TRIANGLES);
            gl.glColor3f(.6f,0.9f,0.2f);
                gl.glVertex2d(10,10);
                gl.glVertex2d(100,68);
                gl.glVertex2d(100,10);
               // gl.glVertex2d(110,10);
            gl.glEnd();
            
            gl.glBegin(gl.GL_TRIANGLES);
            gl.glColor3f(.6f,0.5f,0.9f);
                gl.glVertex2d(100,68);
                gl.glVertex2d(150,68);
                gl.glVertex2d(150,100);
               // gl.glVertex2d(110,10);
            gl.glEnd();
            
            gl.glBegin(gl.GL_TRIANGLES);
            gl.glColor3f(.2f,0.7f,0.3f);
                gl.glVertex2d(10,10);
                gl.glVertex2d(42,31);
                gl.glVertex2d(10,65);
               // gl.glVertex2d(110,10);
            gl.glEnd();
            
            gl.glBegin(gl.GL_TRIANGLES);
            gl.glColor3f(.9f,0.6f,0.4f);
                gl.glVertex2d(10,64);
                gl.glVertex2d(67,100);
                gl.glVertex2d(10,100);
               // gl.glVertex2d(110,10);
            gl.glEnd();
            
            gl.glBegin(gl.GL_TRIANGLES);
            gl.glColor3f(.7f,0.9f,0.6f);
                gl.glVertex2d(100,67);
                gl.glVertex2d(67,100);
                gl.glVertex2d(150,100);
               // gl.glVertex2d(110,10);
            gl.glEnd();
            
            

            // Para que se ejecute correctamente subrutinas
            gl.glFlush();

             
        }

        public void DibujarHexagono(GL gl,float x1, float y1,float x2, float y2,float x3, float y3,float x4, float y4,float x5, float y5,float x6, float y6){
            gl.glBegin(gl.GL_POLYGON);
            gl.glVertex2d(x1, y1);
            gl.glVertex2d(x2, y2);
            gl.glVertex2d(x3, y3);
            gl.glVertex2d(x4, y4);
            gl.glVertex2d(x5, y5);
            gl.glVertex2d(x6, y6);
            gl.glEnd();
       
        }
        
        @Override
        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
            
        }

        @Override
        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
            
        }
        
    }
    
    
     @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_RIGHT){
            trasladaX+=0.1;
            System.out.println("Valor en la traslacion de X: "+trasladaX);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            trasladaX-=0.1;
            System.out.println("Valor en la traslacion de X: "+trasladaX);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_UP){
            trasladaY+=0.1;
            System.out.println("Valor en la traslacion de Y: "+trasladaX);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_DOWN){
            trasladaY-=0.1;
            System.out.println("Valor en la traslacion de Y: "+trasladaX);
        }
        
        
        if(e.getKeyCode()== KeyEvent.VK_D){
            escalaX+=1f;
            System.out.println("Valor en la escalacion de x: "+trasladaX);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_A){
            escalaX-=1f;
            System.out.println("Valor en la escalacion de x: "+trasladaX);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_W){
            escalaY+=1f;
            System.out.println("Valor en la escalacion de y: "+trasladaX);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_S){
            escalaY-=1f;
            System.out.println("Valor en la escalacion de y: "+trasladaX);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_R){
            rotarX+=2f;
            System.out.println("Valor en la rotacion de x: "+trasladaX);
        }
        
         if(e.getKeyCode()== KeyEvent.VK_T){
            rotarX-=2f;
            System.out.println("Valor en la rotacion de x: "+trasladaX);
        }
         
        if(e.getKeyCode()== KeyEvent.VK_Y){
            rotarY+=1f;
            System.out.println("Valor en la rotacion de y: "+trasladaX);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_U){
            rotarY-=1f;
            System.out.println("Valor en la rotacion de y: "+trasladaX);
        }

         
         if(e.getKeyCode()== KeyEvent.VK_ESCAPE){
            trasladaX=0;
            trasladaY=0;
            escalaX=1;
            escalaY=1;
            rotarX=0;
            rotarY=1;

        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}

