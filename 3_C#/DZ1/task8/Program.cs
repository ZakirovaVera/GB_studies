Console.Write("Введите число: ");
string inputNumber = Console.ReadLine() ?? "";
int number;
int index = 2;

if (int.TryParse(inputNumber, out number))
{
    while (index <= number)
    {
        Console.Write(index + " ");
        index += 2;
    }
}
else
    Console.Write("Ошибка! Введите число!");
