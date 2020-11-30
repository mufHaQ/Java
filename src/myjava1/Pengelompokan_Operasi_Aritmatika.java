package myjava1;

public class Pengelompokan_Operasi_Aritmatika {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Pengelompokan Operasi Aritmatika
        // Perkalian atau Pembagian akan dilakukan terlebih dahulu
        // Antara Penjumlahan, Pengurangan, Perkalian, Pembagian, yang didahulukan yang paling kiri
        
        int a = 100;
        int b = 12;
        int c = 30;
        
        double hasil1 = (double) a/b*c;
        double hasil2 = (double) a/(b*c);
        System.out.printf("%d / %d * %d = %f \n", a, b, c, hasil1); // Hasil: 100 / 12 * 30 = 250.000000 
        System.out.printf("%d / (%d * %d) = %f \n", a, b, c, hasil2); // Hasil: 100 / (12 * 30) = 0.277778 
    }
}
