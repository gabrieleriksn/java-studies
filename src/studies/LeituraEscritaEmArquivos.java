package studies;

public class LeituraEscritaEmArquivos {

	public static void main(String[] args) {
		
		// Trabalhando com File e Scanner.
		
		/*
		String path = "C:\\Temp\\in.txt";
		File file = new File(path);
		Scanner sc = null;
		List<String> frases = new ArrayList<>();
		
		try {
			sc = new Scanner(file);
			
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				frases.add(line);
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());;
		}
		
		finally {
			if (sc != null) {
				sc.close();
			}
		}
		
		for (String frase : frases) {
			System.out.println(frase);
		}
		*/
		
		
		
		// Trabalhando com FileReader e BufferedReader
		
		/*
		String path = "C:\\Temp\\in.txt";
		
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
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				fr.close();
				br.close();
			}
			catch (Exception io) {
				System.out.println("Error: " + io.getMessage());
			}
		}
		
		// Uma forma mais elegante e concisa...
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				System.out.println(line);
			}
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		*/
		
		
		
		// Trabalhando com FileWriter e BufferedWriter
		
		/*
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Temp\\novo-arquivo.txt";
		System.out.print("Quantas linhas você quer escrever? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (int i=0; i<n; i++) {
				String line = sc.nextLine();
				bw.write(line + String.format("%n"));
			}
		}
		
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		finally {
			sc.close();
		}
		*/
	}

}
