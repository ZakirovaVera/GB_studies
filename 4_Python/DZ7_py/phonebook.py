import csv_data_provider as csv
import json_data_provider as json

data = 0


def initialization():
    global data
    data = csv.read_file()


def show():
    for i, item in enumerate(data):
        item_str = str(item).translate({ord(i): None for i in '{' '}' '\''})
        print(f'{i}. {item_str}')


def new_record():
    global data
    new_row = {
        'Фамилия': input("Введите фамилию: "),
        'Имя': input("Введите имя: "),
        'Тел.': input("Введите телефон: "),
        'Описание': input("Введите описание: ")
    }
    data.append(new_row)


def remove_record():
    global data
    data.pop(int(input("Введите позицию для удаления: ")))


def save_file():
    global data
    csv.write_in_file(data)
    json.write_in_file(data)
