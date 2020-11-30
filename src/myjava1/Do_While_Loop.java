package myjava1;

public class Do_While_Loop {
	public static void main(String args[]) {
		
		System.out.println("Awal Program");
		
		boolean kondisi = true;
		int i = 0;
		do {
			i++;
			System.out.println("Angak ke: " + i);
			
			if (i == 100000) {
				kondisi = false;
			}
		}while(kondisi);
	}
}
