import pygame
from pygame.locals import *
from OpenGL import *
from OpenGL.GL import *
from OpenGL.GLU import *
import math


def Cube():
    glBegin(GL_QUADS)
    glColor4f(1,0,0,.5)
    glNormal3f(0, 0, 1)
    glTexCoord2f(1, 1)
    glVertex3f(1, 1, 1)
    glColor4f(1,1,0,.5)
    glTexCoord2f(1, 0)
    glVertex3f(1, -1, 1)
    glColor4f(0,1,0,.5)
    glTexCoord2f(0, 0)
    glVertex3f(-1, -1, 1)
    glColor4f(1,0,1,.5)
    glTexCoord2f(0, 1)
    glVertex3f(-1, 1, 1)
    glEnd()

    #trasera
    glBegin(GL_QUADS)
    glColor4f(0,0,1,.5)
    glNormal3f(0, 0, -1)
    glTexCoord2f(1, 1)
    glVertex3f(1, 1, -1)
    glColor4f(1,0,1,.5)
    glTexCoord2f(1, 0)
    glVertex3f(1, -1, -1)
    glColor4f(1,.5,.5,.5)
    glTexCoord2f(0, 0)
    glVertex3f(-1, -1, -1)
    glColor4f(.5,.5,1,.5)
    glTexCoord2f(0, 1)
    glVertex3f(-1, 1, -1)
    glEnd()

    #izquierdo
    glBegin(GL_QUADS)
    glColor4f(1,0,0,.5)
    glNormal3f(-1, 0, 0)
    glTexCoord2f(1, 1)
    glVertex3f(-1, 1, 1)
    glColor4f(0,1,0,.5)
    glTexCoord2f(1, 0)
    glVertex3f(-1, -1, 1)
    glColor4f(0,0,1,.5)
    glTexCoord2f(0, 0)
    glVertex3f(-1, -1, -1)
    glColor4f(1,0,1,.5)
    glTexCoord2f(0, 1)
    glVertex3f(-1, 1, -1)
    glEnd()

    #derecha
    glBegin(GL_QUADS)
    glColor4f(.5,.7,0,.5)
    glNormal3f(1, 0, 0)
    glTexCoord2f(1, 1)
    glVertex3f(1, 1, 1)
    glColor4f(0,0.5,.3,.5)
    glTexCoord2f(1, 0)
    glVertex3f(1, -1, 1)
    glColor4f(1,0,1,.5)
    glTexCoord2f(0, 0)
    glVertex3f(1, -1, -1)
    glColor4f(1,1,0,.5)
    glTexCoord2f(0, 1)
    glVertex3f(1, 1, -1)
    glEnd()

    #top
    glBegin(GL_QUADS)
    glColor4f(1,0,0,.5)
    glNormal3f(0, 1, 0)
    glTexCoord2f(1, 1)
    glVertex3f(1, 1, -1)
    glColor4f(1,1,1,.5)
    glTexCoord2f(1, 0)
    glVertex3f(1, 1, 1)
    glColor4f(1,0,1,.5)
    glTexCoord2f(0, 0)
    glVertex3f(-1, 1, 1)
    glColor4f(0,0,1,.5)
    glTexCoord2f(0, 1)
    glVertex3f(-1, 1, -1)
    glEnd()

    #bottom
    glBegin(GL_QUADS)
    glColor4f(1,1,0,.5)
    glNormal3f(0, -1, 0)
    glTexCoord2f(1, 1)
    glVertex3f(1, -1, -1)
    glColor4f(1,0,1,.5)
    glTexCoord2f(1, 0)
    glVertex3f(1, -1, 1)
    glColor4f(0,0,0,.5)
    glTexCoord2f(0, 0)
    glVertex3f(-1, -1, 1)
    glColor4f(1,1,.2,.5)
    glTexCoord2f(0, 1)
    glVertex3f(-1, -1, -1)
    glEnd()


def main():

    pygame.init()
    display = (800,600)
    pygame.display.set_mode(display, DOUBLEBUF|OPENGL)

    gluPerspective(45, (display[0]/display[1]), 0.1, 150.0)

    glTranslatef(0,0.0, -5)
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
	glEnable(GL_DEPTH_TEST)        
	glEnable(GL_BLEND)
	glBlendFunc(GL_SRC_ALPHA,GL_ONE_MINUS_SRC_ALPHA)
	glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
	##        glTranslatef(0.0,0.0, -5)
	glRotatef(2, 1, 0, 0)
	glRotatef(1,0,1,0)
	#gluLookAt(cubo1.getx(),cubo1.gety(),cubo1.getz(),cubo.getx(),cubo.gety(),cubo.getz(),(0,1,0))
	Cube()

	#glRotatef(1,0,1,0)
	#glTranslatef(1,0.0, 0)
	#glTranslatef(-1.0,0.0, 0)
	#cubo1=Cube()
	#glPopMatrix()
	#cubo[0][0]=Math.cos(1)*4
	#cubo[0][0]=Math.sin(1)*4
	pygame.display.flip()
	pygame.time.wait(10)
        
    

main()



