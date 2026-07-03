
package SsewankamboElijjah.qn2exceptions;
    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    public static void readFile() {
        // The resource is opened within the try statement parentheses
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
    
