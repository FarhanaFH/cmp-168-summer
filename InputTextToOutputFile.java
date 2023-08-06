import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputTextToOutputFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String outputFileName;

        System.out.println("What is the name of your output file?");
        outputFileName = scanner.nextLine();

        try (PrintWriter writer = new PrintWriter(outputFileName)) {
            while (true) {
                String input = scanner.nextLine();
                writer.println(input);
                if (input.equals("STOP!")) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }
}
