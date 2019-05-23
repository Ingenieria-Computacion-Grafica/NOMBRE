/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.io.IOException;
import javax.media.opengl.GL;
import static org.yourorghere.Materiales.materiales;
/**
 *
 * @author Jarol Saltos
 */
public class Casa1 {
    
 GL gl;
    float x,y,z;
    float w,h,d;
    float rx,ry,rz;
    MATERIAL m;
    
    CUBO cuerpo,ventana1,ventana2,puerta;
    CILINDRO techo1;
    
    public Casa1( float x, float y, float z, 
            float w, float h, float d,
            float rx, float ry, float rz, GL gl) throws IOException {
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

       // 
      
        
        cuerpo = new CUBO(-2,-.5f,0,2,2,2,0,0,0,Materiales.materiales.get("cemento"),gl); //la traslacion debe ser respecto al centro de la casa
        techo1 = new CILINDRO(-2,0f,0,1f,1f,1,-90,0,0,Materiales.materiales.get("rojo"),gl,0.8f,0f,0.8f,8,4);
        ventana1 = new CUBO(-1.4513f, -.2f, -.3f,.02f,.5f,0.5f,0,0,0,Materiales.materiales.get("celeste"),gl);
        ventana2 = new CUBO(-1.4513f, -0.2f, .3f,.02f,.5f,.5f,0,0,0,Materiales.materiales.get("celeste"),gl);
        puerta = new CUBO( -1.4513f,   -.7f,   0   ,.02f,1f, .5f,0,0,0,Materiales.materiales.get("madera"),gl);
        
    }
    public void display(){
        if(this.m!=null){
    this.m.Activar();
}
     
        gl.glPushMatrix();//Copiar
        gl.glTranslatef(x, y, z);
        gl.glRotatef(rx, 1, 0, 0);
        gl.glRotatef(ry, 0, 1, 0);
        gl.glRotatef(rz, 0, 0, 1);
        gl.glScalef(w, h, d);       
        
      //  gl.glRotatef(90,0,1,0);
        //
          
        cuerpo.display();
        techo1.display(); 
        ventana1.display();
        ventana2.display();
        puerta.display();
        
           //gl.glLoadIdentity();
        
    
        gl.glPopMatrix();

    }
}