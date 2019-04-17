import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *



		
def Draw():   
    #Cabeza
    glPushMatrix()    
    glRotatef(45,0,0,1)
    glColor3f(.1, .5, 0)
    glBegin(GL_POLYGON)
    glVertex2f(1,1)
    glVertex2f(2,1)
    glVertex2f(2,0)
    glVertex2f(1,0)
    glEnd()            
    glPopMatrix()
    
    #Cuello
    glPushMatrix()    
    #glRotatef(45,0,0,1)
    glTranslatef(-.025,0,0)
    glScalef(.5,1,1)
    glColor3f(.5, 0, .5)
    glBegin(GL_POLYGON)
    glVertex2f(1,1)
    glVertex2f(2,1)
    glVertex2f(2,0)
    glVertex2f(1,0)
    glEnd()            
    glPopMatrix()
    
    #Tronco
    glPushMatrix()    
    #glRotatef(45,0,0,1)
    glTranslatef(-.75,-1.25,0)
    glScalef(1,2,1)
    glColor3f(.5, 0, 0)
    glBegin(GL_POLYGON)
    glVertex2f(1,1)
    glVertex2f(2,1)
    glVertex2f(2,0)
    glVertex2f(1,0)
    glEnd()            
    glPopMatrix()
    
    
    #Brazo Iz
    glPushMatrix() 
    
    glTranslatef(-1.75,-1.5,0)
    glRotatef(45,0,0,1)
    glScalef(1.5,.2,1)
    
    glColor3f(.5, 1, .32)
    glBegin(GL_POLYGON)
    glVertex2f(1,1)
    glVertex2f(2,1)
    glVertex2f(2,0)
    glVertex2f(1,0)
    glEnd()            
    glPopMatrix()
    
    #Brazo De
    glPushMatrix() 
    
    glTranslatef(0,1.70,0)
    glRotatef(45,0,0,-1)
    glScalef(1.5,.2,1)
    
    glColor3f(.5, 1, .32)
    glBegin(GL_POLYGON)
    glVertex2f(1,1)
    glVertex2f(2,1)
    glVertex2f(2,0)
    glVertex2f(1,0)
    glEnd()            
    glPopMatrix()
    
    #Pierna Iz
    glPushMatrix() 
    
    glTranslatef(.5,-4.25,0)
    glRotatef(90,0,0,1)
    glScalef(1.5,.2,1)
    
    glColor3f(.5, .1, 1)
    glBegin(GL_POLYGON)
    glVertex2f(1,1)
    glVertex2f(2,1)
    glVertex2f(2,0)
    glVertex2f(1,0)
    glEnd()            
    glPopMatrix()
    
    
    #Pierna De
    glPushMatrix() 
    
    glTranslatef(1.2,-4.25,0)
    glRotatef(90,0,0,1)
    glScalef(1.5,.2,1)
    
    glColor3f(.5, .1, 1)
    glBegin(GL_POLYGON)
    glVertex2f(1,1)
    glVertex2f(2,1)
    glVertex2f(2,0)
    glVertex2f(1,0)
    glEnd()            
    glPopMatrix()


def main():
	pygame.init()
	display = (800,600)
	pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
	
	gluPerspective(45, (display[0]/display[1]),0.1,50.0)
	
	glTranslatef(-1,0,-10)
	 
	glRotatef(0,0,0,0)
	
	while True:
		for event in pygame.event.get():
			if event.type == pygame.QUIT:
				pygame.quit()
				quit()
			if event.type == KEYDOWN:
				if event.key == pygame.K_LEFT:
					glTranslatef(-0.1,0,0)
				if event.key == pygame.K_RIGHT:
					glTranslatef(0.1,0,0)
				if event.key == pygame.K_UP:
					glTranslatef(0,0.1,0)
				if event.key == pygame.K_DOWN:
					glTranslatef(0,-0.1,0)
				if event.key == pygame.K_KP_PLUS:
					glTranslatef(0,0,1)
				if event.key == pygame.K_KP_MINUS:
					glTranslatef(0,0,-1)
				if event.key == pygame.K_w:
					glRotatef(5,1,0,0)
				if event.key == pygame.K_s:
					glRotatef(-5,1,0,0)
				if event.key == pygame.K_a:
					glRotatef(5,0,1,0)
				if event.key == pygame.K_d:
					glRotatef(-5,0,1,0)

		
		
		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		Draw()
		pygame.display.flip()
		pygame.time.wait(10)
main()  
