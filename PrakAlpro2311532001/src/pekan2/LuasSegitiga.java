package pekan2;
import java.util.Scanner;
public class LuasSegitiga {

	public static void main(String[] args) {
		int alas,tinggi;
		double luas;
		Scanner input = new Scanner(System.in);
		System.out.println("Inputkan Alas= ");
		alas=input.nextInt();
		System.out.println("Inputkan Tinggi= ");
		tinggi=input.nextInt();
		input.close();
		luas=0.5*alas*tinggi;
		System.out.println("Luas segitiga adalah: " +luas);


	}

}
