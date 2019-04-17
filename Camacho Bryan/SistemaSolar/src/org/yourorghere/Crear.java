/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;

/**
 *
 * @author User
 */
public class Crear {
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    GL gl;

    public Crear(float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, GL gl) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.h = h;
        this.d = d;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.gl = gl;
    }
    
    public void Display(){
        GLUT glut = new GLUT();
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        
        //Sol
        gl.glLoadIdentity();
        gl.glColor3f(1, 1, 0);
        gl.glTranslatef(0, 0, -30);
        glut.glutWireSphere(10, 50, 50);
        
        //Mercurio
        gl.glLoadIdentity();
        gl.glColor3f(1, 0.5f, 0);
        gl.glTranslatef(20, 0, -30);
        glut.glutWireSphere(1.5f, 30, 30);
        
        //Venus
        gl.glLoadIdentity();
        gl.glColor3f(0, 0.3f, 0.3f);
        gl.glTranslatef(-30, 5, -30);
        glut.glutWireSphere(2, 30, 30);
        
        //Tierra
        gl.glLoadIdentity();
        gl.glColor3f(0, 0, 0.8f);
        gl.glTranslatef(40, 10, -55);
        glut.glutWireSphere(1.5f, 30, 30);
        
            //Luna
            gl.glLoadIdentity();
            gl.glColor3f(1, 1, 1);
            gl.glTranslatef(42f, 12f, -55);
            glut.glutWireSphere(0.5f, 30, 30);
        
        //Marte
        gl.glLoadIdentity();
        gl.glColor3f(1, 0.3f, 0);
        gl.glTranslatef(-50, -20, -20);
        glut.glutWireSphere(2.5f, 50, 50);
        
        //Jupiter
        gl.glLoadIdentity();
        gl.glColor3f(0.8f, 0.45f, 0);
        gl.glTranslatef(10, 35, -85);
        glut.glutWireSphere(4, 30, 30);
        
        //Saturno
        gl.glLoadIdentity();
        gl.glColor3f(0.6f, 0.7f, 0.6f);
        gl.glTranslatef(75, -15, -25);
        glut.glutWireSphere(5.5f, 50, 50);
            //Anillo
            gl.glLoadIdentity();
            gl.glColor3f(0.3f, 0.3f, 0.3f);
            gl.glTranslatef(75, -15, -25);
            gl.glRotatef(90, 1, 0, 0);
            glut.glutSolidTorus(1, 10, 10, 25);
        
        //Urano
        gl.glLoadIdentity();
        gl.glColor3f(0.3f, 0.5f, 0.3f);
        gl.glTranslatef(-150, 0, -80);
        glut.glutWireSphere(5, 50, 50);
            //Anillo
            gl.glLoadIdentity();
            gl.glColor3f(1, 1, 1);
            gl.glTranslatef(-150, 0, -80);
            gl.glRotatef(90, 1, 0, 0);
            glut.glutSolidTorus(1, 8, 10, 25);
            
        //Neptuno
        gl.glLoadIdentity();
        gl.glColor3f(0.25f, 0.15f, 0.15f);
        gl.glTranslatef(-30, 35, -15);
        glut.glutWireSphere(4.5f, 50, 50);
        
        //Pluton
        gl.glLoadIdentity();
        gl.glColor3f(0.355f, 0.355f, 0.355f);
        gl.glTranslatef(0, -50, -25);
        glut.glutWireSphere(2, 30, 30);
        
        gl.glEnd();
        gl.glPopMatrix();
    }
    
    public void Orbitar(){
        rz+=15;
    }
}
