import java.util.ArrayList;
import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class task2 {
    public static void main(String[] args) {
        List<Integer> wholeТumbers = new ArrayList<>();
        int size = 10;

        FillRandomList(wholeТumbers, size);
        System.out.println();
        RemoveEvenNumbers(wholeТumbers);
        
    }
    public static void FillRandomList(List<Integer> arr, int size) {
        for (int i = 0; i < size; i++) {
            arr.add((int)(Math.random() * (20 + 1 - (-20)) + (-20)));
        }
        for (var el : arr) {
            System.out.print(el+" ");
        }
    }
    public static void RemoveEvenNumbers(List<Integer> arr) {
        List<Integer> arrNotEvenNum = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++) {
            if(Math.abs(arr.get(i)) % 2 == 1){
                arrNotEvenNum.add(arr.get(i));
            }
        }
        for (var el : arrNotEvenNum) {
             System.out.print(el+" ");
        }  
    }
}
