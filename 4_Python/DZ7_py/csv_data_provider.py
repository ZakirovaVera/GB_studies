import csv


def read_file():
    """
    Метод считывает и возвращает считанные данные с файла file_name
    return: данные с файла 
    """
    with open('data_file.csv', encoding='utf-8') as r_file:
        # Создаем объект reader, указываем символ-разделитель ","
        file_reader = csv.reader(r_file, delimiter=",")
        # Считывание данных из CSV файла, формирование словаря
        data = [{
                'Фамилия': row[0],
                'Имя': row[1],
                'Тел.': row[2],
                'Описание': row[3]
                } for row in file_reader
                ]
    return data


def write_in_file(data):
    """
    Метод позволяет записать текст в файл file_name
    """
    with open('data_file.csv', mode="w", encoding='utf-8') as w_file:
        names = ['Фамилия', 'Имя', 'Тел.', 'Описание']
        file_writer = csv.DictWriter(w_file, delimiter=',',
                                     lineterminator="\r", fieldnames=names)
        for i in data:
            file_writer.writerow(i)
