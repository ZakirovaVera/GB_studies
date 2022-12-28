// Задача 64: Задайте значения M и N. Напишите программу, которая выведет все 
//натуральные числа в промежутке от M до N.
// M = 1; N = 5. -> "1, 2, 3, 4, 5"
// M = 4; N = 8. -> "4, 5, 6, 7, 8"

Console.Clear();

int firstNum = GetNaturalNumberFromUser("Введите число 1: ", "Ошибка ввода!");
int secondNum = GetNaturalNumberFromUser("Введите число 2: ", "Ошибка ввода!");

if (firstNum > secondNum)
{
    Console.Write("Ошибка ввода, второе введенное число должно быть больше первого!");
    return;
}
else
    PrintNaturalsNambers(firstNum, secondNum);

int GetNaturalNumberFromUser(string message, string errorMessage)
{
    while (true)
    {
        Console.Write(message);
        bool isCorrect = int.TryParse(Console.ReadLine(), out int userNumber);
        if (isCorrect && userNumber > 0)
            return userNumber;
        Console.WriteLine(errorMessage);
    }
}

string PrintNaturalsNambers(int start, int end)
{
    if (start == end + 1)
        return start.ToString();

    if (start == end)
        Console.Write($"{start}");
    else
        Console.Write($"{start}, ");
    return PrintNaturalsNambers(start + 1, end);
}
