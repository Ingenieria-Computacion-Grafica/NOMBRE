/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author Jarol Saltos
 */
public class DibujoMuneco {
    float x,y,z;
    float r,g,b;
    float w, h, d;
    float rx, ry, rz;
    float escala=1;
    GL gl;

    public DibujoMuneco(float x, float y, float z,  float w, float h, float d, float rx, float ry, float rz, GL gl) {
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
    }
    
        public void display (){

       gl.glPushMatrix();
        gl.glTranslatef(x-.9f,y-.5f,z);
        gl.glRotatef(rx,1,0,0);
        gl.glRotatef(ry,0,1,0);

        gl.glScalef(w/110,h/110,d);
            //cabeza
            gl.glColor3f(.5f,.5f,0);
            gl.glBegin(GL.GL_POLYGON);
            gl.glVertex2f(27,72);
            gl.glVertex2f(25,75);
            gl.glVertex2f(25,79);
            gl.glVertex2f(26,81);
            gl.glVertex2f(27,83);
            gl.glVertex2f(29,84);
            gl.glVertex2f(31,84);
            gl.glVertex2f(32,83);
            gl.glVertex2f(33,81);
            gl.glVertex2f(34,79);
            gl.glVertex2f(34,75);
            gl.glVertex2f(32,72);
            gl.glEnd();
            
            gl.glColor3f(0f,0f,0);
            gl.glBegin(GL.GL_LINES);
            gl.glVertex2f(28,79);
            gl.glVertex2f(27,78);
            
            gl.glVertex2f(31,79);
            gl.glVertex2f(32,78);
            
            gl.glVertex2f(29.5f,78);
            gl.glVertex2f(30.5f,76);
            gl.glVertex2f(30.5f,76);
            gl.glVertex2f(29.5f,75);
            
            gl.glEnd();
            gl.glColor3f(.5f,.5f,0);
            //mano izquierda
            gl.glBegin(GL.GL_POLYGON);
            gl.glVertex2f(10,49);
            gl.glVertex2f(8,48);
            gl.glVertex2f(8,45);
            gl.glVertex2f(5,42);
            gl.glVertex2f(6,38);
            gl.glVertex2f(10,45);
            gl.glEnd();
            
            //mano derecha
            gl.glBegin(GL.GL_POLYGON);
            gl.glVertex2f(47,49);
            gl.glVertex2f(50,48);
            gl.glVertex2f(50,45);
            gl.glVertex2f(53,42);
            gl.glVertex2f(52,40);
            gl.glVertex2f(48,45);
            gl.glEnd();
            
            gl.glColor3f(.05f,1,0);
            //brazo derecho
            gl.glBegin(GL.GL_POLYGON);
            gl.glVertex2f(39,70);
            gl.glVertex2f(38,64);
            gl.glVertex2f(48,45);
            gl.glVertex2f(48,49);
            gl.glEnd();
            
            //brazo izquierdo
            gl.glBegin(GL.GL_POLYGON);
            gl.glVertex2f(20,70);
            gl.glVertex2f(21,64);
            gl.glVertex2f(10,45);
            gl.glVertex2f(10,49);
            gl.glEnd();
            //torso
            gl.glBegin(GL.GL_POLYGON);
            gl.glVertex2f(23,50);
            gl.glVertex2f(20,70);
            gl.glVertex2f(27,72);
            gl.glVertex2f(32,72);
            gl.glVertex2f(39,70);
            gl.glVertex2f(36,50);
            
            gl.glEnd();
            //Pierna Izquierda
            gl.glBegin(GL.GL_POLYGON);
            gl.glColor3f(0,0,1);
            gl.glVertex2f(20,14);
            gl.glVertex2f(23,50);
            gl.glVertex2f(30,50);
            gl.glVertex2f(30,40);
            gl.glVertex2f(25,14);
            
            
            gl.glEnd();
            //Pierna Derecha
            gl.glBegin(GL.GL_POLYGON);
            gl.glColor3f(0,0,1);
            gl.glVertex2f(35,14);
            gl.glVertex2f(27,50);
            gl.glVertex2f(36,50);
            gl.glVertex2f(40,14);
            
            
            gl.glEnd();
            //ZAPATO izquierdo
            
            gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(1,1,1);
            gl.glVertex2f(10,9);
            gl.glVertex2f(10,10);
            gl.glVertex2f(25,10);
            gl.glVertex2f(25,9);
            gl.glEnd();
            
            gl.glBegin(GL.GL_POLYGON);
            gl.glColor3f(1,0,0);
            gl.glVertex2f(10,10);
            gl.glVertex2f(10,13);
            gl.glVertex2f(25,14);
            gl.glVertex2f(25,10);  
          
            
            gl.glEnd();
            
            //zapato derecho
            gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(1,1,1);
            gl.glVertex2f(35,9);
            gl.glVertex2f(35,10);
            gl.glVertex2f(50,10);
            gl.glVertex2f(50,9);
            gl.glEnd();
            
            gl.glBegin(GL.GL_POLYGON);
            gl.glColor3f(1,0,0);
            gl.glVertex2f(35,10);
            gl.glVertex2f(35,14);
            gl.glVertex2f(50,13);
            gl.glVertex2f(50,10);  
          
            
            gl.glEnd();
            
            
        // Flush all drawing operations to the graphics card
        gl.glPopMatrix();
}
        double getry() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.ry;
    }

    double getx() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.x;
    }

    double getrx() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.rx;
    }

    double gety() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.y;
    }

    double getz() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.z;
    }
        double setry(double ry) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.ry;
    }

    double setx(double x) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.x;
    }

    double setrx(double rx) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.rx;
    }

    double sety(double y) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.y;
    }

    double setz(double z) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
return this.z;
    }
    
}