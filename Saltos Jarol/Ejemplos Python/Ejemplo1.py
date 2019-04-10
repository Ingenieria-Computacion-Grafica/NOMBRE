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
	gluPerspective(45, (display[0]/display[1]),0.1,150)
	glTranslatef(0,0,-6)
	while True:
		for event in pygame.event.get():
			if event.type==pygame.QUIT:
				pygame.quit()
				quit()

		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		
		glRotatef(1,1,0,0)
		glBegin(GL_POLYGON)
		glColor3f(1,0,0)
		glVertex3f(-1,-1,0)
		glColor3f(0,1,0)
		glVertex3f(-1,1,0)
		glColor3f(0,0,1)
		glVertex3f(1,1,0)
		glColor3f(1,1,0)
		glVertex3f(1,-1,0)
		glEnd()
		pygame.display.flip()
		pygame.time.wait(10)

		ry+=1
main()
