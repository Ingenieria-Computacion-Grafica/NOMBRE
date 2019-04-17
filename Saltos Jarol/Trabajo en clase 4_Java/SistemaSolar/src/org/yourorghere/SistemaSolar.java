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
import java.awt.event.KeyListener;
import javax.media.opengl.GLCapabilities;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import com.sun.opengl.util.GLUT;
import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureIO;
import java.io.File;
import java.util.Hashtable;
import java.util.Random;

/**
 * Consulta_GLU.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel)
 * <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class SistemaSolar extends JFrame implements KeyListener {
        
    public static int ncam=1;
    Random rnd = new Random();
    GLUT glut;
    ESFERA sol, plan1, plan2, plan3, plan4, plan5, plan6, cam, luna1, luna2, luna3;
    float rotTras, rotStar, i,a1,b1,c1,a2,b2,c2,a3,b3,c3;
    float a4,b4,c4,a5,b5,c5,a6,b6,c6;
public  SistemaSolar(){
    
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
       SistemaSolar frame = new SistemaSolar();
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
        gl.glShadeModel(GL.GL_SMOOTH); 
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glEnable(GL.GL_BLEND);
        gl.glBlendFunc(GL.GL_SRC_ALPHA,GL.GL_ONE_MINUS_SRC_ALPHA);
        gl.glEnable(GL.GL_TEXTURE_2D);
        

//        Texture t1=TextureIO.newTexture(new File("sol.png"),false);//AQUI SE ALMACENAN LAS TECTURAS COMO SI FUERA EL DICCIONARIO
//        SistemaSolar.texturas.put("ladrillos",t1);
        sol = new ESFERA(0, 0, 0, 1, 1, 1, 90, 0, 0, 1, 1, 0, gl, 1f, 20, 20);
        plan1 = new ESFERA(2, 0, 0, 1, 1, 1, 80, 0, 0, 1, 0, 0, gl, .2f, 20, 20);
        plan2 = new ESFERA(3, 0, 0, 1, 1, 1, -83, 0, 0, 0, 1, 0.3f, gl, .4f, 20, 20);
        plan3 = new ESFERA(4.5f, 0, 0, 1, 1, 1,85, 0, 0, 0, 0, 1, gl, .5f, 20, 20);
        luna1 = new ESFERA(5.3f, 0, 0, 1, 1, 1,87, 0, 0, 1,1 , 1, gl, .05f, 20, 20);
        plan4 = new ESFERA(6.5f, 0, 0, 1, 1, 1, 86, 0, 0, 1 , 0, 1, gl, .4f, 20, 20);
        plan5 = new ESFERA(9, 0, 0, 1, 1, 1, -90, 0, 0, .3f, .3f, .3f, gl, .6f, 20, 20);
        luna2 = new ESFERA(10.1f, 0, 0, 1, 1, 1,87, 0, 0, 1,1 , 1, gl, .05f, 20, 20);
        plan6 = new ESFERA(12.5f, 0, 0, 1, 1, 1,87, 0, 0, .2f, .7f, 1, gl, .7f, 20, 20);
        luna3 = new ESFERA(7.9f, .2f, 0f, 1, 1, 1,87, 0, 0, 1f, 1f, 1, gl, .05f, 20, 20);
        
        cam = new ESFERA(0, 6, -10, 1, 1, 1, 0, 0, 80, 0, 1, 1, gl, .8f, 20, 20);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        glut = new GLUT();

        if (height <= 0) { // avoid a divide by zero error!

            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 30.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();
//         gl.glTranslatef(1.6f,0,0);
////         gl.glRotatef(rotTras*3, .5f, .5f, 0);
//        luna1.display1();
//        gl.glLoadIdentity();
        // Move the "drawing cursor" around
         GLU glu= new GLU ();   
         
//           
               glu.gluLookAt(cam.getx(),cam.gety(),cam.getz(),sol.setx(sol.getx()),sol.sety(sol.gety()),sol.setz(sol.getz()),0,1,0);
              
//                        glu.gluLookAt(luna1.x,luna1.y,luna1.z,sol.x,sol.y,sol.z,0,1,0);


            


//                gl.glLoadIdentity();
//        gl.glTranslatef(0, 0, -6); 
//        gl.glColor3f(1, 1, 1);
        gl.glRotatef(rotTras, 0, .5f, 0);
        
        sol.display1();  
        
        
         
        gl.glRotatef(rotTras*.001f, 0, .5f, 0);
        plan6.display();
        
//        glut.glutWireTorus(.15f,1f,20,20);
        plan6.rz+=.4f;
        
        
         
        gl.glRotatef(rotTras*.09f, 0, .5f, 0);
        plan5.display1();
        luna2.display1();
        luna3.display1();
        gl.glTranslatef(9, 0, 0); 
        gl.glScalef(1f,.1f,1f);
//        gl.glRotatef(rotTras*.09f, 0, .5f, 0);
        gl.glRotatef(90,1,0,0);
//        gl.glRotatef(rotTras*.01f, 0, .5f, 0);
        glut.glutWireTorus(.15f,1f,20,20);
//        gl.glRotatef(-rotTras*.01f, 0, .5f, 0);
        gl.glRotatef(-90,1,0,0);
         gl.glScalef(1f,10,1);
         gl.glTranslatef(-9, 0, 0);
        plan5.rz+=.6f;
        gl.glRotatef(rotTras*.08f, 0, .5f, 0);
        plan4.display();
        plan4.rz+=.8f;
        gl.glRotatef(rotTras*.2f, 0, .5f, 0);
        plan3.display();
        luna1.display1();
//       
        
        plan3.rz+=1f;
        gl.glRotatef(rotTras*.5f, 0, .5f, 0);
        plan2.display();
        plan2.rz+=2f;
        gl.glRotatef(rotTras*1.8f, 0, .5f, 0);
        plan1.display();
        plan1.rz+=4f;
        
        gl.glRotatef(-rotStar, 0, .5f, 0);
        gl.glScalef(.015f,.015f,.015f);
        for(int i=1;i<50;i++){          
        gl.glTranslatef(rnd.nextFloat()*(360.95f)-360.95f,10, rnd.nextFloat()*(360.3f*i)-360.95f);
//        gl.glRotatef(rnd.nextFloat()*(360.95f)-5.95f,0, 1, 0);
        gl.glRotatef(rotStar*i,0, 1, 0);
        gl.glColor3f(1,1,1);
        glut.glutWireIcosahedron();
         
         }
        rotTras += .4f;
        rotStar -= .08f;    
//        gl.glPushMatrix();
        //       gl.glLoadIdentity();
//       luna1.x=plan3.x;
//       luna1.y=plan3.y;
//       luna1.z=plan3.z;
////       gl.glTranslatef(-6.8f,0,0);
//       gl.glRotatef(rotTras,0.5f,0,0);
//       luna1.display();
//         gl.glPopMatrix();
//        gl.glLoadIdentity();
//        luna1.x=plan3.x;
//        luna1.y=plan3.y;
//        luna1.z=plan3.z;
////        gl.glTranslatef(1,0,0);
////        gl.glRotatef(rotStar,0,1,0);
//        luna1.display1();
         rotStar -= .08f;   
//        gl.glTranslatef(-.5f,0,0);
        
//        gl.glRotatef(rotTras*.5f, 2, .5f, 0);
//        luna1.display();
        
//        gl.glRotatef(rotTras*.5f, -2, -.5f, 0);
        gl.glLoadIdentity();
        gl.glTranslatef(cam.x,cam.y,cam.z);
        gl.glRotatef(cam.rx,1,0,0);
        gl.glRotatef(cam.ry,0,1,0);
        gl.glRotatef(cam.rz,0,0,1);
        gl.glScalef(cam.w,cam.h,cam.d);
//        cam.display();
        cam.x=(float) Math.cos(i)*8;
//        cam.z=(float) Math.sin(i)*8;
        cam.y=(float) Math.sin(i)*4;
//        cam.z=(float) Math.cos(i)*4;
//        cam.x=(float) Math.sin(i)*8;
       i+=.01f;
       
       

        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }
    
 
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
 }
    public void keyTyped(KeyEvent e) {
        
     
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
            System.out.println("Valor en la traslacion de Y: "+cam.z);
        }
        
        if(e.getKeyCode()== KeyEvent.VK_Z){
            cam.z-=0.1;
            cam.setz(cam.getz());
            System.out.println("Valor en la traslacion de Y: "+cam.z);
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
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
