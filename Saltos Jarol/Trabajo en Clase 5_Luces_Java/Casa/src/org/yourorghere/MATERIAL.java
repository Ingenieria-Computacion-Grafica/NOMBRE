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
public class MATERIAL {
        float[] emissive;
        float [] ambient;
        float [] diffuse;
        float [] specular;
        float shininess;
        GL gl;

    public MATERIAL(float[] emissive, float[] ambient, float[] diffuse, float[] specular, float shininess, GL gl) {
        this.emissive = emissive;
        this.ambient = ambient;
        this.diffuse = diffuse;
        this.specular = specular;
        this.shininess = shininess;
        this.gl = gl;
    }
    
    public void Activar(){
                //metodos de open gl que activan un material determinado
        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, this.ambient,0);
        gl.glMaterialfv(GL.GL_FRONT,GL.GL_EMISSION,this.emissive,0);
        gl.glMaterialfv(GL.GL_FRONT,GL.GL_DIFFUSE,this.diffuse,0);
        gl.glMaterialfv(GL.GL_FRONT,GL.GL_SPECULAR,this.specular,0);
        gl.glMaterialf(GL.GL_FRONT,GL.GL_SHININESS,this.shininess);
 
    }
}
