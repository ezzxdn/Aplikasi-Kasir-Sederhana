package pekan7;

public class AksesMahasiswa {

	public static void main(String[] args) {
		Mahasiswa a = new Mahasiswa ();
		
		a.setNIM("231153200");
		a.setNama("Ezza");
		
		System.out.println(a.getNIM());
		System.out.println(a.getNama());
		
		a.Cetak();
	}

}
