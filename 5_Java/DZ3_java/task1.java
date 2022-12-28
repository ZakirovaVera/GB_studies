// Реализовать алгоритм сортировки слиянием
public class task1 {
    public static void main(String[] args) {
        int [] array = new int[]{22, 4, 1, 9, 11, 7, 3, 8};
        int arrayLength = array.length;
        PrintArray(array);
        System.out.println();
        MergeSort(array, arrayLength);
        PrintArray(array);
        System.out.println();

    }
    public static void PrintArray(int [] arr) {
        for (var el : arr) {
            System.out.print(el+" ");
        }
    }
    public static void MergeSort(int [] arr, int size) {
        if (size < 2) return;
        int leftSize = size / 2;
        int rightSize = size - leftSize;
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];
        
        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = leftSize; i < size; i++) {
            rightArr[i - leftSize] = arr[i];
        }
        MergeSort(leftArr, leftSize);
        MergeSort(rightArr, rightSize);
    
        MergeArray(arr, leftArr, rightArr, leftSize, rightSize);
    }
    public static void MergeArray(int[] arr, int[] leftArr, int[] rightArr, int leftSize, int rightSize) {
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftArr[i] <= rightArr[j])
                arr[k++] = leftArr[i++];
            else
                arr[k++] = rightArr[j++];
        }
        while (i < leftSize) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightSize) {
            arr[k++] = rightArr[j++];
        }
    }
}
