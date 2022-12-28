# 5. Даны два файла, в каждом из которых находится запись многочлена.
# Задача - сформировать файл, содержащий сумму многочленов.

with open('file1.txt', 'r') as file:
    file_data_list1 = file.read()
    print(f'Данные с файла 1 многочлен {file_data_list1}')
file.close()

with open('file2.txt', 'r') as file:
    file_data_list2 = file.read()
    print(f'Данные с файла 2 многочлен {file_data_list2}')
file.close()

f_1 = file_data_list1.translate({ord(i): None for i in '+' '=' '0' '*'})
print(f_1)

f_2 = file_data_list2.translate({ord(i): None for i in '+' '=' '0' '*'})
print(f_2)
