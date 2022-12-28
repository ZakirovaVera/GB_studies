Console.Write("Введите число: ");
string str1 = Console.ReadLine() ?? "";
int number1;

Console.Write("Введите число: ");
string str2 = Console.ReadLine() ?? "";
int number2;

Console.Write("Введите число: ");
string str3 = Console.ReadLine() ?? "";
int number3;


if (int.TryParse(str1, out number1))
{
    if (int.TryParse(str2, out number2))
    {
        if (int.TryParse(str3, out number3))
        {
            int max = number1;

            if (number2 > max)
                max = number2;
            if (number3 > max)
                max = number3;

            Console.Write("max = ");
            Console.WriteLine(max);
        }

        else
            Console.Write("Неверно введено число 3");

    }
    else
        Console.Write("Неверно введено число 2");
}
else
    Console.Write("Неверно введено число 1");
