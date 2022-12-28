// Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел 
// больше 0 ввёл пользователь.
// 0, 7, 8, -2, -2 -> 2
// -1, -7, 567, 89, 223-> 3

Console.Clear();

int sizeArray = GetNumberFromUser("Введите количество чисел: ", "Ошибка ввода!");
int[] arrayNum = GetArray(sizeArray);
int countNumGreaterZero = GetCountOfNumbersGreaterThanZero(arrayNum);
Console.WriteLine($"[{String.Join(", ", arrayNum)}] -> {countNumGreaterZero}");

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

int[] GetArray(int size)
{
    int[] arr = new int[size];
    for (int i = 0; i < arr.Length; i++)
    {
        int userNumber;
        while (true)
        {
            Console.WriteLine($"Введите {i + 1}-й элемент");
            
            bool isCorrect = int.TryParse(Console.ReadLine(), out userNumber);
            if (isCorrect)
                break;

            Console.WriteLine("Error");
        }
        arr[i] = userNumber;
    }
    return arr;
}

int GetCountOfNumbersGreaterThanZero(int[] arr)
{
    int count = 0;
    foreach (int element in arr)
    {
        if (element > 0) count++;
    }
    return count;
}
