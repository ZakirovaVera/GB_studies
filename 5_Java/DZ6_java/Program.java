import java.util.ArrayList;
import java.util.List;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и 
// выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Вывести в виде.
// |Имя| Критерий|
// |----|-----------|
// | Asus | 2ГБ |
// | HP | 4ГБ |
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. 
// (По возрастанию имени ноутбука в алфавитном порядке, по цене по убыванию)
public class Program {
    public static void main(String[] args) {

        List<Notebook> notebookTest = CreateNotebookList();
        // Изначальный список.
        System.out.println("Ноутбуки до фильтрации:");
        PrintList(notebookTest);

        Menu menu = new Menu();
        Integer numMenu = menu.GetMenuCriteria();

        FilterNBook filter = new FilterNBook();
        String resultFilter = filter.Filter(notebookTest, numMenu);

        System.out.println(resultFilter);
        // Отсортированный список по Имя+Критерий.
        // PrintList(notebookTest);
    }

    public static List<Notebook> CreateNotebookList() {
        List<Notebook> arrNotebooks = new ArrayList<Notebook>();
        arrNotebooks.add(new Notebook("Aser",15, 512, "Windows7", "orange", 11.6, 2, 67500.00));
        arrNotebooks.add(new Notebook("MSI", 16, 512, "Windows10", "white", 15.6, 8, 75000.00));
        arrNotebooks.add(new Notebook("HP", 32, 1024, "Windows11", "green", 15.6, 8, 82000.00));
        arrNotebooks.add(new Notebook("Asus", 12, 1024, "Windows11", "grey", 17.0, 8, 44600.00));
        arrNotebooks.add(new Notebook("Aser", 12, 512, "Windows10", "red", 11.6, 2, 34500.00));
        arrNotebooks.add(new Notebook("Aser", 80, 512, "Windows7", "black", 11.6, 2, 51000.00));
        arrNotebooks.add(new Notebook("MSI", 8, 512, "---", "black", 15.6, 4, 21000.00));
        arrNotebooks.add(new Notebook("Aser", 10, 512, "---", "black", 11.6, 2, 59000.00));
        return arrNotebooks;
    }

    public static void PrintList(List<Notebook> arr) {
        for (Notebook el : arr) {
            el.PrintInfo();
            System.out.println();
        }
    }
}
