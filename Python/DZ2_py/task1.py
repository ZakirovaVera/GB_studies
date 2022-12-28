# 1. Напишите программу, которая принимает на вход вещественное
# число и показывает сумму его цифр.

# Пример:
# - 6782 -> 23
# - 0,56 -> 11

user_number = float(input('Введите вещественное число: '))
integer_user_number = int(str(abs(user_number)).replace('.', ''))
sum_digits_number = 0

while integer_user_number != 0:
    sum_digits_number += integer_user_number % 10
    integer_user_number = integer_user_number // 10

# если введено отрицательное число, то и сумма будет отрицательной
if user_number > 0:
    print(f'{user_number} -> {sum_digits_number}')
else:
    print(f'{user_number} -> {-sum_digits_number}')
