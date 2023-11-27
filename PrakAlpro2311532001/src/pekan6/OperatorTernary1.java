package pekan6;
import java.util.Scanner;
public class OperatorTernary1 {

	public static void main(String[] args) {
		double IPK;
		String stat1 = "Anda Lulus Sangat Memuaskan"; //kondisi true
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("IPK Anda = ");
		IPK = input.nextDouble();
		input.close();
		
		String hasil = (IPK > 2.75)?stat1: "Anda Lulus Memuaskan"; //?stat: = negasi kondisi yang ada
		System.out.println(hasil);

	}

}
