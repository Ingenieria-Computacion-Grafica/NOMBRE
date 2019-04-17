import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *


		
def DrawName():
		
		#NOMBRE   
                
		glPushMatrix()                
                
		#F
		glColor3f(1,0,0)
		glBegin(GL_LINES)                
		glVertex2f(.30,.50)
		glVertex2f(.30,.20)
		glVertex2f(.30,.50)
		glVertex2f(.50,.50)
		glVertex2f(.30,.40)
		glVertex2f(.50,.40)
		glEnd()
		#A
		glBegin(GL_LINES)
		glVertex2f(.60,.50)
		glVertex2f(.60,.20)
		glVertex2f(.60,.50)
		glVertex2f(.90,.50)
		glVertex2f(.90,.50)
		glVertex2f(.90,.20)
		glVertex2f(.60,.35)
		glVertex2f(.90,.35)
		glEnd()
		#B
		glBegin(GL_LINES)
		glVertex2f(1,.50)
		glVertex2f(1,.20)
		glVertex2f(1,.50)
		glVertex2f(1.2,.45)
		glVertex2f(1.2,.45)
		glVertex2f(1,.35)
		glVertex2f(1,.35)
		glVertex2f(1.2,.25)
		glVertex2f(1.2,.25)
		glVertex2f(1,.20)
		glEnd()
		#I		
		glBegin(GL_LINES)
		glVertex2f(1.3,.5)
		glVertex2f(1.3,.2)
		glEnd()
		#A
		glBegin(GL_LINES)
		glVertex2f(1.4,.5)
		glVertex2f(1.4,.2)
		glVertex2f(1.4,.5)
		glVertex2f(1.7,.5)
		glVertex2f(1.7,.5)
		glVertex2f(1.7,.2)
		glVertex2f(1.4,.35)
		glVertex2f(1.7,.35)		
		glEnd()
		#N
		glBegin(GL_LINES)
		glVertex2f(1.8,.5)
		glVertex2f(1.8,.2)
		glVertex2f(1.8,.5)
		glVertex2f(2,.2)
		glVertex2f(2,.5)
		glVertex2f(2,.2)
		glEnd()
		
		#APELLIDO
		#P
		glColor3f(0,1,0)
		glBegin(GL_LINES)
		glVertex2f(.3,.1)
		glVertex2f(.3,-.2)
		glVertex2f(.3,.1)
		glVertex2f(.5,-.1)
		glVertex2f(.5,-.1)
		glVertex2f(.3,-.1)
		glEnd()
		#O
		glBegin(GL_LINES)
		glVertex2f(.60,.1)
		glVertex2f(.60,-.2)
		glVertex2f(.60,.1)
		glVertex2f(.90,.1)
		glVertex2f(.90,.1)
		glVertex2f(.90,-.2)
		glVertex2f(.60,-.2)
		glVertex2f(.90,-.2)
		glEnd()
		#R
		glBegin(GL_LINES)
		glVertex2f(1,.1)
		glVertex2f(1,-.2)
		glVertex2f(1,.1)
		glVertex2f(1.2,0)
		glVertex2f(1.2,0)
		glVertex2f(1,-.1)
		glVertex2f(1,-.1)
		glVertex2f(1.2,-.2)		
		glEnd()
		#T
		glBegin(GL_LINES)
		glVertex2f(1.3,.1)
		glVertex2f(1.3,-.2)
		glVertex2f(1.2,.1)
		glVertex2f(1.4,.1)
		glEnd()
		#E
		glBegin(GL_LINES)
		glVertex2f(1.4,.1)
		glVertex2f(1.4,-.2)
		glVertex2f(1.4,.1)
		glVertex2f(1.7,.1)
		glVertex2f(1.4,-.05)
		glVertex2f(1.6,-.05)
		glVertex2f(1.4,-.2)
		glVertex2f(1.7,-.2)		
		glEnd()
		#R
		glBegin(GL_LINES)
		glVertex2f(1.8,.1)
		glVertex2f(1.8,-.2)
		glVertex2f(1.8,.1)
		glVertex2f(2,.0)
		glVertex2f(2,0)
		glVertex2f(1.8,-.1)
		glVertex2f(1.8,-.1)
		glVertex2f(2,-.2)
		glEnd()
		glPopMatrix()
		#O
		glBegin(GL_LINES)
		glVertex2f(2.1,.1)
		glVertex2f(2.1,-.2)
		glVertex2f(2.1,.1)
		glVertex2f(2.4,.1)
		glVertex2f(2.4,.1)
		glVertex2f(2.4,-.2)
		glVertex2f(2.1,-.2)
		glVertex2f(2.4,-.2)
		glEnd()
def main():
	pygame.init()
	display = (800,600)
	pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
	
	gluPerspective(45, (display[0]/display[1]),0.1,50.0)
	glTranslatef(-1.25,0,-5)
	glRotatef(0,0,0,0)

	while True:
		for event in pygame.event.get():
			if event.type == pygame.QUIT:
				pygmae.quit()
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
		DrawName()
		pygame.display.flip()
		pygame.time.wait(10)
main()
