import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
import figura
import eventos


def main():
    pygame.init()
    display = (800,600)
    pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
    
    gluPerspective(90, (display[0]/display[1]),0.1,50.0)

    glTranslatef(0,0,-2)
    #e = Esfera(2, (0, 0, 0), )
    #gluLookAt( -5 , 0 , 0 , 0, 0 , 0 , 0, 1 , 0 )
    
    object_passed = False
    #glRotatef(1,2,4,0)
    glEnable(GL_DEPTH_TEST)
    #glShadeModel(GL_FLAT)
    glShadeModel(GL_SMOOTH)

    #glLoadIdentity()
    glPushMatrix()
    spot_cutoff = 45
    spot_direction = [2, -1, 0]
    spot_exponent = 1


    #direccion(1,-1,-1)
    luzAmbiente = [0.05,0,0,1]
    luzDifusa = [0.1, 0, 0, 1]
    luzEspecular = [0.99,0,0,1]
    PosLuz = [-2,1,0,1]
    material = [1, 1, 1, 1]
    glEnable(GL_LIGHTING)
    glEnable(GL_LIGHT0)
    glLightModelfv(GL_LIGHT_MODEL_TWO_SIDE, luzAmbiente)
    
    #Seleccionar material
    glMaterialfv(GL_FRONT, GL_AMBIENT, material, 0)
    glMaterialfv(GL_FRONT, GL_SPECULAR, material, 0)
    #Fuente de luz
    glLightfv(GL_LIGHT0, GL_AMBIENT, luzAmbiente,0)
    glLightfv(GL_LIGHT0, GL_DIFFUSE, luzDifusa, 0)
    glLightfv(GL_LIGHT0, GL_SPECULAR, luzEspecular,0)
    glLightfv(GL_LIGHT0, GL_POSITION, PosLuz,0)
    glLightf(GL_LIGHT0, GL_SPOT_CUTOFF, spot_cutoff)
    glLightfv(GL_LIGHT0, GL_SPOT_DIRECTION, spot_direction, 0)
    glLighti(GL_LIGHT0, GL_SPOT_EXPONENT, spot_exponent)
    glTranslatef(PosLuz[0], PosLuz[1], PosLuz[2])
    glEnable(GL_LIGHT0)
    #gltranslatef(0, 0, -2)
    #glRotatef(-90, 1, 0, 0)
    glPopMatrix()
    while not object_passed:
        eventos.events()
        
        glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
        #glLineWidth(7)
        #gluLookAt( 0 , 0 , 0 , camera_x, camera_y , camera_z , 1, 1 , 1 )
        #glTranslatef(0,0,0.5)
        #glRotatef(0.5,0,1,0)
        #figura.Draw()
        #glutWireTeapot(2)
        #glutSolidTeapot(2)
        #glutWireSphere(3,100,100)
        #glutSolidSphere(3,100,100)
        #glutWireCube(3)
        #glutSolidCube(3)
        #glutWireCone(2,5,40,5)
        #glutSolidCone(2,5,40,5)
        #glutWireDodecahedron(2)
        #glutSolidDodecahedron(2)
        #glutWireOctahedron(3)
        glutSolidOctahedron(3)
        #glutWireTetrahedron(3)
        #glutSolidTetrahedron(3)
        #glutWireIcosahedron(1)
        #glutSolidIcosahedron(3)
        pygame.display.flip()
        pygame.time.wait(10)

#for x in range(10):

main()
pygame.quit()
quit()
