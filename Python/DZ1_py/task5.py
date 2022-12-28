# Напишите программу, которая принимает на вход координаты двух точек и
# находит расстояние между ними в 2D пространстве.

# Пример:
# - A (3,6); B (2,1) -> 5,09
# - A (7,-5); B (1,-1) -> 7,21
import math
x_coordinateA = int(input('Введите координату Х: '))
y_coordinateA = int(input('Введите координату Y: '))
x_coordinateB = int(input('Введите координату Х: '))
y_coordinateB = int(input('Введите координату Y: '))

distance_between_points = math.sqrt(pow(x_coordinateB-x_coordinateA, 2) + pow(y_coordinateB-y_coordinateA, 2))
print(f'А {x_coordinateA,y_coordinateA}; B {x_coordinateB,y_coordinateB} -> {round(distance_between_points,2)}')
