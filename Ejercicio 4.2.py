#Ejercicio 4.2

#Aclaración, en Python no existe como tal la encapsulación restrictiva de atributos/metodos como en otros idiomas
#Por ejemplo self.__identificador no es más que un cambio de nombre para identificar que no debería ser utilizada por otras clases
#Por ende los ejercicios 4.2 y 4.7 que fueron hechos en Python NO utilizarán más este tipo de "semi encapsulación", espero comprenda.

#Clase principal
class Inmueble:
    def __init__(self, identificador, area, direccion):
        self.identificador = identificador
        self.area = area
        self.direccion = direccion
        self.precio_metro_cuadrado = 0
    def calcular_precio(self):
        return self.area * self.precio_metro_cuadrado
    def mostrar_atributos(self):
        print("Identificador Inmobiliario:", self.identificador)
        print("Área en metros cuadrados:", self.area)
        print("Dirección:", self.direccion)
        print("Precio por metro cuadrado:", self.precio_metro_cuadrado)
        print("Precio total:", self.calcular_precio())


#Agregamos atributos de Casas generales
class Casa(Inmueble):
    def __init__(self, identificador, area, direccion, num_habitaciones, num_banos):
        super().__init__(identificador, area, direccion)
        self.num_habitaciones = num_habitaciones
        self.num_banos = num_banos

#Agregamos atributos de Casas Rurales
class CasaRural(Casa):
    def __init__(self, identificador, area, direccion, num_habitaciones, num_banos, distancia_municipal, altitud):
        super().__init__(identificador, area, direccion, num_habitaciones, num_banos)
        self.distancia_municipal = distancia_municipal
        self.altitud = altitud
        self.precio_metro_cuadrado = 1500000

#Agregamos atributos de Conjuntos Cerrados
class CasaConjuntoCerrado(Casa):
    def __init__(self, identificador, area, direccion, num_habitaciones, num_banos, num_pisos, valor_administracion, incluye_piscina, incluye_campos_deportivos):
        super().__init__(identificador, area, direccion, num_habitaciones, num_banos)
        self.num_pisos = num_pisos
        self.valor_administracion = valor_administracion
        self.incluye_piscina = incluye_piscina
        self.incluye_campos_deportivos = incluye_campos_deportivos
        self.precio_metro_cuadrado = 2500000

    def mostrar_atributos(self):
        super().mostrar_atributos()
        print("Número de pisos:", self.num_pisos)
        print("Valor de administración:", self.valor_administracion)
        print("Incluye piscina:", self.incluye_piscina)
        print("Incluye campos deportivos:", self.incluye_campos_deportivos)

#Agregamos atributos de CasasIndependientes
class CasaIndependiente(Casa):
    def __init__(self, identificador, area, direccion, num_habitaciones, num_banos):
        super().__init__(identificador, area, direccion, num_habitaciones, num_banos)
        self.precio_metro_cuadrado = 3000000

#Agregamos atributos de apartamento familiar
class ApartamentoFamiliar(Inmueble):
    def __init__(self, identificador, area, direccion, num_habitaciones, num_banos, valor_administracion):
        super().__init__(identificador, area, direccion)
        self.num_habitaciones = num_habitaciones
        self.num_banos = num_banos
        self.valor_administracion = valor_administracion
        self.precio_metro_cuadrado = 2000000

    def mostrar_atributos(self):
        super().mostrar_atributos()
        print("Número de habitaciones:", self.num_habitaciones)
        print("Número de baños:", self.num_banos)
        print("Valor de administración:", self.valor_administracion)

#Atributos de Apartaestudio
class Apartaestudio(Inmueble):
    def __init__(self, identificador, area, direccion):
        super().__init__(identificador, area, direccion)
        self.num_habitaciones = 1 
        self.num_banos = 1
        self.precio_metro_cuadrado = 1500000

    def mostrar_atributos(self):
        super().mostrar_atributos()
        print("Número de habitaciones:", self.num_habitaciones)
        print("Número de baños:", self.num_banos)
#Atributos de Locales
class Local(Inmueble):
    def __init__(self, identificador, area, direccion, localizacion):
        super().__init__(identificador, area, direccion)
        self.localizacion = localizacion


class LocalComercial(Local):
    def __init__(self, identificador, area, direccion, localizacion, centro_comercial):
        super().__init__(identificador, area, direccion, localizacion)
        self.centro_comercial = centro_comercial
        self.precio_metro_cuadrado = 3000000


class Oficina(Local):
    def __init__(self, identificador, area, direccion, localizacion, es_gobierno):
        super().__init__(identificador, area, direccion, localizacion)
        self.es_gobierno = es_gobierno
        self.precio_metro_cuadrado = 3500000


# Prueba con un apartamentoFamiliar y un apartaestudio
print("=== Apartamento Familiar ===")
apartamento_familiar = ApartamentoFamiliar(103067, 120, "Avenida Santander 45-45", 3, 2, 200000)
apartamento_familiar.mostrar_atributos()

print("\n=== Apartaestudio ===")
apartaestudio = Apartaestudio(12354, 50, "Avenida Caracas 30-15")
apartaestudio.mostrar_atributos()