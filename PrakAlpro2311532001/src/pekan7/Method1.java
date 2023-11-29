package pekan7;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		int a;
		char b;
		String jawab;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Apakah ingin menjalankan program (ya/tidak)?");
		jawab = scan.next();
		
		while (jawab.equalsIgnoreCase("ya")) {
			System.out.println("Input umur Anda: ");
			a=scan.nextInt();
			
			System.out.println("Apakah Anda sudah punya SIM C?");
			b=scan.next().charAt(0);
			Razia (a, b);
			
			System.out.println("Apakah lanjut (ya/tidak)?");
			jawab = scan.next();
		}
			System.out.println("Terima kasih");
			scan.close();

	}
	static void Razia (int a, char b) {
			if ((a >= 17)&&(b=='y')) {
			System.out.println("Anda sudah dewasa dan boleh bawa motor");
			}
			if ((a >= 17)&&(b!='y')) {
			System.out.println("Anda sudah dewasa dan belum boleh bawa motor");
			}	
			if ((a < 17)&&(b!='y')) {
			System.out.println("Anda belum dewasa dan belum boleh bawa motor");
			}
	}

}
