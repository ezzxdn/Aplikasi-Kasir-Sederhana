package pekan2;

public class Transaksi {

	public static void main(String[] args) {
		double hargabarang=337000;
		double jumlahbarang=5;
		double diskon=0.25;
		double totalharga;
		
		
		totalharga= (hargabarang*jumlahbarang)*(1-diskon);
		System.out.println("Total harga bayar = "+ totalharga);


	}

}
