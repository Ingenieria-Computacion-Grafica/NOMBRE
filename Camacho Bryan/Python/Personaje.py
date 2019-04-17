import pygame
from pygame.locals import *
from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
from OpenGL.GL.shaders import *
import math

width, height = 1200, 768

def draw_rect(x, y, width, height):
    glBegin(GL_QUADS)                                  # start drawing a rectangle
    glVertex2f(x, y)                                   # bottom left point
    glVertex2f(x + width, y)                           # bottom right point
    glVertex2f(x + width, y + height)                  # top right point
    glVertex2f(x, y + height)                          # top left point
    glEnd()


def Mosaico():
    
    #Cabeza
    glBegin(GL_QUADS)
    glColor3f(0,1,0)
    glVertex2f(625,600)
    glVertex2f(685,675)
    glColor3f(0,0,0)
    glVertex2f(625,750)
    glVertex2f(565,675)
    glEnd()
    
    #Torso
    glBegin(GL_QUADS)
    glColor3f(0,1,0)
    glVertex2f(550,600)
    glVertex2f(700,600)
    glColor3f(0,0,0)
    glVertex2f(700,300)
    glVertex2f(550,300)
    glEnd()

    #Pierna Derecha
    glBegin(GL_QUADS)
    glColor3f(0,0,0)
    glVertex2f(550,300)
    glVertex2f(600,300)
    glColor3f(0,1,0)
    glVertex2f(600,50)
    glVertex2f(550,50)
    glEnd()
    
    #Pie Derecho
    glBegin(GL_TRIANGLES)
    glColor3f(0,1,0)
    glVertex2f(550,50)
    glColor3f(0,1,0)
    glVertex2f(550,100)
    glColor3f(0,0,0)
    glVertex2f(475,50)
    glEnd()

    #Pierna Izquierda
    glBegin(GL_QUADS)
    glColor3f(0,0,0)
    glVertex2f(650,300)
    glVertex2f(700,300)
    glColor3f(0,1,0)
    glVertex2f(700,50)
    glVertex2f(650,50)
    glEnd()
    
    #Pie Izquierdo
    glBegin(GL_TRIANGLES)
    glColor3f(0,1,0)
    glVertex2f(700,50)
    glColor3f(0,1,0)
    glVertex2f(700,100)
    glColor3f(0,0,0)
    glVertex2f(775,50)
    glEnd()

    #Brazo Izquierdo
    glBegin(GL_QUADS)
    glColor3f(0,1,0)
    glVertex2f(700,600)
    glColor3f(0,0,0)
    glVertex2f(900,600)
    glColor3f(0,0,0)
    glVertex2f(900,560)
    glColor3f(0,1,0)
    glVertex2f(700,560)
    glEnd()
    
    #Mano Izquierda
    glBegin(GL_QUADS)
    glColor3f(0,0,0)
    glVertex2f(910,600)
    glColor3f(0,0,0)
    glVertex2f(910,560)
    glColor3f(0,1,0)
    glVertex2f(960,560)
    glColor3f(0,1,0)
    glVertex2f(960,600)
    glEnd()
    
    #Brazo Derecho
    glBegin(GL_QUADS)
    glColor3f(0,1,0)
    glVertex2f(550,600)
    glColor3f(0,0,0)
    glVertex2f(350,600)
    glColor3f(0,0,0)
    glVertex2f(350,560)
    glColor3f(0,1,0)
    glVertex2f(550,560)
    glEnd()

    #Mano Derecha
    glBegin(GL_QUADS)
    glColor3f(0,0,0)
    glVertex2f(340,600)
    glColor3f(0,0,0)
    glVertex2f(340,560)
    glColor3f(0,1,0)
    glVertex2f(290,560)
    glColor3f(0,1,0)
    glVertex2f(290,600)
    glEnd()


def main():
    pygame.init()
    display = (width,height)
    pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
    glOrtho(0,width,0,height,0,10)
    
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
            if event.type == KEYDOWN:
                if event.key == pygame.K_LEFT:
                    glTranslatef(-5,0,0)
                if event.key == pygame.K_RIGHT:
                    glTranslatef(5,0,0)
                if event.key == pygame.K_UP:
                    glTranslatef(0,5,0)
                if event.key == pygame.K_DOWN:
                    glTranslatef(0,-5,0)

        glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
        glClearColor(1,1,1,1)
        Mosaico()
        pygame.display.flip()
        pygame.time.wait(10)
main()







