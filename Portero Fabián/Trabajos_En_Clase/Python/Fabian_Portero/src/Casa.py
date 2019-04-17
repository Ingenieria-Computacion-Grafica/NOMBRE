import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *

from Cubos import Cubos

		
def Draw():   
    
    #Paredes
    miCubo = Cubos(0,0,0,.8,.8,.8,2,2,2,0,0,0)
    #miCubo.__init__(0,0,0,0.2,0.2,0.2,5,1,1,0,0,0)    
    
    #Techo
    miCubo2 = Cubos(0,2.5,0,1,0,0,2.5,.5,1,0,0,0)    
    
    #Ventanas
    #Ventana Iz
    miCubo3 = Cubos(-1,.5,0,0,.5,.5,.5,.5,.5,0,0,0)
    
    #Ventana De
    miCubo3 = Cubos(1,.5,0,0,.5,.5,.5,.5,.5,0,0,0)
    
    #Puerta
    miCubo3 = Cubos(0,-1.25,0,.5,.25,0,.5,1,0,0,0,0)
def main():
	pygame.init()
	display = (800,600)
	pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
	
	gluPerspective(45, (display[0]/display[1]),0.1,50.0)
	
	glTranslatef(0,0,-20)
	 
	glRotatef(0,0,0,0)
	
	while True:
		for event in pygame.event.get():
			if event.type == pygame.QUIT:
				pygame.quit()
				quit()
			if event.type == KEYDOWN:
				if event.key == pygame.K_LEFT:
					glTranslatef(-0.1,0,0)
				if event.key == pygame.K_RIGHT:
					glTranslatef(0.1,0,0)
				if event.key == pygame.K_UP:
					glTranslatef(0,0.1,0)
				if event.key == pygame.K_DOWN:
					glTranslatef(0,-0.1,0)
				if event.key == pygame.K_KP_PLUS:
					glTranslatef(0,0,1)
				if event.key == pygame.K_KP_MINUS:
					glTranslatef(0,0,-1)
				if event.key == pygame.K_w:
					glRotatef(5,1,0,0)
				if event.key == pygame.K_s:
					glRotatef(-5,1,0,0)
				if event.key == pygame.K_a:
					glRotatef(5,0,1,0)
				if event.key == pygame.K_d:
					glRotatef(-5,0,1,0)

		
		
		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		Draw()
		pygame.display.flip()
		pygame.time.wait(10)
main()  


	    
	
