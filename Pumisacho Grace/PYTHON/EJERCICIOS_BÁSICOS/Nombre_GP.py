import pygame
from pygame.locals import *
from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
import math
import G
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

G.draw_G()
                
             
def draw_R():
    glBegin(GL_LINES);
    glVertex2d(65,50);
    glVertex2d(65,10);
    glVertex2d(60,50);
    glVertex2d(60,10);
    glVertex2d(60,50);
    glVertex2d(90,50);
    glVertex2d(90,50);
    glVertex2d(90,40);
    glVertex2d(90,40);
    glVertex2d(80,30);
    glVertex2d(80,30);
    glVertex2d(60,30);
    glVertex2d(80,30);
    glVertex2d(90,10);
    glEnd();
            
def draw_A():
             
    glBegin(GL_LINES);
    glVertex2d(105,50);
    glVertex2d(105,10);
    glVertex2d(100,50);
    glVertex2d(100,10);
    glVertex2d(100,50);
    glVertex2d(130,50);
    glVertex2d(130,50);
    glVertex2d(130,10);
    glVertex2d(100,30);
    glVertex2d(130,30);
    glEnd();
            
def draw_C():
             
    glBegin(GL_LINES);
    glVertex2d(145,50);
    glVertex2d(145,10);
    glVertex2d(140,50);
    glVertex2d(140,10);
    glVertex2d(140,50);
    glVertex2d(170,50);
    glVertex2d(170,10);
    glVertex2d(140,10);
    glEnd();
            
def draw_E():
             
    glBegin(GL_LINES);
    glVertex2d(185,50);
    glVertex2d(185,10);
    glVertex2d(180,50);
    glVertex2d(180,10);
    glVertex2d(180,50);
    glVertex2d(210,50);
    glVertex2d(210,10);
    glVertex2d(180,10);
    glVertex2d(200,30);
    glVertex2d(180,30);
    glEnd();
            
          
def draw_P():
             
    glBegin(GL_LINES);
    glVertex2d(245,50);
    glVertex2d(245,10);
    glVertex2d(240,50);
    glVertex2d(240,10);
    glVertex2d(280,50);
    glVertex2d(280,30);
    glVertex2d(240,50);
    glVertex2d(280,50);
    glVertex2d(240,30);
    glVertex2d(280,30);
    glEnd();

def draw_U():
             
    glBegin(GL_LINES);
    glVertex2d(295,50);
    glVertex2d(295,10);
    glVertex2d(290,50);
    glVertex2d(290,10);
    glVertex2d(290,10);
    glVertex2d(330,10);
    glVertex2d(330,50);
    glVertex2d(330,10);
    glEnd();  
              
def draw_M():
             
    glBegin(GL_LINES);
    glVertex2d(345,47);
    glVertex2d(345,10);
    glVertex2d(340,50);
    glVertex2d(340,10);
    glVertex2d(340,50);
    glVertex2d(360,30);
    glVertex2d(360,30);
    glVertex2d(380,50);
    glVertex2d(380,50);
    glVertex2d(380,10);
    glEnd();  
              
def draw_I():
             
    glBegin(GL_LINES);

    glVertex2d(390,47);
    glVertex2d(420,47);
    glVertex2d(404,47);
    glVertex2d(404,10);
    glVertex2d(411,47);
    glVertex2d(411,10);
    glVertex2d(390,10);
    glVertex2d(420,10);
    glEnd();  
              
def draw_S():
             
    glBegin(GL_LINES);
    glVertex2d(430,50);
    glVertex2d(430,30);
    glVertex2d(435,50);
    glVertex2d(435,30);
    glVertex2d(430,50);
    glVertex2d(460,50);
    glVertex2d(460,30);
    glVertex2d(430,30);
    glVertex2d(460,30);
    glVertex2d(460,10);
    glVertex2d(430,10);
    glVertex2d(460,10);
    glEnd();
              
def draw_B():
             
    glBegin(GL_LINES);
    glVertex2d(475,50);
    glVertex2d(475,10);
    glVertex2d(470,50);
    glVertex2d(470,10);
    glVertex2d(470,50);
    glVertex2d(500,50);
    glVertex2d(500,50);
    glVertex2d(500,10);
    glVertex2d(470,30);
    glVertex2d(500,30);
    glEnd();
            
def draw_N():
             
    glBegin(GL_LINES);
    glVertex2d(510,50);
    glVertex2d(510,10);
    glVertex2d(515,50);
    glVertex2d(515,10);
    glVertex2d(510,50);
    glVertex2d(540,50);
    glVertex2d(540,10);
    glVertex2d(510,10);
    glEnd();   
            
def draw_H():
             
    glBegin(GL_LINES);
    glVertex2d(555,50);
    glVertex2d(555,10);
    glVertex2d(550,50);
    glVertex2d(550,10);
    glVertex2d(585,50);
    glVertex2d(585,10);
    glVertex2d(550,30);
    glVertex2d(585,30);
    glEnd();  
            
def draw_O():
             
    glBegin(GL_LINES);
    glVertex2d(600,50);
    glVertex2d(600,10);
    glVertex2d(595,50);
    glVertex2d(595,10);
    glVertex2d(630,50);
    glVertex2d(630,10);
    glVertex2d(595,50);
    glVertex2d(630,50);
    glVertex2d(595,10);
    glVertex2d(630,10);
    glEnd();



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
    draw_G()
    glColor3f(0.0, 0.0, 1.0) 
    draw_R()
    glColor3f(.0, 1.0, 0.0) 
    draw_A()
    glColor3f(0.190, 0.20, 0.40) 
    draw_C()
    glColor3f(1.0, 1.0, 5.0)
    draw_E()
    glColor3f(1.0, 1.0, 0.0)
    draw_P()
    glColor3f(2.0, 0.0, 1.0)
    draw_U()
    glColor3f(0.0, 1.0, 2.0)
    draw_M()
    glColor3f(0.9, 0.6, 0.4)
    draw_I()
    glColor3f(0.5, 0.6, 0.5)
    draw_S()
    glColor3f(0.9, 0.27, 0.15)
    draw_B()
    glColor3f(0.76, 0.51, 0.95)
    draw_N()
    glColor3f(0.1, 0.5, 0.9)
    draw_H()
    glColor3f(1.0, 0.21, 0.0)
    draw_O()
    glColor3f(0.910, 0.1, 0.4)

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
window = glutCreateWindow("Mi primer programa GRACE PUMISACHO")              # create window with title
glutDisplayFunc(draw)                                  # set draw function callback
glutIdleFunc(draw)                                     # draw all the time
glutMainLoop() 



