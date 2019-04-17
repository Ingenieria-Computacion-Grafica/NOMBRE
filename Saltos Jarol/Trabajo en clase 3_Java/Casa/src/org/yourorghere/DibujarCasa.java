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
public class DibujarCasa implements Movil{
    public float x,y,z,rx,ry,rz,w,h,d;
    GL gl;

    public DibujarCasa(float x, float y, float z, float rx, float ry, float rz, float w, float h, float d, GL gl) {

        this.x = x;
        this.y = y;
        this.z = z;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.w = w;
        this.h = h;
        this.d = d;
        this.gl = gl;
    }
    
    public void display(){
        gl.glPushMatrix();
        gl.glTranslatef(x,y,z);
        gl.glRotatef(rx,1,0,0);
        gl.glRotatef(ry,0,1,0);
        gl.glRotatef(rz,0,0,1);
        gl.glScalef(w,h,d);
        
      gl.glBegin(GL.GL_QUADS);
            gl.glColor3f(.5f, .8f, 0);    // Set the current drawing color to light blue
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, 0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //CARA TRACERA
        gl.glBegin(GL.GL_QUADS);
            
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, -0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //CARA DERECHA
                gl.glBegin(GL.GL_QUADS);
            gl.glVertex3f(0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //cara izquierda
        gl.glBegin(GL.GL_QUADS);
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Top Left
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, -0.5f, -0.5f);  // Bottom Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //cara de encima
            gl.glBegin(GL.GL_QUADS);
            gl.glVertex3f(0.5f, 0.5f, -0.5f);  // Top Left
            gl.glVertex3f(-0.5f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, 0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, 0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        //cara inferior
            gl.glBegin(GL.GL_QUADS);
            gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Top Left
            gl.glVertex3f(-0.5f, -0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.5f, -0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(0.5f, -0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        
        
        
        //PARTE DE ARRIBA TEJADOO
     gl.glColor3f(.8f,0,0);
        //cara inferior
            gl.glBegin(GL.GL_QUADS);
            gl.glVertex3f(0.7f, 0.5f, -0.5f);  // Top Left
            gl.glVertex3f(-0.7f, 0.5f, -0.5f);   // Top Right
            gl.glVertex3f(-0.7f,0.5f, 0.5f);  // Bottom Right
            gl.glVertex3f(0.7f, 0.5f, 0.5f); // Bottom Left
        // Done Drawing The Quad
        gl.glEnd();
        gl.glBegin(GL.GL_TRIANGLES);
       
        gl.glVertex3f(0.7f,0.5f,0.7f);
        gl.glVertex3f(-0.7f,0.5f,0.7f);
        gl.glVertex3f(0,0.9f,0);
        gl.glEnd();
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex3f(0.7f,0.5f,-0.7f);
        gl.glVertex3f(-0.7f,0.5f,-0.7f);
        gl.glVertex3f(0,0.9f,0);
        gl.glEnd();
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex3f(-0.7f,0.5f,-0.7f);
        gl.glVertex3f(-0.7f,0.5f,0.7f);
        gl.glVertex3f(0,0.9f,0);
        gl.glEnd();
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex3f(0.7f,0.5f,-0.7f);
        gl.glVertex3f(0.7f,0.5f,0.7f);
        gl.glVertex3f(0,0.9f,0);
        gl.glEnd();
        
        //VENTANAS
        gl.glBegin(GL.GL_QUADS);
        gl.glColor4f(0,0.5f,0,.5f);
        gl.glVertex3f(.4f, -.1f,.51f);
        gl.glVertex3f(.4f, 0.1f,.51f);
        gl.glVertex3f(.2f, 0.1f,.51f);
        gl.glVertex3f(.2f, -.1f,.51f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_QUADS);
        gl.glColor4f(0,0.5f,0,.5f);
        gl.glVertex3f(-.2f, -.1f,.51f);
        gl.glVertex3f(-.2f, 0.1f,.51f);
        gl.glVertex3f(-.4f, 0.1f,.51f);
        gl.glVertex3f(-.4f, -.1f,.51f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_QUADS);
        gl.glColor4f(0,0.5f,0,.5f);
        gl.glVertex3f(.1f, -.1f,.51f);
        gl.glVertex3f(.1f, 0.1f,.51f);
        gl.glVertex3f(-.1f, 0.1f,.51f);
        gl.glVertex3f(-.1f, -.1f,.51f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_QUADS);
        gl.glColor4f(0,0.5f,0,.5f);
        gl.glVertex3f(.1f, .2f,.51f);
        gl.glVertex3f(.1f, 0.4f,.51f);
        gl.glVertex3f(-.1f, .4f,.51f);
        gl.glVertex3f(-.1f, .2f,.51f);
        gl.glEnd();
       
       gl.glBegin(GL.GL_QUADS);
        gl.glColor4f(0,0.5f,0,.5f);
        gl.glVertex3f(.4f, .2f,.51f);
        gl.glVertex3f(.4f, 0.4f,.51f);
        gl.glVertex3f(.2f, .4f,.51f);
        gl.glVertex3f(.2f, .2f,.51f);
        gl.glEnd();
        
        gl.glBegin(GL.GL_QUADS);
        gl.glColor4f(0,0.5f,0,.5f);
        gl.glVertex3f(-.2f,.2f,.51f);
        gl.glVertex3f(-.2f, .4f,.51f);
        gl.glVertex3f(-.4f, .4f,.51f);
        gl.glVertex3f(-.4f, .2f,.51f);
        gl.glEnd();
        
        //PUERTA
        gl.glBegin(GL.GL_QUADS);
        gl.glColor4f(0.5f,0.1f,0,.5f);
        gl.glVertex3f(.15f, -.5f,.51f);
        gl.glVertex3f(.15f, -0.2f,.51f);
        gl.glVertex3f(-.15f, -.2f,.51f);
        gl.glVertex3f(-.15f, -.5f,.51f);
        gl.glEnd();
        
       gl.glPopMatrix();
       
       ry+=.5f;
        
        
        
        
    }
     
          
    public void avanzar(){
        
        
       this.z+=.1f;
//       this.x+=  Math.cos((double) Math.toRadians(this.ry))*5f;
//       this.z+=  Math.sin((double) Math.toRadians(this.ry))*.5f;
    }
     public void retroceder(){
    
        this.z-=.1f;
//        this.x-=  Math.cos((double) Math.toRadians(this.ry))*.5f;
//        this.z-=  Math.sin((double) Math.toRadians(this.ry))*.5f;
     }
     public void derecha(){
        this.x-=.1f;
//       this.x+=  Math.cos((double) Math.toRadians(this.ry+90))*.5f;
//       this.z+=  Math.sin((double) Math.toRadians(this.ry+90))*.5f;
     }
     public void izquierda(){
        this.x+=.1f;
//       this.x+=  Math.cos((double) Math.toRadians(this.ry-90))*.5f;
//       this.z-=  Math.sin((double) Math.toRadians(this.ry+90))*.5f;
     }
     public void up(){
        //this.x+=vel;
       this.y+= .1f;
     }
     
     public void down(){
        //this.x+=vel;
       this.y-= .1f;

     }
     public void w1(){
        //this.x+=vel;
       this.w-=  .4f;

     }
     public void h1(){
        //this.x+=vel;
       this.h-=  .4f;

     }
     public void d1(){
        //this.x+=vel;
       this.d-=  .4f;

     }
     public void w2(){
        //this.x+=vel;
       this.w+=  .4f;

     }
     public void h2(){
        //this.x+=vel;
       this.h+=  .4f;

     }
     public void d2(){
        //this.x+=vel;
       this.d+=  .4f;

     }
     public void rx(){
        //this.x+=vel;
       this.rx+=  .4f;

     }
     public void ry(){
        //this.x+=vel;
       this.ry+=  .4f;

     }
     public void rz(){
        //this.x+=vel;
       this.rz+=  .4f;

     }
     public void rx1(){
        //this.x+=vel;
       this.rx-=  .4f;

     }
     public void ry1(){
        //this.x+=vel;
       this.ry-=  .4f;

     }
     public void rz1(){
        //this.x+=vel;
       this.rz-=  .4f;

     }
     
     public float getry(){
            return this.ry;
        }
        public float getrx(){
            return this.rx;
        }   
        public float getrz(){
            return this.rx;
        }  
        public float getry1(){
            return this.ry;
        }
        public float getrx1(){
            return this.rx;
        }   
        public float getrz1(){
            return this.rx;
        }  
        public float getx(){
            return this.x;
        }
        public float gety(){
            return this.y;
        }
        public float getz(){
            return this.z;
        } 
        public float getw(){
            return this.w;
        }
         public float geth(){
            return this.h;
        }
          public float getd(){
            return this.d;
        }
        public float getup(){
            return this.y;
        }
        public float getdown(){
            return this.y;
        }
       
        public float setw1(float r){
            return this.w=r;
        }
        public float seth1(float r){
            return this.h=r;
        }
        public float setd1(float r){
            return this.d=r;
        }
        public float setw2(float r){
            return this.w=r;
        }
        public float seth2(float r){
            return this.h=r;
        }
        public float setd2(float r){
            return this.d=r;
        }
        public float setup(float r){
            return this.y=r;
        }
        public float setdown(float r){
            return this.y=r;
        }
           public float setx(){
            return this.x;
        }
        public float sety(){
            return this.y;
        }
        public float setz(){
            return this.z;
        }
        public float setrx(){
            return this.rx;
        }
        public float setry(){
            return this.y;
        }
        public float setrz(){
            return this.rz;
        }
        public float setrx1(){
            return this.rx;
        }
        public float set1y1(){
            return this.ry;
        }
        public float setrz1(){
            return this.rz;
        } 
     
    

    public void setx(float r) {
    this.x=r;
    }

    public void sety(float r) {
    this.y=r;    }

    public void setz(float r) {
    this.z=r;    }

    public void setrx(float r) {
    this.rx=r;
    }

    public void setry(float r) {
        this.ry=r;    }

    public void setrz(float r) {
    this.rz=r;
    }

    public void setrx1(float r) {
    this.rx=r;    }

    public void setry1(float r) {
    this.ry=r;
    }

    public void setrz1(float r) {
    this.rz=r;
    }

    public void up(float r) {
    this.y=r;
    }

    public void down(float r) {
    this.y=r; 
    }

    public void getw1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void geth1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getd1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getw2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void geth2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getd2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
