// Задача 50: Напишите программу, которая на вход принимает 
//позиции элемента в двумерном массиве, и возвращает значение этого 
// элемента или же указание, что такого элемента нет.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4

// 1 7 -> такого числа в массиве нет

Console.Clear();

int rows = GetNumberFromUser("Введите число строк массива: ", "Ошибка ввода!");
int columns = GetNumberFromUser("Введите число столбцов массива: ", "Ошибка ввода!");
int startArray = GetNumberFromUser("Введите минимальное число массива: ", "Ошибка ввода!");
int endArray = GetNumberFromUser("Введите максимальное число массива: ", "Ошибка ввода!");

int rowsNumber = GetNumberFromUser("Введите номер строки: ", "Ошибка ввода!");
int columsNumber = GetNumberFromUser("Введите номер столбца: ", "Ошибка ввода!");

int[,] array = GetArray(rows, columns, startArray, endArray);
PrintArray(array);

ElementValueArray(rowsNumber, columsNumber, array);

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

//вывод элемента по заданной пользователем позиции
void ElementValueArray(int m, int n, int[,] inArray)
{
    if ((m > inArray.GetLength(0) || n > inArray.GetLength(1)) || (m <= 0 || n <= 0))
    {
        Console.WriteLine($"{m} {n} -> Такого числа нет в массиве");
        return;
    }
    Console.WriteLine($"{m} {n} -> {inArray[m - 1, n - 1]}");
}
