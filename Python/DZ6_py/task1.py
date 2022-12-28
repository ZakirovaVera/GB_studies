# 5. Задайте число. Составьте список чисел Фибоначчи, в том числе для отрицательных индексов.
# Пример:
# - для k = 8 список будет выглядеть так:
# [-21 ,13, -8, 5, −3, 2, −1, 1, 0, 1, 1, 2, 3, 5, 8, 13, 21] [Негафибоначчи]

number_row_length = int(input('Введите длину ряда: '))

fibonacci_positive = []
[
    fibonacci_positive.insert(i, i) if (i == 0 or i == 1)
    else fibonacci_positive.append(fibonacci_positive[i - 1] + fibonacci_positive[i - 2])
    for i in range(0, number_row_length + 1)
]

fibonacci_negative = [((-1)**(i + 1))*item for i,
                      item in enumerate(fibonacci_positive) if i != 0]

fibonacci_negative.reverse()
fibonacci = fibonacci_negative + fibonacci_positive
print(f'Для N = {number_row_length} -> Негафибоначчи {fibonacci}')
