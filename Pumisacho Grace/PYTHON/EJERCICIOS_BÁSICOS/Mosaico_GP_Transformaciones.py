# -*- coding: utf-8 -*-
"""
Created on Wed Apr 17 01:27:50 2019

@author: Grace
"""

import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *


	
def draw_G():
    
    glBegin(GL_QUADS);
    glColor3f(1,0,0.3);
    glVertex2d(0.67,1.00);
    glVertex2d(1.00,0.68);
    glVertex2d(0.43,0.30);
    glVertex2d(0.10,0.64);    
    glEnd();
    

    glBegin(GL_LINES);
    glColor3f(1,0,1);
    glVertex2d(0.10, 1.00);
    glVertex2d(1.50, 1.00);
    glVertex2d(1.50, 0.10);
    glVertex2d(0.10, 0.10);
    glVertex2d(1.50, 1.00);
    glVertex2d(1.50, 0.10);
    glVertex2d(0.10, 0.10);
    glVertex2d(0.10, 1.00);
    glEnd();
    

    glBegin(GL_QUADS);
    glColor3f(0.09,1,1);
    glVertex2d(1.50,0.10);
    glVertex2d(1.50,0.68);
    glVertex2d(1.00,0.68);
    glVertex2d(1.00,0.10);    
    glEnd();
    
    
    glBegin(GL_LINES);
    glVertex2d(0.10, 0.10);
    glVertex2d(1.50, 1.00);
    glEnd();
    
    
    glBegin(GL_TRIANGLES);
    glColor3f(0.6,0.9,0.2);
    glVertex2d(0.10,0.10);
    glVertex2d(1.00,0.68);
    glVertex2d(1.00,0.10);
#       //     glVertex2d(110,10);
    glEnd();
    
    glBegin(GL_TRIANGLES);
    glColor3f(0.6,0.5,0.9);
    glVertex2d(1.00,0.68);
    glVertex2d(1.50,0.68);
    glVertex2d(1.50,1.00);
#       //     glVertex2d(110,10);
    glEnd();
    
    glBegin(GL_TRIANGLES);
    glColor3f(0.2,0.7,0.3);
    glVertex2d(0.10,0.10);
    glVertex2d(0.42,0.31);
    glVertex2d(0.10,0.65);
#       //     glVertex2d(110,10);
    glEnd();
    
    glBegin(GL_TRIANGLES);
    glColor3f(0.9,0.6,0.4);
    glVertex2d(0.10,0.64);
    glVertex2d(0.67,1.00);
    glVertex2d(0.10,1.00);
#       //     glVertex2d(110,10);
    glEnd();
    
    glBegin(GL_TRIANGLES);
    glColor3f(0.7,0.9,0.6);
    glVertex2d(1.00,0.67);
    glVertex2d(0.67,1.00);
    glVertex2d(1.50,1.00);
#       //     glVertex2d(110,10);
    glEnd(); 



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
		
		draw_G()
			
		pygame.display.flip()
		pygame.time.wait(10)
main()







