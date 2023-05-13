import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {
    // Папка для хранения.
    final String folderToSave = "Records";
    // Текущее расположение приложения.
    final String currentDir = System.getProperty("user.dir");

    public void SaveToFile(ItemRecord data) throws IOException {
        var path = GetFullPath();

        var directory = new File(path);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        var fileByFam = new File(path + "\\" + data.getFamily() + ".txt");
        var recordDelemiter = "\n";
        if (!fileByFam.exists()) {
            fileByFam.createNewFile();
            recordDelemiter = "";
        }

        FileWriter writer = new FileWriter(fileByFam, true);
        var text = recordDelemiter +
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

    private String GetFullPath() {
        return currentDir + "\\" + folderToSave;
    }
}
