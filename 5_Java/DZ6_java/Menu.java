import java.util.Scanner;

public class Menu {
    
    public void PrintMenu() {
        System.out.print("1 - ОЗУ\n"+
        "2 - Объем ЖД\n"+
        "3 - Операционная система\n"+
        "4 - Цвет\n"+
        "5 - Диагональ\n"+
        "6 - Количество ядер процессора\n"+
        "7 - Сортировка Ноутбуков по убыванию цены\n"+
        "8 - Сортировка Ноутбуков по алфавиту");
        System.out.println();
    }

    public Integer GetMenuCriteria() {
        PrintMenu();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите цифру, соответствующую необходимому критерию: ");
        Integer numMenu = Integer.parseInt(iScanner.nextLine());
        
        iScanner.close();
        return numMenu;
    }
}
