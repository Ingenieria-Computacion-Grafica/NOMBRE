import pygame
from pygame.locals import *
from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
import math
window = 0                                             # glut window number
width, height = 900, 900                               # window size

CIRCLE_ANGLE_INC = 45                                 # amount of degrees to step circles 

display=(800,600)
pygame.display.set_mode(display, DOUBLEBUF|OPENGL)
glShadeModel(GL_SMOOTH)
gluPerspective(45, (display[0]/display[1]),0.1,150)



def draw_rect(x, y, width, height):
    glBegin(GL_QUADS)                                  # start drawing a rectangle
    glVertex2f(x, y)                                   # bottom left point
    glVertex2f(x + width, y)                           # bottom right point
    glVertex2f(x + width, y + height)                  # top right point
    glVertex2f(x, y + height)                          # top left point
    glEnd() 

glTranslatef(1,1,0,0)
glRotatef(1,1,0,0)
#**18--nariz
	    def draw_TRIANGLES():
            glBegin(GL_TRIANGLES)
            glColor3f(0, 0, 0)
            glVertex2f(10, 50)
            glColor3f(1, 1, 1)
            glVertex2f(12, 55)
            glColor3f(0, 0, 0)
            glVertex2f(20, 55)
            glEnd()
            #**OCICO****
            #**15
            def draw_TRIANGLES():
            glBegin(GL_TRIANGLES);
            glColor3f(0.01f, 0.01f, 0.01f)
            glVertex2f(10, 50)
            glColor3f(1, 1, 1)
            glVertex2f(25, 65)
            glColor3f(1, 1, 1)
            glVertex2f(35, 55)
            glEnd()
            
            #//**16
            def draw_TRIANGLES():
            glBegin(GL_TRIANGLES)
            glColor3f(0.01f, 0.01f, 0.01f)
            glVertex2f(12, 50)
            glColor3f(1, 1, 1)
            gl.glVertex2f(20, 45)
            gl.glColor3f(1, 1, 1)
            gl.glVertex2f(35, 55)
            gl.glEnd()

            #//******************
            
 
            
            
                #//**OREJITAS****
            #//**17
            def draw_TRIANGLES():
            glBegin(GL_TRIANGLES)
            glColor3f(0.01f, 0.01f, 0.01f)
            glVertex2f(25, 75)
            glColor3f(1, 1, 1)
            glVertex2f(25, 85)
            glColor3f(1, 1, 1)
            glVertex2f(35, 85)
            glEnd()
            
            
            #//**18
	    def draw_TRIANGLES():
            glBegin(GL_TRIANGLES)
            glColor3f(0.01f, 0.01f, 0.01f)
            glVertex2f(40,80)
            glColor3f(1, 1, 1)
            glVertex2f(50,85)
            glColor3f(0,0,0)
            glVertex2f(55,75)
            glEnd()

            #//******************
            
               
            
            
            glColor3f(1, 0, 0)


#//********PIERNAS**********
#            //**PIERNA DELANTERA1****
            #//**5
            def draw_POLYGON():
            glBegin(GL_POLYGON)
	    glColor3f(52, 73, 94)
            glVertex2f(50, 20)
            glColor3f(0, 0, 0)
            glVertex2f(50, 55)
            glVertex2f(60, 60)
            glColor3f(0, 0, 0)
            glVertex2f(75, 45)
            glVertex2f(60, 10)
            glEnd()
#//            //**PIERNA DELANTERA2****
#//            //**6
            def draw_POLYGON():
            glBegin(GL_POLYGON)
            glColor3f(52, 73, 94)
            glVertex2f(90, 20)
            glVertex2f(85, 35)      
            glVertex2f(115, 50)
            glVertex2f(110, 10)
            glEnd()

            #//**7
           
            def draw_POLYGON():
            glBegin(GL_POLYGON)
            glColor3f(1, 1, 1) 
            glVertex2f(85, 35)
            glVertex2f(75, 45)
            glVertex2f(60, 100)
            glVertex2f(115, 50)
            glEnd()

            #//**8
 	    def draw_POLYGON():
            glBegin(GL_TRIANGLES)
            glColor3f(0, 0, 0)
            glVertex2d(60, 60)
            glColor3f(0, 0, 0)
            glVertex2d(60, 100)
            glColor3f(1, 1, 1)
            glVertex2d(75, 45)
            glEnd()

            #//**9
            def draw_POLYGON():
            glBegin(GL_POLYGON)
            glColor3f(1, 1, 1)
            glVertex2f(60, 60)
            glVertex2f(50, 75)
            glVertex2f(40, 80)
            glVertex2f(30, 80)
            glColor3f(0,0,0)
            glVertex2f(60, 100)
            glVertex2f(60, 60)
            glEnd()
            
            #//**PIERNA posterior1****
            #//**11
 	    def draw_POLYGON():
	    glBegin(gl.GL_POLYGON)
            glColor3f(52, 73, 94)            
            glVertex2f(130, 20)
            glVertex2f(125, 35)
            glColor3f(0, 0, 0)
            glVertex2f(155, 35)
            glVertex2f(160, 30)
            glColor3f(0, 0, 0)
            glVertex2f(150, 10)
            gl.glEnd();
            #//****************** 
            #//**PIERNA posterior2****
            #//**12
            def draw_POLYGON():
            glBegin(GL_POLYGON)
            glColor3f(52, 73, 94)
            glVertex2f(165, 25)
            glVertex2f(135, 60)
            glVertex2f(150, 90)
            glVertex2f(180, 70)
            glVertex2f(200, 40)
            glVertex2f(190, 20)
            glEnd()
            #//******************   

            #//********TRONCO**********
            #//**10
	    def draw_POLYGON():
            glBegin(GL_POLYGON)
	    glColor3f(0.1f, 0.1f, 0.1f)
            gl.glVertex2f(110, 35)
            gl.glColor3f(0, 0, 0)
            gl.glVertex2f(115, 50)
            gl.glColor3f(1, 1, 1)
            gl.glVertex2f(60, 100)
            gl.glVertex2f(150, 90)
            gl.glVertex2f(135, 60)
            gl.glVertex2f(155, 35)
            gl.glEnd()
            #//****************** 
            
            #//********COLITA**********
            #//**13
            def draw_POLYGON():
            glBegin(GL_POLYGON)
            glColor3f(0.1f, 0.1f, 0.1f)
            glVertex2f(160, 85)
            glColor3f(0, 0, 0)
            glVertex2f(150, 90)
            glColor3f(1, 1, 1)
            glVertex2f(160, 93)
            glVertex2f(170, 85)
            glEnd()
            #//******************  
