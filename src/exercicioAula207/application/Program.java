package exercicioAula207.application;

import exercicioAula207.entities.Product;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		String path = "C:\\Temp\\ws-eclipse\\java-course\\src\\exercicioAula207\\data\\products.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				
				String[] data = line.split(",");
				Product product = new Product(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2]));
				
				String newPath = "C:\\Temp\\ws-eclipse\\java-course\\src\\exercicioAula207\\data\\out";
				
				new File(newPath).mkdir();

				try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath + "\\summary.csv", true))) {
					String summary = product.toString();
					bw.write(summary + String.format("%n"));
				}
				
				catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
			}
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
	}

}
