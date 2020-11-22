package myjava;

public class Operator_Unary {

    public static void main(String args[]) {
        // Operator Unary | Unary = Operasi yang dilakukan pada satu variable
        
        // Unary + dan -
        int angka1 = 1;
        System.out.printf("Unary '+', %d menjadi %d\n", angka1, +angka1); // Hasil: 
        System.out.printf("Unary '-', %d menjadi %d\n\n", angka1, -angka1); // Hasil: 
        
        // Unary Decrement dan Increment
        int a = 100;
        a++;
//        a++;
        System.out.println("Nilai dengan 'a++', yang awalnya bernilai 100 menjadi " + a); // Hasil: 
        
        int b = 100;
        b--;
//        b--;
        System.out.println("Nilai dengan 'b--', yang awalnya bernilai 100 menjadi " + b + "\n"); // Hasil: 
        
        // Menggunakan Prefix
        int nilaiA = 100;
        System.out.printf("Nilai dengan prefix '++', yang awalnya bernilai %d menjadi %d \n", nilaiA, ++nilaiA); // Ditambah dulu nilainya baru ditampilkan dibagian "%d"
        // Hasil: Nilai dengan prefix '++', yang awalnya bernilai 100 menjadi 101 
        int nilaiB = 100;
        System.out.printf("Niali dengan postfix '++' yang awalnya bernilai %d menjadi %d \n", nilaiB, nilaiB++); // tidak berubah nilainya karena ditampilkan dulu baru dijumlahkan
        // Hasil: Niali dengan postfix '++' yang awalnya bernilai 100 menjadi 100 
        System.out.printf("Nilai 'nilaiB' = %d \n\n", nilaiB); // "nilaiB" menampilkan hasil penjumlahan pada line-40
        // Hasil: Nilai 'nilaiB' = 101 
        
        // Unary boolean ! untuk negasi
        boolean ulhaq = true;
        System.out.println("Nilai boolean = " + ulhaq); // Hasil: Nilai boolean = true
        System.out.println("Nilai boolean = " + !ulhaq); // Hasil: Nilai boolean = false
        
        
    }
}
