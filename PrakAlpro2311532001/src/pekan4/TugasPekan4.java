package pekan4;

public class TugasPekan4 {

	public static void main(String[] args) {
		System.out.println("#================#");
		
		for (int baris = 1; baris <= 4; baris++) {
			System.out.print("|");
		
			for (int spasi = 1; spasi <= (baris * -2 + 8); spasi++) {
				System.out.print(" ");
			}
			System.out.print("<>");
			for (int titik = 1; titik<=(baris * 4- 4); titik++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int spasi = 1; spasi <= (baris * -2 + 8); spasi++) {
				System.out.print(" ");
			}
			System.out.println("|");

		}
		for ( int baris = 1; baris <= 4 ; baris ++) {
			System.out.print("|");
			for ( int spasi = 1 ; spasi <= baris *2-2;spasi ++) {
				System.out.print(" "); 
			}
			System.out.print("<>");
			for ( int titik =1;titik <= baris *-4+16;titik++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for ( int spasi =1 ;spasi <= baris *2-2;spasi ++ ) {
				System.out.print(" ");
			}
			System.out.println("|");
}
		System.out.println("#================#");

	}

}
