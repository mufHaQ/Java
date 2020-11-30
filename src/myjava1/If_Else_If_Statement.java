package myjava1;

import java.util.Scanner;

public class If_Else_If_Statement {
    public static void main(String args[]) {
        // If Else If Statement
        Scanner inpt = new Scanner(System.in);
        
        int nilaiBenar = 10;
        int nilaiTebakan;
        boolean statusTebakan, nilai2;
        
        System.out.println("Masukkan nilai < 20");
        System.out.print("Masukkan nilai tebakan anda: ");
        nilaiTebakan = inpt.nextInt();
        
        statusTebakan = (nilaiTebakan == nilaiBenar);
        nilai2 = (nilaiTebakan < 20);
        
        // Jika kedua nilai if benar, maka yang akan dijalankan hanya kondisi if yang pertama
        if(nilaiTebakan == 10){
            System.out.println("nilai anda: " + statusTebakan);
        } else if (nilaiTebakan < 20){
            System.out.println("nilai Tebakan anda: " + statusTebakan + ", nilai anda < 20: " + nilai2);
        } else {
            System.out.println("nilai Tebakan anda: " + statusTebakan + ", nilai anda < 20: " + nilai2);
            
        }
        inpt.close();
    }
}
