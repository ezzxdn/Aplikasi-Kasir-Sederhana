package pekan3;
import java.util.Scanner;
public class NilaiHuruf2 {

	public static void main(String[] args) {
		int nilai;
		Scanner input=new Scanner(System.in);
		System.out.println("Input nilai Anda");
		nilai=input.nextInt();
		input.close();
		if (nilai>=81) {
			System.out.println("A");
		}
		else if (nilai>=71) {
			System.out.println("B");
		}
		else if (nilai>=61) {
			System.out.println("C");
		}
		else if (nilai>=51) {
			System.out.println("D");
		}
		else {
			System.out.println("E");
		}

	}

}
