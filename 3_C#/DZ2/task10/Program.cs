// Задача 10: Напишите программу, которая принимает на вход трёхзначное число 
//и на выходе показывает вторую цифру этого числа.
int triplicityNumber;
while (true)
{
    // Ввести число
    Console.Write("Введите число: ");
    string number = Console.ReadLine() ?? "";    
    bool isParseStrToNumber = int.TryParse(number, out triplicityNumber);
    if (isParseStrToNumber == false)
    {
        Console.WriteLine("Выявлены ошибки при вводе данных!");
        continue;
    }
    // Проверка на трехзначность
    bool isTriplicityNumber = true;
    if (triplicityNumber < 100) isTriplicityNumber = false;
    if (triplicityNumber > 1000) isTriplicityNumber = false;

    if (isTriplicityNumber)
    {        
        break;
    }
    Console.WriteLine("Выявлены ошибки при вводе данных!");
}

int a1 = triplicityNumber / 10;
int a2 = a1 % 10;
Console.WriteLine($"Второе число в вводимом числе: {a2}");