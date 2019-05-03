import pygame
from pygame.locals import *

from OpenGL.GL import *
from OpenGL.GLU import *


	
def draw_G():
    glBegin(GL_LINES);
    glVertex2d(0.15, 0.10);
    glVertex2d(0.15, 0.50);
    glVertex2d(0.10, 0.50);
    glVertex2d(0.50, 0.50);
    glVertex2d(0.10, 0.50);
    glVertex2d(0.10, 0.10);
    glVertex2d(0.10, 0.40);
    glVertex2d(0.10, 0.10);
    glVertex2d(0.50, 0.30);
    glVertex2d(0.25, 0.30);
    glVertex2d(0.49, 0.30);
    glVertex2d(0.49, 0.10);
    glVertex2d(0.10, 0.10);
    glVertex2d(0.50, 0.10);
    glEnd();
    
def draw_R():
    glBegin(GL_LINES);
    glVertex2d(0.65,0.50);
    glVertex2d(0.65,0.10);
    glVertex2d(0.60,0.50);
    glVertex2d(0.60,0.10);
    glVertex2d(0.60,0.50);
    glVertex2d(0.90,0.50);
    glVertex2d(0.90,0.50);
    glVertex2d(0.90,0.40);
    glVertex2d(0.90,0.40);
    glVertex2d(0.80,0.30);
    glVertex2d(0.80,0.30);
    glVertex2d(0.60,0.30);
    glVertex2d(0.80,0.30);
    glVertex2d(0.90,0.10);
    glEnd();

def draw_A():    
    glBegin(GL_LINES);
    glVertex2d(1.05,0.50);
    glVertex2d(1.05,0.10);
    glVertex2d(1.00,0.50);
    glVertex2d(1.00,0.10);
    glVertex2d(1.00,0.50);
    glVertex2d(1.30,0.50);
    glVertex2d(1.30,0.50);
    glVertex2d(1.30,0.10);
    glVertex2d(1.00,0.30);
    glVertex2d(1.30,0.30);
    glEnd();
    
    
def draw_C():         
    glBegin(GL_LINES);
    glVertex2d(1.45,0.50);
    glVertex2d(1.45,0.10);
    glVertex2d(1.40,0.50);
    glVertex2d(1.40,0.10);
    glVertex2d(1.40,0.50);
    glVertex2d(1.70,0.50);
    glVertex2d(1.70,0.10);
    glVertex2d(1.40,0.10);
    glEnd();
            
def draw_E():        
    glBegin(GL_LINES);
    glVertex2d(1.85,0.50);
    glVertex2d(1.85,0.10);
    glVertex2d(1.80,0.50);
    glVertex2d(1.80,0.10);
    glVertex2d(1.80,0.50);
    glVertex2d(2.10,0.50);
    glVertex2d(2.10,0.10);
    glVertex2d(1.80,0.10);
    glVertex2d(2.00,0.30);
    glVertex2d(1.80,0.30);
    glEnd();

def draw_P():
             
    glBegin(GL_LINES);
    glVertex2d(2.45,0.50);
    glVertex2d(2.45,0.10);
    glVertex2d(2.40,0.50);
    glVertex2d(2.40,0.10);
    glVertex2d(2.80,0.50);
    glVertex2d(2.80,0.30);
    glVertex2d(2.40,0.50);
    glVertex2d(2.80,0.50);
    glVertex2d(2.40,0.30);
    glVertex2d(2.80,0.30);
    glEnd();

def draw_U():      
    glBegin(GL_LINES);
    glVertex2d(2.95,0.50);
    glVertex2d(2.95,0.10);
    glVertex2d(2.90,0.50);
    glVertex2d(2.90,0.10);
    glVertex2d(2.90,0.10);
    glVertex2d(3.30,0.10);
    glVertex2d(3.30,0.50);
    glVertex2d(3.30,0.10);
    glEnd();  
              
