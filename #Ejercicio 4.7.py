#Ejercicio 4.7 (Utilizando ABC, abstractmethod de la libreria abc)
from abc import ABC, abstractmethod

#Clase principal de Animales
class Animal(ABC):
    def __init__(self, sonido, alimentos, habitat, nombre_cientifico):
        self.sonido = sonido
        self.alimentos = alimentos
        self.habitat = habitat
        self.nombre_cientifico = nombre_cientifico

#Metodos Abstractos
    @abstractmethod
    def get_nombre_cientifico(self):
        return self.nombre_cientifico

    def get_sonido(self):
        return self.sonido

    def get_alimentos(self):
        return self.alimentos

    def get_habitat(self):
        return self.habitat
#Declaramos las diferentes clases de animales y sus atributos
class Canido(Animal):
    def __init__(self, sonido, alimentos, habitat, nombre_cientifico):
        super().__init__(sonido, alimentos, habitat, nombre_cientifico)

class Felino(Animal):
    def __init__(self, sonido, alimentos, habitat, nombre_cientifico):
        super().__init__(sonido, alimentos, habitat, nombre_cientifico)

class Perro(Canido):
    def __init__(self):
        super().__init__("ladrido", "carnívoro", "doméstico", "Lupus Familiaris")
    def get_nombre_cientifico(self):
        return self.nombre_cientifico

class Lobo(Canido):
    def __init__(self):
        super().__init__("aullido", "carnívoro", "bosque", "Canis Lupus")
    def get_nombre_cientifico(self):
        return self.nombre_cientifico

class Gato(Felino):
    def __init__(self):
        super().__init__("maullido", "ratones", "doméstico", "Felis silvestris catus")
    def get_nombre_cientifico(self):
        return self.nombre_cientifico

class Leon(Felino):
    def __init__(self):
        super().__init__("rugido", "carnívoro", "pradera", "Panthera Leo")
    def get_nombre_cientifico(self):
        return self.nombre_cientifico

#Lista por conveniencia
animales = [Perro(), Gato(), Lobo(), Leon()]
#Loop for in para imprimir todos los atributos de los 4 animales
for animal in animales:
    print("Nombre Científico:", animal.get_nombre_cientifico())
    print("Sonido:", animal.get_sonido())
    print("Alimentos:", animal.get_alimentos())
    print("Hábitat:", animal.get_habitat())
    print()