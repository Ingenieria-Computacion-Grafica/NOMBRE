
import sys
import math
from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *



class Luz(object):
    encendida = True
    colores = [(1, 0.9, 0.2, 1), (1., 0.5, 0.5, 1.),
               (0.5,0,0,1.), (0.5,0.5,1.,0.5)]
    def __init__(self, luz_id, posicion):
        
        self.luz_id = luz_id
      
        self.posicion = posicion
        
        self.color_actual = 0

    
    def dibujar(self):
        light_id = self.luz_id
        color = Luz.colores[self.color_actual]
        glLightfv(light_id, GL_POSITION, self.posicion)
        glLightfv(light_id, GL_DIFFUSE, color)
        glLightfv(light_id, GL_CONSTANT_ATTENUATION, 0.2)
        glLightfv(light_id, GL_LINEAR_ATTENUATION, 0.09)

    def cambiar_color(self):
        self.color_actual += 1
        
        self.color_actual %= len(Luz.colores)


    def enable(self):
        if not Luz.encendida:
            glEnable(GL_LIGHTING)
            Luz.encendida = True
        glEnable(self.luz_id)


class Esfera(object):
    
    meridianos = 160
    
    paralelos = 30

    
    def __init__(self, radio, posicion, color):
        self.radio = radio
        self.posicion = posicion
        self.color = color

    
    def dibujar(self):
        
        glTranslatef(*self.posicion)
        
        glMaterialfv(GL_FRONT, GL_DIFFUSE, self.color)
       
        glutWireSphere(self.radio, Esfera.meridianos, Esfera.paralelos)


class programa(object):
    
    def __init__(self, largo=1000, ancho=600):
       
        self.titulo = 'LUCES JPB2'
        
        self.largo = largo
        self.ancho = ancho
        
        self.angulo = 0
        
        self.distancia = 10
        
        self.iluminacion = Luz(GL_LIGHT0, (0.5, 0, 15, 1))
       
        self.esfera1 = Esfera(2, (0, 0, 0), (1, 0.4, 0.4, 1))
        
        self.esfera2 = Esfera(1, (-2, 2, 0), (0.2, 1, 0.8, 1))

	self.esfera3 = Esfera(1, (-3, 1, 0), (0.5, 0.1, 0.6, 1))
        
        self.esfera4 = Esfera(1, (2, 2, 0), (0.9, 0.9, 0, 1))
	
	self.esfera5 = Esfera(1, (6, -4, 0), (0.2, 1, 0.8, 1))

	self.esfera6 = Esfera(1, (5, -2, 0), (0.5, 0.1, 0.6, 1))
        
        self.esfera7 = Esfera(1, (6, 0, 0), (0.9, 0.9, 0, 1))

    
    def iniciar(self):
       
        glutInit()

        
        glutInitDisplayMode(GLUT_DOUBLE | GLUT_DEPTH)
        glutInitWindowPosition(50, 50)
        glutInitWindowSize(self.largo, self.ancho)
        glutCreateWindow(self.titulo)

        
        glEnable(GL_DEPTH_TEST)
        
        glEnable(GL_LIGHTING)
        
        glEnable(GL_LIGHT0)

      
        self.iluminacion.enable()

        
        glClearColor(.1, .1, .1, 1)

        glMatrixMode(GL_PROJECTION)
        aspect = self.largo / self.ancho
        gluPerspective(40., aspect, 1., 40.)
        glMatrixMode(GL_MODELVIEW)

        
        glutDisplayFunc(self.dibujar)
        
        glutSpecialFunc(self.keyboard)

        
        glutMainLoop()
    
    def dibujar(self):
       
        x = math.sin(self.angulo) * self.distancia
        z = math.cos(self.angulo) * self.distancia

        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
        glLoadIdentity()

      
        gluLookAt(x, 0, z,
                  0, 0, 0,
                  0, 1, 0)

        
        self.iluminacion.dibujar()

        
        self.esfera1.dibujar()
        
        self.esfera2.dibujar()

	self.esfera3.dibujar()
        
        self.esfera4.dibujar()

	self.esfera5.dibujar()

	self.esfera6.dibujar()
        
        self.esfera7.dibujar()

        glutSwapBuffers()

    
    def keyboard(self, tecla, x, y):
        if tecla == GLUT_KEY_INSERT:
            
            sys.exit()
        if tecla == GLUT_KEY_UP:
            
            self.distancia -= 0.05
        if tecla == GLUT_KEY_DOWN:
          
            self.distancia += 0.05
        if tecla == GLUT_KEY_LEFT:
            
            self.angulo -= 0.05
        if tecla == GLUT_KEY_RIGHT:
            
            self.angulo += 0.1
        if tecla == GLUT_KEY_F1:
            
            self.iluminacion.cambiar_color()
        
        self.distancia = max(20, min(self.distancia, 20))
      
        self.angulo %= math.pi * 3
        
        glutPostRedisplay()


if __name__ == '__main__':
    app = programa()
    app.iniciar()
