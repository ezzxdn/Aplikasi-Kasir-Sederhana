package pekan6;
import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Nama: ");
		String nama = in.nextLine();//nextLine untuk >1 kata, next saja untuk 1 kata
		System.out.print("Umur: ");
		int umur = in.nextInt();
		
		System.out.print("Input pilihan Anda: ");
		int n = in.nextInt();
		System.out.println();
		System.out.println("Nama: " + nama);
		System.out.println("Umur: " + umur);
		System.out.println("Pilihan: " + n);
		
		switch(n) {
		
		case 1:
			System.out.println(nama + " memilih Anies.");
			break;
		case 2:
			System.out.println(nama + " memilih Prabowo.");
			break;	
		case 3:
			System.out.println(nama + " memilih Ganjar.");	
		default :
			System.out.println(nama + " tidak memilih 1-3.");
		}
		System.out.println();
		System.out.println("Terima kasih sudah memilih.");

	}

}
