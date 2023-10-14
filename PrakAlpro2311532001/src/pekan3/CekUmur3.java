package pekan3;
import java.util.Scanner;
public class CekUmur3 {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner input = new Scanner(System.in);
		System.out.println("Input umur Anda: ");
		umur=input.nextInt();
		System.out.println("Apakah Anda sudah punya SIM C?");
		sim=input.next().charAt(0);
		input.close();
		if ((umur >= 17)&&(sim=='y')) {
			System.out.println("Anda sudah dewasa dan boleh bawa motor");
		} 
		if ((umur >= 17)&&(sim!='y')) {
			System.out.println("Anda sudah dewasa dan belum boleh bawa motor");
		}	
		if ((umur < 17)&&(sim!='y')) {
			System.out.println("Anda belum dewasa dan belum boleh bawa motor");
	}
		
	}

}
