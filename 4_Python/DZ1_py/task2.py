# Напишите программу для. проверки истинности утверждения ¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z
# для всех значений предикат.
import random
x = random.randrange(0,2)
y = random.randrange(0,2)
z = random.randrange(0,2)

result = not (x or y or z) == (not x and not y and not z)
print(f'х = {x}, y = {y}, z = {z} \n¬(X ⋁ Y ⋁ Z) = ¬X ⋀ ¬Y ⋀ ¬Z \nРезультат: {result}')

# Данное утверждение истинности во всех случаях будет True, в print 
# выводится итог проверки.