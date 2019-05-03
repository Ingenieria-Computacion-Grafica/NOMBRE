
import pygame
from pygame.locals import *
from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
import math


def draw_G():
    glBegin(GL_LINES);
    glVertex2d(15, 10);
    glVertex2d(15, 50);
    glVertex2d(10, 50);
    glVertex2d(50, 50);
    glVertex2d(10, 50);
    glVertex2d(10, 10);
    glVertex2d(10, 40);
    glVertex2d(10, 10);
    glVertex2d(50, 30);
    glVertex2d(25, 30);
    glVertex2d(49, 30);
    glVertex2d(49, 10);
    glVertex2d(10, 10);
    glVertex2d(50, 10);
    
    glEnd();
                
