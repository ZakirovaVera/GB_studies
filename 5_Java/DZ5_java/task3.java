// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class task3 {
    public static void main(String[] args) {
        int arr[] = {10, 3, 76, 34, 23, 88};
        System.out.println("Массив для сортировки");
        PrintArray(arr);

        HeapSort(arr);

        System.out.println("Сортированный массив");
        PrintArray(arr);
    }

    // печать массива
    public static void PrintArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Основная функция для сортировки массива заданного размера
    public static void HeapSort(int[] array) {
        int n = array.length;

        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            Heapify(array, n, i);

        // Один за другим извлекаем элементы из кучи
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            Heapify(array, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i,
    // что является индексом в arr[]. n - размер кучи
    public static void Heapify(int arr[], int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень / родительский узел
        int left = 2 * i + 1; // левый дочерний = 2*i + 1
        int right = 2 * i + 2; // правый правый = 2*i + 2

        // Проверяем существует ли левый дочерний элемент больший, чем корень
        if (left < n && arr[left] > arr[largest])
            largest = left;
        // Проверяем существует ли правый дочерний элемент больший, чем корень
        if (right < n && arr[right] > arr[largest])
            largest = right;
        // Если самый большой элемент не корень, заменяем корень поменять местами с потомком, 
        // имеющим большее значение
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            // вызов heapify для дочернего элемента
            Heapify(arr, n, largest);
        }
    }
}
