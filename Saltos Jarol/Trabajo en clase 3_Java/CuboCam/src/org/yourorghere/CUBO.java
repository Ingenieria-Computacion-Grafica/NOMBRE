/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;//paquete donde se encuentra la clase que estoy definienndo

import javax.media.opengl.GL;
/**
 *
 * @author fing.labcom
 */
public class CUBO{
   float x,y,z;
    float r,g,b;
    float w, h, d;
    float rx, ry, rz;

    GL gl;

    public CUBO(float x, float y, float z, float rx, float ry, float rz, float r, float g, float b, float w, float h, float d, GL gl) {//constructor calt+insert
        this.x = x;
        this.y = y;
        this.z = z;
        this.rx=rx;
        this.ry=ry;
        this.rz=rz;
        this.gl=gl;
        this.r = r;
        this.g = g;
        this.b = b;
        this.w=w;
        this.h=h;
        this.d=d;
    }
    public void display (){
        gl.glPushMatrix();
        gl.glTranslatef(x,y,z);
        gl.glRotatef(rx,1,0,0);
        gl.glRotatef(ry,0,1,0);

        gl.glScalef(w,h,d);
            //CARA FRONTAL
            
        gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(r, g, b);    // Set the current drawing color to light blue
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, 0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //CARA TRACERA
        gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(r+0.2f, g-0.1f, b); 
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, -0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //CARA DERECHA
                gl.glBegin(GL.GL_QUADS);
        gl.glColor3f(r, g-0.2f, b); 
            gl.glVertex3f(0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //cara izquierda
        gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(r+0.3f, g-0.2f, b-0.6f); 
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //cara de encima
            gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(r+0.1f, g-0.1f, b-0.3f); 
            gl.glVertex3f(0.5f, 0.5f, -0.5f);  // Top Left
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, 0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //cara inferior
            gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(r+0.1f, g-0.05f, b+0.3f); 
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Top Left
            gl.glVertex3f(-0.5f, -0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        gl.glPopMatrix();
    }

    double getry() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.ry;
    }

    double getx() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.x;
    }

    double getrx() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.rx;
    }

    double gety() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.y;
    }

    double getz() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.z;
    }
        double setry(double ry) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.ry;
    }

    double setx(double x) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.x;
    }

    double setrx(double rx) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.rx;
    }

    double sety(double y) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.y;
    }

    double setz(double z) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.z;
    }
    
      
}