def draw_M():        
    glBegin(GL_LINES);
    glVertex2d(3.45,0.47);
    glVertex2d(3.45,0.10);
    glVertex2d(3.40,0.50);
    glVertex2d(3.40,0.10);
    glVertex2d(3.40,0.50);
    glVertex2d(3.60,0.30);
    glVertex2d(3.60,0.30);
    glVertex2d(3.80,0.50);
    glVertex2d(3.80,0.50);
    glVertex2d(3.80,0.10);
    glEnd();
              
def draw_I():
             
    glBegin(GL_LINES);

    glVertex2d(3.90,0.47);
    glVertex2d(4.20,0.47);
    glVertex2d(4.04,0.47);
    glVertex2d(4.04,0.10);
    glVertex2d(4.11,0.47);
    glVertex2d(4.11,0.10);
    glVertex2d(3.90,0.10);
    glVertex2d(4.20,0.10);
    glEnd();
              
def draw_S():         
    glBegin(GL_LINES);
    glVertex2d(4.30,0.50);
    glVertex2d(4.30,0.30);
    glVertex2d(4.35,0.50);
    glVertex2d(4.35,0.30);
    glVertex2d(4.30,0.50);
    glVertex2d(4.60,0.50);
    glVertex2d(4.60,0.30);
    glVertex2d(4.30,0.30);
    glVertex2d(4.60,0.30);
    glVertex2d(4.60,0.10);
    glVertex2d(4.30,0.10);
    glVertex2d(4.60,0.10);
    glEnd();
              
def draw_B():        
    glBegin(GL_LINES);
    glVertex2d(4.75,0.50);
    glVertex2d(4.75,0.10);
    glVertex2d(4.70,0.50);
    glVertex2d(4.70,0.10);
    glVertex2d(4.70,0.50);
    glVertex2d(5.00,0.50);
    glVertex2d(5.00,0.50);
    glVertex2d(5.00,0.10);
    glVertex2d(4.70,0.30);
    glVertex2d(5.00,0.30);
    glEnd();
            
def draw_N():         
    glBegin(GL_LINES);
    glVertex2d(5.10,0.50);
    glVertex2d(5.10,0.10);
    glVertex2d(5.15,0.50);
    glVertex2d(5.15,0.10);
    glVertex2d(5.10,0.50);
    glVertex2d(5.40,0.50);
    glVertex2d(5.40,0.10);
    glVertex2d(5.10,0.10);
    glEnd();
            
def draw_H():
             
    glBegin(GL_LINES);
    glVertex2d(5.55,0.50);
    glVertex2d(5.55,0.10);
    glVertex2d(5.50,0.50);
    glVertex2d(5.50,0.10);
    glVertex2d(5.85,0.50);
    glVertex2d(5.85,0.10);
    glVertex2d(5.50,0.30);
    glVertex2d(5.85,0.30);
    glEnd();
            
def draw_O():        
    glBegin(GL_LINES);
    glVertex2d(6.00,0.50);
    glVertex2d(6.00,0.10);
    glVertex2d(5.95,0.50);
    glVertex2d(5.95,0.10);
    glVertex2d(6.30,0.50);
    glVertex2d(6.30,0.10);
    glVertex2d(5.95,0.50);
    glVertex2d(6.30,0.50);
    glVertex2d(5.95,0.10);
    glVertex2d(6.30,0.10);
    glEnd();
          



def main():
	pygame.init()
	display = (800,600)
	pygame.display.set_mode(display,DOUBLEBUF|OPENGL)
	
	gluPerspective(45, (display[0]/display[1]),0.1,50.0)
	glTranslatef(-2,1,-9)
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
				if event.key == pygame.K_a:
					glScalef(2*0.5,2*0.5,0)
    
				if event.key == pygame.K_r:
					glRotatef(30, -0.5, 0, 0)
                    
#                if event.key == pygame.K_ESCAPE:
#                    glTranslatef(0,0,0)
#                    glScalef(0,0,0)
#                    glRotatef(0, 0, 0, 0)




		glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT)
		
		draw_G()
		draw_R()
		draw_A()
		draw_C()
		draw_E()
		draw_P()
		draw_U()
		draw_M()
		draw_I()
		draw_S()
		draw_B()
		draw_N()
		draw_H()
		draw_O()
		
		
		pygame.display.flip()
		pygame.time.wait(10)
main()







