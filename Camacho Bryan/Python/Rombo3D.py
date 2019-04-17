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

    #vertices = (
    #(1,-1,-1),
    #(1,1,-1),
    #(-1,1,-1),
    #(-1,-1,-1),
    #(1,-1,1),
    #(1,1,1),
    #(-1,-1,1),
#(-1,1,1)
#)

vertices = (
    (1,-1,-1),
    (-1,-1,-1),
    (1,-1,1),
    (-1,-1,1),
    (0, 1, 0),
    (0,-3,0)
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

def Cube():
    glBegin(GL_TRIANGLES)
    
    #glColor3fv((0,1,0))
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

def main():
    pygame.init()
    display = (1200,768)
    pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
    glEnable(GL_DEPTH_TEST)
    gluPerspective(30, (display[0]/display[1]),0.1,50.0)
    glTranslatef(0,1,-8)
    glRotatef(0,0,0,0)
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
        glRotatef(0.5,0,1,0)
        glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
        Cube()
        pygame.display.flip()
        pygame.time.wait(10)
main()







