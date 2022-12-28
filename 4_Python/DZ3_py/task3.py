# 3. Задайте список из вещественных чисел. Напишите программу, которая найдёт разницу
# между максимальным и минимальным значением дробной части элементов.
# Пример:
# - [1.1, 1.2, 3.1, 5, 10.01] => 0.19

# numbers = [1.1, 1.2, 3.1, 5, 10.01]

# max_value_fractional_part = round(numbers[0] % 1, 2)
# min_value_fractional_part = round(numbers[0] % 1, 2)

# for item in numbers:
#     fractional_part = item % 1
#     if fractional_part > max_value_fractional_part:
#         max_value_fractional_part = fractional_part
#     if fractional_part < max_value_fractional_part:
#         min_value_fractional_part = fractional_part
#     different_number = round(
#         max_value_fractional_part - min_value_fractional_part, 2)
# print(f'{numbers} \nРазницу между максимальным и минимальным значением дробной\
#  части элементов {different_number}')

lst = [1.1, 1.2, 3.1, 5, 10.01]

lst = [round(val % 1, 2) for val in lst]
rev_result = max(lst) - min(lst)
print(rev_result)
