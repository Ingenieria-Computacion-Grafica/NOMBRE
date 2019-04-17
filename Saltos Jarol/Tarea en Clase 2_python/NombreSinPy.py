import pygame
from pygame.locals import *
from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
import math
window = 0                                             # glut window number
width, height = 700, 700                               # window size

CIRCLE_ANGLE_INC = 45   
def draw_rect(x, y, width, height):
    glBegin(GL_QUADS)                                  # start drawing a rectangle
    glVertex2f(x, y)                                   # bottom left point
    glVertex2f(x + width, y)                           # bottom right point
    glVertex2f(x + width, y + height)                  # top right point
    glVertex2f(x, y + height)                          # top left point
    glEnd() 
      
def draw_J():		
	#LETRA J
	glBegin(GL_LINES)
	glVertex2f(10,140)
	glVertex2f(30,140)
	glVertex2f(20,140)
	glVertex2f(20,110)
	glVertex2f(10,110)
	glVertex2f(20,110)
	glEnd()
def draw_A():
	#LETRA A
	glBegin(GL_LINES)
	glVertex2f(40,110)
	glVertex2f(40,140)

	glVertex2f(40,140)
	glVertex2f(60,140)

	glVertex2f(60,140)
	glVertex2f(60,110)

	glVertex2f(40,120)
	glVertex2f(60,120)
	glEnd()

def draw_R():
	#LETRA R
	glBegin(GL_LINES)
	glVertex2f(70,110)
	glVertex2f(70,140)

	glVertex2f(70,140)
	glVertex2f(90,140)

	glVertex2f(90,140)
	glVertex2f(90,125)

	glVertex2f(90,125)
	glVertex2f(70,125)

	glVertex2f(70,125)
	glVertex2f(90,110)
	glEnd()

def draw_O():
	#LETRA O
	glBegin(GL_LINES)

	glVertex2f(100,110)
	glVertex2f(100,140)

	glVertex2f(100,140)
	glVertex2f(120,140)

	glVertex2f(120,140)
	glVertex2f(120,110)

	glVertex2f(100,110)
	glVertex2f(120,110)
	
	glEnd()

	#LETRA L
def draw_L():
	glBegin(GL_LINES)
	glVertex2f(130,110)
	glVertex2f(130,140)
	glVertex2f(130,110)
	glVertex2f(150,110)
	glEnd()

def draw_S():
	glBegin(GL_LINES)
	glVertex2f(10,100)
	glVertex2f(30,100)

	glVertex2f(10,100)
	glVertex2f(10,85)

	glVertex2f(10,85)
	glVertex2f(30,85)

	glVertex2f(30,85)
	glVertex2f(30,70)
	
	glVertex2f(30,70)
	glVertex2f(10,70)
	glEnd()

def draw_T():
	glBegin(GL_LINES)
	glVertex2f(150,140)
	glVertex2f(180,140)

	glVertex2f(165,140)
	glVertex2f(165,110)
	glEnd()





def draw():                                            # ondraw is called all the time
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT) # clear the screen
    glLoadIdentity()                                   # reset position
    refresh2d(width, height)                           # set mode to 2d
    #gluPerspective(45, (width/height),0.1,1.0)
    #glTranslatef(1,3,0)    
    glColor3f(1.0, 0.0, 0.0)                           # set color to blue
    #draw_rect(10, 10, 200, 100)                        # rect at (10, 10) with width 200, height 100
    #glTranslatef(300,300,0)
    #glTranslatef()
    draw_J()
    glColor3f(0.0, 0.0, 1.0) 
    draw_A()
    glColor3f(.0, 1.0, 0.0) 
    draw_R()
    glColor3f(1.0, 1.0, 0.0) 
    draw_O()
    glColor3f(1.0, 0.0, 1.0) 
    draw_L()
    glColor3f(1.0, 0.5, 0.2)
    draw_S()
    glTranslatef(0,-40,0)
    glColor3f(0.2, 0.1, 0.5)
    draw_A()
    glTranslatef(-59,0,0)
    glColor3f(0.8, 0.5, 0.1)
    draw_L()
    glColor3f(1.0, 0.3, 0.6)
    draw_T()
    glColor3f(1.0, 0, 0.6)
    glTranslatef(85,0,0)
    draw_O()
    glColor3f(0.0, 0.3, 1.0)
    glTranslatef(115,40,0)
    draw_S()

    glutSwapBuffers()                                # important for double buffering

def refresh2d(width, height):
    glViewport(0, 0, width, height)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, width, 0.0, height, 0.0, 1.0)
    glMatrixMode (GL_MODELVIEW)
    glLoadIdentity()    

# initialization
glutInit()                                             # initialize glut
glutInitDisplayMode(GLUT_RGBA | GLUT_DOUBLE | GLUT_ALPHA | GLUT_DEPTH)
glutInitWindowSize(width, height)                      # set window size
glutInitWindowPosition(0, 0)                           # set window position
window = glutCreateWindow("Mi primer programa")              # create window with title
glutDisplayFunc(draw)                                  # set draw function callback
glutIdleFunc(draw)                                     # draw all the time
glutMainLoop() 



