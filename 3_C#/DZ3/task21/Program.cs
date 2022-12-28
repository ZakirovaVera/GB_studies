// Задача 21: Напишите программу, которая принимает на вход координаты 
// двух точек и находит расстояние между ними в 3D пространстве.


int EnterNumber(string textConsole)
{
    int num = 0;
    bool isParseNum = false;
    while (isParseNum == false)
    {
        Console.WriteLine(textConsole);
        string strNum = Console.ReadLine() ?? "";
        isParseNum = int.TryParse(strNum, out num);
        if (isParseNum == false)
        {
            Console.WriteLine("Ошибка ввода");
        }
    }
    return num;
}

int x1 = EnterNumber("Введите координату 1 для точки 1");
int y1 = EnterNumber("Введите координату 2 для точки 1");
int z1 = EnterNumber("Введите координату 3 для точки 1");

int x2 = EnterNumber("Введите координату 1 для точки 2");
int y2 = EnterNumber("Введите координату 2 для точки 2");
int z2 = EnterNumber("Введите координату 3 для точки 2");


double length = Math.Sqrt(Math.Pow(x2 - x1, 2) + Math.Pow(y2 - y1, 2) + Math.Pow(z2 - z1, 2));
Console.WriteLine(length);