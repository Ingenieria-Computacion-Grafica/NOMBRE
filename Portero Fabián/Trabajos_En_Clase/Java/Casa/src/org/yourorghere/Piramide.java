/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author Fabian
 */
public class Piramide {
    float x,y,z;
    float r,g,b;
    float w,h,d;
    float rx,ry,rz;
    GL gl;

    public Piramide(GL gl,float x, float y, float z, float r, float g, float b,
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
        
        
        //Frontal
        gl.glBegin(GL.GL_TRIANGLES);
      //  gl.glColor3f(r,g,b);
        gl.glVertex3f(0, 1, 0);
        gl.glVertex3f(-0.5f, 0, 0.5f);
        gl.glVertex3f(0.5f, 0, 0.5f);
        gl.glEnd();
        //Lateral
        gl.glBegin(GL.GL_TRIANGLES);
     //   gl.glColor3f(0.5f,0,b);
        gl.glVertex3f(0, 1, 0);
        gl.glVertex3f(0.5f, 0, 0.5f);
        gl.glVertex3f(0.5f, 0, -0.5f);
        gl.glEnd();
        //Trasera
        gl.glBegin(GL.GL_TRIANGLES);
     //   gl.glColor3f(0,g,0.5f);
        gl.glVertex3f(0, 1, 0);
        gl.glVertex3f(0.5f, 0, -0.5f);
        gl.glVertex3f(-0.5f, 0, -0.5f);
        gl.glEnd();
        //Lateral
        gl.glBegin(GL.GL_TRIANGLES);
     //   gl.glColor3f(r,0,0.5f);
        gl.glVertex3f(0, 1, 0);
        gl.glVertex3f(-0.5f, 0, -0.5f);
        gl.glVertex3f(-0.5f, 0, 0.5f);
        gl.glEnd();
        
       //Base
       gl.glBegin(GL.GL_QUADS);
     //  gl.glColor3f(1,1,1);
       gl.glVertex3f(-0.5f, 0, -0.5f);
       gl.glVertex3f(0.5f, 0, -0.5f);
       gl.glVertex3f(0.5f, 0, 0.5f);
       gl.glVertex3f(-0.5f,0,0.5f);
       gl.glEnd();
       
       gl.glPopMatrix();
    }
}
