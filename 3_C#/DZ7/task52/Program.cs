// Задача 52: Задайте двумерный массив из целых чисел. 
// Найдите среднее арифметическое элементов в каждом столбце.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.

Console.Clear();

int rows = GetNumberFromUser("Введите число строк массива: ", "Ошибка ввода!");
int columns = GetNumberFromUser("Введите число столбцов массива: ", "Ошибка ввода!");
int startArray = GetNumberFromUser("Введите минимальное число массива: ", "Ошибка ввода!");
int endArray = GetNumberFromUser("Введите максимальное число массива: ", "Ошибка ввода!");

int[,] array = GetArray(rows, columns, startArray, endArray);
PrintArray(array);
double[] averageColumn = ArithmeticMeanColumn(array);
Console.WriteLine($"Среднее арифметическое каждого столбца: {String.Join(", ", averageColumn)}");

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

//заполнение массива
int[,] GetArray(int m, int n, int minValue, int maxValue)
{
    int[,] result = new int[m, n];
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            result[i, j] = new Random().Next(minValue, maxValue + 1);
        }
    }
    return result;
}

//вывод массива в консоль
void PrintArray(int[,] inArray)
{
    for (int i = 0; i < inArray.GetLength(0); i++)
    {
        for (int j = 0; j < inArray.GetLength(1); j++)
        {
            Console.Write($"{inArray[i, j]}\t");
        }
        Console.WriteLine();
    }
}

//ср.арифметическое столбоц
double[] ArithmeticMeanColumn(int[,] inArray)
{
    double[] result = new double[inArray.GetLength(1)];
    for (int j = 0; j < inArray.GetLength(1); j++)
    {
        double res = 0;
        for (int i = 0; i < inArray.GetLength(0); i++)
        {
            res += inArray[i, j];
        }
        result[j] = Math.Round((res / inArray.GetLength(0)), 1);
    }
    return result;
}
