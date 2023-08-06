import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadAndEditFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;

        while (true) {
            System.out.println("What is the name of your file?");
            fileName = scanner.nextLine();
            try {
                File file = new File(fileName);
                if (!file.exists()) {
                    System.out.println("File Not Found " + fileName);
                } else {
                    try (Scanner fileScanner = new Scanner(file)) {
                        StringBuilder modifiedContent = new StringBuilder();
                        while (fileScanner.hasNextLine()) {
                            String line = fileScanner.nextLine();
                            line = capitalizeFirstLetter(line);
                            line = capitalizeAfterPeriod(line);
                            line = removeDuplicateSpaces(line);
                            modifiedContent.append(line).append("\n");
                        }

                        writeToFile("HomeworkOutput6-2.txt", modifiedContent.toString());
                        System.out.print("");
                    } catch (FileNotFoundException e) {
                        System.out.println("Error reading the file: " + e.getMessage());
                    }

                    break; 
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

    private static String capitalizeFirstLetter(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return Character.toUpperCase(text.charAt(0)) + text.substring(1);
    }

    private static String capitalizeAfterPeriod(String text) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        for (char ch : text.toCharArray()) {
            if (ch == '.') {
                capitalizeNext = true;
            } else if (Character.isLetter(ch) && capitalizeNext) {
                ch = Character.toUpperCase(ch);
                capitalizeNext = false;
            }
            result.append(ch);
        }
        return result.toString();
    }

    private static String removeDuplicateSpaces(String text) {
        return text.trim().replaceAll("\\s+", " ");
    }

    private static void writeToFile(String fileName, String content) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.write(content);
        }
    }
}
