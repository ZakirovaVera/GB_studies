/**
 * sem_task5
 */
public class sem_task5 {
    public static void main(String[] args) {
        String text = "Добро пожаловать на курс по Java";
        String[] words = text.split("\\s");
        PrintMas(words);
        PermutationWords(words);
        PrintMas(words);

    }
    public static void PrintMas(String[] arr) {
        for(var el:arr)
            System.out.print(el + " ");
        System.out.println();
    }
    public static String[] PermutationWords(String[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
}
