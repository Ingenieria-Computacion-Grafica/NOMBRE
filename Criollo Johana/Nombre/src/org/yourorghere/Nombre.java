package org.yourorghere;



import com.sun.opengl.util.Animator;
import java.awt.Frame;
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


/**
 *
 * @author UCE
 */
public class Nombre extends JFrame{
    public  GL gl;
    public GLU gl1;
    Figuras figu;
    Nomb letras;
    Mosaico mos;
    
    public  Nombre(){
        setTitle("Puntos");
        setSize(1400,1400);
        
        // Intancia de clase GraphicListener
        
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas= new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
        
    }
    
    public static void main(String args[]){
        Nombre frame = new Nombre();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
    }
    
    public class GraphicListener implements GLEventListener{

        @Override
        public void init(GLAutoDrawable arg0) {
            // Activar propiedades 
            gl= arg0.getGL();
//            gl.glEnable(gl.GL_BLEND);
//            gl.glBlendFunc(gl.GL_SRC_ALPHA,gl.GL_ONE_MINUS_CONSTANT_ALPHA); // para transparencia
//              gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
//            
            letras=new Nomb(0,0,gl);
            figu=new Figuras(0,0,gl);
            mos=new Mosaico(0,0,gl);
        }

        @Override
        public void display(GLAutoDrawable arg0) {
            gl1 = new GLU();
            gl = arg0.getGL();
            
            gl.glClearColor(0, 0, 1, 0);
            
            // Establecer los parametros de la proyección
            gl.glMatrixMode(gl.GL_PROJECTION);
            gl1.gluOrtho2D(0,200,0 ,150);
            
//            letras.display();
//            figu.display();
            mos.display();
            // Creación de linea
            // Definir el grosor de la linea
           
            

                
                
           

        }

        @Override
        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
            
        }

        @Override
        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
            
        }
        
    }
    
}
