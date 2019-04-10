/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author Grace Mireya Pumisacho
 */
public class NAME {
    float x,y,z;
    GL gl;

    public NAME (float x, float y, float z, GL gl) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.gl = gl;
    }
    
    public void display(){
        
        gl.glPushMatrix();
        //gl.glTranslatef(x-1,y-1,z);
        gl.glScalef(x/1000, y/1000, z);

        
        gl.glLineWidth(3);
             // Creacion
            // Letra G
            gl.glBegin(gl.GL_LINES);
            gl.glColor3f(1,0,0);
                gl.glVertex3d(10, 50,0);
                gl.glVertex3d(50, 50,0);
                gl.glVertex3d(15, 10,0);
                gl.glVertex3d(15, 50,0);                
                gl.glVertex3d(10, 50,0);
                gl.glVertex3d(10, 10,0);
                gl.glVertex3d(10, 40,0);
                gl.glVertex3d(10, 10,0);
                gl.glVertex3d(50, 30,0);
                gl.glVertex3d(25, 30,0);
                gl.glVertex3d(49, 30,0);
                gl.glVertex3d(49, 10,0);
                gl.glVertex3d(10, 10,0);
                gl.glVertex3d(50, 10,0);
                

            gl.glEnd();
            // Letra R
             gl.glColor3f(0,0,1);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(60,50,0);
                gl.glVertex3d(60,10,0);
                gl.glVertex3d(65,50,0);
                gl.glVertex3d(65,10,0);
                gl.glVertex3d(60,50,0);
                gl.glVertex3d(90,50,0);
                gl.glVertex3d(90,50,0);
                gl.glVertex3d(90,40,0);
                gl.glVertex3d(90,40,0);
                gl.glVertex3d(80,30,0);
                gl.glVertex3d(80,30,0);
                gl.glVertex3d(60,30,0);
                gl.glVertex3d(80,30,0);
                gl.glVertex3d(90,10,0);
                
                
            gl.glEnd();
            
             // Letra A
             gl.glColor3f(0,1,0);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(100,50,0);
                gl.glVertex3d(100,10,0);
                gl.glVertex3d(105,50,0);
                gl.glVertex3d(105,10,0);
                gl.glVertex3d(100,50,0);
                gl.glVertex3d(130,50,0);
                gl.glVertex3d(130,50,0);
                gl.glVertex3d(130,10,0);
                gl.glVertex3d(100,30,0);
                gl.glVertex3d(130,30,0);
            gl.glEnd();
            
            // Letra C
             gl.glColor3f(1,1,0);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(140,50,0);
                gl.glVertex3d(140,10,0);
                gl.glVertex3d(145,50,0);
                gl.glVertex3d(145,10,0);
                gl.glVertex3d(140,50,0);
                gl.glVertex3d(170,50,0);
                gl.glVertex3d(170,10,0);
                gl.glVertex3d(140,10,0);
               
            gl.glEnd();
            
            // Letra E
             gl.glColor3f(1,1,5);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(180,50,0);
                gl.glVertex3d(180,10,0);
                gl.glVertex3d(185,50,0);
                gl.glVertex3d(185,10,0);
                gl.glVertex3d(180,50,0);
                gl.glVertex3d(210,50,0);
                gl.glVertex3d(210,10,0);
                gl.glVertex3d(180,10,0);
                gl.glVertex3d(200,30,0);
                gl.glVertex3d(180,30,0);
                
            gl.glEnd();
            
          
            // Letra P
             gl.glColor3f(2,0,1);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(240,50,0);
                gl.glVertex3d(240,10,0);
                gl.glVertex3d(245,50,0);
                gl.glVertex3d(245,10,0);
                gl.glVertex3d(280,50,0);
                gl.glVertex3d(280,30,0);
                gl.glVertex3d(240,50,0);
                gl.glVertex3d(280,50,0);
                gl.glVertex3d(240,30,0);
                gl.glVertex3d(280,30,0);
 
              gl.glEnd();

            // Letra U
             gl.glColor3f(0,1,2);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(290,50,0);
                gl.glVertex3d(290,10,0);
                gl.glVertex3d(295,50,0);
                gl.glVertex3d(295,10,0);              
                gl.glVertex3d(290,10,0);
                gl.glVertex3d(325,10,0);
                gl.glVertex3d(325,50,0);
                gl.glVertex3d(325,10,0);
              gl.glEnd();  
              
              // Letra M
             gl.glColor3f(0.9f,0.6f,0.4f);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(340,50,0);
                gl.glVertex3d(340,10,0);
                gl.glVertex3d(335,50,0);
                gl.glVertex3d(335,10,0);
                gl.glVertex3d(340,50,0);
                gl.glVertex3d(360,30,0);
                gl.glVertex3d(360,30,0);
                gl.glVertex3d(380,50,0);
                gl.glVertex3d(380,50,0);
                gl.glVertex3d(380,10,0);
              gl.glEnd();  
              
              // Letra I
             gl.glColor3f(0.5f,0.5f,0.5f);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(390,47,0);
                gl.glVertex3d(420,47,0);
                gl.glVertex3d(403,47,0);
                gl.glVertex3d(403,10,0);
                gl.glVertex3d(408,47,0);
                gl.glVertex3d(408,10,0);
                gl.glVertex3d(390,10,0);
                gl.glVertex3d(420,10,0);

              gl.glEnd();  
              
              // Letra S
             gl.glColor3f(0.9f,0.27f,0.15f);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(430,50,0);
                gl.glVertex3d(430,30,0);
                gl.glVertex3d(435,50,0);
                gl.glVertex3d(435,30,0);
                gl.glVertex3d(430,50,0);
                gl.glVertex3d(460,50,0);
                gl.glVertex3d(460,30,0);
                gl.glVertex3d(430,30,0);
                gl.glVertex3d(458,30,0);
                gl.glVertex3d(458,10,0);
                gl.glVertex3d(453,30,0);
                gl.glVertex3d(453,10,0);
                gl.glVertex3d(430,10,0);
                gl.glVertex3d(460,10,0);

              gl.glEnd();
              
               // Letra A
             gl.glColor3f(0.76f,0.51f,0.95f);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(470,50,0);
                gl.glVertex3d(470,10,0);
                gl.glVertex3d(475,50,0);
                gl.glVertex3d(475,10,0);
                gl.glVertex3d(470,50,0);
                gl.glVertex3d(500,50,0);
                gl.glVertex3d(500,50,0);
                gl.glVertex3d(500,10,0);
                gl.glVertex3d(470,30,0);
                gl.glVertex3d(500,30,0);
            gl.glEnd();
            
            // Letra C
             gl.glColor3f(0.1f,0.5f,0.9f);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(510,50,0);
                gl.glVertex3d(510,10,0);
                gl.glVertex3d(515,50,0);
                gl.glVertex3d(515,10,0);
                gl.glVertex3d(510,50,0);
                gl.glVertex3d(540,50,0);
                gl.glVertex3d(540,10,0);
                gl.glVertex3d(510,10,0);
               
            gl.glEnd();   
            
            // Letra H
             gl.glColor3f(1,21,0);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(550,50,0);
                gl.glVertex3d(550,10,0);
                gl.glVertex3d(555,50,0);
                gl.glVertex3d(555,10,0);
                gl.glVertex3d(585,50,0);
                gl.glVertex3d(585,10,0);
                gl.glVertex3d(550,30,0);
                gl.glVertex3d(585,30,0);
               
            gl.glEnd();  
            
             // Letra O
             gl.glColor3f(0.91f,0.1f,0.4f);
             gl.glBegin(gl.GL_LINES);
                gl.glVertex3d(595,50,0);
                gl.glVertex3d(595,10,0);
                gl.glVertex3d(600,50,0);
                gl.glVertex3d(600,10,0);
                gl.glVertex3d(630,50,0);
                gl.glVertex3d(630,10,0);
                gl.glVertex3d(595,50,0);
                gl.glVertex3d(630,50,0);
                gl.glVertex3d(595,10,0);
                gl.glVertex3d(630,10,0);
               
            gl.glEnd();
        

        
        
        gl.glPopMatrix();
        
    }
    
}
