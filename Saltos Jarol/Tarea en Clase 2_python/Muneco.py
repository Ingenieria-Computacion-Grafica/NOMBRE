import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *


#
		
def Draw():   
	 
	    glPushMatrix()

            #cabeza
            glColor3f(.5,.5,0)
            glBegin(GL_POLYGON)
            glVertex2f(.27,.72)
            glVertex2f(.25,.75)
            glVertex2f(.25,.79)
            glVertex2f(.26,.81)
            glVertex2f(.27,.83)
            glVertex2f(.29,.84)
            glVertex2f(.31,.84)
            glVertex2f(.32,.83)
            glVertex2f(.33,.81)
            glVertex2f(.34,.79)
            glVertex2f(.34,.75)
            glVertex2f(.32,.72)
            glEnd()
            
            glColor3f(0,0,0)
            glBegin(GL_LINES)
            glVertex2f(.28,.79)
            glVertex2f(.27,.78)
            
            glVertex2f(.31,.79)
            glVertex2f(.32,.78)
            
            glVertex2f(.295,.78)
            glVertex2f(.305,.76)
            glVertex2f(.305,.76)
            glVertex2f(.295,.75)
            
            glEnd();
            glColor3f(.5,.5,0)
            #mano izquierda
            glBegin(GL_POLYGON)
            glVertex2f(.10,.49)
            glVertex2f(.08,.48)
            glVertex2f(.08,.45)
            glVertex2f(.05,.42)
            glVertex2f(.06,.38)
            glVertex2f(.10,.45)
            glEnd()
            
            #mano derecha
            glBegin(GL_POLYGON)
            glVertex2f(.47,.49)
            glVertex2f(.50,.48)
            glVertex2f(.50,.45)
            glVertex2f(.53,.42)
            glVertex2f(.52,.40)
            glVertex2f(.48,.45)
            glEnd()
            
            glColor3f(.05,1,0)
            #brazo derecho
            glBegin(GL_POLYGON)
            glVertex2f(.39,.70)
            glVertex2f(.38,.64)
            glVertex2f(.48,.45)
            glVertex2f(.48,.49)
            glEnd()
           
            #brazo izquierdo
            glBegin(GL_POLYGON)
            glVertex2f(.20,.70)
            glVertex2f(.21,.64)
            glVertex2f(.10,.45)
            glVertex2f(.10,.49)
            glEnd()
            #torso
            glBegin(GL_POLYGON)
            glVertex2f(.23,.50)
            glVertex2f(.20,.70)
            glVertex2f(.27,.72)
            glVertex2f(.32,.72)
            glVertex2f(.39,.70)
            glVertex2f(.36,.50)
            
            glEnd()
            #Pierna Izquierda
            glBegin(GL_POLYGON)
            glColor3f(0,0,1)
            glVertex2f(.20,.14)
            glVertex2f(.23,.50)
            glVertex2f(.30,.50)
            glVertex2f(.30,.40)
            glVertex2f(.25,.14)                        
            glEnd()

            #Pierna Derecha
            glBegin(GL_POLYGON)
            glColor3f(0,0,1)
            glVertex2f(.35,.14)
            glVertex2f(.27,.50)
            glVertex2f(.36,.50)
            glVertex2f(.40,.14)                       
            glEnd()
            #ZAPATO izquierdo
            
            glBegin(GL_QUADS)
            glColor3f(1,1,1)
            glVertex2f(.10,.09)
            glVertex2f(.10,.10)
            glVertex2f(.25,.10)
            glVertex2f(.25,.09)
            glEnd()
            
            glBegin(GL_POLYGON)
            glColor3f(1,0,0)
            glVertex2f(.10,.10)
            glVertex2f(.10,.13)
            glVertex2f(.25,.14)
            glVertex2f(.25,.10)            
            glEnd()
            
            #zapato derecho
            glBegin(GL_QUADS)
            glColor3f(1,1,1)
            glVertex2f(.35,.09)
            glVertex2f(.35,.10)
            glVertex2f(.50,.10)
            glVertex2f(.50,.09)
            glEnd()
            
            glBegin(GL_POLYGON)
            glColor3f(1,0,0)
            glVertex2f(.35,.10)
            glVertex2f(.35,.14)
            glVertex2f(.50,.13)
            glVertex2f(.50,.10)                  
            glEnd()
       	    glPopMatrix()
def main():
	pygame.init()
	display = (800,600)
	pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
	
	gluPerspective(45, (display[0]/display[1]),0.1,50.0)
	#gluOrtho2D(0,200,0,150)
	glTranslatef(-.5,-1,-6)
	 
	glRotatef(0,0,0,0)
	glScalef(3,3,3)
	
	while True:
		for event in pygame.event.get():
			if event.type == pygame.QUIT:
				pygame.quit()
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
					glTranslatef(0,0,1)
				if event.key == pygame.K_2:
					glTranslatef(0,0,-1)

				if event.key == pygame.K_3:
					glRotatef(5,1,0,0)
				if event.key == pygame.K_4:
					glRotatef(-5,1,0,0)
				if event.key == pygame.K_5:
					glRotatef(5,0,1,0)
				if event.key == pygame.K_6:
					glRotatef(-5,0,1,0)

		
		#glRotatef(1,3,1,1)
		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		Draw()
		pygame.display.flip()
		pygame.time.wait(10)
main()  
