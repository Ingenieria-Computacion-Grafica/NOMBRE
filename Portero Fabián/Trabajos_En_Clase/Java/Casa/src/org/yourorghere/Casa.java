package org.yourorghere;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import javax.media.opengl.GL;
//import org.yourorghere.Cubo;
//import org.yourorghere.Piramide;
/**
 *
 * @author Fabian
 */
public class Casa {
    GL gl;
    float x,y,z;
    float w,h,d;
    float rx,ry,rz;
    public ArrayList<Cubo> cerca1;
    Cubo cuerpo,ventana,puerta,cerca2,piso;
    Piramide techo;
    
    public Casa(GL gl, float x, float y, float z, 
            float w, float h, float d,
            float rx, float ry, float rz) {
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

        
        cuerpo = new Cubo(gl,0,0,0,0.9f,0.9f,0.9f,1,1,1,0,0,0); //la traslacion debe ser respecto al centro de la casa
        techo=new Piramide(gl,0,0,0,0,1,0.1f,1,1,1,0,0,0);
        ventana = new Cubo (gl,0,0,0,0,0.7f,1,1,1,1,0,0,0);
        puerta = new Cubo (gl,0,0,0,1,0.5f,0,1,1,1,0,0,0);
        cerca2 = new Cubo (gl,0,0,0,0,1,0,0.1f,0.5f,0.01f,0,0,0);
        
         cerca1 = new ArrayList <Cubo>();
         for (int i=0; i<20; i++){
             cerca1.add (new Cubo (gl,0,0.35f,i*0.25f,0,1,0,0.1f,0.75f,0.01f,0,90,0));
             cerca1.add (new Cubo (gl,i*0.25f,0.35f,0,0,1,0,0.1f,0.75f,0.01f,0,0,0));
         }
      // puntacerca = new Piramide (gl,0,0,0,0,1,0,0.1f,0.5f,0.01f,0,0,0);
        piso = new Cubo (gl,0,0,0,0.5f,0.5f,0.5f,1,1,1,0,0,0);
       // puntacerca = new Piramide (gl,0,0,0,)
    }
    
    
    
    public void display(){
         
        gl.glPushMatrix();
          gl.glRotatef(rx, 180, 0, 0);
         gl.glPushMatrix();
           gl.glColor3f(1.000f, 0.922f, 0.804f);
        gl.glTranslatef(x, y, z);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w, h, d);
        cuerpo.display();
         gl.glPopMatrix();
         
          gl.glPushMatrix();
           gl.glColor3f(0.753f, 0.753f, 0.75f);
        gl.glTranslatef(x+0.75f, y+0.25f, z+1);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w*2, h*1.5f, d);
        cuerpo.display();
         gl.glPopMatrix();
        
             gl.glPushMatrix();
             gl.glColor3f(0.6f,0,0.1f);
        gl.glTranslatef(x, y+0.5f, z);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w*1.5f, h*0.5f, d);
        techo.display();
        gl.glPopMatrix();//
        
    //ventanas
     gl.glPushMatrix();
      gl.glColor3f(0.275f, 0.510f, 0.706f);
        gl.glTranslatef(x+0.25f, y+0.2f, z-0.01f);
        gl.glScalef(w*0.3f, h*0.3f, d);
        ventana.display();
        gl.glPopMatrix();
        
           gl.glPushMatrix();
        gl.glTranslatef(x-0.25f, y+0.2f, z-0.01f);
        gl.glScalef(w*0.3f, h*0.3f, d);
        ventana.display();
        gl.glPopMatrix();
        
        //puerta
        
            gl.glPushMatrix();
            gl.glColor3f(0.545f, 0.271f, 0.075f);
        gl.glTranslatef(x, y-0.25f, z-0.01f);
        gl.glScalef(w*0.3f, h*0.45f, d);
        puerta.display();
        gl.glPopMatrix();
        
        
        //cerca
        
        
         gl.glPushMatrix();
            gl.glColor3f(0.804f, 0.522f, 0.247f);
        gl.glTranslatef(x+1, y, z-2.5f);
        gl.glRotatef(90,0,0,1);
         gl.glScalef(w, h*10, d);
        cerca2.display();
        gl.glPopMatrix(); 
          gl.glPushMatrix();
           
          gl.glPushMatrix();
            gl.glColor3f(0.804f, 0.522f, 0.247f);
        gl.glTranslatef(x+1, y-0.25f, z-2.5f);
        gl.glRotatef(90,0,0,1);
         gl.glScalef(w, h*10, d);
        cerca2.display();
        gl.glPopMatrix(); 
          gl.glPushMatrix();
          
          
          
          
          
            gl.glPushMatrix();
            gl.glColor3f(0.804f, 0.522f, 0.247f);
        gl.glTranslatef(x-1.5f, y, z+0.1f);
        gl.glRotatef(90,0,0,1);
         gl.glRotatef(90,1,0,0);
         gl.glScalef(w, h*10, d);
        cerca2.display();
        gl.glPopMatrix(); 
          gl.glPushMatrix();
           
          gl.glPushMatrix();
            gl.glColor3f(0.804f, 0.522f, 0.247f);
        gl.glTranslatef(x-1.5f, y-0.25f, z-0.025f);
        gl.glRotatef(90,0,0,1);
        gl.glRotatef(90,1,0,0);
         gl.glScalef(w, h*10, d);
        cerca2.display();
        gl.glPopMatrix(); 
        
        
        
        gl.glPushMatrix();
        gl.glColor3f(0.804f, 0.522f, 0.247f);
        gl.glTranslatef(x-1.5f, y-0.5f, z-2.5f);
        
       for(Cubo c:cerca1){
        c.display();
             }
        
      gl.glPopMatrix();

        
        
        //piso
        
         gl.glPushMatrix();
         gl.glColor3f(0.5f,0.392f,0.5f);
        gl.glTranslatef(x+1, y-0.5f, z);
        gl.glScalef(w*5f, h*0.01f, d*5f);
        piso.display();
        gl.glPopMatrix();
        
        
          gl.glPopMatrix();
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
      
    }
}

