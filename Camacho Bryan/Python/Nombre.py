import pygame
from pygame.locals import *
from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
from OpenGL.GL.shaders import *
import math
window = 0                                             # glut window number
width, height = 1280, 960                               # window size

CIRCLE_ANGLE_INC = 45                                 # amount of degrees to step circles 

def draw_rect(x, y, width, height):
    glBegin(GL_QUADS)                                  # start drawing a rectangle
    glVertex2f(x, y)                                   # bottom left point
    glVertex2f(x + width, y)                           # bottom right point
    glVertex2f(x + width, y + height)                  # top right point
    glVertex2f(x, y + height)                          # top left point
    glEnd()


def draw_B():
    glBegin(GL_LINES) 
    glVertex2f(50, 50)
    glVertex2f(50, 350)
    glVertex2f(50, 350)
    glVertex2f(150, 275)
    glVertex2f(150, 275)
    glVertex2f(50, 200)
    glVertex2f(50, 200)
    glVertex2f(150, 125)
    glVertex2f(150, 125)
    glVertex2f(50, 50)
    
    glEnd() 

def draw_R():
    glBegin(GL_LINES) 
    glVertex2f(200, 50)
    glVertex2f(200, 350)
    glVertex2f(200, 350)
    glVertex2f(300, 275)
    glVertex2f(300, 275)
    glVertex2f(200, 200)
    glVertex2f(200, 200)
    glVertex2f(300, 50)
                                              
    glEnd()

def draw_Y():
    glBegin(GL_LINES) 
    glVertex2f(400, 50)
    glVertex2f(400, 200)
    glVertex2f(400, 200)
    glVertex2f(350, 350)
    glVertex2f(400, 200)
    glVertex2f(450, 350)
                                              
    glEnd() 

def draw_A():
    glBegin(GL_LINES) 
    glVertex2f(500, 50)
    glVertex2f(550, 350)
    glVertex2f(550, 350)
    glVertex2f(600, 50)
    glVertex2f(525, 200)
    glVertex2f(575, 200)
                                              
    glEnd()

def draw_N():
    glBegin(GL_LINES)
    glVertex2f(650, 50)
    glVertex2f(650, 350)
    glVertex2f(650, 350)
    glVertex2f(750, 50)
    glVertex2f(750, 50)
    glVertex2f(750, 350)
    
    glEnd()

def draw_TRIANGLES1():
    glBegin(GL_TRIANGLES)
    glVertex2f(700, 900)
    glVertex2f(1200, 900)
    glVertex2f(825, 650)
    glEnd()

def draw_TRIANGLES2():
    glBegin(GL_TRIANGLES)
    glVertex2f(1200, 900)
    glVertex2f(950, 400)
    glVertex2f(825, 650)
    glEnd()

def draw_U():
    glBegin(GL_QUADS)
    glVertex2f(850, 850)
    glVertex2f(925, 850)
    glVertex2f(925, 825)
    glVertex2f(850, 825)
    glEnd()

    glBegin(GL_QUADS)
    glVertex2f(1050, 850)
    glVertex2f(1050, 825)
    glVertex2f(975, 825)
    glVertex2f(975, 850)
    glEnd()

    glBegin(GL_QUADS)
    glVertex2f(872.5, 825)
    glVertex2f(872.5, 625)
    glVertex2f(902.5, 625)
    glVertex2f(902.5, 825)
    glEnd()

    glBegin(GL_QUADS)
    glVertex2f(1027.5, 825)
    glVertex2f(1027.5, 625)
    glVertex2f(997.5, 625)
    glVertex2f(997.5, 825)
    glEnd()

    glBegin(GL_QUADS)
    glVertex2f(872.5, 625)
    glVertex2f(1027.5, 625)
    glVertex2f(1027.5, 600)
    glVertex2f(872.5, 600)
    glEnd()

    #Terminamos la U
def draw():                                            # ondraw is called all the time
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT) # clear the screen
    glLoadIdentity()                                   # reset position
    refresh2d(width, height)                           # set mode to 2d
    #gluPerspective(60, (width/height),0,10)
    glColor3f(1.0, 1.0, 1.0)                           # set color to blue
    #draw_rect(10, 10, 200, 100)                        # rect at (10, 10) with width 200, height 100

    draw_B()
    glColor3f(1.0, 0.0, 0.0)
    draw_R()
    glColor3f(1.0, 1.0, 1.0)
    draw_Y()
    glColor3f(1.0, 0.0, 0.0)
    draw_A()
    glColor3f(1.0, 1.0, 1.0)
    draw_N()
    
    glColor3f(0, 0 ,1)
    draw_TRIANGLES1()
    
    glColor3f(1, 0 ,0)
    draw_TRIANGLES2()
    
    glColor3f(1, 1, 1)
    draw_U()

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
#pygame.init()
glutInitDisplayMode(GLUT_RGBA | GLUT_DOUBLE | GLUT_ALPHA | GLUT_DEPTH)
glutInitWindowSize(width, height)                      # set window size
glutInitWindowPosition(0, 0)                           # set window position
window = glutCreateWindow("Nombre Bryan")              # create window with title
glutDisplayFunc(draw)                                  # set draw function callback
glutIdleFunc(draw)                                     # draw all the time
glutMainLoop() 



