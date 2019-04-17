/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.util.ArrayList;
import javax.media.opengl.GL;

/**
 *
 * @author User
 */
public class Estrellas {
    ArrayList<Esfera> estrella = new ArrayList<Esfera>();
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    GL gl;
//    Scanner sc = new Scanner(System.in);

    public Estrellas(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz) {
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
        for (int i = 0; i < 750; i+=4) {
            for (int j = 0; j < 750; j+=4) {
//                if (i%3==0) {
                    estrella.add(new Esfera(gl, -300+0.85f*i, -(-175+0.85f*j), 75, 0.1f, 0.1f, 0.1f, 0, 0, 0, 1, 1, 1, 10, 10));   
//                }
//                if (i%3==1) {
//                    estrella.add(new Esfera(gl, -2+0.85f*i, -(-20+0.85f*j), -120, 0.1f, 0.1f, 0.1f, 0, 0, 0, 1, 1, 1, 10, 10));    
//                }
//                if (i%3==2) {
//                    estrella.add(new Esfera(gl, -2+0.85f*i, -(-20+0.85f*j), -120, 0.1f, 0.1f, 0.1f, 0, 0, 0, 1, 1, 1, 10, 10));    
//                } 
            }
            
        }
    }
//    
    public void Display(){
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(this.rx, 1, 0, 0);
        gl.glRotatef(this.ry, 0, 1, 0);
        gl.glRotatef(this.rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        for (Esfera e: estrella) {
            e.Display();    
        }
        
        gl.glEnd();
        gl.glPopMatrix();     
        }
}
