import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        boolean fileExists;
        boolean isDirectory;
        while (true) {
            String path = new Scanner(System.in) .nextLine();
            File file = new File(path);
            fileExists = file.exists();
            isDirectory = file.isDirectory();
            if (isDirectory) {
                System.out.println("Указанный путь является путём к папке ");
            }else if (!fileExists) {
                System.out.println("Файл не существует");
            } else {
                ++count;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + count);
            }
        }
    }
}
