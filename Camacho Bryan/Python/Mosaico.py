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
    
    glColor3f(0,1,1)
    glBegin(GL_TRIANGLES)
    glVertex2f(450,400)
    glVertex2f(650,400)
    glVertex2f(550,500)
    glEnd()

    glColor3f(0,0.7,1)
    glBegin(GL_TRIANGLES)
    glVertex2f(450,400)
    glVertex2f(650,400)
    glVertex2f(550,300)
    glEnd()

    glColor3f(0,0.4,1)
    glBegin(GL_QUADS)
    glVertex2f(450,400)
    glVertex2f(550,500)
    glVertex2f(250,600)
    glVertex2f(150,500)
    glEnd()

    glColor3f(0,0.65,1)
    glBegin(GL_QUADS)
    glVertex2f(650,400)
    glVertex2f(550,500)
    glVertex2f(850,600)
    glVertex2f(950,500)
    glEnd()

    glColor3f(0,0.15,1)
    glBegin(GL_QUADS)
    glVertex2f(450,400)
    glVertex2f(550,300)
    glVertex2f(250,200)
    glVertex2f(150,300)
    glEnd()

    glColor3f(0,0.95,1)
    glBegin(GL_QUADS)
    glVertex2f(650,400)
    glVertex2f(550,300)
    glVertex2f(850,200)
    glVertex2f(950,300)
    glEnd()

    glColor3f(0,0.3,1)
    glBegin(GL_TRIANGLES)
    glVertex2f(950,500)
    glVertex2f(650,400)
    glVertex2f(950,300)
    glEnd()

    glColor3f(0,0.8,1)
    glBegin(GL_TRIANGLES)
    glVertex2f(150,500)
    glVertex2f(450,400)
    glVertex2f(150,300)
    glEnd()

    glColor3f(0,0.15,1)
    glBegin(GL_TRIANGLES)
    glVertex2f(250,600)
    glVertex2f(550,500)
    glVertex2f(850,600)
    glEnd()

    glColor3f(0,0.7,1)
    glBegin(GL_TRIANGLES)
    glVertex2f(250,200)
    glVertex2f(550,300)
    glVertex2f(850,200)
    glEnd()

    glColor3f(0,0.8,0.8)
    glBegin(GL_TRIANGLES)
    glVertex2f(150,500)
    glVertex2f(250,600)
    glVertex2f(150,600)
    glEnd()

    glColor3f(0,0.8,0.8)
    glBegin(GL_TRIANGLES)
    glVertex2f(950,500)
    glVertex2f(950,600)
    glVertex2f(850,600)
    glEnd()

    glColor3f(0,0.8,0.8)
    glBegin(GL_TRIANGLES)
    glVertex2f(950,300)
    glVertex2f(950,200)
    glVertex2f(850,200)
    glEnd()
    
    glColor3f(0,0.8,0.8)
    glBegin(GL_TRIANGLES)
    glVertex2f(150,300)
    glVertex2f(250,200)
    glVertex2f(150,200)
    glEnd()

    glColor3f(0,0,0.7)
    glBegin(GL_TRIANGLES)
    glVertex2f(150,600)
    glVertex2f(350,900)
    glVertex2f(550,600)
    glEnd()

    glColor3f(0,0,0.7)
    glBegin(GL_TRIANGLES)
    glVertex2f(550,600)
    glVertex2f(750,900)
    glVertex2f(950,600)
    glEnd()

    glColor3f(0,0,1)
    glBegin(GL_TRIANGLES)
    glVertex2f(350,900)
    glVertex2f(550,600)
    glVertex2f(750,900)
    glEnd()

    glColor3f(0,0,0.7)
    glBegin(GL_TRIANGLES)
    glVertex2f(150,200)
    glVertex2f(350,-100)
    glVertex2f(550,200)
    glEnd()
    
    glColor3f(0,0,0.7)
    glBegin(GL_TRIANGLES)
    glVertex2f(550,200)
    glVertex2f(750,-100)
    glVertex2f(950,200)
    glEnd()
    
    glColor3f(0,0,1)
    glBegin(GL_TRIANGLES)
    glVertex2f(350,-100)
    glVertex2f(550,200)
    glVertex2f(750,-100)
    glEnd()

    glColor3f(1,1,1)
    glBegin(GL_TRIANGLES)
    glVertex2f(50,600)
    glVertex2f(50,200)
    glVertex2f(-100,400)
    glEnd()

    glColor3f(1,1,1)
    glBegin(GL_TRIANGLES)
    glVertex2f(1050,600)
    glVertex2f(1200,400)
    glVertex2f(1050,200)
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
                if event.key == pygame.K_1:
                    glScalef(1.1,1.1,1.1)
                if event.key == pygame.K_2:
                    glScalef(0.9,0.9,0.9)

        glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
        Mosaico()
        pygame.display.flip()
        pygame.time.wait(10)
main()







