package myjava1;

import java.util.Scanner;

public class Ternary_Operator {

    public static void main(String args[]) {
        // Tenary Operator
        // Variable x = eksekusi ? statement_true : statement_false
        
        int input, x;
        
        Scanner inpt = new Scanner(System.in);
        
        System.out.print("Masukkan nilai: ");
        input = inpt.nextInt();
        
        // Jika memakai Ternary Operator
        x = (input == 10) ? (input*input) : (input/2);
        
//        //Jika memakai If Else
//        if (input == 10){
//            x = input*input;
//        }else{
//            x = input/2;
//        }

        System.out.println("Hasilnya adalah: " + x);
        
        inpt.close();
        
        /*
        Contoh hasil jika kondisi true:
        Masukkan nilai: 10
        Hasilnya adalah: 100
        
        Contoh hasul jika kondisi false:
        Masukkan nilai: 100
        Hasilnya adalah: 50
        */
        
    }
}
