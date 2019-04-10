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
public class FIGURAS {

    float x, y, z;
    GL gl;

    public FIGURAS(float x, float y, float z, GL gl) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.gl = gl;
    }

    public void display() {

        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glScalef(x, y, z);

        gl.glBegin(gl.GL_QUADS);
        gl.glColor3f(0.29f, 0.50f, 0.19f);
        gl.glVertex3d(0.10f, 0.10f, 0);
        gl.glVertex3d(0.10f, 0.40f, 0);
        gl.glVertex3d(0.40f, 0.40f, 0);
        gl.glVertex3d(0.40f, 0.10f, 0);
        gl.glPopMatrix();

        gl.glEnd();
        // Letra U
        gl.glColor3f(0.29f, 0.10f, 0.59f);
        gl.glBegin(gl.GL_TRIANGLES);
        gl.glVertex3d(0.80f, 0.40f, 0);
        gl.glVertex3d(0.80f, 0.10f, 0);
        gl.glVertex3d(0.420f, 0.40f, 0);
        // gl.glVertex2d(110,10);

        gl.glEnd();

        gl.glPopMatrix();

    }

}
