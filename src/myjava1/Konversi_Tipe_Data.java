package myjava1;

public class Konversi_Tipe_Data {
    public static void main(String args[]) {
        // Konversi Tipe Data
        
        int iInt = 550; // int = 32bit
        System.out.println("Nilai aInt = " + iInt); // Hasil: Nilai aInt = 550
        
//        Memperbesar rentang ke tipe data yang lebih besar
        long lLong = iInt; 
        System.out.println("Nilai bLong = " + lLong); // Hasil: Nilai bLong = 550
        
//        Memperkecil rentang ke tipe data yang lebih kecil (akan menghilangkan nilai aslinya)
        byte bByte = (byte)iInt;
        System.out.println("Nilai bByte = " + bByte); // Hasil: Nilai bByte = 38
        
//        Castin pembagian
        int a = 10;
        float b = 4;
        float c = a/b;
        System.out.printf("%d / %f = %f \n", a, b, c); // Hasil: 10 / 4.000000 = 2.500000 
        
//        Casting pembagian 2
        int x = 10; 
        int y = 4;
        float z = (float) x/y;
        System.out.printf("%d / %d = %f \n", x, y, z); // Hasil: 10 / 4 = 2.500000 
    }
}
