package studies;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEBufferedReader {
    public static void main(String[] args) {
        
        String path = "C:\\Temp\\in.txt";

        // Esse jeito aqui funciona, mas ém uito poluído...

        /*
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        */

        // A forma mais elegante de fazer a leitura de arquivos seria a seguinte:

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
