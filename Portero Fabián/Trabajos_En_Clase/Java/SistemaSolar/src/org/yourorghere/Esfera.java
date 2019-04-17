/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import static org.yourorghere.SistemaSolar.escalaX;
import static org.yourorghere.SistemaSolar.escalaY;

/**
 *
 * @author Sebas
 */
public class Esfera {
    GL gl;
    float r;
    int slices, stacks;
    float x,y,z;
    float re,ge,be;
    float rx,ry,rz;
    float w,h,d;
    public Esfera(GL gl, float r, int slices, int stacks, 
            float x, float y, float z,float w,float h, float d,
            float re, float ge, float be, 
            float rx, float ry, float rz) {
        this.gl = gl;
        this.r = r;
        this.slices = slices;
        this.stacks = stacks;
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        this.h = h;
        this.d = d;        
        this.re = re;
        this.ge = ge;
        this.be = be;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
    }

    
    
    
    public void display(){
      
        gl.glTranslatef(x, y, z);
        gl.glScalef(w,h,d);  
      //  gl.glColor3f(re,ge,be);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        GLU glu=new GLU();
        GLUquadric esfera=glu.gluNewQuadric(); 
        //GLU_FILL es para que se vea como solido, GLU_LINE para que se vea lineas
        //GLU_POINTS para que se vea como puntos y GLU_SIL... para que se vea la silueta
        glu.gluQuadricDrawStyle(esfera, GLU.GLU_FILL);
        glu.gluSphere(esfera, r, slices, stacks);
    }
    
    
    
}
