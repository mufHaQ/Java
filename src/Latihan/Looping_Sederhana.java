package Latihan;

import java.util.*;

public class Looping_Sederhana {
	public static void main(String args[]) {
		
//		While
		int nilai_awal, nilai_akhir, total;
		Scanner inpt = new Scanner(System.in);
		
		System.out.print("Masukkan nilai awal: ");
		nilai_awal = inpt.nextInt();
		System.out.print("Masukkan nilai akhir: ");
		nilai_akhir = inpt.nextInt();
		inpt.close();
//		
//		total = 0;
		
		
//		while (nilai_awal <= nilai_akhir) {
//			total = total + nilai_awal;
//			System.out.println("Nilai awal + "+ nilai_awal + " menjadi: " + total);
//			nilai_awal++;
//		}
//		inpt.close();
		
//		Do While
//		do {
//			total = total + nilai_awal;
//			System.out.println("Nilai awal + " + nilai_awal + " menjadi: " + total);
//			nilai_awal++;
//		}while (nilai_awal <= nilai_akhir);
		
//		For 
		for (total = 0; nilai_awal <= nilai_akhir; nilai_awal++) {
			total = total + nilai_awal;
			System.out.println("Nilai awal + " + nilai_awal + " menjadi: " + total);
		}
		
	}
}
