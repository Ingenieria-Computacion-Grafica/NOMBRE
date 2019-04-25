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
public class Esfera1 {
    GL gl;
    float c; //radio
    int slices, stacks;
    float x,y,z; // coordenadas xyz
    float r,g,b; //colores 
    float rx,ry,rz;  //rotacion 



    public Esfera1(float x, float y, float z, float r, float g, float b, float c, int slices, int stacks,
                  float rx, float ry, float rz,GL gl) {
        
        this.gl = gl;
        this.c = c;
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
        gl.glColor3f(r, g, b);
        
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz++, 0, 0, 1);
        
        GLU glu=new GLU();
        GLUquadric esfera=glu.gluNewQuadric(); 
        //GLU_FILL es para que se vea como solido, GLU_LINE para que se vea lineas
        //GLU_POINTS para que se vea como puntos y GLU_SIL... para que se vea la silueta
      //  glu.gluQuadricDrawStyle(esfera, GLU.GLU_LINE);
        gl.glLineWidth(1.2f);
        glu.gluQuadricDrawStyle(esfera, GLU.GLU_LINE);
       // glu.gluQuadricDrawStyle(esfera, GLU.GLU_SILHOUETTE);

        glu.gluSphere(esfera, c, slices, stacks);
        gl.glPopMatrix();

        
        
    }
    
}

