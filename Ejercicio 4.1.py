#Ejercicio 4.1

#Clase Cuenta para tener la mayoria de metodos
class Cuenta:
    def __init__(self, saldo, tasa_anual):
        self._saldo = saldo
        self._num_consignaciones = 0
        self._num_retiros = 0
        self._tasa_anual = tasa_anual
        self._comision_mensual = 0.0

    def consignar(self, cantidad):
        self._saldo += cantidad
        self._num_consignaciones += 1

    def retirar(self, cantidad):
        if cantidad <= self._saldo:
            self._saldo -= cantidad
            self._num_retiros += 1
        else:
            print("No hay saldo suficiente para realizar el retiro.")

    def calcular_interes_mensual(self):
        interes_mensual = (self._tasa_anual / 12) * self._saldo
        self._saldo += interes_mensual

    def extracto_mensual(self):
        self._saldo -= self._comision_mensual
        self.calcular_interes_mensual()

    def imprimir(self):
        print("Saldo: ", self._saldo)
        print("Comisión mensual: ", self._comision_mensual)
        print("Número de transacciones realizadas: ", self._num_consignaciones + self._num_retiros)

#Cuenta de ahorros con sus respectivos metodos
class CuentaAhorros(Cuenta):
    def __init__(self, saldo, tasa_anual):
        super().__init__(saldo, tasa_anual)
        self._cuenta_activa = saldo >= 10000

    def consignar(self, cantidad):
        if self._cuenta_activa:
            super().consignar(cantidad)
        else:
            print("La cuenta de ahorros está inactiva. No se puede consignar.")

    def retirar(self, cantidad):
        if self._cuenta_activa:
            super().retirar(cantidad)
        else:
            print("La cuenta de ahorros está inactiva. No se puede retirar.")

    def extracto_mensual(self):
        if self._num_retiros > 4:
            self._comision_mensual = 1000 * (self._num_retiros - 4)
        super().extracto_mensual()
        self.imprimir()

#Cuenta Corriente
class CuentaCorriente(Cuenta):
    def __init__(self, saldo, tasa_anual):
        super().__init__(saldo, tasa_anual)
        self._sobregiro = 0

    def retirar(self, cantidad):
        self._sobregiro += cantidad - self._saldo
        self._saldo = 0
        self._num_retiros += 1

    def consignar(self, cantidad):
        if self._sobregiro > 0:
            if cantidad <= self._sobregiro:
                self._sobregiro -= cantidad
            else:
                self._sobregiro = 0
                super().consignar(cantidad - self._sobregiro)
        else:
            super().consignar(cantidad)

    def extracto_mensual(self):
        super().extracto_mensual()
        self.imprimir()

#Una prueba interactuable de una Cuenta de Ahorros
print("Cuenta de Ahorros")
saldo_inicial_ahorros = float(input("Ingrese el saldo inicial: "))
tasa_interes_ahorros = float(input("Ingrese la tasa de interés anual para la cuenta de ahorros: "))

cuenta_ahorros = CuentaAhorros(saldo_inicial_ahorros, tasa_interes_ahorros)

consignacion_ahorros = float(input("Ingrese la cantidad a consignar: "))
cuenta_ahorros.consignar(consignacion_ahorros)

retiro_ahorros = float(input("Ingrese la cantidad a retirar: "))
cuenta_ahorros.retirar(retiro_ahorros)

print("\nExtracto mensual para la cuenta de ahorros:")
cuenta_ahorros.extracto_mensual()