package myjava1;

import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        // Fungsi Recursive

        Scanner inpt = new Scanner(System.in);

        int nilai;
        System.out.print("Masukkan nilai: ");
        nilai = inpt.nextInt();
        System.out.println("Anda memasukkan nilai: " + nilai + "\n");


        printNilai(nilai);
        System.out.println();

        int jmlh = jumlah(nilai);
        System.out.println("\nJumlah: " + jmlh);
        
        inpt.close();
    }

    // Fungsi Rekursif sederhana

    private static int jumlah(int nilai){
        System.out.println("nilai-2: " + nilai);

        if (nilai == 0){
            return nilai;
        }
        return nilai + jumlah(nilai - 1);
    }

    private static void printNilai(int nilai){
        System.out.println("Nilai: " + nilai);

        if (nilai == 0){
            return;
        }

        nilai--;
        printNilai(nilai);
    }
}
