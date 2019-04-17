import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *


#
		
def Draw():   
	 
	glPushMatrix()
  	 
	glBegin(GL_POLYGON)
	
	glColor3f(.5,.3,0)
	glVertex2d(1.17, .87)
	glVertex2d(1.17, .10)
        glVertex2d(1.90, .10)
        glVertex2d(1.90, .87)
            
   	glEnd()
    	glBegin(GL_POLYGON)
	   
        glColor3f(.5,0,0.3)
        
        glVertex2d(.10, .85)
        glVertex2d(.85, 1.40)
        glVertex2d(1.17, .87)
        glVertex2d(.40, .32)
         
   	glEnd() 
    
   	glBegin(GL_POLYGON)
 
        glColor3f(0,1,0.3)
        
        glVertex2d(.10, .10)
        glVertex2d(.10, .85)
        glVertex2d(.40, .32)
     
    	glEnd() 
    
    	glBegin(GL_POLYGON)  
        glColor3f(0.7,.4,0.3)
        
        glVertex2d(.10, .10)
        glVertex2d(1.17, .87)
        glVertex2d(1.17, .10)
     
    	glEnd()     
    
   	glBegin(GL_POLYGON)
		

        glColor3f(0.1,0,0.3)
        
        
        glVertex2d(.10, .85)
        glVertex2d(.10, 1.40)
        glVertex2d(.85, 1.40)
     
    	glEnd()    
    
   	glBegin(GL_POLYGON)   
        glColor3f(1,0,0.3)
     
        glVertex2d(.85, 1.40)
        glVertex2d(1.90, 1.40)
        glVertex2d(1.17, .87)
    	glEnd()  
    
    	glBegin(GL_POLYGON)  
        glColor3f(0,1,0.5)
        
        glVertex2d(1.17, .87)
        glVertex2d(1.90, 1.40)
        glVertex2d(1.90, .87)
        
    	glEnd()   
	glPopMatrix()

def main():
	pygame.init()
	display = (800,600)
	pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
	
	gluPerspective(45, (display[0]/display[1]),0.1,50.0)
	#gluOrtho2D(0,200,0,150)
	glTranslatef(-1,-1,-6)
	 
	glRotatef(0,0,0,0)
	
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
