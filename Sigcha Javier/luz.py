import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *
import figura
import eventos

glutInit()


def main():

    pygame.init()
    display = (800,600)
    pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
    
    gluPerspective(45, (display[0]/display[1]),0.1,50.0)
    glTranslatef(3,0,-20)
    #gluLookAt( 0 , 0 , 2 , 0, 0 , 0 , 0, 1 , 0 )
    
    object_passed = False
    #glRotatef(1,2,4,0)
    glEnable(GL_DEPTH_TEST)
    #glShadeModel(GL_FLAT)
    glShadeModel(GL_SMOOTH)
    
    
    luzAmbiente = [1,1,1,0]
    luzDifusa = [1,1,1,1]
    PosLuz = [10,0,0,0]
    materialAmbiente = [0,0.5,1,1]
    glEnable(GL_LIGHTING)
    
    #glLightModelfv(GL_LIGHT_MODEL_AMBIENT,luzAmbiente)
    
    #Seleccionar material
    glMaterialfv(GL_FRONT,GL_AMBIENT,materialAmbiente)
    
    #Fuente de luz
    glLightfv(GL_LIGHT0,GL_AMBIENT,luzAmbiente)
    glLightfv(GL_LIGHT0,GL_SPECULAR,luzDifusa)
    glLightfv(GL_LIGHT0,GL_POSITION,PosLuz)
    glEnable(GL_LIGHT0)
    
    
    while not object_passed:
        eventos.events()
        
        glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
        #gluLookAt( 0 , 0 , 0 , camera_x, camera_y , camera_z , 1, 1 , 1 )
        #glTranslatef(-3,0,-0.5)
        glRotatef(1,1,1,1)
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
        glutSolidDodecahedron(2)
        #glutWireOctahedron(3)
        #glutSolidOctahedron(3)
        #glutWireTetrahedron(3)
        #glutSolidTetrahedron(3)
        #glutWireIcosahedron(3)
        pygame.display.flip()
        pygame.time.wait(10)



#for x in range(10):

main()
glLoadIdentity()

def Cubo():
    gluPerspective(45, (display[0]/display[1]),0.1,50.0)
    glTranslatef(-3,0,-20)

    object_pa= False
    #glRotatef(1,2,4,0)
    glEnable(GL_DEPTH_TEST)
    #glShadeModel(GL_FLAT)
    glShadeModel(GL_SMOOTH)
    
    
    luzAmbiente = [1,1,1,0]
    luzDifusa = [0,1,1,1]
    PosLuz = [10,0,0,0]
    materialAmbiente = [0,0.5,1,1]
    glEnable(GL_LIGHTING)
    
    #glLightModelfv(GL_LIGHT_MODEL_AMBIENT,luzAmbiente)
    
    #Seleccionar material
    glMaterialfv(GL_FRONT,GL_AMBIENT,materialAmbiente)
    
    #Fuente de luz
    glLightfv(GL_LIGHT0,GL_AMBIENT,luzAmbiente)
    glLightfv(GL_LIGHT0,GL_SPECULAR,luzDifusa)
    glLightfv(GL_LIGHT0,GL_POSITION,PosLuz)
    glEnable(GL_LIGHT0)
    
    
    while not object_pa:
        eventos.events()
        
        glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
        #gluLookAt( 0 , 0 , 0 , camera_x, camera_y , camera_z , 1, 1 , 1 )
        #glTranslatef(-3,0,-0.5)
        glRotatef(1,1,1,1)
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
        #glutSolidOctahedron(3)
        #glutWireTetrahedron(3)
        #glutSolidTetrahedron(3)
        glutWireIcosahedron(3)
        pygame.display.flip()
        pygame.time.wait(10)
Cubo() 


def teclado():
	pygame.init()
	display = (800,600)
	pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
	
	gluPerspective(45, (display[0]/display[1]),0.1,50.0)
	glTranslatef(1,1,-9)
	glRotatef(0,0,0,0)

	while True:
		for event in pygame.event.get():
			if event.type == pygame.QUIT:
				pygmae.quit()
				quit()
			if event.type == KEYDOWN:
				if event.key == pygame.K_LEFT:
					glTranslatef(-0.5,0,0)
				if event.key == pygame.K_RIGHT:
					glTranslatef(0.5,0,0)
				if event.key == pygame.K_UP:
					glTranslatef(0,0.5,0)
				if event.key == pygame.K_DOWN:
					glTranslatef(0,-0.5,0)
				if event.key == pygame.K_1:
					gluLookAt(-2,0,0,1,1,1,0,1,0)
				if event.key == pygame.K_2:
					gluLookAt(2,0,0,1,0,1,0,1,0)

		
		#glRotatef(1,3,1,1)
		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		Draw()
		pygame.display.flip()
		pygame.time.wait(10)
teclado()
pygame.quit()
quit()





