# Создайте программу для игры с конфетами человек против человека.
# Условие задачи: На столе лежит 2021 конфета. Играют два игрока делая ход друг после друга.
# Первый ход определяется жеребьёвкой. За один ход можно забрать не более чем 28 конфет.
# Все конфеты оппонента достаются сделавшему последний ход. Сколько конфет нужно
# взять первому игроку, чтобы забрать все конфеты у своего конкурента?

# чтобы выиграть первый игрок должен взять 20 конфет, а последующие ходы сравнивать до 29 (ход соперника и свой)

import random


# ввод числа от пользователя
def user_input_number():
    num_candy = int(
        input(f'Игрок {current_player}, введите число конфет от 1 до 28: '))
    print(f'Игрок {current_player} ввел {num_candy}')
    if num_candy > 28 or num_candy <= 0:
        print(f'Введено неверное число, повторите ввод.')
        return user_input_number()
    return num_candy


# игра
def game_candy(number_candies, num_candy):
    number_candies = number_candies - num_candy
    if number_candies < 0:
        number_candies = 0
    print(f'Осталось {number_candies} конфет')
    return number_candies


# проверка выигрыша
def win_check(turn):
    if turn <= 0:
        return True


# переключение игрока
def change_player(current_player):
    if current_player == 1:
        return 2
    return 1


number_candies = 50  # количество конфет в начале игры
print(f'В начале игры {number_candies} конфет')
current_player = random.randint(1, 2)  # первый ход 1 - 2
print(f'Ход {current_player} игрока')
game_runned = True  # флаг игры

while (game_runned):  # пока Правда игра продолжается
    number_entry = user_input_number()  # ввод числа user
    number_candies = game_candy(number_candies, number_entry)  # ход игры
    is_win = win_check(number_candies)
    if is_win == True:
        print(f'Победил игрок {current_player}')
        game_runned = False
    current_player = change_player(current_player)
