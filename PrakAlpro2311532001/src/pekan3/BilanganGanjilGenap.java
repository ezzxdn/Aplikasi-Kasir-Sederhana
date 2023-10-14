package pekan3;
import java.util.Scanner;
public class BilanganGanjilGenap {

	public static void main(String[] args) {
		long NIM;
		Scanner input=new Scanner(System.in);
		System.out.println("Input NIM Anda: ");
		NIM = input.nextLong();
		input.close();
		if (NIM%2==0) {
			System.out.println(NIM + " merupakan bilangan genap");
		}
		else {
			System.out.println(NIM + " merupakan bilangan ganjil");
		}

	}

}