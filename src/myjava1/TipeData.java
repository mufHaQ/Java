package myjava1;

public class TipeData {
    public static void main(String[] args){
        // Tipe Data : integer(int), byte, short, long, double, float, char, boolean
        // Semua ini merupakan tipe data primitif
        
        // integer (satuan)
        int inta = 10;
        System.out.println("");
        System.out.println("===============INTEGER===============");
        System.out.println("Nilai integer 'inta' : "+inta+"\n"); // Hasil: Nilai integer 'inta' : 10
        System.out.println("Nilai integer : " + Integer.BYTES + " bytes"); // Hasil: Nilai integer : 4 bytes
        System.out.println("Nilai integer : " + Integer.SIZE + " bit" + "\n"); // Hasil: Nilai integer : 32 bit
        System.out.println("Nilai Maksimum dalam integer adalah : " + Integer.MAX_VALUE); // Hasil: Nilai Maksimum dalam integer adalah : 2147483647
        System.out.println("Nilai Minimum dalam integer adalah : " + Integer.MIN_VALUE); // Hasil: Nilai Minimum dalam integer adalah : -2147483648
        System.out.println("=====================================\n");
        
        // byte
        byte bytea = 10;
        System.out.println("=================BYTE================="); 
        System.out.println("Nilai byte 'bytea' : "+bytea+"\n"); // Hasil: Nilai byte 'bytea' : 10
        System.out.println("Nilai byte : " + Byte.BYTES + " bytes"); // Hasil: Nilai byte : 1 bytes
        System.out.println("Nilai byte : " + Byte.SIZE + " bit" + "\n"); // Hasil: Nilai byte : 8 bit
        System.out.println("Nilai Maksimum dalam byte adalah : " + Byte.MAX_VALUE); // Hasil: Nilai Maksimum dalam byte adalah : 127
        System.out.println("Nilai Minimum dalam byte adalah : " + Byte.MIN_VALUE); // Hasil: Nilai Minimum dalam byte adalah : -128
        System.out.println("======================================\n");
        
        // short
        short shorta = 10;
        System.out.println("================SHORT================");
        System.out.println("Nilai short 'shorta' : "+shorta+"\n"); // Hasil: Nilai short 'shorta' : 10
        System.out.println("Nilai short : " + Short.BYTES + " bytes"); // Hasil: Nilai short : 2 bytes
        System.out.println("Nilai short : " + Short.SIZE + " bit" + "\n"); // Hasil: Nilai short : 16 bit
        System.out.println("Nilai Maksimum dalam short adalah : " + Short.MAX_VALUE); // Hasil: Nilai Maksimum dalam short adalah : 32767
        System.out.println("Nilai Minimum dalam short adalah : " + Short.MIN_VALUE); // Hasil: Nilai Minimum dalam short adalah : -32768
        System.out.println("======================================\n");
        
        // long
        long longa = 10L;
        System.out.println("=================LONG=================");
        System.out.println("Nilai long 'longa' : "+longa+"\n"); // Hasil: Nilai long 'longa' : 10
        System.out.println("Nilai long : " + Long.BYTES + " bytes"); // Hasil: Nilai long : 8 bytes
        System.out.println("Nilai long : " + Long.SIZE + " bit" + "\n"); // Hasil: Nilai long : 64 bit
        System.out.println("Nilai Maksimum dalam long adalah : " + Long.MAX_VALUE); // Hasil: Nilai Maksimum dalam long adalah : 9223372036854775807
        System.out.println("Nilai Minimum dalam long adalah : " + Long.MIN_VALUE); // Hasil: Nilai Minimum dalam long adalah : -9223372036854775808
        System.out.println("======================================\n");
        
        //double (koma, bilangan real)
        double doublea = 10.7D; 
        System.out.println("=================DOUBLE=================");
        System.out.println("Nilai double 'doublea' : "+doublea+"\n"); // Hasil: Nilai double 'doublea' : 10.7
        System.out.println("Nilai double : " + Double.BYTES + " bytes"); // Hasil: Nilai double : 8 bytes
        System.out.println("Nilai double : " + Double.SIZE + " bit" + "\n"); // Hasil: Nilai double : 64 bit
        System.out.println("Nilai Maksimum dalam double adalah : " + Double.MAX_VALUE); // Hasil: Nilai Maksimum dalam double adalah : 1.7976931348623157E308
        System.out.println("Nilai Minimum dalam double adalah : " + Double.MIN_VALUE); // Hasil: Nilai Minimum dalam double adalah : 4.9E-324
        System.out.println("======================================\n");
        
        //float (koma, bilangan real)
        float floata = 11.77F;
        System.out.println("=================FLOAT=================");
        System.out.println("Nilai float 'longa' : "+floata+"\n"); // Hasil: Nilai float 'longa' : 11.77
        System.out.println("Nilai float : " + Float.BYTES + " bytes"); // Hasil: Nilai float : 4 bytes
        System.out.println("Nilai float : " + Float.SIZE + " bit" + "\n"); // Hasil: Nilai float : 32 bit
        System.out.println("Nilai Maksimum dalam float adalah : " + Float.MAX_VALUE); // Hasil: Nilai Maksimum dalam float adalah : 3.4028235E38
        System.out.println("Nilai Minimum dalam float adalah : " + Float.MIN_VALUE); // Hasil: Nilai Minimum dalam float adalah : 1.4E-45
        System.out.println("======================================\n");
        
        //char (karakter) berdasarkan ASCII
        char chara = 'c';
        System.out.println("=================CHAR=================");
        System.out.println("Nilai float 'longa' : "+chara+"\n"); // Hasil: Nilai float 'longa' : c
        System.out.println("Nilai float : " + Character.BYTES + " bytes"); // Hasil: Nilai float : 2 bytes
        System.out.println("Nilai float : " + Character.SIZE + " bit" + "\n"); // Hasil: Nilai float : 16 bit
        System.out.println("Nilai Maksimum dalam float adalah : " + Character.MAX_VALUE); // Hasil: Nilai Maksimum dalam float adalah : ￿
        System.out.println("Nilai Minimum dalam float adalah : " + Character.MIN_VALUE); // Hasil: Nilai Minimum dalam float adalah :  
        System.out.println("======================================\n");
        
        //boolean (nilai true atau false)
        boolean t = true;
//        boolean f = false;
        System.out.println("=================BOOLEAN=================");
        System.out.println("Nilai float 'longa' : "+t); // Hasil: Nilai float 'longa' : true
        System.out.println("=========================================\n");
        
        
        
    }
}
