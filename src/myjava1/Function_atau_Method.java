package myjava1;

import java.util.Scanner;

public class Function_atau_Method {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);

//        System.out.print("Masukkan Angka: ");
//        x = input.nextInt();
//        y = hitung(x);
//
//        System.out.println("Nilai x = " + x + ", Hasil = " + y);

        pPersegi("Menghitung Luas Persegi");
        System.out.print("Masukkan Angka: ");
        x = input.nextInt();

        y = persegi(x);
        System.out.println("Hasil Luas Persegi = " + y);

        

    }

//    static int hitung(int input){
//        int hasil;
//
//        hasil = (input + 2) * input;
//        return hasil;
//    }

//    Void hanya untuk Print dan tidak  ada nilai return
    static void pPersegi(String input){
        System.out.println(input);
    }

    static int persegi(int input){
        int hasil;

        hasil = input * input;
        return hasil;
    }
}
