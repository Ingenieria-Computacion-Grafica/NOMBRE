/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author Grace Mireya Pumisacho
 */
public class Estrella {
    
    float x,y,z;

    float w,h,d;
    float rx,ry,rz;
    GL gl;
    Cubo cuerpo;
//    Cubo cuerpo1;
    Cilindro punta1, punta2, punta3, punta4;

    public Estrella(float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, GL gl) {
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

        punta1 = new Cilindro(0,0.8f,0, 1f,1f,1f, 0.005f,0.1f,0.8f, 4,1, 90,0,45,gl);
        punta2 = new Cilindro(0,-0.8f,0, 1f,1f,1f, 0.005f,0.1f,0.8f, 4,1, -90,0,45,gl);
        punta3 = new Cilindro(-0.8f,0f,0, 1f,1f,1f, 0.005f,0.1f,0.8f, 4,1, 90,90,45,gl);
        punta4 = new Cilindro(0.8f,0f,0, 1f,1f,1f, 0.005f,0.1f,0.8f, 4,1, 90,-90,45,gl);



    }

    
    
    public void display(){
        
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        
        punta1.display();
        punta2.display();
        punta3.display();
        punta4.display();

        gl.glPopMatrix();
    }
    
//    public void actuar() {
//
//        ry += 2.5;
//        z += 0.6f;
//
//        if (z > 30) {
//            z = -100;
//        }
//    }
//    
//    
}
