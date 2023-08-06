import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAndPrintFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;

        while (true) {
            System.out.println("What is the name of your file?");
            fileName = scanner.nextLine();

            try {
                File file = new File(fileName);
                if (!file.exists()) {
                    throw new FileNotFoundException("File Not Found " + fileName);
                }

                // If the file exists, read and print its content
                try (Scanner fileScanner = new Scanner(file)) {
                    while (fileScanner.hasNextLine()) {
                        System.out.println(fileScanner.nextLine());
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Error reading the file: " + e.getMessage());
                }

                break; // Exit the loop if the file is successfully read and printed
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
