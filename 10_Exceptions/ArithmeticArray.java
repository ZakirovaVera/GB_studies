// 1. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов 
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
// оповестить пользователя.
// 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий 
// новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода 
// единственное исключение, которое пользователь может увидеть - RuntimeException

public class ArithmeticArray {
    public static void main(String[] args) {
        int[] arr1 = { 10, 8, 9 };
        int[] arr2 = { 4, 11, 18 };
        ArithmeticArray service = new ArithmeticArray();
        int[] result = service.differenceArrays(arr1, arr2);
        printArray(result);
        result = service.divisionArrays(arr1, arr2);
        printArray(result);
    }

    public void checkNotEmptyArray(int[] array) {
        if (array == null) {
            throw new NullPointerException("Массив Null");
        }
        if (array.length == 0) {
            throw new RuntimeException("Массив пустой");
        }
    }

    public void checkLengthMatchArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Массивы разной длины");
        }
    }

    public void checkZeroElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                throw new RuntimeException("Элемент массива равен 0. Деление на 0 невозможно.");
            }
        }
    }

    public int[] differenceArrays(int[] array1, int[] array2) {
        checkNotEmptyArray(array1);
        checkNotEmptyArray(array2);
        checkLengthMatchArrays(array1, array2);
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }
        return result;
    }

    public int[] divisionArrays(int[] array1, int[] array2) {
        checkNotEmptyArray(array1);
        checkNotEmptyArray(array2);
        checkLengthMatchArrays(array1, array2);
        checkZeroElement(array2);
        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] / array2[i];
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}