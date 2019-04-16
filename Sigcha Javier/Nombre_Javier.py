import pygame
from pygame.locals import *
from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
import math
window = 0                                             # glut window number
width, height = 700, 700                               # window size

CIRCLE_ANGLE_INC = 45                                 # amount of degrees to step circles 

def draw_rect(x, y, width, height):
    glBegin(GL_QUADS)                                  # start drawing a rectangle
    glVertex2f(x, y)                                   # bottom left point
    glVertex2f(x + width, y)                           # bottom right point
    glVertex2f(x + width, y + height)                  # top right point
    glVertex2f(x, y + height)                          # top left point
    glEnd() 

def draw_J():
    glBegin(GL_LINES) 
    glVertex2f(10, 50) 
    glVertex2f(50, 50) 
    glVertex2f(30, 50) 
    glVertex2f(30, 20) 
    glVertex2f(10, 20) 
    glVertex2f(30, 20)                                               
    glEnd() 

def draw_A():
    glBegin(GL_LINES) 
    glVertex2f(60, 50) 
    glVertex2f(60, 20) 
    glVertex2f(60, 50) 
    glVertex2f(90, 50)
    glVertex2f(90, 50) 
    glVertex2f(90, 20)
    glVertex2f(60, 35) 
    glVertex2f(90, 35) 
                                              
    glEnd() 

def draw_V():
    glBegin(GL_LINES) 
    glVertex2f(100, 50) 
    glVertex2f(110, 15) 
    glVertex2f(110, 15) 
    glVertex2f(130, 50)
    
                                              
    glEnd() 



def draw_I():
    glBegin(GL_LINES) 
    glVertex2f(140, 50) 
    glVertex2f(140, 20) 
                          
    glEnd() 

def draw_E ():
    glBegin(GL_LINES)
    glVertex2f(160,50)
    glVertex2f(160,20)
    glVertex2f(160,50)
    glVertex2f(180,50)
    glVertex2f(160,35)
    glVertex2f(180,35)
    glVertex2f(160,20)
    glVertex2f(180,20)

    glEnd()

def draw_R ():
    glBegin(GL_LINES)
    glVertex2f(200,50)
    glVertex2f(200,20)
    glVertex2f(200,50)
    glVertex2f(220,50)
    glVertex2f(220,50)
    glVertex2f(220,30)
    glVertex2f(220,30)
    glVertex2f(200,30)
    glVertex2f(200,30)
    glVertex2f(220,20)

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
    draw_V()
    glColor3f(.0, 1.0, 0.0) 
    draw_A()
    glColor3f(1.0, 1.0, 0.0) 
    draw_I()
    glColor3f(1.0, 1.0, 0.0)
    draw_E()
    glColor3f(1.0, 1.0, 1.0)
    draw_R()
    glColor3f(0.0,0.0,1.0)
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



