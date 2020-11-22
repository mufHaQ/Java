package Latihan;
import java.util.*;

public class Kalkulator_If_Else {

    public static void main(String args[]) {
        // Kalkulator menggunakan If Else
        
        float a, b, hasil;
        char operator;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        a = input.nextFloat();
        System.out.print("Operator: ");
        operator = input.next().charAt(0);
        System.out.print("Masukkan nilai b: ");
        b = input.nextFloat();
        
        System.out.println("Input user: " + a + " " + operator + " " + b);
        
        // operator tersedia *, /, +, -
        if (operator == '+'){
            hasil = a+b;
            System.out.println("Hasil: " + hasil);
        }else if (operator == '-'){
            hasil = a-b;
            System.out.println("Hasil: " + hasil);
        }else if (operator == '*'){
            hasil = a*b;
            System.out.println("Hasil: " + hasil);
            
        }else if (operator == '/'){
            if (b == 0){
                System.out.println("Pembagian dengan 0 menghasilkan nilai tak terhingga");
            }else{
                
            hasil = a/b;
            System.out.println("Hasil: " + hasil);
            }
        }else{
            System.out.println("Operator tidak ditemukan");
        }
        input.close();
    }
}
