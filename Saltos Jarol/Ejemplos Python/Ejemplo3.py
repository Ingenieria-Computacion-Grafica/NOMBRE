import pygame
from pygame.locals import *
from OpenGL import *
from OpenGL.GL import *
from OpenGL.GLU import *



def main():

	pygame.init()
	display=(800,600)
	pygame.display.set_mode(display, DOUBLEBUF|OPENGL)
	#glShadeModel(GL_FLAT)
	glShadeModel(GL_SMOOTH)
	gluPerspective(45, (display[0]/display[1]),0.1,150)
	glTranslatef(0,0,-6)
	while True:
		for event in pygame.event.get():
			if event.type==pygame.QUIT:
				pygame.quit()
				quit()

		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		
		glRotatef(1,1,0,0)
	
		glBegin(GL_LINE_STRIP)		
		glColor3f(1,0,0)
		glVertex2f(-1,-1)
		glColor3f(0,1,0)
		glVertex2f(-1,1)
		glColor3f(1,1,1)
		glVertex2f(0,1.5)
		glColor3f(0,0,1)
		glVertex2f(1,1)
		glColor3f(1,1,0)
		glVertex2f(1,-1)
		glColor3f(1,1,0)
		glVertex2f(0,-1.5)
		glColor3f(0,.5,0)
		glVertex2f(-1,-1)
		glEnd()
		
		glBegin(GL_POLYGON)		
		glColor3f(1,0,0)
		glVertex2f(-.8,-.8)
		glColor3f(0,1,0)
		glVertex2f(-.8,.8)
		glColor3f(1,1,1)
		glVertex2f(0,1.3)
		glColor3f(0,0,1)
		glVertex2f(.8,.8)
		glColor3f(1,1,0)
		glVertex2f(.8,-.8)
		glColor3f(1,1,0)
		glVertex2f(0,-1.3)
		glColor3f(0,.5,0)
		glVertex2f(-.8,-.8)
		glEnd()
		


		pygame.display.flip()
		pygame.time.wait(10)

main()
