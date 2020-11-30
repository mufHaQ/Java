package myjava1;

import java.util.Scanner;


public class User_Input {
    public static void main(String args[]) {
        
        Scanner userInput = new Scanner(System.in);
//        int Panjang, Lebar, hasil;
        
        // User Input 
        
        // Membuat Perhitungan luas persegi panjang 
//        System.out.print("\nMasukkan panjang : ");
//        Panjang = userInput.nextInt();
//        System.out.print("Masukkan panjang : ");
//        Lebar = userInput.nextInt();
//        
//        hasil = Panjang * Lebar;
//        System.out.println("Hasil : " + hasil + "\n");


        // Pengubahan nilai Integer kedalam Binary (32bit)
        int a;
        String  a_bits;
        
        System.out.print("Masukkan Nilai yang akan diubah ke Binary : ");
        a = userInput.nextInt();
        a_bits = String.format("%32s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.println("Hasil : " + a_bits);
        
        /*
        Contoh Hasil: 
        Masukkan Nilai yang akan diubah ke Binary : 100
        Hasil : 00000000000000000000000001100100
        */
        
        userInput.close();
        
    }
}
