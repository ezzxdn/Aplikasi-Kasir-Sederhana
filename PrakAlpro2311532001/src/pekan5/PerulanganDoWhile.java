package pekan5;
import java.util.Scanner;
public class PerulanganDoWhile {

	public static void main(String[] args) {
		int counter = 0;
		String jawab;
		boolean running = true;
		
		Scanner scan = new Scanner (System.in);
		do {
			counter++;
			System.out.println("Jumlah = " + counter);
			System.out.println("Apakah lanjut (ya/tidak)?");
			jawab = scan.nextLine();
			if (jawab.equalsIgnoreCase("tidak")) {
				running = false;
			} else if (jawab.equalsIgnoreCase("ya")) {
			} else {
				running = false;
				System.out.println("Pilihannya cuma ya/tidak woy! BACA!");
		}
		}
		while (running);
		System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
		scan.close();

		}
	}

