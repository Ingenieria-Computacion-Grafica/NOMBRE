/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import static java.lang.Math.PI;
import java.util.ArrayList;
import javax.media.opengl.GL;

/**
 *
 * @author Grace Mireya Pumisacho
 */
public class RuedaMoscovita {
    float x,y,z;
    float w,h,d;
    float rx,ry,rz;
    GL gl;
    
    Esfera base;
    Cilindro tubo;
    Cilindro BaseP;
    Rueda cajas1;
    Rueda cajas2;


    public RuedaMoscovita(float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, GL gl) {
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
        
        BaseP = new Cilindro(0,0,-3, 0.294f,0,0.510f, 0.2f,1.5f, 10,4,4, 90,0,0,gl);
        tubo = new Cilindro(0,-0.1f,-3, 0.294f,0,0.510f, 0.2f,0.2f, 3,8,8, 0,0,0,gl);
        
        base=new Esfera(0,0,0, 0.502f,0f,1, 0.8f, 8,8, 0,0,0,gl);
        
        cajas1=new Rueda(0,0,0, 1f,1,1,0,0,0,gl);
        cajas2=new Rueda(0,0,0, 1f,1,1,0,0,45,gl);



    }    
    public void display(){
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        tubo.display();
        BaseP.display();
        base.display();
        cajas1.display();

        cajas2.display();

        gl.glPopMatrix();
    }
    
    
    
}
