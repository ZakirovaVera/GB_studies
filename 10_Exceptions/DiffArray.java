// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов 
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то 
// оповестить пользователя.

public class DiffArray {
    public static void main(String[] args) {
        int [] arr1= {10,8,9};
        int [] arr2= {4,11,18};
        DiffArray service= new DiffArray();
        int [] result = service.differenceArrays(arr1, arr2);
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

public static void printArray(int [] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
}
}