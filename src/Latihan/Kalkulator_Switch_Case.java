package Latihan;
import java.util.*;

public class Kalkulator_Switch_Case {

    public static void main(String args[]) {
        // Kalkulator menggunakan Switch Case
        
        float a, b, hasil;
        String operator;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        a = input.nextFloat();
        System.out.print("Operator: ");
        operator = input.next();
        System.out.print("Masukkan nilai b: ");
        b = input.nextFloat();
        
        System.out.println("Input user: " + a + " " + operator + " " + b);
        
        switch (operator) {
            case "+":
                hasil = a+b;
                System.out.println("Hasil: " + hasil);
                break;
            case "-":
                hasil = a-b;
                System.out.println("Hasil: " + hasil);
                break;
            case "*":
                hasil = a*b;
                System.out.println("Hasil: " + hasil);
                break;
            case "/":
                if (b == 0){
                    System.out.println("Pembagian dengan 0 menghasilkan nilai tak terhingga");
                }else{
                    
                    hasil = a/b;
                    System.out.println("Hasil: " + hasil);
                }   break;
            default:
                System.out.println("Operator tidak ditemukan");
                break;
        }
        input.close();
        
    }
}
