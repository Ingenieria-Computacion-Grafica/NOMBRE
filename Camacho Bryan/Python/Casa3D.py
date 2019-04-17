import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
from OpenGL.GL.shaders import *
import math

def draw_rect(x, y, width, height):
    glBegin(GL_QUADS)                                  # start drawing a rectangle
    glVertex2f(x, y)                                   # bottom left point
    glVertex2f(x + width, y)                           # bottom right point
    glVertex2f(x + width, y + height)                  # top right point
    glVertex2f(x, y + height)                          # top left point
    glEnd()

vertices = (
    (1,-1,-1),
    (-1,-1,-1),
    (1,-1,1),
    (-1,-1,1),
    (0, 0, 0),
    (0,-3,0)
)

vertices1 = (
    (1,-1,-1),
    (-1,-1,-1),
    (1,-1,1),
    (-1,-1,1),
    (1,1,-1),
    (-1,1,-1),
    (1,1,1),
    (-1,1,1)
)

edges =(
	(0,1),
	(0,2),
    (0,4),
    (3,1),
    (3,2),
	(3,4),
	(1,4),
    (2,4),
    (0,5),
    (1,5),
    (2,5),
    (3,5)
)

edges1 =(
    (0,1),
    (0,2),
    (0,4),
    (1,3),
    (1,5),
    (3,2),
    (3,7),
    (2,6),
    (4,5),
    (4,6),
    (5,7),
    (7,6)
)
surfaces = {
	(0,1,4),
	(2,3,4),
	(1,3,4),
	(0,2,4),
    (0,1,5),
    (2,3,5),
    (1,3,5),
    (0,2,5)
}

surfaces1 = {
    (0,1,3,2),
    (4,5,7,6),
    (1,5,7,3),
    (0,4,6,2),
    (0,4,5,1),
    (2,6,7,3)
}

colors = [
	(1,1,0),
	(0,1,0),
    (1,1,1),
    (1,1,0),
    (0,1,0),
    (1,1,1),
    (1,1,0),
    (0,1,0),
    (1,1,1),
    (1,1,0),
    (0,1,0),
    (1,1,1)
]

colors1 = [
    (0.6,0.6,0),
    (0.6,0.5,0.6),
    (0.6,0.6,0),
    (0.6,0.5,0.6),
    (0.6,0.6,0),
    (0.6,0.5,0.6),
    (0.6,0.6,0),
    (0.6,0.5,0.6),
    (0.6,0.6,0),
    (0.6,0.5,0.6),
    (0.6,0.6,0),
    (0.6,0.5,0.6)
]

def Techo():

    glBegin(GL_TRIANGLES)
    for surface in surfaces:
        x = 0
        for vertex in surface:
            x = x + 1
            glColor3fv(colors[x])
            glVertex3fv(vertices[vertex])
    glEnd()

    glLineWidth(5)
    glColor3f(0,0,0)
    glBegin(GL_LINES)
    for edge in edges:
        for vertex in edge:
            glVertex3fv(vertices[vertex])
    glEnd()


def Bloque():

    glBegin(GL_QUADS)
    for surface in surfaces1:
        x = 0
        for vertex in surface:
            x = x + 1
            glColor3fv(colors1[x])
            glVertex3fv(vertices1[vertex])
    glEnd()

    glLineWidth(5)
    glColor3f(0,0,0)
    glBegin(GL_LINES)
    for edge in edges1:
        for vertex in edge:
            glVertex3fv(vertices1[vertex])
    glEnd()

def Puerta():
    
    glColor3f(1,1,1)
    glBegin(GL_QUADS)
    glVertex3f(-0.25,1,1.01)
    glVertex3f(-0.25,0,1.01)
    glVertex3f(0.25,0,1.01)
    glVertex3f(0.25,1,1.01)
    glEnd()

def Ventanas():
    
    glColor3f(0,0,0)
    glBegin(GL_QUADS)
    glVertex3f(-0.8,-0.75,1.01)
    glVertex3f(-0.8,-0.25,1.01)
    glVertex3f(-0.3,-0.25,1.01)
    glVertex3f(-0.3,-0.75,1.01)
    glEnd()

    glColor3f(0,0,0)
    glBegin(GL_QUADS)
    glVertex3f(0.8,-0.75,1.01)
    glVertex3f(0.8,-0.25,1.01)
    glVertex3f(0.3,-0.25,1.01)
    glVertex3f(0.3,-0.75,1.01)
    glEnd()

def Draw():
    Techo()
    Bloque()
    Puerta()
    Ventanas()

def main():
    pygame.init()
    display = (1200,768)
    pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
    glEnable(GL_DEPTH_TEST)
    gluPerspective(45, (display[0]/display[1]),0.1,50.0)
    glTranslatef(0,-1,-8)
    glRotatef(180,0,0,1)
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
        glRotatef(1,0,1,0)
        glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
        Draw()
        pygame.display.flip()
        pygame.time.wait(10)

main()







