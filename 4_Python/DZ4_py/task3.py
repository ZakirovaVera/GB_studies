# 3. Задайте последовательность чисел. Напишите программу, которая выведет
# список неповторяющихся элементов исходной последовательности.
# [1, 1, 2, 3, 4]
# [1, 2, 3, 4]

num_list = [int(i) for i in input("Введите числа через пробел: ").split()]
print(f'Исходный список {num_list}')

new_list = []
[new_list.append(i) for i in num_list if i not in new_list]
print(new_list)

# [1, 1, 2, 3, 4]
# [3, 4]
# 
# num_list = [int(i) for i in input("Введите числа через пробел: ").split()]
# print(f'Исходный список {num_list}')
# 
# new_list = [i for i in num_list if num_list.count(i) == 1]
# print(new_list)
