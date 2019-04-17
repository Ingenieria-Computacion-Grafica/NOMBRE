/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

/**
 *
 * @author fing.labcom
 */
public class Esfera {
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    int slices, stacks;
    GL gl;

    public Esfera(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b, int slices, int stacks) {
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
        this.r = r;
        this.g = g;
        this.b = b;
        this.slices = slices;
        this.stacks = stacks;
       
    }
    
    public void Display(){
        GLU glu = new GLU();
        gl.glPushMatrix();
        gl.glColor3f(this.r, this.g, this.b);
        gl.glTranslatef(this.x, this.y, this.z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
//        gl.glTranslatef(this.x, this.y, this.z);
        gl.glScalef(this.w, this.h, this.d);
        GLUquadric esfera = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(esfera, GLU.GLU_FILL);
        glu.gluSphere(esfera, 1, slices, stacks);
        gl.glPopMatrix();
        gl.glEnd();
    }
    
    
    
}
