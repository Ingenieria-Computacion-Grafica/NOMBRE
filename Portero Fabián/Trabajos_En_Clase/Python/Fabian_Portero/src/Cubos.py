
from OpenGL.GL import *
from OpenGL.GLU import *


class Cubos:
    
    #float (x,y,z,r,g,b,w,h,d,rx,ry,rz)
    
    def __init__(self, x, y, z, r, g, b, w, h, d, rx, ry, rz):
	
	    self.x = x
	    self.y = y
	    self.z = z
	    self.r = r
	    self.g = g
	    self.b = b
	    self.w = w
	    self.h = h
	    self.d = d
	    self.rx = rx
	    self.ry = ry
	    self.rz = rz
	    
	    
	
#def draw():
	
	    glPushMatrix()

	    glTranslatef(x, y, z)
	    glRotatef(rx, 1, 0, 0)
	    glRotatef(ry, 0, 1, 0)
	    glRotatef(rz, 0, 0, 1)
	    glScalef(w,h,d)
	    glColor4f(r,g,b,0)
	    #adelante
	    glBegin(GL_QUADS)
	    #glColor3f(1, 0, 0)
	    glVertex3f(1, 1, 1)
	    glVertex3f(1, -1, 1)
	    glVertex3f(-1, -1, 1)
	    glVertex3f(-1, 1, 1)
	    glEnd()

	    #atras
	    glBegin(GL_QUADS)
	    #glColor3f(0, 0, 1)
	    glVertex3f(1, 1, -1)
	    glVertex3f(1, -1, -1)
	    glVertex3f(-1, -1, -1)
	    glVertex3f(-1, 1, -1)
	    glEnd()

	    #izquierdo
	    glBegin(GL_QUADS)
	    #glColor3f(0, 1, 0)
	    glVertex3f(-1, 1, 1)
	    glVertex3f(-1, -1, 1)
	    glVertex3f(-1, -1, -1)
	    glVertex3f(-1, 1, -1)
	    glEnd()

	    #derecha
	    glBegin(GL_QUADS)
	    #glColor3f(.5, .7, 0)
	    glVertex3f(1, 1, 1)
	    glVertex3f(1, -1, 1)
	    glVertex3f(1, -1, -1)
	    glVertex3f(1, 1, -1)
	    glEnd()

	    #arriba
	    glBegin(GL_QUADS)
	    #glColor3f(1, 0, 1)
	    glVertex3f(1, 1, -1)
	    glVertex3f(1, 1, 1)
	    glVertex3f(-1, 1, 1)
	    glVertex3f(-1, 1, -1)
	    glEnd()

	    #abajo
	    glBegin(GL_QUADS)
	    #glColor3f(1, 1, 0)
	    glVertex3f(1, -1, -1)
	    glVertex3f(1, -1, 1)
	    glVertex3f(-1, -1, 1)
	    glVertex3f(-1, -1, -1)
	    glEnd()

	    glPopMatrix()

