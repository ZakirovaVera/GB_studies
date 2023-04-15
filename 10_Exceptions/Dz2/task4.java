import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class task4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку:");
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                scanner.close();
                throw new Exception("Пустые строки вводить нельзя.");
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
