// Напишите программу, которая принимает на вход цифру, обозначающую
// день недели, и проверяет, является ли этот день выходным.

// Запросить ввод числа
Console.WriteLine("Введите число: ");
string day = Console.ReadLine() ?? "";

// Проверить преобразование в число
bool isTryParse = int.TryParse(day, out int dayNumber);
if (isTryParse == false)
{
    Console.WriteLine("Введено не число");
    return;
}

// Проверить число что входит в диапазон [1; 7]
if (dayNumber < 1 || dayNumber > 7)
{
    Console.WriteLine("Число не входит в дни недели");
    return;
}

// Если 1...5 то не выходной, иначе выходной
if (dayNumber >= 1 && dayNumber <= 5)
{
    Console.WriteLine("Нет, будни");
}
else
    Console.WriteLine("Да, выходной!");