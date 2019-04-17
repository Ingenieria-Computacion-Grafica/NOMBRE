import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *



		
def Draw():   
	 
	    glPushMatrix()  	 
	    glColor3f(1, 0, 0)
	    glBegin(GL_LINES)
	    glVertex2d(3.50, .50)
	    glVertex2d(3.50, -.50)

	    glColor3f(0, 1, 0)
	    glVertex2d(3.50, -.50)
	    glVertex2d(6.50, -.50)

	    glColor3f(0, 0, 1)
	    glVertex2d(6.50, -.50)
	    glVertex2d(6.50, .50)

	    glColor3f(0, 1, 1)
	    glVertex2d(3.50, .50)
	    glVertex2d(6.50, .50)

	    glColor3f(1, 1,0)
	    glVertex2d(3.50, -.50)
	    glVertex2d(6.50, .50)

	    glColor3f(1, 0.5, .0)
	    glVertex2d(6.50, 0)
	    glVertex2d(5.00, 0)

	    glColor3f(0, 0.5, 0.3)              
	    glVertex2d(5.00, 0)
	    glVertex2d(5.00, -.50)

	    glColor3f(0.7, 0.5, 0.3)                   
	    glVertex2d(5.00, 0)
	    glVertex2d(4.50, .50)

	    glColor3f(0.4, 1, 0)                  
	    glVertex2d(4.00, -.33)
	    glVertex2d(3.50, .20)

	    glColor3f(1, 1, 1)
	    glVertex2d(3.50, .20)
	    glVertex2d(4.50, .50)

	    glColor3f(1, 1, 1)
	    glVertex2d(4.00, -.33)
	    glVertex2d(5.00, 0)

	    glEnd()
	    glPopMatrix()

def main():
	pygame.init()
	display = (800,600)
	pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
	
	gluPerspective(45, (display[0]/display[1]),0.1,50.0)
	
	glTranslatef(-5,0,-5)
	 
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
