import pygame
from pygame.locals import *
from OpenGL import *
from OpenGL.GL import *
from OpenGL.GLU import *
import math


def Casa():	
	glPushMatrix()

	glBegin(GL_QUADS)
	glColor3f(.5, .8, 0)  
	glVertex3f(-0.5, 0.5, 0.5) 
	glVertex3f(0.5, 0.5, 0.5)
	glVertex3f(0.5, -0.5, 0.5)
	glVertex3f(-0.5, -0.5, 0.5)
	glEnd()
	#CARA TRACERA
	glBegin(GL_QUADS)
	glVertex3f(-0.5, 0.5, -0.5)  # Top Let
	glVertex3f(0.5, 0.5, -0.5)   # Top Right
	glVertex3f(0.5, -0.5, -0.5)  # Bottom Right
	glVertex3f(-0.5, -0.5, -0.5) # Bottom Let
	glEnd()
	#CARA DERECHA
	glBegin(GL_QUADS)
	glVertex3f(0.5, 0.5, 0.5)  # Top Let
	glVertex3f(0.5, 0.5, -0.5)   # Top Right
	glVertex3f(0.5, -0.5, -0.5)  # Bottom Right
	glVertex3f(0.5, -0.5, 0.5) # Bottom Let
	glEnd()
	#cara izquierda
	glBegin(GL_QUADS)
	glVertex3f(-0.5, 0.5, 0.5)  # Top Let
	glVertex3f(-0.5, 0.5, -0.5)   # Top Right
	glVertex3f(-0.5, -0.5, -0.5)  # Bottom Right
	glVertex3f(-0.5, -0.5, 0.5) # Bottom Let
	glEnd()
	#cara de encima
	glBegin(GL_QUADS)
	glVertex3f(0.5, 0.5, -0.5)  # Top Let
	glVertex3f(-0.5, 0.5, -0.5)   # Top Right
	glVertex3f(-0.5, 0.5, 0.5)  # Bottom Right
	glVertex3f(0.5, 0.5, 0.5) # Bottom Let
	# Done Drawing The Quad
	glEnd()
	#cara inerior
	glBegin(GL_QUADS)
	glVertex3f(0.5, -0.5, -0.5)  # Top Let
	glVertex3f(-0.5, -0.5, -0.5)   # Top Right
	glVertex3f(-0.5, -0.5, 0.5)  # Bottom Right
	glVertex3f(0.5, -0.5, 0.5) # Bottom Let
	# Done Drawing The Quad
	glEnd()



	#PARTE DE ARRIBA TEJADOO
	glColor3f(.8,0,0)
	#cara inerior
	glBegin(GL_QUADS)
	glVertex3f(0.7, 0.5, -0.5)  # Top Let
	glVertex3f(-0.7, 0.5, -0.5)   # Top Right
	glVertex3f(-0.7,0.5, 0.5)  # Bottom Right
	glVertex3f(0.7, 0.5, 0.5) # Bottom Let
	# Done Drawing The Quad
	glEnd()
	glBegin(GL_TRIANGLES)

	glVertex3f(0.7,0.5,0.7)
	glVertex3f(-0.7,0.5,0.7)
	glVertex3f(0,0.9,0)
	glEnd()
	glBegin(GL_TRIANGLES)
	glVertex3f(0.7,0.5,-0.7)
	glVertex3f(-0.7,0.5,-0.7)
	glVertex3f(0,0.9,0)
	glEnd()
	glBegin(GL_TRIANGLES)
	glVertex3f(-0.7,0.5,-0.7)
	glVertex3f(-0.7,0.5,0.7)
	glVertex3f(0,0.9,0)
	glEnd()
	glBegin(GL_TRIANGLES)
	glVertex3f(0.7,0.5,-0.7)
	glVertex3f(0.7,0.5,0.7)
	glVertex3f(0,0.9,0)
	glEnd()

	#VENTANAS
	glBegin(GL_QUADS)
	glColor4f(0,0.5,0,.5)
	glVertex3f(.4, -.1,.51)
	glVertex3f(.4, 0.1,.51)
	glVertex3f(.2, 0.1,.51)
	glVertex3f(.2, -.1,.51)
	glEnd()

	glBegin(GL_QUADS)
	glColor4f(0,0.5,0,.5)
	glVertex3f(-.2, -.1,.51)
	glVertex3f(-.2, 0.1,.51)
	glVertex3f(-.4, 0.1,.51)
	glVertex3f(-.4, -.1,.51)
	glEnd()

	glBegin(GL_QUADS)
	glColor4f(0,0.5,0,.5)
	glVertex3f(.1, -.1,.51)
	glVertex3f(.1, 0.1,.51)
	glVertex3f(-.1, 0.1,.51)
	glVertex3f(-.1, -.1,.51)
	glEnd()

	glBegin(GL_QUADS)
	glColor4f(0,0.5,0,.5)
	glVertex3f(.1, .2,.51)
	glVertex3f(.1, 0.4,.51)
	glVertex3f(-.1, .4,.51)
	glVertex3f(-.1, .2,.51)
	glEnd()

	glBegin(GL_QUADS)
	glColor4f(0,0.5,0,.5)
	glVertex3f(.4, .2,.51)
	glVertex3f(.4, 0.4,.51)
	glVertex3f(.2, .4,.51)
	glVertex3f(.2, .2,.51)
	glEnd()

	glBegin(GL_QUADS)
	glColor4f(0,0.5,0,.5)
	glVertex3f(-.2,.2,.51)
	glVertex3f(-.2, .4,.51)
	glVertex3f(-.4, .4,.51)
	glVertex3f(-.4, .2,.51)
	glEnd()

	#PUERTA
	glBegin(GL_QUADS)
	glColor4f(0.5,0.1,0,.5)
	glVertex3f(.15, -.5,.51)
	glVertex3f(.15, -0.2,.51)
	glVertex3f(-.15, -.2,.51)
	glVertex3f(-.15, -.5,.51)
	glEnd()

	glPopMatrix()
def main():

    pygame.init()
    display = (800,600)
    pygame.display.set_mode(display, DOUBLEBUF|OPENGL)

    gluPerspective(45, (display[0]/display[1]), 0.1, 150.0)

    glTranslatef(0,-0.5, -5)
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
	glEnable(GL_DEPTH_TEST)        
	glEnable(GL_BLEND)
	glBlendFunc(GL_SRC_ALPHA,GL_ONE_MINUS_SRC_ALPHA)
	glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
	

	Casa()

	pygame.display.flip()
	pygame.time.wait(10)
        
    

main()

