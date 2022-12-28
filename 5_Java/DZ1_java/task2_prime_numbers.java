// 2. Вывести все простые числа от 1 до 1000
import java.util.ArrayList;


public class task2_prime_numbers {
    public static void main(String[] args) {
        int number = 1000;
        ArrayList<Integer> list = new ArrayList<Integer>();
        PrimeNumbers(number, list);
        PrintMas(list);
    }

    public static void PrimeNumbers(int num, ArrayList<Integer> arr) {
        for(int i = 2; i <= num; i++){
            if (i == 2 || i ==3) {
                arr.add(i);
                continue;
            }
            boolean isAdd = true;
            for (int elem : arr) {
                if (i % elem == 0) {
                    isAdd = false;
                    break;
                }
            }
            if(isAdd)
                arr.add(i);
        }
    }
    public static void PrintMas(ArrayList<Integer> arr) {
        for(var el:arr)
            System.out.print(el + " ");
        System.out.println();
    }
}
