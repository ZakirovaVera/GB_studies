import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1
// человек может иметь несколько телефонов.

public class task1 {
    static Map<String, List<String>> list = new HashMap<>();
    public static void main(String[] args) {
        String encoding = System.getProperty("console.encoding", "cp866");
        Scanner iScanner = new Scanner(System.in, encoding);

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите ФИО: ");
            String fio = iScanner.nextLine();
            System.out.print("Введите номер телефона: ");
            String numPhone = iScanner.nextLine();
            AddRecord(fio, numPhone);
        }   
        for (var el : list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
        iScanner.close();
    }
    public static void AddRecord(String fio, String tel) {
        if(list.containsKey(fio)){
            list.get(fio).add(tel);
        }
        else{
            List<String> phones = new ArrayList<>();
            phones.add(tel);
            list.put(fio, phones);
        }
    }
}
