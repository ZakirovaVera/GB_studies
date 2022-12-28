// Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму 
// натуральных элементов в промежутке от M до N.
// M = 1; N = 15 -> 120
// M = 4; N = 8. -> 30

Console.Clear();

int firstNum = GetNaturalNumberFromUser("Введите число M: ", "Ошибка ввода!");
int secondNum = GetNaturalNumberFromUser("Введите число N: ", "Ошибка ввода!");

if (firstNum > secondNum)
{
    Console.Write("Ошибка ввода, второе введенное число должно быть больше первого!");
    return;
}
else
{
    int resultRecursive = SumNaturalNumbers(firstNum, secondNum);
    Console.WriteLine($"Сумма цифр в числе: M = {firstNum}, N = {secondNum} -> {resultRecursive}");
}

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

int SumNaturalNumbers(int start, int end)
{
    if (start == end)
        return start;
    return start+ SumNaturalNumbers(start + 1, end);
}
