from car import Car
from account import Account

if __name__ == "__main__":
    print ("Hola Mundo")

    car = Car("AJE436", Account("Juan Gonzalez", "55324"))
    print(vars(Car))
    print(vars(Car.driver))