package myjava1;

import java.util.Scanner;

public class Switch_Case {

    public static void main(String args[]) {
        // Switch Case
        // Ekspresinya berupa satuan(int, long, byte, short), String, atau Enum
        
        String input;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda: ");
        input = userInput.next();
        
        switch(input){
            case "ulhaq":
                System.out.println("Saya Ulhaq, hadir pak!!");
                break;
            default:
                System.out.println(input + " tidak hadir pak!");
                break;
        }
        System.out.println("Program selesai");
        
        userInput.close();
        
        
        /*
        Contoh hasil jika default:
        Masukkan nama anda: Ulhaq
        Ulhaq tidak hadir pak!
        Program selesai
        */
    }
}
