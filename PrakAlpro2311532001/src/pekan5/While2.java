package pekan5;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		int counter = 0; 
		String jawab;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Apakah ingin menjalankan program (ya/tidak)?");
		jawab = scan.next();
		
		while (jawab.equalsIgnoreCase("ya")) {
			counter++;
			System.out.println("Jumlah = " + counter);
			System.out.println("Apakah lanjut (ya/tidak)?");
			jawab = scan.next();
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
		scan.close();
	}

}
