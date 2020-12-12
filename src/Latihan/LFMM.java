package Latihan;

import java.util.Scanner;

public class LFMM {
    public static void main(String[] args) {
//        Latihan Fungsi, Menghitung, dan Menggambar

        Scanner inpt = new Scanner(System.in);

        int panjang, lebar;
        String ulang;
        boolean ulangi = true;

        while (ulangi) {
            System.out.print("\nMasukkan Panjang: ");
            panjang = inpt.nextInt();
            System.out.print("Masukkan Lebar: ");
            lebar = inpt.nextInt();
//            System.out.println("\n");
            System.out.print("\n");
            mGambar(panjang, lebar);

            System.out.print("\n");

            kelluas(panjang, lebar);


            System.out.print("\n Apakah anda ingin mengulangi?\nJika ya masukkan (y), jika tidak masukkan (n atau t): ");
            ulang = inpt.next();

            switch (ulang){
                case "y":
                    continue;
                case "t", "n":
                    ulangi = false;
                    System.out.println("\nTerima Kasih");
                    break;
                default:
                    System.out.println("Maaf, tidak ada dalam pilihan");
                    ulangi = false;
                    break;
            }
        }
    }

    private static void kelluas(int panjang, int lebar){
        System.out.println("Luas: " + luas(panjang, lebar));
        System.out.println("Keliling: " + keliling(panjang, lebar));
    }

    private static int keliling(int panjang, int lebar){
        int hasil = 2 * (panjang + lebar);
        return hasil;
    }

    private static int luas (int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }

    static void mGambar(int panjang, int lebar) {
        if (panjang > 100 || lebar > 100) {
            System.out.printf("Maaf nilai tidak boleh melebihi 100\n");
        } else {
            for (int i = 0; i < lebar; i++) {
                for (int j = 0; j < panjang; j++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }
    }
}