#//********CABECITA**********
          
                 #//********OJOS**********
            #//**17
	    def draw_POLYGON():
            glBegin(GL_POLYGON)
            glColor3f(0f,0f,1f)
            glVertex2d(40,65)  
            glVertex2d(35,70)  
            glVertex2d(40,75)  
            glVertex2d(45,75) 
            gl.glEnd()


            #//******************
              #//**14
            def draw_POLYGON():
            glBegin(GL_POLYGON)
            glColor3f(0.8f,0.8f,0.8f)
            #//********OJOS**********
            #//**17
	     def draw_POLYGON():
             glBegin(GL_POLYGON)
          #//Blue
            glVertex2d(40,65) 
            glVertex2d(35,70) 
            glColor3f(0f,0f,0f)
            glVertex2d(40,75)
            glColor3f(0f,0f,0f)
            glVertex2d(45,75) 
        
               #//******************
            glVertex2d(40,50)            
            glVertex2d(20, 65)
     	    glColor3f(0.9f,0.9f,0.9f)
            glVertex2d(30, 80)
            glVertex2d(40, 80)
            glVertex2d(50, 75)
            glVertex2d(60,60)
            glVertex2d(40,50)
            glEnd()
            #//****************** 
#//********PATITAS**********
            #//**PATA DELANTERA1****
            #//**1
            def draw_TRIANGLES():
            glBegin(GL_TRIANGLES)
            glColor3f(1, 1, 1)
            glVertex2d(30, 10)
            glColor3f(1, 1, 1)
            glVertex2d(50, 20)
            glColor3f(0, 0, 0)
            glVertex2d(60, 10)
            glEnd()
            #//**PATA DELANTERA2****
            #//**2
	    def draw_TRIANGLES():
            glBegin(GL_TRIANGLES)
            glColor3f(0.01f, 0.01f, 0.01f)
            glVertex2d(80, 10)
            glColor3f(1, 1, 1)
            glVertex2d(90, 20)
            glVertex2d(110, 10)
            glEnd()
            #//**PATA POSTERIOR1****
            #//**3
	    def draw_TRIANGLES():
            glBegin(GL_TRIANGLES)
            glColor3f(1, 1, 1)
            glVertex2d(120, 10)
            glColor3f(1, 1, 1)
            glVertex2d(130, 20)
            glColor3f(0, 0, 0)
            glVertex2d(150, 10)
            glEnd()
            #//**PATA POSTERIOR2****
            #//**4
	    def draw_TRIANGLES():
            glBegin(GL_TRIANGLES)
            glColor3f(0.01f, 0.01f, 0.01f)
            glVertex2d(200, 10)
            glColor3f(1, 1, 1)
            glVertex2d(190, 20)
            glVertex2d(200, 40)
            glEnd()

            //******************

 

def draw():                                            # ondraw is called all the time
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT) # clear the screen
    glLoadIdentity()                                   # reset position
    refresh2d(width, height)                           # set mode to 2d
    #gluPerspective(45, (width/height),0.1,1.0)
    glTranslatef(1,100,0)    
    glColor3f(1.0, 0.0, 0.0)                           # set color to blue
    #draw_rect(10, 10, 200, 100)                        # rect at (10, 10) with width 200, height 100
    glTranslatef(100,300,0)
    #glTranslatef()
    draw_C()
    glColor3f(0.0, 0.0, 1.0) 
    draw_I()
    glColor3f(1,1,0.0)
    draw_P()
    glColor3f(1,0,1)
    glutSwapBuffers()                                # important for double buffering

def refresh2d(width, height):
    glViewport(0, 0, width, height)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, width, 0.0, height, 0.0, 1.0)
    glMatrixMode (GL_MODELVIEW)
    glLoadIdentity()    
pygame.display.flip()
pygame.time.wait(10)

# initialization
glutInit()                                             # initialize glut
glutInitDisplayMode(GLUT_RGBA | GLUT_DOUBLE | GLUT_ALPHA | GLUT_DEPTH)
glutInitWindowSize(width, height)                      # set window size
glutInitWindowPosition(0, 0)                           # set window position
window = glutCreateWindow("Mi primer programa")              # create window with title
glutDisplayFunc(draw)                                  # set draw function callback
glutIdleFunc(draw)                                     # draw all the time
glutMainLoop() 
