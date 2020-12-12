package Testing_Code;


import java.util.Scanner;

public class Testing1 {
	public static void main(String[] args) {
//		for (int i = 0; i <= 1000000; i++) {
//			System.out.println(i);
//			if (i == 1000) {
//				break;
//			}
//		}
		
//		int i = 0;
//		while (true) {
//			i++;
//			System.out.println("Aksi ke-" + i);
//			if (i == 20) {
//				break; // Memaksa aksi untuk keluar dari loop
//			}else if(i == 10) { 
//				continue; // Memaksa aksi untuk memulai dari awal
//			}
//		}
		
//		int i = 0;
//		while (true) {
//			i++;
//			System.out.println(i);
//			if (i == 100) {
//				return;
//			}
//		}

		Scanner inpt = new Scanner(System.in);
		int i, j;
		System.out.println("Mesin Perkalian");
		System.out.print("Masukkan angka ke-1: ");
		i = inpt.nextInt();
		System.out.print("Masukkan angka ke-2: ");
		j = inpt.nextInt();
		int hasil = a(i, j);
		System.out.println("\nHasilnya adalah: " + hasil);



	}

	static int a (int x, int y){
		int hasil;

		hasil = x * y;
		return hasil;
	}
}
