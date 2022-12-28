import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на
// платформе)
// Написать программу, которая найдет и выведет повторяющиеся имена с
// количеством повторений. Отсортировать по убыванию популярности.

public class task2 {
    static Map<String, Integer> list = new HashMap<>();
    static List<String> dataEmployees = new ArrayList<>();

    public static void main(String[] args) {
        dataEmployees.add("Алексеев");
        dataEmployees.add("Иванов");
        dataEmployees.add("Сидоров");
        dataEmployees.add("Сидоров");
        dataEmployees.add("Петров");
        dataEmployees.add("Иванов");
        dataEmployees.add("Сидоров");

        CalcCountRepeats();
        Sortlist();
    }
    public static void CalcCountRepeats() {
        for (String el : dataEmployees) {
            if(list.containsKey(el)){
                int count = list.get(el);
                count++;
                list.put(el, count);
            }
            else{
                list.put(el, 1);
            }
        }
    }

    public static void Sortlist() {
        List<Map.Entry<String, Integer>> SortList = list.entrySet().stream()
        .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
        .collect(Collectors.toList());
        for (var el : SortList) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
    }
}
