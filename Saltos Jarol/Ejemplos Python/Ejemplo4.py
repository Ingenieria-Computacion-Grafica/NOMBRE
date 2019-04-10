import pygame
from pygame.locals import *
from OpenGL import *
from OpenGL.GL import *
from OpenGL.GLU import *



def main():

	pygame.init()
	display=(800,600)
	pygame.display.set_mode(display, DOUBLEBUF|OPENGL)
	glShadeModel(GL_FLAT)
	gluPerspective(45, (display[0]/display[1]),0.1,150)
	glTranslatef(.5,0,-6)
	while True:
		for event in pygame.event.get():
			if event.type==pygame.QUIT:
				pygame.quit()
				quit()

		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		
		#LETRA U
		glRotatef(1,0,1,0)

		glBegin(GL_LINE_STRIP)
		glColor3f(1,0,0)
		glVertex2f(-1.6,1)
		glVertex2f(-1.6,-1)
		glVertex2f(-.9,-1)
		glVertex2f(-.9,1)
		glVertex2f(-1,1)
		glVertex2f(-1,-.5)
		glVertex2f(-1.5,-.5)
		glVertex2f(-1.5,1)
		glVertex2f(-1.6,1)
		glEnd()
		
		
		#LETRA C	
		glBegin(GL_LINES)
		glColor3f(0,1,0)
		glVertex2f(-.8,1)
		glVertex2f(-.8,-1)

		glVertex2f(-.8,-1)
		glVertex2f(-.2,-1)

		glVertex2f(-.2,-1)
		glVertex2f(-.2,-.8)

		glVertex2f(-.2,-.8)
		glVertex2f(-.7,-.8)

		glVertex2f(-.7,-.8)
		glVertex2f(-.7,.8)

		glVertex2f(-.7,.8)
		glVertex2f(-.2,.8)

		glVertex2f(-.2,.8)
		glVertex2f(-.2,1)

		glVertex2f(-.2,1)
		glVertex2f(-.8,1)
		glEnd()
		

		#LETRA E
		glBegin(GL_LINE_LOOP)
		glColor3f(0,0,1)
		glVertex2f(-.1,1)
		glVertex2f(-.1,-1)
		glVertex2f(.5,-1)
		glVertex2f(.5,-.8)
		glVertex2f(0,-.8)
		glVertex2f(0,-.1)
		glVertex2f(.5,-.1)
		glVertex2f(.5,.1)
		glVertex2f(0,.1)
		glVertex2f(0,.8)
		glVertex2f(.5,.8)
		glVertex2f(.5,1)

		glEnd()


		pygame.display.flip()
		pygame.time.wait(10)

main()
