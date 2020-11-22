package Latihan;

import java.util.Scanner;

public class Looping_Deret_Fibonacci {
	public static void main (String args[]) {
		
//		Menghitung nilai Fibonacci ke-n
		int fn, fn_1, fn_2, n;
		
		Scanner inpt = new Scanner(System.in);
		
		System.out.print("Masukkan nilai Fibonacci ke-: ");
		n = inpt.nextInt();
		inpt.close();
		
		fn_1 = 1;
		fn_2 = 0;
		fn = 1;
		
//		nonAktifkan int i jika ingin menggunakan For Loop
//		int i = 1;
		
//		While
//		while (i <= n) {
//			System.out.println("Nilai Fibonacci ke-" + i + " = " + fn);
//			i++;
//			fn = fn_1 + fn_2;
//			fn_2 = fn_1;
//			fn_1 = fn;
//		}
		
//		Do While
//		do {
//			System.out.println("Nilai Fibonacci ke-" + i + " = " + fn);
//			i++;
//			fn = fn_1 + fn_2;
//			fn_2 = fn_1;
//			fn_1 = fn;
//		}while (i <= n);
		
//		For
		for (int i = 1; i <= n; i++) {
			System.out.println("Nilai Fibonacci ke-" + i + " = " + fn);
			fn = fn_1 + fn_2;
			fn_2 = fn_1;
			fn_1 = fn;
		}
		
	}
}
