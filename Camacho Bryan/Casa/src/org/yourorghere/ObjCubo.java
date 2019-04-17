/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author User
 */
public class ObjCubo {
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    GL gl;
    
    public ObjCubo(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b){
        this.gl=gl;
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.h = h;
        this.d = d;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.r = r;
        this.g = g;
        this.b = b;
    }
    public void Display(){
//        gl.glLoadIdentity();
        gl.glPushMatrix();
        gl.glColor3f(this.r, this.g, this.b);
        gl.glTranslatef(this.x, this.y, this.z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(this.w, this.h, this.d);
        gl.glBegin(GL.GL_QUADS);
        
        //CARA FRONTAL
//        gl.glColor3f(0f, 1.0f, 0.0f);
        gl.glVertex3f(-1, 1, -1);
//        gl.glColor3f(1f, 1.0f, 0.0f);
        gl.glVertex3f(1, 1, -1);
//        gl.glColor3f(0f, 1.0f, 0.0f);
        gl.glVertex3f(1, -1, -1);
//        gl.glColor3f(1f, 1.0f, 0.0f);
        gl.glVertex3f(-1, -1, -1);
        
        //Cara Lateral Derecha
//        gl.glColor3f(0f, 1.0f, 0.0f);
        gl.glVertex3f(1, 1, -1);
//        gl.glColor3f(1f, 1.0f, 0.0f);
        gl.glVertex3f(1, 1, 1);
//        gl.glColor3f(0f, 1.0f, 0.0f);
        gl.glVertex3f(1, -1, 1);
//        gl.glColor3f(1f, 1.0f, 0.0f);
        gl.glVertex3f(1, -1, -1);
        
        //Cara Trasera
//        gl.glColor3f(0f, 1.0f, 0.0f);
        gl.glVertex3f(1, 1, 1);
//        gl.glColor3f(1f, 1.0f, 0.0f);
        gl.glVertex3f(-1, 1, 1);
//        gl.glColor3f(0f, 1.0f, 0.0f);
        gl.glVertex3f(-1, -1, 1);
//        gl.glColor3f(1f, 1.0f, 0.0f);
        gl.glVertex3f(1, -1, 1);
        
//        Cara Lateral Izquierda
//        gl.glColor3f(0f, 1.0f, 0.0f);
        gl.glVertex3f(-1, 1, 1);
//        gl.glColor3f(1f, 1.0f, 0.0f);
        gl.glVertex3f(-1, 1, -1);
//        gl.glColor3f(0f, 1.0f, 0.0f);
        gl.glVertex3f(-1, -1, -1);
//        gl.glColor3f(1f, 1.0f, 0.0f);
        gl.glVertex3f(-1, -1, 1);
        
        //Cara Superior
//        gl.glColor3f(0f, 1.0f, 0.0f);
        gl.glVertex3f(1, 1, -1);
//        gl.glColor3f(1f, 1.0f, 0.0f);
        gl.glVertex3f(1, 1, 1);
//        gl.glColor3f(0f, 1.0f, 0.0f);
        gl.glVertex3f(-1, 1, 1);
//        gl.glColor3f(1f, 1.0f, 0.0f);
        gl.glVertex3f(-1, 1, -1);
        
        //Cara Inferior
//        gl.glColor3f(0f, 1f, 0.0f);
        gl.glVertex3f(1, -1, -1);
//        gl.glColor3f(1f, 1f, 0.0f);
        gl.glVertex3f(1, -1, 1);
//        gl.glColor3f(0f, 1f, 0.0f);
        gl.glVertex3f(-1, -1, 1);
//        gl.glColor3f(1f, 1f, 0.0f);
        gl.glVertex3f(-1, -1, -1);
        
//        this.rx += 0.2f;
//        this.ry += 0.02f;
//        this.rz += 0.02f;
        gl.glEnd();
        gl.glPopMatrix();
    }
}
