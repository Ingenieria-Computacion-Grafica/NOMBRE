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
      
def draw_F():		
	#F
	glBegin(GL_LINES)
	glVertex2d(30, 50)
	glVertex2d(30, 20)
	glVertex2d(30, 50)
	glVertex2d(50, 50)
	glVertex2d(30, 40)
	glVertex2d(50, 40)
	glEnd()
def draw_A():
	#A
	glBegin(GL_LINES)
	glVertex2d(60, 50)
	glVertex2d(60, 20)
	glVertex2d(60, 50)
	glVertex2d(90, 50)
	glVertex2d(90, 50)
	glVertex2d(90, 20)
	glVertex2d(60, 35)
	glVertex2d(90, 35)
	glEnd()

def draw_B():
	#B
	glBegin(GL_LINES)
	glVertex2d(100, 50)
	glVertex2d(100, 20)
	glVertex2d(100, 50)
	glVertex2d(120, 45)
	glVertex2d(120, 45)
	glVertex2d(100, 35)
	glVertex2d(100, 35)
	glVertex2d(120, 25)
	glVertex2d(120, 25)
	glVertex2d(100, 20)
	glEnd()

	
def draw_I():
	#I
	glBegin(GL_LINES)
	glVertex2f(130,50)
	glVertex2f(130,20)
	glEnd()

def draw_N():
	#N
	glBegin(GL_LINES)	
	glVertex2d(180, 50)
	glVertex2d(180, 20)
	glVertex2d(180, 50)
	glVertex2d(200, 20)
	glVertex2d(200, 50)
	glVertex2d(200, 20)
	glEnd()

def draw_P():
	#P
	glBegin(GL_LINES)
	glVertex2d(30,10)
	glVertex2d(30,-20)
	glVertex2d(30,10)
	glVertex2d(50,-5)
	glVertex2d(50,-5)
	glVertex2d(30,-10)
	glEnd()

def draw_O():
	#O
	glBegin(GL_LINES)             
	glVertex2d(60, 10)
	glVertex2d(60, -20)
	glVertex2d(60, 10)
	glVertex2d(90, 10)
	glVertex2d(90, 10)
	glVertex2d(90, -20)
	glVertex2d(60, -20)
	glVertex2d(90, -20)
	glEnd()

def draw_R():
	#R
	glBegin(GL_LINES)             
	glVertex2d(100, 10)
	glVertex2d(100, -20)
	glVertex2d(100, 10)
	glVertex2d(120, 0)
	glVertex2d(120, 0)
	glVertex2d(100, -10)
	glVertex2d(100, -10)
	glVertex2d(120, -20)
	glEnd()

def draw_T():
	#T
	glBegin(GL_LINES)             
	glVertex2d(130, 10)
	glVertex2d(130, -20)
	glVertex2d(125, 10)
	glVertex2d(135, 10)
	glEnd()

def draw_E():
	#E
	glBegin(GL_LINES)             
	glVertex2d(140, 10)
	glVertex2d(140, -20)
	glVertex2d(140, 10)
	glVertex2d(170, 10)
	glVertex2d(140, -5)
	glVertex2d(160, -5)
	glVertex2d(140, -20)
	glVertex2d(170, -20)
	glEnd()
	
	
def draw():                                            # ondraw is called all the time
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT) # clear the screen
    glLoadIdentity()                                   # reset position
    refresh2d(width, height)                           # set mode to 2d
    glColor3f(1.0, 0.0, 0.0)
    
    draw_F()
    draw_A()
    draw_B()
    draw_I()
    glTranslatef(80,0,0)
    draw_A()
    glLoadIdentity()
    draw_N()
    
    glColor3f(0,1,0)
    draw_P()
    draw_O()
    draw_R()
    draw_T()
    draw_E()
    glTranslatef(80,0,0)
    draw_R()
    glLoadIdentity()
    glTranslatef(150,0,0)
    draw_O()
    

    glutSwapBuffers()                                # important for double buffering

def refresh2d(width, height):
    glViewport(0, 0, width, height)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, width, 0.0, height, 0.0, 1.0)
    glTranslatef(250,350,0)
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



