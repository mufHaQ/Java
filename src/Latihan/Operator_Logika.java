package Latihan;
import java.util.*;



public class Operator_Logika {

    public static void main(String args[]) {
        // Latihan Operator Logika
        
        Scanner userInput = new Scanner(System.in);
        
        
//        Membuat sebuah program untuk menebak sebuah angka
//        int nilaiBenar = 11;
        int nilaiTebakan;
        boolean statusTebakan;
        
//        System.out.print("Masukkan nilai tebakan anda: ");
//        nilaiTebakan = userInput.nextInt();
//        System.out.println("Nilai tebakan anda adalah: " + nilaiTebakan);
        
//        Operasi Logika
//        statusTebakan = (nilaiTebakan == nilaiBenar);
//        System.out.println("Tebakan anda = " + statusTebakan);
        
//        Operasi Aljabar boolean AND
        System.out.print("\nMasukkan nilai diantara 5 dan 10 : ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 5) && (nilaiTebakan < 10); 
        System.out.println("tebakan anda = " + statusTebakan);
        
//        Operasi Ajlabar boolean OR
        System.out.print("\nMasukkan nilai diantara 5 dan 10 : ");
        nilaiTebakan = userInput.nextInt();
        statusTebakan = (nilaiTebakan > 5) || (nilaiTebakan < 10);
        System.out.println("tebakan anda = " + statusTebakan + "\n");
        
        userInput.close();
    }

    
}
