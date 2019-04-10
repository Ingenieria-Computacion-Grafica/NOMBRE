/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author Grace
 */
class MOSAICO {
    float x,y,z;
    GL gl;

    public MOSAICO (float x, float y, float z, GL gl) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.gl = gl;
    }
    
    public void display(){
        
        gl.glPushMatrix();
        //gl.glTranslatef(x-1,y-1,z);
        gl.glScalef(x/100, y/100, z);
    
    
    gl.glLineWidth(2);
             gl.glBegin(gl.GL_QUADS);
             gl.glColor3f(1,0f,0.3f);
                gl.glVertex2d(67,100);
                gl.glVertex2d(100,68);
                gl.glVertex2d(43,30);
                gl.glVertex2d(10,64);    
            gl.glEnd();
            

            gl.glBegin(gl.GL_LINES);
            gl.glColor3f(1,0f,1f);
                gl.glVertex2d(10, 100);
                gl.glVertex2d(150, 100);
                gl.glVertex2d(150, 10);
                gl.glVertex2d(10, 10);
                gl.glVertex2d(150, 100);
                gl.glVertex2d(150, 10);
                gl.glVertex2d(10, 10);
                gl.glVertex2d(10, 100);
               
            gl.glEnd();
            

             gl.glBegin(gl.GL_QUADS);
             gl.glColor3f(.09f,1,1);
                gl.glVertex2d(150,10);
                gl.glVertex2d(150,68);
                gl.glVertex2d(100,68);
                gl.glVertex2d(100,10);    
            gl.glEnd();
            
            
            gl.glBegin(gl.GL_LINES);
                gl.glVertex2d(10, 10);
                gl.glVertex2d(150, 100);
            gl.glEnd();
            
            gl.glPopMatrix();
        
    }
    
}