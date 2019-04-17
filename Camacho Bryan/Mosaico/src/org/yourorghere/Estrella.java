/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author fing.labcom
 */
public class Estrella {
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    GL gl;

    public Estrella(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz) {
        this.gl = gl;
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.h = h;
        this.d = d;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
    }
    
    public void Display(){
        
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(0, 1, 0);
            gl.glVertex2f(-1, -1);
            gl.glColor3f(1, 1, 0);
            gl.glVertex2f(-1, 1);
            gl.glColor3f(0, 1, 0);
            gl.glVertex2f(1, 1);
            gl.glColor3f(1, 1, 0);
            gl.glVertex2f(1, -1);
        gl.glEnd();
        
        gl.glBegin(GL.GL_TRIANGLES);
            gl.glColor3f(1, 0, 1);
            gl.glVertex2d(-1, 1);
            gl.glVertex2d(0, 3);
            gl.glVertex2d(1, 1);
            
            gl.glColor3f(1, 0, 1);
            gl.glVertex2d(-1, -1);
            gl.glVertex2d(-4, 0);
            gl.glVertex2d(-1, 1);
            
            gl.glColor3f(1, 0, 1);
            gl.glVertex2d(1, 1);
            gl.glVertex2d(4, 0);
            gl.glVertex2d(1, -1);
            
            gl.glColor3f(1, 0, 1);
            gl.glVertex2d(1, -1);
            gl.glVertex2d(0, -4);
            gl.glVertex2d(-1, -1);
        
        gl.glEnd();
        gl.glPopMatrix();
    }
    
    public void Navegar(){
        rz+=20;
    }
    
    public void MoverI(){
        x-=0.01f;
        if (x <= -7) {
            x = 7;
            }
//        z+=2;
    }
    
    public void MoverD(){
        x+=0.01f;
        if (x >= 7) {
            x = -7;
            }
//        z+=2;
    }
    
    public void Crecer(){
        w+=0.05f;
        h+=0.05f;
        if (w >= 0.35f){
            w = 0.25f;
        }
        if (h >= 0.35f){
            h = 0.25f;
        }
    }
}
