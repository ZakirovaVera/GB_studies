// Напишите программу, которая принимает на вход число (N) и выдаёт 
// таблицу кубов чисел от 1 до N.
bool isNumber = false;
int Number = 0;

while (isNumber == false)
{
    Console.WriteLine("Введите число: ");
    string stringNum = Console.ReadLine() ?? "";
    isNumber = int.TryParse(stringNum, out Number);
    if (isNumber == false)
    {
        Console.WriteLine("Ошибка! Введено не число!");
    }
}

int index = 1;
while (index <= Number)
{
    double cubeNumber = Math.Pow(index, 3);
    index++;
    Console.Write(cubeNumber + ", ");
}