Console.Write("Введите число: ");
string imputNumber = Console.ReadLine() ?? "";
int number;

if (int.TryParse(imputNumber, out number))
{
    if (number % 2 == 1)
    {
        Console.WriteLine("число нечетное");
    }
    else
    {
        Console.WriteLine("Число четное");
    }
}
else
{
    Console.Write("Ошибка, введите число!");
}