# 3. Задайте список(словарь) из n чисел последовательности $(1+\frac 1 n)^n$ -> (1+1/n)^n
# и выведите на экран их сумму.

user_number = int(input('Введите число N: '))
result_sequence = {}
sum_sequence = 0

for key in range(1, user_number+1):
    result_sequence[key] = round((1 + 1 / key)**key, 2)
    sum_sequence += result_sequence[key]

print(f'N = {user_number}: {result_sequence} \nсумма = {round(sum_sequence, 3)}')
