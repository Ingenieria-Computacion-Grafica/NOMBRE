import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *


#glScalef(1/110,1/100,1)
		
def DrawName():
		#LETRA J
		glPushMatrix()
		glBegin(GL_LINES)
		glVertex2f(.10,1.40)
		glVertex2f(.30,1.40)
		glVertex2f(.20,1.40)
		glVertex2f(.20,1.10)
		glVertex2f(.10,1.10)
		glVertex2f(.20,1.10)
		glEnd()
		#LETRA A
		glBegin(GL_LINES)
		glVertex2f(.40,1.10)
		glVertex2f(.40,1.40)

		glVertex2f(.40,1.40)
		glVertex2f(.60,1.40)

		glVertex2f(.60,1.40)
		glVertex2f(.60,1.10)

		glVertex2f(.40,1.20)
		glVertex2f(.60,1.20)
		glEnd()

		#LETRA R
		glBegin(GL_LINES)
		glVertex2f(.70,1.10)
		glVertex2f(.70,1.40)

		glVertex2f(.70,1.40)
		glVertex2f(.90,1.40)

		glVertex2f(.90,1.40)
		glVertex2f(.90,1.25)

		glVertex2f(.90,1.25)
		glVertex2f(.70,1.25)

		glVertex2f(.70,1.25)
		glVertex2f(.90,1.10)
		glEnd()

		#LETRA O
		glBegin(GL_LINES)

		glVertex2f(1.00,1.10)
		glVertex2f(1.00,1.40)

		glVertex2f(1.00,1.40)
		glVertex2f(1.20,1.40)

		glVertex2f(1.20,1.40)
		glVertex2f(1.20,1.10)

		glVertex2f(1.00,1.10)
		glVertex2f(1.20,1.10)
		
		glEnd()

		#LETRA L
		glBegin(GL_LINES)
		glVertex2f(1.30,1.10)
		glVertex2f(1.30,1.40)
		glVertex2f(1.30,1.10)
		glVertex2f(1.50,1.10)
		glEnd()
		#LETRA S
		glBegin(GL_LINES)
		glVertex2f(.10,1.00)
		glVertex2f(.30,1.00)

		glVertex2f(.10,1.00)
		glVertex2f(.10,.85)

		glVertex2f(.10,.85)
		glVertex2f(.30,.85)

		glVertex2f(.30,.85)
		glVertex2f(.30,.70)
		
		glVertex2f(.30,.70)
		glVertex2f(.10,.70)
		glEnd()

		#LETRA A
		glBegin(GL_LINES)
		glVertex2f(.40,0.70)
		glVertex2f(.40,1.00)

		glVertex2f(.40,1.00)
		glVertex2f(.60,1.00)

		glVertex2f(.60,1.00)
		glVertex2f(.60,0.70)

		glVertex2f(.40,.8)
		glVertex2f(.60,.8)
		glEnd()

		#LETRA L
		glBegin(GL_LINES)
		glVertex2f(.70,.70)
		glVertex2f(.70,1.00)
		glVertex2f(.70,0.70)
		glVertex2f(.90,.70)
		glEnd()

		#Letra T
		glBegin(GL_LINES)
		glVertex2f(.85,1.00)
		glVertex2f(1.15,1.00)

		glVertex2f(1.00,1.00)
		glVertex2f(1.00,.70)
		glEnd()

		#LETRA O
		glBegin(GL_LINES)

		glVertex2f(1.20,.7)
		glVertex2f(1.20,1)

		glVertex2f(1.20,1)
		glVertex2f(1.40,1)

		glVertex2f(1.40,1)
		glVertex2f(1.40,.7)

		glVertex2f(1.20,.7)
		glVertex2f(1.40,.7)
		
		glEnd()

		#LETRA S
		glBegin(GL_LINES)
		glVertex2f(1.50,1.00)
		glVertex2f(1.70,1.00)

		glVertex2f(1.50,1.00)
		glVertex2f(1.50,.85)

		glVertex2f(1.50,.85)
		glVertex2f(1.70,.85)

		glVertex2f(1.70,.85)
		glVertex2f(1.70,.70)
		
		glVertex2f(1.70,.70)
		glVertex2f(1.50,.70)
		glEnd()
		glPopMatrix()


def main():
	pygame.init()
	display = (800,600)
	pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
	
	gluPerspective(45, (display[0]/display[1]),0.1,50.0)
	glTranslatef(1,1,-9)
	glRotatef(0,0,0,0)

	while True:
		for event in pygame.event.get():
			if event.type == pygame.QUIT:
				pygmae.quit()
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
				if event.key == pygame.K_1:
					glTranslatef(0,0,1)
				if event.key == pygame.K_2:
					glTranslatef(0,0,-1)

				if event.key == pygame.K_3:
					glRotatef(5,1,0,0)
				if event.key == pygame.K_4:
					glRotatef(-5,1,0,0)
				if event.key == pygame.K_5:
					glRotatef(5,0,1,0)
				if event.key == pygame.K_6:
					glRotatef(-5,0,1,0)

		
		#glRotatef(1,3,1,1)
		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		DrawName()
		pygame.display.flip()
		pygame.time.wait(10)
main()
