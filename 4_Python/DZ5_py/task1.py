# Напишите программу, удаляющую из текста все слова, содержащие ""абв"".

with open('file.txt', 'r', encoding='utf-8') as file:
    file_data_list = file.read()
    print(f'Данные с файла {file_data_list}')
file.close()

my_list = file_data_list.split(" ")
result = []
for word in my_list:
    if "абв" not in word:
        result.append(word)

print(" ".join(result))

# def rm_pattern(usr_data: str, pattern: str) -> str:

#     return ' '.join([word for word in usr_data.split() if not pattern in word])

# PATTERN = 'абв'

# my_text = 'арбуз абвгд был абвгд красным'

# print(rm_pattern(my_text, PATTERN))
