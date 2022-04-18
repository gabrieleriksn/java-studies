package aplications;

import java.util.Scanner;
import entities.Room;

public class aplication_rents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Room[] vect = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			
			System.out.printf("Rent #%s:%n", i+1);
			
			System.out.print("Name: ");
			String resident = sc.nextLine();
			
			System.out.print("Email: ");
			String residentEmail = sc.nextLine();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			
			vect[roomNumber] = new Room(resident, residentEmail, roomNumber);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
