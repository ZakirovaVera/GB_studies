Console.Write("Введите число: ");
string inputNumber = Console.ReadLine() ?? "";
int number;
int index = 1;

if (int.TryParse(inputNumber, out number))
{
    while (index <= number)
    {
        int Четное = index % 2;
        if (Четное == 0)
        {
            Console.Write($"{index} ");
        }
        index += 1;
    }
}
else
    Console.Write("Ошибка! Введите число!");