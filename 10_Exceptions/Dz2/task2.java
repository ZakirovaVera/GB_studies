import java.util.random.RandomGenerator;

// Если необходимо, исправьте данный код

public class task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = GenerateArray(8);
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив не соответствует размеру: " + e);
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e);
        }
    }

    private static int[] GenerateArray(int countItems) {
        int[] arr = new int[countItems];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RandomGenerator.getDefault().nextInt(100);
        }
        return arr;
    }
}
