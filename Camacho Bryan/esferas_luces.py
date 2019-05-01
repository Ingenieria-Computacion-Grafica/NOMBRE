#!/usr/bin/python
# -*- coding: utf-8 -*-
# Librerías del programa
import sys
import math
from OpenGL.GL import *
from OpenGL.GLU import *
from OpenGL.GLUT import *


class Luz(object):
    encendida = True
    colores = [(1, 1, 1, 1), (0, 0, 0, 1), (1, 1, 0, 1), (0, 1, 0, 1), (1, 0, 1, 1)]

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
    meridianos = 40
    paralelos = 40

    def __init__(self, radio, posicion, color):
        self.radio = radio
        self.posicion = posicion
        self.color = color

    def dibujar(self):
        glTranslatef(*self.posicion)
        glMaterialfv(GL_FRONT, GL_DIFFUSE, self.color)
        glutSolidSphere(self.radio, Esfera.meridianos, Esfera.paralelos)


class App(object):
    def __init__(self, ancho=800, largo=600):
        self.titulo = 'Esferas con Luz'
        self.largo = largo
        self.ancho = ancho
        self.angulo = 0
        self.distancia = 20
        self.iluminacion = Luz(GL_LIGHT0, (15, 5, 15, 1))
        self.iluminacion1 = Luz(GL_LIGHT1, (0, 0, 0, 1))
        self.esfera1 = Esfera(2, (0, 0, 0), (1, 0.2, 0.2, 1))
        self.esfera2 = Esfera(1, (4, 2, 0), (0.25, 0.25, 0.25, 1))
        self.esfera3 = Esfera(1, (-4, 2, 0), (0.8, 0.8, 0.8, 1))
        self.esfera4 = Esfera(1, (-4, -2, 0), (0.25, 0.25, 0.25, 1))
        self.esfera5 = Esfera(1, (4, -6, 0), (0.8, 0.8, 0.8, 1))

    def iniciar(self):
        glutInit()
        glutInitDisplayMode(GLUT_DOUBLE | GLUT_DEPTH)
        glutInitWindowPosition(50, 50)
        glutInitWindowSize(self.ancho, self.largo)
        glutCreateWindow(self.titulo)
        glEnable(GL_DEPTH_TEST)
        glEnable(GL_LIGHTING)
        glEnable(GL_LIGHT0)
        glEnable(GL_LIGHT1)
        self.iluminacion.enable()
        glClearColor(.1, .1, .1, 1)
        glMatrixMode(GL_PROJECTION)
        aspect = self.ancho / self.largo
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
        gluLookAt(x, 0, z, 0, 0, 0, 0, 1, 0)
        self.iluminacion.dibujar()
        self.iluminacion1.dibujar()
        self.esfera1.dibujar()
        self.esfera2.dibujar()
        self.esfera3.dibujar()
        self.esfera4.dibujar()
        self.esfera5.dibujar()
        glutSwapBuffers()

    def keyboard(self, tecla, x, y):
        if tecla == GLUT_KEY_F1:
            sys.exit()
        if tecla == GLUT_KEY_UP:
            self.distancia -= 0.1
        if tecla == GLUT_KEY_DOWN:
            self.distancia += 0.1
        if tecla == GLUT_KEY_LEFT:
            self.angulo -= 0.05
        if tecla == GLUT_KEY_RIGHT:
            self.angulo += 0.05
        if tecla == GLUT_KEY_F2:
            self.iluminacion.cambiar_color()
        self.distancia = max(5, min(self.distancia, 20))
        self.angulo %= math.pi * 2
        glutPostRedisplay()


if __name__ == '__main__':
    app = App()
    app.iniciar()
