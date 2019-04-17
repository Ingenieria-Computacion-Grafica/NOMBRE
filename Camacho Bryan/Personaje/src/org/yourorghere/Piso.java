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
 * @author Usuario
 */
public class Piso {
    ArrayList<Cubo> valdosa = new ArrayList<Cubo>();
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    GL gl;
//    Scanner sc = new Scanner(System.in);

    public Piso(GL gl, float x, float y, float z, float w, float h, float d, float rx, float ry, float rz) {
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
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 30; j++) {
                if (i%3==0) {
                    valdosa.add(new Cubo(gl, -2+0.85f*i, -4, -(-20+0.85f*j), 0.4f, 0, 0.4f, 0, 0, 0, 0, 1, 0));   
                }
                if (i%3==1) {
                    valdosa.add(new Cubo(gl, -2+0.85f*i, -4, -(-20+0.85f*j), 0.4f, 0, 0.4f, 0, 0, 0, 0, 0.5f, 0.5f));   
                }
                if (i%3==2) {
                    valdosa.add(new Cubo(gl, -2+0.85f*i, -4, -(-20+0.85f*j), 0.4f, 0, 0.4f, 0, 0, 0, 0, 1, 0.5f));   
                } 
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
        for (Cubo v: valdosa) {
            v.Display();    
        }
        
        gl.glEnd();
        gl.glPopMatrix();     
        }
}     

