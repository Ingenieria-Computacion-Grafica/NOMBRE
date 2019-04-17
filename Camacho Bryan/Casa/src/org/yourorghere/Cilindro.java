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
public class Cilindro {
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    float r, g, b;
    int slices, stacks;
    double rs, ri;
    GL gl;

    public Cilindro(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, float r, float g, float b, int slices, int stacks, double rs, double ri) {
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
        this.rs = rs;
        this.ri = ri;
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
        GLUquadric cilindro = glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(cilindro, GLU.GLU_FILL);
        glu.gluCylinder(cilindro, ri, rs, 1, slices, stacks);
        gl.glPopMatrix();
        gl.glEnd();
    }
    
}
