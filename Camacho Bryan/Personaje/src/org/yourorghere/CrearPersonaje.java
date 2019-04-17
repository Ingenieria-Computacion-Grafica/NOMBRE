/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author User
 */
public class CrearPersonaje {
    Cilindro cuerpo, bi, bd, pi, pd, nariz, sombrero;
    Cubo pie_i, pie_d;
    Esfera cabeza, ojo_i, ojo_d, mi, md;
    float x, y, z;
    float w, h, d;
    float rx, ry, rz;
    GL gl;

    public CrearPersonaje(float x, float y, float z, float w, float h, float d, float rx, float ry, float rz, GL gl) {
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
        this.cuerpo = new Cilindro(gl, 0, 0, 0, 0.75f, 0.75f, 3, 90, 0, 0, 0, 0, 1, 20, 20, 1, 1);
        this.bi = new Cilindro(gl, -1, -1, 0, 0.4f, 0.4f, 1.2f, 0, -45, 0, 1, 1, 0, 10, 10, 1, 1);
        this.bd = new Cilindro(gl, 1, -1, 0, 0.4f, 0.4f, 1.2f, 0, 45, 0, 1, 1, 0, 10, 10, 1, 1);
        this.pi = new Cilindro(gl, -0.5f, -3, 0, 0.35f, 0.35f, 1.75f, 90, 0, 0, 0, 0.5f, 0, 20, 20, 1, 1);
        this.pd = new Cilindro(gl, 0.5f, -3, 0, 0.35f, 0.35f, 1.75f, 90, 0, 0, 0, 0.5f, 0, 20, 20, 1, 1);
        this.pie_i = new Cubo(gl, -0.5f, -5, 0, 0.4f, 0.2f, 0.8f, 0, 0, 0, 1, 0.5f, 0);
        this.pie_d = new Cubo(gl, 0.5f, -5, 0, 0.4f, 0.2f, 0.8f, 0, 0, 0, 1, 0.5f, 0);
        this.cabeza = new Esfera(gl, 0, 0.7f, 0, 0.8f, 0.8f, 0.8f, 0, 0, 0, 1, 1, 1, 7, 7);
        this.ojo_i = new Esfera(gl, 0.3f, 0.9f, 0.7f, 0.3f, 0.3f, 0.15f, 0, 0, 0, 0, 0, 0, 5, 5);
        this.ojo_d = new Esfera(gl, -0.3f, 0.9f, 0.7f, 0.3f, 0.3f, 0.15f, 0, 0, 0, 0, 0, 0, 5, 5);
        this.nariz = new Cilindro(gl, 0, 0.45f, 0.7f, 0.15f, 0.15f, 0.75f, 0, 0, 0, 1, 0.5f, 0, 5, 5, 0, 1);
        this.sombrero = new Cilindro(gl, 0, 1, 0, 0.4f, 0.4f, 1.75f, -90, 0, 0, 0, 1, 0.75f, 20, 20, 0, 1);
        this.mi = new Esfera(gl, -1.9f, -1, 0.8f, 0.4f, 0.4f, 0.4f, 0, 0, 0, 1, 1, 1, 7, 7);
        this.md = new Esfera(gl, 1.9f, -1, 0.8f, 0.4f, 0.4f, 0.4f, 0, 0, 0, 1, 1, 1, 7, 7);
    }
    
    public void Display(){
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        this.cuerpo.Display();
        this.bi.Display();
        this.bd.Display();
        this.pi.Display();
        this.pd.Display();
        this.pie_i.Display();
        this.pie_d.Display();
        this.cabeza.Display();
        this.ojo_i.Display();
        this.ojo_d.Display();
        this.nariz.Display();
        this.sombrero.Display();
        this.mi.Display();
        this.md.Display();
        gl.glEnd();
        gl.glPopMatrix();
    }
    
    public void Bailar(){
        ry+=1;
    }
    
    public void Avanzar(){
        z+=0.03f;
        if (z>=5) {
            z = -20;
        }
    }
    
    public void Regresar(){
        z-=0.03f;
        if (z<=-30) {
            z = 10;
        }   
    }    
}
