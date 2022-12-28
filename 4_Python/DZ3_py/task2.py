# 2. Напишите программу, которая найдёт произведение пар чисел списка.
# Парой считаем первый и последний элемент, второй и предпоследний и т.д.
# Пример:
# - [2, 3, 4, 5, 6] => [12, 15, 16];
# - [2, 3, 5, 6] => [12, 15]

numbers_list = [2, 3, 4, 5, 6]
product_pairs_numbers = []
print(numbers_list)

for i, item in enumerate(numbers_list):
    if i <= (len(numbers_list)-1)/2:
        product_pairs_numbers.append(item * numbers_list[-1-i])

# Второе решение задачи
# i=0
# while i <= (len(numbers_list)-1)/2:
#     product_pairs_numbers.append(numbers_list[i] * numbers_list[-1-i])
#     i+=1

print(product_pairs_numbers)
