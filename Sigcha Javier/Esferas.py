
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
        glLightfv(light_id, GL_CONSTANT_ATTENUATION, 0.1)
        glLightfv(light_id, GL_LINEAR_ATTENUATION, 0.05)

    def cambiar_color(self):
        self.color_actual += 1
        
        self.color_actual %= len(Luz.colores)


    def enable(self):
        if not Luz.encendida:
            glEnable(GL_LIGHTING)
            Luz.encendida = True
        glEnable(self.luz_id)


class Esfera(object):
    
    meridianos = 60
    
    paralelos = 60

    
    def __init__(self, radio, posicion, color):
        self.radio = radio
        self.posicion = posicion
        self.color = color

    
    def dibujar(self):
        
        glTranslatef(*self.posicion)
        
        glMaterialfv(GL_FRONT, GL_DIFFUSE, self.color)
       
        glutSolidSphere(self.radio, Esfera.meridianos, Esfera.paralelos)


class programa(object):
    
    def __init__(self, largo=800, ancho=600):
       
        self.titulo = 'LUZ CUERPOS 3D'
        
        self.largo = largo
        self.ancho = ancho
        
        self.angulo = 0
        
        self.distancia = 20
        
        self.iluminacion = Luz(GL_LIGHT0, (0.5, 0, 15, 1))
       
        self.esfera1 = Esfera(2, (0, 0, 0), (1, 1, 1, 1))
        
        self.esfera2 = Esfera(1, (4, 2, 0), (1, 0.4, 0.4, 1))

    
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

        glutSwapBuffers()

    
    def keyboard(self, tecla, x, y):
        if tecla == GLUT_KEY_INSERT:
            
            sys.exit()
        if tecla == GLUT_KEY_UP:
            
            self.distancia -= 0.1
        if tecla == GLUT_KEY_DOWN:
          
            self.distancia += 0.1
        if tecla == GLUT_KEY_LEFT:
            
            self.angulo -= 0.05
        if tecla == GLUT_KEY_RIGHT:
            
            self.angulo += 0.05
        if tecla == GLUT_KEY_F1:
            
            self.iluminacion.cambiar_color()
        
        self.distancia = max(10, min(self.distancia, 20))
      
        self.angulo %= math.pi * 2
        
        glutPostRedisplay()


if __name__ == '__main__':
    app = programa()
    app.iniciar()
