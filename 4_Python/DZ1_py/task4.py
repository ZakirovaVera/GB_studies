# Напишите программу, которая по заданному номеру четверти, показывает диапазон
# возможных координат точек в этой четверти (x и y).

quarter_number = int(input('Введите номер четверти: '))

if quarter_number == 1:
    print('Х (0; + бесконечности), Y(0; + бесконечности)')
elif quarter_number == 2:
    print('Х (0; - бесконечности), Y(0; + бесконечности)')
elif quarter_number == 3:
    print('Х (0; - бесконечности), Y(0; - бесконечности)')
elif quarter_number == 4:
    print('Х (0; + бесконечности), Y(0; - бесконечности)')
else:
    print('Error! Такой четверти нет')