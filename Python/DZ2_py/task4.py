# 4. Задайте список из N элементов, заполненных числами из промежутка [-N, N].
# Найдите произведение элементов на указанных позициях. Позиции хранятся
# в файле file.txt в одной строке одно число.
import random
user_number_n = int(input('Введите целое число N: '))
string_numbers = []
sum_position_txt = 0

while len(string_numbers) < user_number_n:
    string_numbers.append(random.randrange(-user_number_n, user_number_n+1))

print(string_numbers)

with open("text.txt", "r") as file:
    file_data_list = file.read().splitlines()
    print(f'Данные с файла {file_data_list}')
    index = 0
    while index < len(file_data_list):
        position = int(file_data_list[index])
        # проверка, значение с файла > длины списка
        if position > len(string_numbers):
            sum_position_txt += 0
        else:
            sum_position_txt += string_numbers[position]
            print(f'На {position} позиции -> {string_numbers[position]}')
        index += 1
file.close()
print(f'Сумма этих позиций = {sum_position_txt}')
