package pekan7;
import java.util.Scanner;
public class AksesMahasiswa2 {

	public static void main(String[] args) {
			String NIM;
			String Nama;
			Scanner input = new Scanner(System.in);
			
			System.out.print("NIM: ");
			NIM = input.next();
			System.out.print("Nama: ");
			Nama = input.next();
					
			Mahasiswa a = new Mahasiswa ();
			a.setNIM(NIM);
			a.setNama(Nama);
			
			System.out.println(a.getNIM());
			System.out.println(a.getNama());
			
			a.Cetak();
			
			input.close();

	}

}
