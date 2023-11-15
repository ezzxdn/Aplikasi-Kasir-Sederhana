package pekan5;

import java.util.Scanner;

public class CekUmurDoWhile {

	public static void main(String[] args) {
		int umur;
		char sim;
		String jawab;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Apakah ingin menjalankan program (ya/tidak)?");
		jawab = scan.next();
		
		while (jawab.equalsIgnoreCase("ya")) {
			System.out.println("Input umur Anda: ");
			umur=scan.nextInt();
			
			System.out.println("Apakah Anda sudah punya SIM C?");
			sim=scan.next().charAt(0);

			if ((umur >= 17)&&(sim=='y')) {
			System.out.println("Anda sudah dewasa dan boleh bawa motor");
			}
			if ((umur >= 17)&&(sim!='y')) {
			System.out.println("Anda sudah dewasa dan belum boleh bawa motor");
			}	
			if ((umur < 17)&&(sim!='y')) {
			System.out.println("Anda belum dewasa dan belum boleh bawa motor");
			}
			System.out.println("Apakah lanjut (ya/tidak)?");
			jawab = scan.next();
		}
			System.out.println("Terima kasih");
			scan.close();
	}

}
