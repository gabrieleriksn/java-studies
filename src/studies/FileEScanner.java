package studies;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileEScanner {
    public static void main(String[] args) {

        // Lendo arquivos texto com classes File e Scanner

        String path = "C:\\Temp\\in.txt";
        File file = new File(path);
        Scanner sc = null;
        // OBS: tem que usar o "\\", pois uma única barra indica a leitura de caracteres
        // especiais, o que não é o caso.

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

}