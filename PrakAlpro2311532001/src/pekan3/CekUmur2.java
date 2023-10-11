package pekan3;
import java.util.Scanner;
public class CekUmur2 {

	public static void main(String[] args) {
		int umur;
		Scanner u = new Scanner(System.in);
		System.out.println("Input umur Anda: ");
		umur= u.nextInt();
		u.close();
		if (umur >= 17) {
			System.out.println("Anda sudah dewasa");
		
		} else {
			System.out.println("Anda belum dewasa");
		}

	}

}
