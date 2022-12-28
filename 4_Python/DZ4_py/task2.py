# 2. Задайте натуральное число N. Напишите программу,
# которая составит список простых множителей числа N.

num_user = int(input('Введите число: '))
lst_multiplier = []
index = 2

while index <= num_user:
    if num_user % index == 0:
        lst_multiplier.append(index)
        num_user //= index
    else:
        index += 1
print(lst_multiplier)
