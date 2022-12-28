// Задача 68: Напишите программу вычисления функции Аккермана с помощью рекурсии. 
// Даны два неотрицательных числа m и n.
// m = 2, n = 3 -> A(m,n) = 9
// m = 3, n = 2 -> A(m,n) = 29

Console.Clear();

int firstNum = GetNonNegativeNumberFromUser("Введите число M: ", "Ошибка ввода!");
int secondNum = GetNonNegativeNumberFromUser("Введите число N: ", "Ошибка ввода!");

int resultAckerman = FunctionAckerman(firstNum, secondNum);
Console.WriteLine($"Функции Аккермана от M = {firstNum} и N = {secondNum} -> {resultAckerman}");

int GetNonNegativeNumberFromUser(string message, string errorMessage)
{
    while (true)
    {
        Console.Write(message);
        bool isCorrect = int.TryParse(Console.ReadLine(), out int userNumber);
        if (isCorrect && userNumber >= 0)
            return userNumber;
        Console.WriteLine(errorMessage);
    }
}

int FunctionAckerman(int numberM, int numberN)
{
    if (numberM == 0)
        return numberN + 1;

    if (numberM > 0 && numberN == 0)
        return FunctionAckerman(numberM - 1, 1);

    return FunctionAckerman(numberM - 1, FunctionAckerman(numberM, numberN - 1));
}
