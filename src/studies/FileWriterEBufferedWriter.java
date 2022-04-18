package studies;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEBufferedWriter {
    public static void main(String[] args) {
        // o File Writer é uma stream básica de leitura em arquivos
        // Intanciamos o BufferedWriter a partir dele, assim como nos readers.

        // Modos de instanciar o FileWriter:
        
        // Cria / Recria o arquivo sobrescrevendo o que existia
        // FileWriter fr = new FileWriter(path)

        // Adiciona ao final do arquivo, ou seja, implementa em um arquivo já
        // existente, sem sobrescrevê-lo.
        // FileWriter fr = new FileWriter(path, true);

        String[] lines = new String[] {"Esse processo de escrita em arquivos", "É bem interessante", "né?"};
        
        String path = "C:\\Temp\\teste.txt";
       
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line + String.format("\n"));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
