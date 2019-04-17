import pygame
from pygame.locals import *
from OpenGL import *
from OpenGL.GL import *
from OpenGL.GLU import *



def main():
	ry=1;
	pygame.init()
	display=(800,600)
	pygame.display.set_mode(display, DOUBLEBUF|OPENGL)
	glShadeModel(GL_FLAT)
	gluPerspective(45, (display[0]/display[1]),0.1,150)
	glTranslatef(0,0,-6)
	while True:
		for event in pygame.event.get():
			if event.type==pygame.QUIT:
				pygame.quit()
				quit()

		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		
		#glScalef(1/110,1/100,1)
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

		pygame.display.flip()
		pygame.time.wait(10)

		ry+=1
main()
