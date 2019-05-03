# -*- coding: utf-8 -*-
"""
Created on Wed Apr 17 09:10:46 2019

@author: Grace
"""
import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *
import Figuras_Basicas as fb

def M ():
    
    fb.Cuadrado(0,0.5,0,  0.5451, 0.2706, 0.0745,   0.15,0.2,0,  0,0,0);
    fb.Cuadrado(-0.7,1,0,  0.5451, 0.2706, 0.0745,   0.2,0.45,0,  0,0,-35);
    fb.Cuadrado(0.7,1,0,  0.5451, 0.2706, 0.0745,   0.2,0.45,0,  0,0,35);
    fb.Circulo(0,-0.1,0,   0.804, 0.5216, 0.2471,    1.1,1.1,0,0.48,    0,0,0 );
    fb.Circulo(0,1,0,   0.804, 0.5216, 0.2471, 1.1,1.1,0,0.48, 0,0,0 );
    fb.Circulo(-0.15,1.06,0,   1, 1, 1,  1.35,2.5,1,  0.09, 0,0,10 );
    fb.Circulo(0.15,1.06,0,   1, 1, 1,     1.35,2.5,1,   0.09, 0,0,-10 );
    fb.Circulo(-0.15,1.04,0,   0, 0, 0,  1.22,2.,1,  0.09, 0,0,10 );
    fb.Circulo(0.15,1.04,0,    0, 0, 0,     1.22,2.,1,   0.09, 0,0,-10 );
    
    fb.Cuadrado(0.092,1.12,0,  1, 1,1,   0.035,0.035,0,  0,0,0);
    fb.Cuadrado(-0.23,1.12,0,  1, 1,1,   0.03,0.03,0,  0,0,0);
    fb.Cuadrado(0.13,1.08,0,  1, 1,1,   0.02,0.02,0,  0,0,30);
    fb.Cuadrado(-0.18,1.08,0,  1, 1,1,   0.02,0.02,0,  0,0,30);
    
    fb.Circulo(0,0.72,0,   0, 0, 0, 0.45,.25,0,  0.4, 0,0,0 );
    fb.Cuadrado(-0.05,0.75,0,  1, 1,1,   0.03,0.03,0,  0,0,45);
    fb.Cuadrado(-0.09,0.72,0,  1, 1,1,   0.02,0.02,0,  0,0,0);
    
    fb.Cuadrado(0,0.55,0,  0, 0, 0,   0.05,0.05,0,  0,0,0);
    fb.Cuadrado(0,0.55,0,  1, 1, 1,   0.04,0.04,0,  0,0,0);
    
    fb.Cuadrado(-0.5,-0.51,0,  0.5451, 0.2706, 0.0745,   0.15,0.30,0,  0,0,-20);
    fb.Cuadrado(0.5,-0.51,0,  0.5451, 0.2706, 0.0745,   0.15,0.30,0,  0,0,20);
    fb.Cuadrado(-0.2,-0.51,0,  0.5451, 0.2706, 0.0745,   0.15,0.35,0,  0,0,0);
    fb.Cuadrado(0.2,-0.51,0,  0.5451, 0.2706, 0.0745,   0.15,0.35,0,  0,0,0);
    
#    fb.Triangulo (-0.08,-0.03,0,  0.1, 1, 15, 1,1,0,  0,0,-45); 
    
 #   fb.Triangulo (-0.08,-0.03,0,  0.1, 1, 15, 1,1,0,  0,0,-45) 
       
    
def main():
	pygame.init()
	display = (800,600)
	pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
	
	gluPerspective(45, (display[0]/display[1]),0.1,50.0)
	glTranslatef(-2,1,-9)
	glRotatef(0,0,0,0)

	while True:
		for event in pygame.event.get():
			if event.type == pygame.QUIT:
				pygame.quit()
				quit()
			if event.type == KEYDOWN:
				if event.key == pygame.K_LEFT:
					glTranslatef(-0.5,0,0)
				if event.key == pygame.K_RIGHT:
					glTranslatef(0.5,0,0)
				if event.key == pygame.K_UP:
					glTranslatef(0,0.5,0)
				if event.key == pygame.K_DOWN:
					glTranslatef(0,-0.5,0)      
				if event.key == pygame.K_a:
					glScalef(2,2,0)
    
				if event.key == pygame.K_r:
					glRotatef(30, -0.5, 0, 0)
                    


		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		
		M ()
			
		pygame.display.flip()
		pygame.time.wait(10)    
    
  
main()  
    
    