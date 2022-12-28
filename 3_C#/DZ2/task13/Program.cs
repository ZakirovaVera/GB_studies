// Напишите программу, которая выводит третью цифру заданного числа 
// или сообщает, что третьей цифры нет.

// Запросить ввести число
Console.Write("Введите число: ");
string inputNumber = Console.ReadLine() ?? "";

// Проверка строки на число, если не число то сообщаем и выходим.
bool success = int.TryParse(inputNumber, out int number);
if (success == false)
{
    Console.WriteLine("Введено не число");
    return;
}

// Проверить если длина строки < 3 то сообщаем и выходим
int lengthStr = inputNumber.Length;
if (lengthStr < 3)
{
    Console.WriteLine("Третьего числа нет");
    return;
}

// Получить третий символ
char firstChar = inputNumber[2]; // третий символ

// Вывод результата, третьего символа или его отсутсвия
Console.WriteLine(firstChar);