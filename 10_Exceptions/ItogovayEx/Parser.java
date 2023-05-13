import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class Parser {

    public ItemRecord parceToData(String consoleData) throws NumberOfDataFieldsException, FormatDataException {
        String[] arrayData = consoleData.split(" ");
        if (arrayData.length != ItemRecord.CountFields) {
            throw new NumberOfDataFieldsException("Введено неверное количество полей");
        }

        ItemRecord data = new ItemRecord();
        data.setFamily(parseToFIO(arrayData[0]));
        data.setName(parseToFIO(arrayData[1]));
        data.setOtchestvo(parseToFIO(arrayData[2]));
        data.setDateOfBirth(parseToDOB(arrayData[3]));
        data.setPhone(parseToPhone(arrayData[4]));
        data.setSex(parseToSex(arrayData[5]));

        return data;
    }

    private String parseToFIO(String data) throws FormatDataException {
        if (data == null || data.isEmpty()) {
            throw new FormatDataException("Некорректные данные - ФИО.");
        }

        String result = stringToCamelCase(data);
        return result;
    }

    // Распарсить в дату рождения.
    private String parseToDOB(String data) throws FormatDataException {
        try {
            String[] parts = data.split(".");

            if (parts.length < 3) {
                throw new FormatDataException("Необходимо 3 части через точку.");
            }

            new GregorianCalendar(
                    Integer.parseInt(parts[2]),
                    Integer.parseInt(parts[1]),
                    Integer.parseInt(parts[0]));

            return data;
        } catch (FormatDataException e) {
            throw e;
        } catch (Exception e) {
            throw new FormatDataException("Некорректные данные - Дата рождения.");
        }
    }

    private Integer parseToPhone(String data) {
        return Integer.parseInt(data);
    }

    private String parseToSex(String data) throws FormatDataException {
        List<String> allowSymbol = new ArrayList<String>(Arrays.asList(new String[] { "f", "m" }));
        if (!allowSymbol.contains(data)) {
            throw new FormatDataException("Некорректные данные - пол.");
        }

        return data;
    }

    private String stringToCamelCase(String data) {
        String part1 = data.substring(0, 1);
        String part2 = data.substring(1, data.length() - 1);
        String result = part1.toUpperCase() + part2.toLowerCase();
        return result;
    }
}
