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
public class Bola {

    float x,y,z;
    float r,g,b;

    float w,h,d;
    float rx,ry,rz;
    GL gl;
    
    Esfera circulo;

    public Bola(float x, float y, float z, float r,float g,float b,float w, float h, float d, float rx, float ry, float rz, GL gl) {
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
        
        circulo = new Esfera(0,0,0, r,g,b, 1,50,50, 0,0, 0,gl );
        
    }
    

    
    
    
    public void display(){
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        
        circulo.display();


        gl.glPopMatrix();
        
        
    }
    
}

