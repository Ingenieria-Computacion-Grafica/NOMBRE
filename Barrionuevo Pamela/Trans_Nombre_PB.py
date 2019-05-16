import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *

"""
vertices = (
	(1,-1,-1),
	(1,1,-1),
	(-1,1,-1),
	(-1,-1,-1),
	(1,-1,1),
	(1,1,1),
	(-1,-1,1),
	(-1,1,1)
)

edges =(
	(0,1),
	(0,3),
	(0,4),
	(2,1),
	(2,3),
	(2,7),
	(6,3),
	(6,4),
	(6,7),
	(5,1),
	(5,4),
	(5,7)
)
surfaces = {
	(0,1,2,3),
	(3,2,7,6),
	(6,7,5,4),
	(4,5,1,0),
	(1,5,7,2),
	(4,0,3,6),
}

colors = [
	(1,0,0),
	(0,1,0),
	(0,0,1),
	(0,0,0),
	(1,1,1),
	(0,1,1),
	(1,0,0),
	(0,1,0),
	(0,0,1),
	(0,0,0),
	(1,1,1),
	(0,1,1),
]"""
glColor3fv((0,1,0))
def draw_P():
    glBegin(GL_LINES) 
    glVertex2f(10, 50) 
    glVertex2f(50, 50) 
    glVertex2f(10, 50) 
    glVertex2f(10, 10) 
    glVertex2f(10, 30) 
    glVertex2f(50, 30)
    glVertex2f(50, 30) 
    glVertex2f(50, 50)                                               
    glEnd() 

def draw_A():
    glBegin(GL_LINES) 
    glVertex2f(60, 50) 
    glVertex2f(100, 50) 
    glVertex2f(100, 10) 
    glVertex2f(100, 50)
    glVertex2f(60, 10) 
    glVertex2f(60, 50)
    glVertex2f(60, 30) 
    glVertex2f(100, 30)                                              
    glEnd() 


def draw_M():
    glBegin(GL_LINES)
    glVertex2f(110, 50) 
    glVertex2f(110, 10) 
    glVertex2f(150, 10) 
    glVertex2f(150, 50)
    glVertex2f(110, 50) 
    glVertex2f(130, 30)
    glVertex2f(130, 30) 
    glVertex2f(150, 50)                                               
    glEnd() 

def draw_E():
    glBegin(GL_LINES) 
    glVertex2f(160, 10) 
    glVertex2f(160, 50) 
    glVertex2f(160, 50) 
    glVertex2f(200, 50)
    glVertex2f(160, 30) 
    glVertex2f(200, 30)
    glVertex2f(160, 10) 
    glVertex2f(200, 10)                                              
    glEnd()
def Draw():
	glBegin(GL_QUADS)

	#glColor3fv((0,1,0))
	"""for surface in surfaces:
		x = 0
		for vertex in surface:
			x = x + 1
			glColor3fv(colors[x])
			glVertex3fv(vertices[vertex])

	glEnd()
	glBegin(GL_LINES)
	for edge in edges:
		for vertex in edge:
			glVertex3fv(vertices[vertex])

	glEnd()"""

	#glBegin(GL_LINES) 
	#glVertex2f(1,2)
	#glVertex2f(1,1)
	#glEnd() 



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

		
		#glRotatef(1,3,1,1)
		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		Draw()
		pygame.display.flip()
		#pygame.time.wait(10)
main()







