import pygame
from pygame.locals import *
#from OpenGL.GL import shaders
#from OpenGL.arrays import vbo
#from OpenGL.raw.GL.ARB.vertex_array_object import glGenVertexArrays, \glBindVertexArray
from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
from OpenGL.GL.shaders import *
import math
import random

def draw_rect(x, y, width, height):
    glBegin(GL_QUADS)                                  # start drawing a rectangle
    glVertex2f(x, y)                                   # bottom left point
    glVertex2f(x + width, y)                           # bottom right point
    glVertex2f(x + width, y + height)                  # top right point
    glVertex2f(x, y + height)                          # top left point
    glEnd()

    #vertices =
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

ground_vertices = (
    (-20,-0.1,20),
    (20, -0.1,20),
    (-20,-0.1,-500),
    (20,-0.1,-500)
)


def Ground():
    glBegin(GL_QUADS)
    for vertex in ground_vertices:
        glColor3fv((1,1,1))
        glVertex3fv(vertex)
    glEnd()


def set_vertices(max_distance):
    x_changevalue = random.randrange(-20,20)
    y_changevalue = 3 #random.randrange(-10,10)
    z_changevalue = random.randrange(-1*max_distance,-50)

    new_vertices = []

    for vertice in vertices:
        new_vertice = []

        new_x = vertice[0]+x_changevalue
        new_y = vertice[1]+y_changevalue
        new_z = vertice[2]+z_changevalue

        new_vertice.append(new_x)
        new_vertice.append(new_y)
        new_vertice.append(new_z)

        new_vertices.append(new_vertice)

    return new_vertices


def Rombo(vertices):
    glBegin(GL_TRIANGLES)
    for surface in surfaces:
        x = 0
        for vertex in surface:
            x = x + 1
            glColor3fv(colors[x])
            glVertex3fv(vertices[vertex])
    glEnd()

    glLineWidth(1)
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
    #glEnable(GL_DEPTH_TEST)
    gluPerspective(60, (display[0]/display[1]),0.1,300.0)
    glTranslatef(random.randrange(-5,5),0, -40)#Asigno posiciones de redibujo aleatorias para X y Y
    #glTranslatef(0,0,-50)
    
    x_move = 0
    y_move = 0
    
    max_distance = 300
    
    rombo_dict = {}
    
    for x in range(40):
        rombo_dict[x] =set_vertices(max_distance)

    
    #object_passed = False
    while True:
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                pygame.quit()
                quit()
            if event.type == KEYDOWN:
                if event.key == pygame.K_LEFT:
                #x_move = -0.3
                    glTranslatef(-0.5,0,0)
                if event.key == pygame.K_RIGHT:
                #x_move = 0.3
                    glTranslatef(0.5,0,0)
                if event.key == pygame.K_UP:
                    #y_move = 0.3
                    glTranslatef(0,0.5,0)
                if event.key == pygame.K_DOWN:
#y_move = -0.3
                    glTranslatef(0,-0.5,0)
                if event.key == pygame.K_1:
                    glTranslatef(0,0,0.5)
                if event.key == pygame.K_2:
                    glTranslatef(0,0,-10)

#if event.type == pygame.KEYUP:
#if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
#x_move = 0
            
            #if event.key == pygame.K_UP or event.key == pygame.K_DOWN:
            #y_move = 0
#while True:
#for event in pygame.event.get():
#if event.type == pygame.QUIT:
#pygame.quit()
#quit()
#glTranslatef(0,0,0.01)

        x = glGetDoublev(GL_MODELVIEW_MATRIX)
        print(str(x))
        #camera_x = x[3][0]
        #camera_y = x[3][1]
        #camera_z = x[3][2]
            #if camera_z < -1:
#object_passed = True

        glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
        Ground()
        glTranslatef(x_move,y_move,0.5)
        for each_rombo in rombo_dict:
            Rombo(rombo_dict[each_rombo])

        pygame.display.flip()
        pygame.time.wait(10)

            #for x in range(20):


main()
pygame.quit()
quit()







