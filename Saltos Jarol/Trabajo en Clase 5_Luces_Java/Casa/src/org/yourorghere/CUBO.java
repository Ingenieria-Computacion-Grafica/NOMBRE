/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;//paquete donde se encuentra la clase que estoy definienndo

import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureIO;
import java.io.File;
import java.io.IOException;
import javax.media.opengl.GL;

/**
 *
 * @author fing.labcom
 */
public class CUBO  {

    float anglex=0,angley=0,x,y,z,w,h,d,rx,ry,rz;
    MATERIAL m;
    float escala=1;
    GL gl;

      public CUBO(float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, MATERIAL m,GL gl) throws IOException {//constructor calt+insert
       this.x=x;
       this.y=y;
       this.z=z;
       this.w=w;
       this.h=h;
       this.d=d;
       this.rx=rx;
       this.ry=ry;
       this.rz=rz;
       this.m=m;
       this.gl=gl;

}

    public void display (){
//
if(this.m!=null){
//    System.out.println("Activando material");
//    System.out.println(this.m);
    this.m.Activar();
}


     
//        this.tex.enable();
//        this.tex.bind();
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w, h, d);
            //CARA FRONTAL
        gl.glBegin(GL.GL_QUADS);
        gl.glNormal3f(0,0,1);       
//        gl.glTexCoord2f(1, 1);
//        gl.glVertex3f(1, 1, -1);
           // Set the current drawing color to light blue
            gl.glVertex3f(-0.25f, 0.25f, 0.25f);  // Top Left
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(0.25f, 0.25f, 0.25f);   // Top Right
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(0.25f, -0.25f, 0.25f);  // Bottom Right
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(-0.25f, -0.25f, 0.25f); // Bottom Left
            gl.glTexCoord2f(0, 0);
// Done Drawing The Quad
        gl.glEnd();
        
