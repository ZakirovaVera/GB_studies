# 5. Реализуйте алгоритм перемешивания списка.

import random

numbers = [4, 9, 7, 3, 8, 1, 0, 9, 5]
print(numbers)
index = 0

while index <= len(numbers)-1:
    index_rand = int(random.randint(0, len(numbers)-1))
    temp = numbers[index]
    numbers[index] = numbers[index_rand]
    numbers[index_rand] = temp
    index+=1
print(numbers)
