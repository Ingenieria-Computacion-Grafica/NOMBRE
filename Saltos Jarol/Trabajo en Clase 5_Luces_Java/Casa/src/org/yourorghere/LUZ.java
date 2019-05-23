/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;
/**
 *
 * @author fing.labcom
 */
public class LUZ {
        float [] position;  //declaramos un arreglo
        float [] ambient; 
        float [] diffuse;
        float [] specular;
        int id;//se refiere al identificador que se va a asociar a cada luz que creamos...
        //CUBO foco;
        GL gl;
        MATERIAL m;
        boolean encendida= false;
    public LUZ(float[] position, float[] ambient, float[] diffuse, float[] specular, int id,GL gl)  {
        this.position = position;
        this.ambient = ambient;
        this.diffuse = diffuse;
        this.specular = specular;
        this.id = id;
       //this.foco = new CUBO(0,0,0,.2f,.2f,.2f,0,0,0, m,gl);//para que la posición sea dinámica, se altera con el traslatef
        this.gl=gl;
    }
        
        public void DisplayFoco() {
            
           gl.glPushMatrix();
           gl.glTranslatef(this.position[0],this.position[1],this.position[2]);//las posiciones que corresponden con las posiciones de la luz 
           //foco.display();
           gl.glPopMatrix();
        }
        public void ConfigurarLuz(){
            gl.glLightfv(id,GL.GL_AMBIENT, this.ambient,0);//ambient es lo mismo que poner this.ambient
            gl.glLightfv(id,GL.GL_DIFFUSE, this.diffuse,0);
            gl.glLightfv(id,GL.GL_SPECULAR, this.specular,0);
            gl.glLightfv(id,GL.GL_POSITION, this.position,0);
//            if(this.encendida)
//                gl.glEnable(this.id);
//            else gl.glDisable(this.id);
//            //EJEMPLO DE SEMAFORO
            if(this.encendida && !gl.glIsEnabled(this.id)){
                gl.glEnable(this.id);
            }
            if(!this.encendida && gl.glIsEnabled(this.id)){
                gl.glDisable(this.id);
            }
        }
        public void ActivarLuz(){
            this.encendida=true;    
        }
        public void DesactivarLuz(){
            this.encendida=false;    
        }
}
