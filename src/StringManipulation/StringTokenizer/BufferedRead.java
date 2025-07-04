package StringManipulation.StringTokenizer;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BufferedRead {

    public ArrayList<String> FileProcessing(String filePath) {
        ArrayList<String> fileData = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileData.add(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan.");
        }
        catch (IOException e) {
            System.out.println("Terjadi kesalahan.");
        }

        return fileData;
    }
}
