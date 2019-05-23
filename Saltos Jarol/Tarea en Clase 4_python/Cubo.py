import pygame
from pygame.locals import *
from OpenGL import *
from OpenGL.GL import *
from OpenGL.GLU import *
import math
#from math.random import *
import random
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
#random.randrange(,)intervalo de donde a donde van random.ran()

#Draw(cube_dict(each_cube))
#cube_dict =


#for x in range(20):
    
def main():

    pygame.init()
    display = (800,600)
    pygame.display.set_mode(display, DOUBLEBUF|OPENGL)

    gluPerspective(45, (display[0]/display[1]), 0.1, 150.0)

    glTranslatef(0,0.0, -40)
    object_passed = False
    while not object_passed:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
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

        x = glGetDoublev(GL_MODELVIEW_MATRIX)
        print(str(x))
        camera_x=x[3][0]
        camera_y=x[3][1]
        camera_z=x[3][2]
        if camera_z < -1:
            object_passed = True

        glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)

        glTranslatef(0,0,.5)
        Cube()
        pygame.display.flip()
        pygame.time.wait(10)
for x in range(20):
	#print(x)
    main()
	#print(x)
pygame.quit()
quit()
	  
