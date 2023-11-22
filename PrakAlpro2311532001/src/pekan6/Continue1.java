package pekan6;

public class Continue1 {

	public static void main(String[] args) {
		int i = 1;
		
		while (i <= 10) {
			if ((i == 5)||(i == 8)) {
				i++;
				continue; //melewatkan angka 5 dan 8
			}
			System.out.println(i);
			i++;
		}

	}

}
