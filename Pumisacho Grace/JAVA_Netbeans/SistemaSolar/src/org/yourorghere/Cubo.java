/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author Grace Mireya Pumisacho
 */
public class Cubo {
    float x,y,z;
    float r,g,b;
    float w,h,d;
    float rx,ry,rz;
    GL gl;

    public Cubo(float x, float y, float z, float r, float g, float b, 
            float w, float h, float d, float rx, float ry, float rz, GL gl) {
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
        
        
        //Cara FRONTAL
        gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(r,g,b);
           //gl.glColor3f(1,1,1);    // Set the current drawing color to light blue
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, 0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        
        
        //CARA TRACERA
        gl.glBegin(GL.GL_QUADS);
           // gl.glColor3f(1,0,0);    // Set the current drawing color to light blue ACTIVAMOS TEST D PROFUNDIDAD
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, -0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        
        
        //CARA DERECHA
        gl.glBegin(GL.GL_QUADS);
           //gl.glColor3f(0,1,0);
            gl.glVertex3f(0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        
        
        //cara IZQUIERDA
        gl.glBegin(GL.GL_QUADS);
        //gl.glColor3f(0,0,1);
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        
        
        //cara de SUPERIOR
        gl.glBegin(GL.GL_QUADS);
            //gl.glColor3f(0,0,0);
            gl.glVertex3f(0.5f, 0.5f, -0.5f);  // Top Left
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, 0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        
        
        //cara INFERIOR
        gl.glBegin(GL.GL_QUADS);
            //gl.glColor3f(0,1,1);
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Top Left
            gl.glVertex3f(-0.5f, -0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        
        //*****************************************************************
//
//        
//        //Cara FRONTAL
//        gl.glBegin(GL.GL_LINE_LOOP);
//        gl.glColor3f(0,0,0);
//           gl.glColor3f(0,0,0);    // Set the current drawing color to light blue
//            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Top Left
//            gl.glVertex3f(0.5f, 0.5f, 0.5f);   // Top Right
//            gl.glVertex3f(0.5f, -0.5f, 0.5f);  // Bottom Right
//            gl.glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom Left
//       //  Done Drawing The Quad
//        gl.glEnd();
////        
//        
//        //CARA TRACERA
//        gl.glBegin(GL.GL_LINE_LOOP);
//           // gl.glColor3f(1,0,0);    // Set the current drawing color to light blue ACTIVAMOS TEST D PROFUNDIDAD
//            gl.glVertex3f(-0.5f, 0.5f, -0.5f);  // Top Left
//            gl.glVertex3f(0.5f, 0.5f, -0.5f);   // Top Right
//            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom Right
//            gl.glVertex3f(-0.5f, -0.5f, -0.5f); // Bottom Left
//        // Done Drawing The Quad
//        gl.glEnd();
//        
//        
//        //CARA DERECHA
//        gl.glBegin(GL.GL_LINE_LOOP);
//           //gl.glColor3f(0,1,0);
//            gl.glVertex3f(0.5f, 0.5f, 0.5f);  // Top Left
//            gl.glVertex3f(0.5f, 0.5f, -0.5f);   // Top Right
//            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom Right
//            gl.glVertex3f(0.5f, -0.5f, 0.5f); // Bottom Left
//        // Done Drawing The Quad
//        gl.glEnd();
//        
//        
//        //cara IZQUIERDA
//        gl.glBegin(GL.GL_LINE_LOOP);
//        //gl.glColor3f(0,0,1);
//            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Top Left
//            gl.glVertex3f(-0.5f, 0.5f, -0.5f);   // Top Right
//            gl.glVertex3f(-0.5f, -0.5f, -0.5f);  // Bottom Right
//            gl.glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom Left
//        // Done Drawing The Quad
//        gl.glEnd();
//        
//        
//        //cara de SUPERIOR
//        gl.glBegin(GL.GL_LINE_LOOP);
//            //gl.glColor3f(0,0,0);
//            gl.glVertex3f(0.5f, 0.5f, -0.5f);  // Top Left
//            gl.glVertex3f(-0.5f, 0.5f, -0.5f);   // Top Right
//            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Bottom Right
//            gl.glVertex3f(0.5f, 0.5f, 0.5f); // Bottom Left
//        // Done Drawing The Quad
//        gl.glEnd();
//        
//        
//        //cara INFERIOR
//        gl.glBegin(GL.GL_LINE_LOOP);
//            //gl.glColor3f(0,1,1);
//            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Top Left
//            gl.glVertex3f(-0.5f, -0.5f, -0.5f);   // Top Right
//            gl.glVertex3f(-0.5f, -0.5f, 0.5f);  // Bottom Right
//            gl.glVertex3f(0.5f, -0.5f, 0.5f); // Bottom Left
//        // Done Drawing The Quad
//        gl.glEnd();
        
        gl.glPopMatrix();
    }
}

