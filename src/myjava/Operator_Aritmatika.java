
package myjava;
public class Operator_Aritmatika  {
    public static void main(String args[]) {
        // Operasi Aritmatika
        
        int variable1 = 6;
        int variable2 = 15;        
        int hasil; 
        
        // 1. Penjumlahan
        hasil = variable1 + variable2;
        System.out.println("");
        System.out.printf("%d + %d = %d", variable1, variable2, hasil); // Hasil: 6 + 15 = 21
        System.out.println("\n");
        
        // 2. Pengurangan 
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d", variable1, variable2, hasil); // Hasil: 6 - 15 = -9
        System.out.println("\n");
        
        // 3. Perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d * %d = %d", variable1, variable2, hasil); // Hasil: 6 * 15 = 90
        System.out.println("\n");
        
        // 4. Pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d", variable1, variable2, hasil); // Hasil: 6 / 15 = 0 (Karena nilainya adalah integer)
        System.out.print(" (Karena nilainya adalah integer)");
        System.out.println("\n");
        
        // 5. Modulus
        hasil = variable2 % variable1;
        System.out.printf("%d %% %d = %d", variable2, variable1, hasil); // Hasil: 15 % 6 = 3 (modulus adalah sisa pembagian)
        System.out.print(" (modulus adalah sisa pembagian)");
        System.out.println("\n");
    }
}
