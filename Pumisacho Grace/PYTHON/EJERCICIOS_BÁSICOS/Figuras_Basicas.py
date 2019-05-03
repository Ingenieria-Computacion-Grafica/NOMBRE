import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
import math


def Cuadrado(x,y,z,r,g,b,w,h,d,rx,ry,rz):
    glPushMatrix()
    glTranslatef(x, y, z)
    glRotatef(rx, 1, 0, 0)
    glRotatef(ry, 0, 1, 0)
    glRotatef(rz, 0, 0, 1)
    glScalef(w, h, d)
    
    glColor3f(r, g, b)
    
    

    glBegin(GL_QUADS)
     #  // Set the current drawing color to light blue
    glVertex3f(-1.0, 1.0, 0.0)  #// Top Left
    glVertex3f(1.0, 1.0, 0.0)  # // Top Right
    glVertex3f(1.0, -1.0, 0.0)  #// Bottom Right
    glVertex3f(-1.0, -1.0, 0.0) #// Bottom Left
    glEnd()
    glPopMatrix()


def Triangulo(x,y,z,r,g,b,w,h,d,rx,ry,rz):
    
    glPushMatrix()
    glTranslatef(x, y, z)
    glRotatef(rx, 1, 0, 0)
    glRotatef(ry, 0, 1, 0)
    glRotatef(rz, 0, 0, 1)
    glScalef(w, h, d)
    
    glColor3f(r, g, b)

    glBegin(GL_TRIANGLES)
    glColor3f(1.0, 0.0, 0.0) #   // Set the current drawing color to red
    glVertex3f(0, 0, 0.0)   #// Top
    glColor3f(0.0, .1, 0.0)   # // Set the current drawing color to green
    glVertex3f(-0.3, 0, 0.0) #// Bottom Left
    glColor3f(0.0, 0.0, 1.0)#    // Set the current drawing color to blue
    glVertex3f(0, 0.3, 0)  # Bottom Right
    glEnd()
    glPopMatrix()


def Circulo (x,y,z,r,g,b,w,h,d,c,rx,ry,rz):
    
    glPushMatrix()
    glTranslatef(x, y, z)
    glRotatef(rx, 1, 0, 0)
    glRotatef(ry, 0, 1, 0)
    glRotatef(rz, 0, 0, 1)
    glScalef(w, h, d)
  

    glBegin(GL_POLYGON)
    
    i=0

    for i in  range(0,30):
#        glColor3f(1.0, 0.0, 0.0)
        glColor3f(r, g, b)
        calx = (c * math.cos(i))
        caly=  (c * math.sin(i))
        glVertex3d(calx,caly,0)
        
    i=i+1
        
    glEnd()
    
    glPopMatrix()
     