        gl.glBegin(GL.GL_LINE_LOOP);
//            gl.glColor3f(0, 0,0);    // Set the current drawing color to light blue
            gl.glVertex3f(-0.25f, 0.25f, 0.25f);  // Top Left
            gl.glVertex3f(0.25f, 0.25f, 0.25f);   // Top Right
            gl.glVertex3f(0.25f, -0.25f, 0.25f);  // Bottom Right
            gl.glVertex3f(-0.25f, -0.25f, 0.25f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //CARA TRACERA
        gl.glBegin(GL.GL_QUADS);
//            gl.glColor3f(r+0.2f, g-0.1f, b); 
            gl.glNormal3f(0,0,-1);
            //gl.glColor3f(r, g, b);
            gl.glVertex3f(-0.25f, 0.25f, -0.25f);  // Top Left
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(0.25f, 0.25f, -0.25f);   // Top Right
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(0.25f, -0.25f, -0.25f);  // Bottom Right
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(-0.25f, -0.25f, -0.25f); // Bottom Left
            gl.glTexCoord2f(0, 0);
        // Done Drawing The Quad
        gl.glEnd();
        gl.glBegin(GL.GL_LINE_LOOP);
           // gl.glColor3f(0,0,0);
             gl.glVertex3f(-0.25f, 0.25f, -0.25f);  // Top Left
            gl.glVertex3f(0.25f, 0.25f, -0.25f);   // Top Right
            gl.glVertex3f(0.25f, -0.25f, -0.25f);  // Bottom Right
            gl.glVertex3f(-0.25f, -0.25f, -0.25f); // Bottom Left
            gl.glEnd();
        //CARA DERECHA
                gl.glBegin(GL.GL_QUADS);
       //     gl.glColor3f(r, g-0.2f, b); 
       gl.glNormal3f(1,0,0);
        //gl.glColor3f(r, g, b);
            gl.glVertex3f(0.25f, 0.25f, 0.25f);  // Top Left
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(0.25f, 0.25f, -0.25f);   // Top Right
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(0.25f, -0.25f, -0.25f);  // Bottom Right
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(0.25f, -0.25f, 0.25f); // Bottom Left
            gl.glTexCoord2f(0, 0);
        // Done Drawing The Quad
        gl.glEnd();
        
            gl.glBegin(GL.GL_LINE_LOOP);
           // gl.glColor3f(0,0,0);
       //     gl.glColor3f(r, g-0.2f, b); 
            gl.glVertex3f(0.25f, 0.25f, 0.25f);  // Top Left
            gl.glVertex3f(0.25f, 0.25f, -0.25f);   // Top Right
            gl.glVertex3f(0.25f, -0.25f, -0.25f);  // Bottom Right
            gl.glVertex3f(0.25f, -0.25f, 0.25f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();        
        
        //cara izquierda
        gl.glBegin(GL.GL_QUADS);
 
 //           gl.glColor3f(r+0.3f, g-0.2f, b-0.6f); 
            gl.glNormal3f(-1,0,0);
         //   gl.glColor3f(r, g, b);
            gl.glVertex3f(-0.25f, 0.25f, 0.25f);  // Top Left
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(-0.25f, 0.25f, -0.25f);   // Top Right
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(-0.25f, -0.25f, -0.25f);  // Bottom Right
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(-0.25f, -0.25f, 0.25f); // Bottom Left
            gl.glTexCoord2f(0, 0);
        // Done Drawing The Quad
        gl.glEnd();
        
            gl.glBegin(GL.GL_LINE_LOOP);
            //gl.glColor3f(0,0,0);
 //           gl.glColor3f(r+0.3f, g-0.2f, b-0.6f); 
            gl.glVertex3f(-0.25f, 0.25f, 0.25f);  // Top Left
        
            gl.glVertex3f(-0.25f, 0.25f, -0.25f);   // Top Right
            gl.glVertex3f(-0.25f, -0.25f, -0.25f);  // Bottom Right
            gl.glVertex3f(-0.25f, -0.25f, 0.25f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //cara de encima
            gl.glBegin(GL.GL_QUADS);
            gl.glNormal3f(0,1,0);
 //           gl.glColor3f(r+0.1f, g-0.1f, b-0.3f); 
          //  gl.glColor3f(r, g, b);
            gl.glVertex3f(0.25f, 0.25f, -0.25f);  // Top Left
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(-0.25f, 0.25f, -0.25f);   // Top Right
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(-0.25f, 0.25f, 0.25f);  // Bottom Right
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(0.25f, 0.25f, 0.25f); // Bottom Left
            gl.glTexCoord2f(0, 0);
        // Done Drawing The Quad
        gl.glEnd();
        
                    gl.glBegin(GL.GL_LINE_LOOP);
                    //gl.glColor3f(0,0,0);
 //           gl.glColor3f(r+0.1f, g-0.1f, b-0.3f); 
            gl.glVertex3f(0.25f, 0.25f, -0.25f);  // Top Left
            
            gl.glVertex3f(-0.25f, 0.25f, -0.25f);   // Top Right
            gl.glVertex3f(-0.25f, 0.25f, 0.25f);  // Bottom Right
            gl.glVertex3f(0.25f, 0.25f, 0.25f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //cara inferior
            gl.glBegin(GL.GL_QUADS);
            gl.glNormal3f(0,-1,0);
          //  gl.glColor3f(r, g, b);
 //           gl.glColor3f(r+0.1f, g-0.05f, b+0.3f); 
            gl.glVertex3f(0.25f, -0.25f, -0.25f);  // Top Left
            gl.glTexCoord2f(0, 1);
            gl.glVertex3f(-0.25f, -0.25f, -0.25f);   // Top Right
            gl.glTexCoord2f(1, 1);
            gl.glVertex3f(-0.25f, -0.25f, 0.25f);  // Bottom Right
            gl.glTexCoord2f(1, 0);
            gl.glVertex3f(0.25f, -0.25f, 0.25f); // Bottom Left
            gl.glTexCoord2f(0, 0);
        // Done Drawing The Quad
        gl.glEnd();
        
            gl.glBegin(GL.GL_LINE_LOOP);
          //  gl.glColor3f(0,0,0);
 //           gl.glColor3f(r+0.1f, g-0.05f, b+0.3f); 
            gl.glVertex3f(0.25f, -0.25f, -0.25f);  // Top Left
            gl.glVertex3f(-0.25f, -0.25f, -0.25f);   // Top Right
            gl.glVertex3f(-0.25f, -0.25f, 0.25f);  // Bottom Right
            gl.glVertex3f(0.25f, -0.25f, 0.25f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        
        
      gl.glPopMatrix();
   
    }
  
    
}























