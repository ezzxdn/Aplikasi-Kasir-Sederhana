package pekan4;

public class prak4Rabu4 {

	public static void main(String[] args) {
		int jumlah=0;
		for(int i=10; i>=1; i--) {
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
