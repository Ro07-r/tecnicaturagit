class Cubo:
    """
    Crear la clase Cubo con los atributos: ancho, alto y profundidad con un metodo
    calcular_volumen que tendrá la formula:
    volumen = ancho * altura * profundidad
    que el usuario ingrese los valores
    """

    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.alto * self.profundidad

ancho = int(input("Digite el numero para el ancho del cubo: "))
alto = int(input("Digite el numero para el alto del cubo: "))
profundidad = int(input("Digite el numero para la profundidad del cubo: "))

#Instancia del objeto
cubo1 = Cubo(ancho, alto, profundidad)
print(f'El volumen del cubo es: {cubo1.calcular_volumen()}')