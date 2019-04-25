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
public class Rueda {
    float x,y,z;
    float w,h,d;
    float rx,ry,rz;
    GL gl;
    Esfera base;
    Cubo tubo;
    Cilindro BaseP;
    Esfera caja1,caja2,caja3,caja4,caja5,caja6,caja7,caja8;
    Estrella estrella;


    public Rueda(float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, GL gl) {
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
        
        estrella=new Estrella(0,0f,0, 5.5f,5.5f,5.5f, 0,0,0,gl);
        caja1=new Esfera(10,0,0, 1f,0.49f,0f, 1, 20,20, 0,0,0,gl);
        caja2=new Esfera(20,70,0, 1f,0,0.49f, 1.3f, 20,20, 0,0,0,gl);
        caja3=new Esfera(35,-20,0, 0f,0.49f,1f, 1.8f, 20,20, 0,0,0,gl);
        caja5=new Esfera(40,30,0, 0f,1f,1f, 2, 20,20, 0,0,0,gl);
        caja4=new Esfera(50,-80,0, 1f,0f,0f,1.8f, 20,20, 0,0,0,gl);
        caja6=new Esfera(60,40,0, 0f,1f,0.49f, 1.8f, 20,20, 0,0,0,gl);
        caja7=new Esfera(70,-10,0, 0f,0f,1f, 1.3f, 20,20, 0,0,0,gl);
        caja8=new Esfera(80,50,0, 0.8f,0f,0.9f, 0.8f, 20,20, 0,0,0,gl);


    }    
    public void display(){
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, rz+=0.3);
        gl.glScalef(w, h, d);
        
        gl.glRotatef(rz, 0, 0, 0.1f);
        caja1.display();
        
        gl.glRotatef(rz, 0, 0, +0.001f);
        caja2.display();
        
        gl.glRotatef(rz, 0, 0, +0.5f);
        caja3.display();
    
        gl.glRotatef(rz, 0, 0, +0.005f);
        caja4.display();
        
        gl.glRotatef(rz, 0, 0, +0.5f);
        caja5.display();
        
        gl.glRotatef(rz, 0, 0, +0.00005f);
        caja6.display();
        
        gl.glRotatef(rz, 0, 0, +0.5f);
        caja7.display();
        
        gl.glRotatef(rz, 0, 0, +0.05f);
        caja8.display();
//        


        gl.glPopMatrix();
    }
    
    
    
}
