package pekan5;

import java.util.Scanner;

public class TugasPekan5 {

	public static void main(String[] args) {
		int a;
		int sum=0;
		boolean kondisi = true;
		
		Scanner input = new Scanner (System.in);
		
		while (kondisi) {
			System.out.println("Enter a number: ");
			a = input.nextInt();
		
			if (a > 0) {
				sum += a;
			} else {
				kondisi = false;
				System.out.println("Sum = " + sum);
			}
			
		}
	}

}
