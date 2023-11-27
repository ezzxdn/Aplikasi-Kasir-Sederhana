package pekan6;
import java.util.Scanner;
public class PostTest {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		input.close();
		int count = 0;
		
		System.out.println("Input: ");
		System.out.println("Output: ");
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 1; j++) {
				System.out.println(count);
				count = (count + 1) % 10;
			}
			System.out.println();
		}

	}

}
