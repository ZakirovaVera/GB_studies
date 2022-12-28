import java.util.Comparator;
import java.util.List;

public class FilterNBook {

    public String Filter(List<Notebook> arr, Integer numCriteria) {
        // Отсортировать ноутбуки с учетом критерия.
        SortByCriteria(arr, numCriteria);
        String result = "";
        // Сформировать результирующий список данных.
        if (numCriteria > 0 && numCriteria < 7) {
            result += "Имя\t|Критерий\n";
            for (Notebook el : arr) {
                result += el.nameNotebook + "\t|" + GetCriteria(el, numCriteria) + "\n";
            }
        }
        else{
            for (Notebook el : arr) {
                result += el.GetInfo() + "\n";
            }
        }
        return result;
    }

    // Отсортировать массив ноутбуков по критерию.
    public void SortByCriteria(List<Notebook> arr, Integer numCriteria) {

        arr.sort(new Comparator<Notebook>() {
            @Override
            public int compare(Notebook a, Notebook b) {
                String aNameAndCriteria = "";
                String bNameAndCriteria = "";

                switch (numCriteria) {
                    case 1:
                        aNameAndCriteria += a.RAM > b.RAM ? 0 : 1;
                        bNameAndCriteria += a.RAM < b.RAM ? 0 : 1;
                        break;
                    case 2:
                        aNameAndCriteria += a.hardDiskCapacity > b.hardDiskCapacity ? 0 : 1;
                        bNameAndCriteria += a.hardDiskCapacity < b.hardDiskCapacity ? 0 : 1;
                        break;
                    case 3:
                        aNameAndCriteria += a.operatingSystem;
                        bNameAndCriteria += b.operatingSystem;
                        break;
                    case 4:
                        aNameAndCriteria += a.color;
                        bNameAndCriteria += b.color;
                        break;
                    case 5:
                        aNameAndCriteria += a.diagonal > b.diagonal ? 0 : 1;
                        bNameAndCriteria += a.diagonal < b.diagonal ? 0 : 1;
                        break;
                    case 6:
                        aNameAndCriteria += a.numberProcessorCores > b.numberProcessorCores ? 0 : 1;
                        bNameAndCriteria += a.numberProcessorCores < b.numberProcessorCores ? 0 : 1;
                        break;
                    case 7:
                        aNameAndCriteria += a.priceNB > b.priceNB ? 0 : 1;
                        bNameAndCriteria += a.priceNB < b.priceNB ? 0 : 1;
                        break;
                    case 8:
                        aNameAndCriteria = a.nameNotebook;
                        bNameAndCriteria = b.nameNotebook;
                        break;
                }

                Integer resultCompare = aNameAndCriteria.compareTo(bNameAndCriteria);
                return resultCompare;
            }
        });
    }

    public String GetCriteria(Notebook arr, Integer numCriteria) {
        switch (numCriteria) {
            case 1:
                return arr.RAM.toString();
            case 2:
                return arr.hardDiskCapacity.toString();
            case 3:
                return arr.operatingSystem;
            case 4:
                return arr.color;
            case 5:
                return arr.diagonal.toString();
            case 6:
                return arr.numberProcessorCores.toString();
            default:
                return "Критерий отсуствует в фильтре";
        }
    }
}
