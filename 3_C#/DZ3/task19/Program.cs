// Задача 19: Напишите программу, которая принимает на вход пятизначное число 
// и проверяет, является ли оно палиндромом.

Console.Clear();
Console.Write("Введите число: ");
string strNumber = Console.ReadLine() ?? "";
bool isParseNum = int.TryParse(strNumber, out int number);
if (isParseNum == false)
{
    Console.WriteLine("Ошибка, не число!");
    return;
}

int length = 5;
if (strNumber.Length != length)
{
    Console.WriteLine("Ошибка, число не 5-ти значное!");
    return;
}

char[] arr = strNumber.ToCharArray();
Array.Reverse(arr);

string str = new string(arr);

if (strNumber == str)
{
    Console.WriteLine("Число является палиндромом");
}
else
{
    Console.WriteLine("Число НЕ является палиндромом");
}