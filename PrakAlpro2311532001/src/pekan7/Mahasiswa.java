package pekan7;

public class Mahasiswa {
	private String NIM;
	private String Nama;
	
	//setter
	public void setNIM (String NIM) {
		this.NIM = NIM;
	}
	public void setNama (String Nama) {
		this.Nama = Nama;
	}
	
	//getter
	public String getNIM () {
		return NIM;
	}
	public String getNama () {
		return Nama;
	}
	
	public void Cetak () {
		System.out.println("NIM: " + NIM);
		System.out.println("Nama: " + Nama);
	}

}
