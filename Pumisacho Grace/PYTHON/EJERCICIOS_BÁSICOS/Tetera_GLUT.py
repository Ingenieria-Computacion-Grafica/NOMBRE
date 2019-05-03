from OpenGL.GLUT import *
from OpenGL.GL import *
from OpenGL.GLU import *

width,height=800,600

def draw():
    glClear(GL_COLOR_BUFFER_BIT)
    glClearColor(1.0,0.0,0.0,0.0)
    glutWireTeapot(0.2)
    glTranslatef(0.5,0.5,0)
    glutSolidSphere(0.2,20 ,10 )
    glTranslatef(-0.20,-0.20,0)
    glutWireCylinder(0.8, 8, 8, 15);
    glFlush()

    
glutInit()
glutInitDisplayMode(GLUT_RGB)
glutInitWindowSize(width,height)
glutInitWindowPosition(200,200)
glutCreateWindow("Opengl Teapot")
glutDisplayFunc(draw)
glutMainLoop()
