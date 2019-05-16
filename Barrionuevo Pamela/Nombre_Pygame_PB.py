import pygame
from pygame.locals import *
from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
import math
window = 0                                             # glut window number
width, height = 900, 900                               # window size

CIRCLE_ANGLE_INC = 45                                 # amount of degrees to step circles 

def draw_rect(x, y, width, height):
    glBegin(GL_QUADS)                                  # start drawing a rectangle
    glVertex2f(x, y)                                   # bottom left point
    glVertex2f(x + width, y)                           # bottom right point
    glVertex2f(x + width, y + height)                  # top right point
    glVertex2f(x, y + height)                          # top left point
    glEnd() 

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


def draw_TRIANGLES():
    glBegin(GL_TRIANGLES) 
    glVertex2f(60, 100) 
    glVertex2f(60, 150) 
    glVertex2f(100, 100)                                               
    glEnd() 

def draw_QUADS():
    glBegin(GL_QUADS) 
    glVertex2f(130, 100) 
    glVertex2f(130, 150) 
    glVertex2f(150, 150)
    glVertex2f(150, 100)                                               
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

def draw_B():
    glBegin(GL_LINES) 
    glVertex2f(220, 10) 
    glVertex2f(220, 50) 
    glVertex2f(220, 50) 
    glVertex2f(240, 50)
    glVertex2f(240, 50) 
    glVertex2f(240, 30)
    glVertex2f(220, 30)
    glVertex2f(260, 30)
    glVertex2f(260, 30)
    glVertex2f(260, 10)
    glVertex2f(220, 10)
    glVertex2f(260, 10)                                              
    glEnd()

def draw_A():
    glBegin(GL_LINES) 
    glVertex2f(270, 10) 
    glVertex2f(270, 50) 
    glVertex2f(270, 50) 
    glVertex2f(310, 50)
    glVertex2f(270, 30) 
    glVertex2f(310, 30)
    glVertex2f(310, 50) 
    glVertex2f(310, 10)                                              
    glEnd() 

def draw_R():
    glBegin(GL_LINES) 
    glVertex2f(330, 10) 
    glVertex2f(330, 50) 
    glVertex2f(330, 50) 
    glVertex2f(350, 50)
    glVertex2f(350, 50) 
    glVertex2f(350, 30)
    glVertex2f(330, 30) 
    glVertex2f(365, 30)
    glVertex2f(365, 30)
    glVertex2f(365, 10)                                              
    glEnd() 

def draw_R():
    glBegin(GL_LINES) 
    glVertex2f(380, 10) 
    glVertex2f(380, 50) 
    glVertex2f(380, 50) 
    glVertex2f(400, 50)
    glVertex2f(400, 50) 
    glVertex2f(400, 30)
    glVertex2f(380, 30) 
    glVertex2f(415, 30)
    glVertex2f(415, 30)
    glVertex2f(415, 10)                                              
    glEnd() 

def draw_I():
    glBegin(GL_LINES) 
    glVertex2f(430, 10) 
    glVertex2f(430, 50)                                                   
    glEnd() 

def draw_O():
    glBegin(GL_LINES) 
    glVertex2f(445, 10) 
    glVertex2f(445, 50) 
    glVertex2f(445, 50) 
    glVertex2f(485, 50)
    glVertex2f(445, 10) 
    glVertex2f(445, 10)
    glVertex2f(485, 50) 
    glVertex2f(485, 10)
    glVertex2f(445, 10)
    glVertex2f(485, 10)                                              
    glEnd() 

def draw_N():
    glBegin(GL_LINES) 
    glVertex2f(500, 10) 
    glVertex2f(500, 50) 
    glVertex2f(500, 50) 
    glVertex2f(540, 10)
    glVertex2f(540, 10) 
    glVertex2f(540, 50)                                               
    glEnd()

def draw_U():
    glBegin(GL_LINES) 
    glVertex2f(500, 10) 
    glVertex2f(500, 50) 
    glVertex2f(500, 50) 
    glVertex2f(540, 10)
    glVertex2f(540, 10) 
    glVertex2f(540, 50) 
                                              
    glEnd()

def draw_E():
    glBegin(GL_LINES) 
    glVertex2f(590, 10) 
    glVertex2f(590, 50) 
    glVertex2f(590, 50) 
    glVertex2f(630, 50)
    glVertex2f(590, 30) 
    glVertex2f(630, 30)
    glVertex2f(590, 10) 
    glVertex2f(630, 10)   
                                              
    glEnd()

def draw_V():
    glBegin(GL_LINES) 
    glVertex2f(640, 50) 
    glVertex2f(660, 10) 
    glVertex2f(660, 10) 
    glVertex2f(680, 50)       
                                              
    glEnd()

def draw_O():
    glBegin(GL_LINES) 
    glVertex2f(690, 10) 
    glVertex2f(690, 50) 
    glVertex2f(690, 50) 
    glVertex2f(730, 50)
    glVertex2f(690, 10) 
    glVertex2f(730, 10) 
    glVertex2f(730, 50) 
    glVertex2f(730, 10)
    glVertex2f(690, 10) 
    glVertex2f(730, 10)        
                                              
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
    
    draw_P()
    glColor3f(0.0, 0.0, 1.0) 

    draw_A()
    glColor3f(2.0, 0.5, 1.0) 

    draw_M()
    glColor3f(1.0, 1.0, 0.0) 

    draw_E()
    glColor3f(2.0, 0.5, 1.0)

    draw_B()
    glColor3f(0.0, 0.0, 1.0) 

    draw_A()
    glColor3f(.0, 1.0, 0.0) 

    draw_R()
    glColor3f(2.0, 0.5, 1.0) 

    draw_R()
    glColor3f(1.0, 1.0, 0.0)

    draw_I()
    glColor3f(0.0, 0.0, 1.0) 

    draw_O()
    glColor3f(2.0, 0.5, 1.0) 

    draw_N()
    glColor3f(1.0, 1.0, 0.0)
 
    draw_U()
    glColor3f(2.0, 0.5, 1.0)

    draw_E()
    glColor3f(0.0, 0.0, 1.0) 

    draw_V()
    glColor3f(.0, 1.0, 0.0) 

    draw_O()
    glColor3f(1.0, 1.0, 0.0) 
    

    draw_TRIANGLES()
    #glTranslatef(300,300,0)
    glColor3f(0.0, 1.0, 0.0) 
    draw_QUADS()

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
window = glutCreateWindow("Nombre Pygame PB")              # create window with title
glutDisplayFunc(draw)                                  # set draw function callback
glutIdleFunc(draw)                                     # draw all the time
glutMainLoop() 



