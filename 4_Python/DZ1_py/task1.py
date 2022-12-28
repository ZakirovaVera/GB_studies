# Напишите программу, которая принимает на вход цифру, обозначающую день недели,
# и проверяет, является ли этот день выходным.
# Пример:
# - 6 -> да
# - 7 -> да
# - 1 -> нет

day_number = int(input('Введите число: '))

if day_number < 1 or day_number > 7:
    print(f'Число {day_number} не входит в дни недели')
elif day_number >= 1 and day_number <= 5:
    print(f'{day_number} -> Нет, Будни')
else:
    print(f'{day_number} -> Да, выходной!')
