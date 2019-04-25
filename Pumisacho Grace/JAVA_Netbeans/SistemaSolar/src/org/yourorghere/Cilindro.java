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
 * @author Grace Mireya Pumisacho
 */
public class Cilindro {
    GL gl;
    float r1,r2;
    float h;
    int slices, stacks;
    float x,y,z;
    float r,g,b;
    float rx,ry,rz;

    public Cilindro(float x, float y, float z, float r, float g, float b,
                    float r1, float r2, float h, int slices, int  stacks,float rx, float ry, float rz, GL gl) {
        
        this.gl = gl;
        this.r1 = r1;
        this.r2 = r2;
        this.h = h;
        this.slices = slices;
        this.stacks = stacks;
        this.x = x;
        this.y = y;
        this.z = z;
        this.r = r;
        this.g = g;
        this.b = b;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
    }

    
    public void display(){
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glColor3f(r,g,b);

        gl.glRotatef(rx, 1, 0,0);
        gl.glRotatef(ry, 0, 1,0);
        gl.glRotatef(rz, 0, 0,1);
          
        GLU glu=new GLU();
        GLUquadric cilindro=glu.gluNewQuadric();
       // glu.gluQuadricDrawStyle(cilindro, GLU.GLU_POINT);
       //
        gl.glLineWidth(2f);
        glu.gluQuadricDrawStyle(cilindro, GLU.GLU_FILL);
        glu.gluCylinder(cilindro, r1, r2, h, slices, stacks);
        gl.glPopMatrix();
       
    }
   
}

   
