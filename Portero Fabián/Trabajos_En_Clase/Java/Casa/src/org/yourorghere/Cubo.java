/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author  TIM
 */
public class Cubo {
    
      float x,y,z;
    float r,g,b;
    float w,h,d;
    float rx,ry,rz;
    GL gl;

    public Cubo(GL gl,float x, float y, float z, float r, float g, float b, 
            float w, float h, float d, float rx, float ry, float rz) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
        this.g = g;
        this.b = b;
        this.w = w;
        this.h = h;
        this.d = d;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.gl = gl;
    }

   
    
    public void display(){
        

        gl.glPushMatrix();
        
        
        gl.glTranslatef(x, y, z);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        
         gl.glBegin(GL.GL_QUADS);
         
         //Frontal
              // Set the current drawing color to light blue
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, 0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //CARA TRACERA
        gl.glBegin(GL.GL_QUADS);
              // Set the current drawing color to light blue ACTIVAMOS TEST D PROFUNDIDAD
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, -0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //CARA DERECHA
                gl.glBegin(GL.GL_QUADS);
          
            gl.glVertex3f(0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //cara izquierda
        gl.glBegin(GL.GL_QUADS);
           
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //cara de encima
            gl.glBegin(GL.GL_QUADS);
           
            gl.glVertex3f(0.5f, 0.5f, -0.5f);  // Top Left
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, 0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //cara inferior
            gl.glBegin(GL.GL_QUADS);
           
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Top Left
            gl.glVertex3f(-0.5f, -0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        
        //29/6/18
        gl.glPopMatrix();
    }
}
