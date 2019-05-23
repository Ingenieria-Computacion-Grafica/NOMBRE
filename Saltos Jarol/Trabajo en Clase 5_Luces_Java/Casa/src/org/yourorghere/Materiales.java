/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.util.Hashtable;
//import static org.yourorghere.Escenar.materiales;
import javax.media.opengl.GL;

/**
 *
 * @author Jarol Saltos
 */
public class Materiales {
     public   static Hashtable<String,MATERIAL> materiales=  new Hashtable<String,MATERIAL>();
  
    
    static float[] emissive;
    static     float [] ambient;
     static    float [] diffuse;
     static    float [] specular;
                
    static float[] emission_verde={0,0,0,1};
    static float[] ambient_verde={0,.0f,0,1};
    static float[] specular_verde={0,.25f,0,1};
    static float[] diffuse_verde={0,.25f,0,1}; 
    
    
    static float[] emission_azul={0,0,0,.2f};
    static float[] ambient_azul={0,0,.0f,.2f};
    static float[] specular_azul={0,0,.25f,.2f};
    static float[] diffuse_azul={0,0,.25f,.2f};
    
    static float[] emission_celeste={.5f,.5f,0,0.2f};
    static float[] ambient_celeste={0,0,.25f,0.2f};
    static float[] specular_celeste={0,0,.25f,0.2f};
    static float[] diffuse_celeste={0,0,.25f,0.2f};  
    

    //MATERIAL 3
   static  float[] emission_amarillo={0,0,0,1};
    static float[] ambient_amarillo={0,0,0f,1};
   static  float[] specular_amarillo={.25f,.25f,.0f,1};
   static  float[] diffuse_amarillo={1f,1f,0,1};  
   
   
   //MATERIAL blanco
   static  float[] e_blanco={0f,0f,0f,1};
    static float[] a_blanco={0f,0f,0f,1};
   static  float[] s_blanco={1.f,1.f,1.f,1};
   static  float[] d_blanco={1f,1f,1f,1};  

    //----------CEMENTO---------
   static  float[] e_cemento={0f,0f,0f,1};
   static  float[] a_cemento={0.5f,0.5f,0.5f,1};
  static   float[] s_cemento={.5f,.5f,.5f,1};
  static   float[] d_cemento={.5f,0.5f,0.5f,1}; 

    //---------MADERA-----------
  static   float[] e_madera={0,0,0,1};
  static   float[] a_madera={0.0059f,0.0029f,.0f,1};
  static   float[] s_madera={0.0059f,0.0029f,.0f,1};
   //static  float[] d_madera={0.59f,0.29f,0};   
   static  float[] d_madera={0.0059f,0.0029f,0f,1};  
 
    //-----------NEGRO----------
   static   float[] e_negro={0,0,0,1};
  static   float[] a_negro={0f,0f,0f,1};
  static   float[] s_negro={0.02f,0.02f,0.02f,1};
   static  float[] d_negro={0,0,0,1};   
    
  static   float[] emission_rojo={0,0,0,1};
  static   float[] ambient_rojo={0f,0,0,1};
  static   float[] specular_rojo={.25f,.0f,.0f,1};
  static   float[] diffuse_rojo={.1f,0,0,1};    
 
 
 
    public static void diccionario(GL gl){
        //System.out.println("entrando");
        //una manera de definir y agregar, son así
        MATERIAL cemento=new MATERIAL(e_cemento,a_cemento,d_cemento,s_cemento,1,gl);
        materiales.put("cemento",cemento);//otra manera de definirlo es así:
        materiales.put("madera", new MATERIAL(e_madera,a_madera,d_madera,s_madera,1,gl));
        materiales.put("verde", new MATERIAL(emission_verde,ambient_verde,diffuse_verde,specular_verde,1,gl));
        materiales.put("amarillo", new MATERIAL(emission_amarillo,ambient_amarillo,diffuse_amarillo,specular_amarillo,1,gl));
        materiales.put("azul", new MATERIAL(emission_azul,ambient_azul,diffuse_azul,specular_azul,1,gl));
        materiales.put("celeste", new MATERIAL(emission_celeste,ambient_celeste,diffuse_celeste,specular_celeste,1,gl));
        materiales.put("rojo", new MATERIAL(emission_rojo,ambient_rojo,diffuse_rojo,specular_rojo,1,gl));
        materiales.put("negro", new MATERIAL(e_negro,a_negro,d_negro,s_negro,1,gl));
        materiales.put("blanco", new MATERIAL(e_blanco,a_blanco,d_blanco,s_blanco,1,gl));
       // materiales.put("trans", new MATERIAL(emission_trans,ambient_trans,diffuse_trans,specular_trans,1,gl));
       // MATERIAL mat1= new MATERIAL(emission_mat1,ambient_mat1,diffuse_mat1,specular_mat1,1,gl);
    }
}
