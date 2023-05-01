public class Parser {

    public Data parceToData(String consoleData) {
        String[] arrayData = consoleData.split(" ");
        if (arrayData.length != Data.CountFields) {
            throw new NumberOfDataFieldsException("Введено неверное количество полей");
        }

        Data data = new Data();
        data.setFamily(parseToFIO(arrayData[0]));
        data.setName(parseToFIO(arrayData[1]));
        data.setOtchestvo(parseToFIO(arrayData[2]));
        data.setDateOfBirth(parseToDOB(arrayData[3]));
        data.setPhone(parseToPh(arrayData[4]));
        data.setSex(parseToSex(arrayData[5]));
        return data;
    }

    private String parseToFIO(String data) {
        if (data == null || data.isEmpty()) {
            throw new FormatDataException("Некорректные данные - ФИО");
        }

        String result = stringToCamelCase(data);
        return result;
    }

    private Date parseToDOB(String data) {
        //TODO распарсить строку в свойство
    }

    private String stringToCamelCase(String data) {
        String part1 = data[0];
        String part2 = data.substring(1, data.length() - 1);
        String result = part1.toUpperCase() + part2.toLowerCase();
        return result;
    }

}
