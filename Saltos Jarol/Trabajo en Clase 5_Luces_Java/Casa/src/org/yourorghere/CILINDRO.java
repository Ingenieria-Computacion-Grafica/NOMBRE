/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;
import com.sun.opengl.util.texture.Texture;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
/**
 *
 * @author fing.labcom
 */
public class CILINDRO {
    float r1,r2,x,y,z,w,h,d,rx,ry,rz;
    int slices, stacks;
    float ha;
    GL gl;
    MATERIAL m;
    Texture t;
//
    public CILINDRO( float x, float y, float z,float w, float h, float d,float rx, float ry, float rz,MATERIAL m,GL gl, float r1, float r2,float ha, int slices, int stacks) {
        this.x=x;
        this.y=y;
        this.z=z;
        this.w=w;
        this.h=h;
        this.d=d;
        this.rx=rx;
        this.ry=ry;
        this.rz=rz;
        this.gl=gl;
        this.r1 = r1;
        this.r2 = r2;
        this.m=m;
        this.slices = slices;
        this.stacks = stacks;//
        this.ha=ha;
        this.t=null;
//        this.x = x;
//        this.y = y;
//        this.z = z;
//        this.r = r;
//        this.g = g;
//        this.b = b;
//        this.gl = gl;

//        this.rx=rx;
//        this.ry=ry;
//        this.rz=rz;
    
    }

    public void display(){
if(this.m!=null){
    this.m.Activar();
} 
    gl.glPushMatrix();
    gl.glTranslatef(x,y,z);
    gl.glRotatef(rx,1,0,0);
    gl.glRotatef(ry,0,1,0);
    gl.glRotatef(rz,0,0,1);
    GLU glu=new GLU();
    GLUquadric cilin = glu.gluNewQuadric(); //renderizar conos, cilindros, y todo
//    glu.gluQuadricDrawStyle (esfera,GLU.GLU_FILL);//GLU_LINE, GLU_POINT, GLU_SILHOUETTE
    glu.gluQuadricDrawStyle (cilin,GLU.GLU_FILL);
//    glu.gluQuadricDrawStyle (esfera,GLU.GLU_SILHOUETTE);
//    glu.gluQuadricDrawStyle (cilin,GLU.GLU_FILL);
    glu.gluCylinder(cilin, r1, r2, ha, slices, stacks);//Cylender(cilindro,r1,r2,h,slices,stacks);
    gl.glPopMatrix();
}
}
