import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class task3 {
    public static void main(String[] args) {
        List<Integer> wholeТumbers = new ArrayList<>();
        int size = 10;

        FillRandomList(wholeТumbers, size);
        System.out.println();
        System.out.printf("Max целое число из списка = %d\n", Collections.max(wholeТumbers));
        System.out.printf("Min целое число из списка = %d\n", Collections.min(wholeТumbers));
        
    }
    public static void FillRandomList(List<Integer> arr, int size) {
        for (int i = 0; i < size; i++) {
            arr.add((int)(Math.random() * (20 + 1 - (-20)) + (-20)));
        }
        for (var el : arr) {
            System.out.print(el+" ");
        }
    }

}
