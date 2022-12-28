# 1. Задайте список из нескольких чисел. Напишите программу, которая найдёт
# сумму элементов списка, стоящих на нечётной позиции.
# Пример:
# - [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12

# numbers_list = [2, 3, 5, 9, 3]
# print(numbers_list)
# amount_on_odd_positions = 0

# for i, item in enumerate(numbers_list):
#     if i % 2 == 1:
#         amount_on_odd_positions += item
#         print(f'На позиции {i} -> {item}')
# print(f'Сумма элементов на нечетных позициях = {amount_on_odd_positions}')

users_nums = [
    45, # 0
    67, # 1
    43, # 2
    78, # 3
    3,  # 4
    5,  # 5
]

print(f'Sum => {sum(users_nums[1::2])}')
