// Задача 27: Напишите программу, которая принимает на вход число 
// и выдаёт сумму цифр в числе.
// 452 -> 11 (4+5+2)
// 82 -> 10
// 9012 -> 12

Console.Clear();
int num = NumberEnteredByUser("Введите целое число: ", "Ошибка ввода!");

int sumDigits = SumDigitsNumber(num);

Console.WriteLine("Сумма цифр в числе:");
Console.WriteLine($"{num} -> {sumDigits}");

int NumberEnteredByUser(string message, string messageError)
{
    while (true)
    {
        Console.Write(message);
        bool correctParse = int.TryParse(Console.ReadLine(), out int userNumber);
        if (correctParse)
            return userNumber;
        Console.WriteLine(messageError);
    }
}

int SumDigitsNumber(int number)
{
    int summa = 0;
    while (Math.Abs(number) > 0)
    {
        summa += number % 10;
        number /= 10; 
    }
    return summa;
}
