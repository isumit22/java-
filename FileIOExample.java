import java.io.*;

public class FileIOExample {
    public static void main(String[] args) {
        try (
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fileWriter = new FileWriter("output.txt");
        ) {
            System.out.println("Enter some text to write to file (type 'exit' to finish):");
            String line;

            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(line + "\n");
            }

            System.out.println("Data written to 'output.txt' successfully!");

            System.out.println("\nReading data from 'output.txt':");
            try (BufferedReader fileReader = new BufferedReader(new FileReader("output.txt"))) {
                String fileLine;
                while ((fileLine = fileReader.readLine()) != null) {
                    System.out.println(fileLine);
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

