# -*- coding: utf-8 -*-
"""
Created on Tue Apr 14 20:52:59 2020

@author: Juan
"""
import numpy as np 
def utilidad():
    utilidad = np.array([27834,23789,30189,30967,32501,32701,31665,17155,4614,834])
    return utilidad
def ejercicio1(utilidad):
    cant = len(utilidad)
    prom1= (utilidad[cant-1]+utilidad[cant-2])/2
    prom2= (utilidad[0] + utilidad[1])/2
    dif = prom2 - prom1
    return dif

def ejercicio2(utilidad):
    cant = len(utilidad)
    mayor=utilidad[0]
    menor=utilidad[0]
    for i in range(0,cant):
        if mayor<utilidad[i]:
            mayor=utilidad[i]
        if menor>utilidad[i]:
            menor=utilidad[i]
    dif = mayor - menor
    return dif

def ejercicio3(utilidad):
    orden = np.sort(utilidad)
    mediana = (orden[4]+ orden[5])/2
    return mediana

def ejercicio4(utilidad):
    mediana = ejercicio3(utilidad)
    suma = 0 
    cant = len(utilidad)
    for i in range(0, cant):
        suma += utilidad[i]
    prom = suma/cant
    conclusion ="""
    Las ventajas de la mediana es que es fácil de comprender, no le afectan valores extremos
    y las desventajas es que los valores deben ser ordenados para realizar las diferentes operaciones 
    ya que los números que se encuentran en los extremos son importantes. 
    Cuando hablamos de promedio también nos encontramos con aspectos que hacen que tenga ventajas y desventajas.
    Las ventajas del promedio es que este es estable en el muestreo,  los valores extremos no se afectan, sin embargo
    si lo afecta cualquier cambio que se presente en los datos dados.
    """ 
    print("la media es: " + str(prom) + "y la mediana es: " + str(mediana))
    print(conclusion)
def ejercicio5(utilidad):
    acum = 0
    cant = len(utilidad)
    for i in range (0,cant):
        acum += utilidad[i]
    porc = 0 
    a=2007
    for i in range (0, cant):
        porc = (utilidad[i]*100)/acum
        a +=1
        print("el porcentaje que aporta el año es:" + str(a) + "el acumulado es: "+ str(porc)+"%")

def ejercicio6(utilidad):
    deficit = utilidad[9]-utilidad[8]
    return deficit
def ejercicio7(utilidad):
    cant = len(utilidad)
    a=2008
    for i in range(0,cant-1):
        a +=1
        d = utilidad[i]-utilidad[i+1]
        deficit = (d*10)/utilidad[i]
        print("El deficit del año "+ str(a) + "es" + str(deficit))

    
            



utilidad = utilidad()
print("La diferencia de la media es: " + str(ejercicio1(utilidad)))
print("La diferencia del mayor y el menor es: " + str(ejercicio2(utilidad)))
ejercicio5(utilidad)
print("el deficit del año 2017 con respecto al anterior es de: " + str(ejercicio6(utilidad)))
ejercicio7(utilidad)
ejercicio4(utilidad)
print("La mediana es " + str(ejercicio3(utilidad)))




