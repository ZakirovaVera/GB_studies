// Задача 43. Напишите программу, которая найдёт точку пересечения двух прямых, 
// заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; значения b1, k1, b2 и k2 
// задаются пользователем.
// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)

Console.Clear();

int meaningB1 = GetNumberFromUser("Введите значение b1 = ", "Ошибка ввода!");
int meaningK1 = GetNumberFromUser("Введите значение k1 = ", "Ошибка ввода!");
int meaningB2 = GetNumberFromUser("Введите значение b2 = ", "Ошибка ввода!");
int meaningK2 = GetNumberFromUser("Введите значение k2 = ", "Ошибка ввода!");
LineIntersection(meaningB1, meaningK1, meaningB2, meaningK2);

int GetNumberFromUser(string message, string errorMessage)
{
    while (true)
    {
        Console.WriteLine(message);
        bool isCorrect = int.TryParse(Console.ReadLine(), out int userNumber);
        if (isCorrect)
            return userNumber;
        Console.WriteLine(errorMessage);
    }
}

void LineIntersection(double B1, double K1, double B2, double K2)
{
    double coordinatesX = (B2 - B1) / (K1 - K2);
    double coordinatesY = K1 * coordinatesX + B1;
    if (K1 == K2 && B1 != B2)
        Console.WriteLine("Заданные прямые не пересекаются, параллельны!");
    else if (K1 == K2 && B1 == B2)
        Console.WriteLine("Заданные прямые идентичны");
    else
        Console.WriteLine($"b1 = {B1}, k1 = {K1}, " + 
        $"b2 = {B2}, k2 = {K2} -> ({coordinatesX}; {coordinatesY})");
}
