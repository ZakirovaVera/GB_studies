Console.Write("Введите число: ");
string str1 = Console.ReadLine() ?? "";
int number1;

Console.Write("Введите число: ");
string str2 = Console.ReadLine() ?? "";
int number2;

if (int.TryParse(str1, out number1))
{
    if (int.TryParse(str2, out number2))
    {
        int max = number1;
        int min = number1;
        if (number2 > max)
        {
            max = number2;
        }
        else
        {
            min = number2;
        }
        Console.Write("max = ");
        Console.WriteLine(max);
        Console.Write("min = ");
        Console.WriteLine(min);
    }
    else
        Console.Write("Неверно введено число 2");
}
else
    Console.Write("Неверно введено число 1");
    