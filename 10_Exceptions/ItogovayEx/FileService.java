import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {
    // Папка для хранения.
    final String folderToSave = "Records";
    // Текущее расположение приложения.
    final String currentDir = System.getProperty("user.dir");

    public void SaveToFile(ItemRecord data) throws IOException {
        // Путь папки
        var path = GetFullPath();
        // Создать папку
        CreateDirectory(path);
        // Создать файл по фамилии
        FileCreationResult fileByFam = CreateFile(path, data.getFamily());

        FileWriter writer = new FileWriter(fileByFam.getFile(), true);
        var text = fileByFam.getRecordDelemiter() +
                "<" + data.getFamily() + ">" +
                "<" + data.getName() + ">" +
                "<" + data.getOtchestvo() + ">" +
                "<" + data.getDateOfBirth() + ">" +
                "<" + data.getPhone() + ">" +
                "<" + data.getSex() + ">";
        writer.write(text);
        writer.flush();
        writer.close();
    }

    private FileCreationResult CreateFile(String path, String family) throws IOException {
        FileCreationResult result = new FileCreationResult();

        var fileByFam = new File(path + "\\" + family + ".txt");
        result.setFile(fileByFam);

        var recordDelemiter = "\n";
        if (!fileByFam.exists()) {
            fileByFam.createNewFile();
            recordDelemiter = "";
        }
        result.setRecordDelemiter(recordDelemiter);

        return result;
    }

    private void CreateDirectory(String path) {
        var directory = new File(path);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    private String GetFullPath() {
        return currentDir + "\\" + folderToSave;
    }
}

class FileCreationResult {
    private File file;
    private String recordDelemiter;

    public void setFile(File value) {
        file = value;
    }

    public File getFile() {
        return file;
    }

    public void setRecordDelemiter(String value) {
        recordDelemiter = value;
    }

    public String getRecordDelemiter() {
        return recordDelemiter;
    }
}
