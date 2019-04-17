/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;


public class Esphera {
    GL gl;
    float ra;//radio
    int slices, stacks;//son los cortes horizontales y verticales realizamos para hacer una esfera
    float x, y, z;
    float r, g, b;
    float rx,ry,rz;

    public Esphera(GL gl, float ra, int slices, int stacks, float x, float y, float z, float r, float g, float b) {
        this.gl = gl;
        this.ra=ra;
        this.r = r;
        this.slices = slices;
        this.stacks = stacks;
        this.x = x;
        this.y = y;
        this.z = z;
        this.r=r;
        this.g = g;
        this.b = b;
    }
    
    
    public void display(){
    gl.glTranslatef(x,y,z);     //Traslacion
    gl.glRotatef(rx,1,0,0);
    gl.glRotatef(ry,0,1,0);
    gl.glRotatef(rz,0,0,1);
    GLU glu=new GLU();
    GLUquadric esfera = glu.gluNewQuadric(); //renderizar conos, cilindros, y todo
//    glu.gluQuadricDrawStyle (esfera,GLU.GLU_FILL);//GLU_LINE, GLU_POINT, GLU_SILHOUETTE
    glu.gluQuadricDrawStyle (esfera,GLU.GLU_FILL);
//    glu.gluQuadricDrawStyle (esfera,GLU.GLU_SILHOUETTE);
    glu.gluSphere(esfera,ra,slices,stacks);//recibe el radio, numero de cortes horizontales y verticales
}
    
}
