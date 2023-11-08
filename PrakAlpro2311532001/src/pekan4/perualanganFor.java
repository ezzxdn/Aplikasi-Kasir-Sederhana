package pekan4;
import java.util.Scanner;
public class perualanganFor {

	public static void main(String[] args) {
		int jumlah=0;
		int batas;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan batas= ");
		batas = input.nextInt();
		input.close();
		for(int i=batas; i>=1; i--) {
			System.out.print(i + " ");
			jumlah = jumlah+i;
			if (i>1) {
				System.out.print("+ ");
			}
		}
		System.out.println();
		System.out.println("Jumlah: "+jumlah);
	}

}

