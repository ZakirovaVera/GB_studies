public class Notebook {
    String nameNotebook; // Наименование
    Integer RAM; // ОЗУ
    Integer hardDiskCapacity; // Объем жесткого диска
    String operatingSystem; // Операционная система
    String color; // Цвет
    Double diagonal; // Диагональ
    Integer numberProcessorCores; // Количество ядер процессора
    Double priceNB; // цена

    void  PrintInfo(){
        System.out.printf(GetInfo());
    }
    String GetInfo(){
        return String.format("%s: Цена %.2f рублей, ОЗУ %dГб, RAM %dГб, %s, %s, Диагональ экрана %.1f, Количество ядер процессора %d", nameNotebook, priceNB, RAM, hardDiskCapacity, operatingSystem, color, diagonal, numberProcessorCores);
    }    

    Notebook(String name, int ram, Integer hardDisk, String operSys, String col, Double diag, Integer numProcCor, Double price){
        nameNotebook = name;
        RAM = ram;
        hardDiskCapacity = hardDisk;
        operatingSystem = operSys;
        color = col;
        diagonal = diag;
        numberProcessorCores = numProcCor;
        priceNB = price;
    }
}
