package myjava1;

public class Operator_Bitwise {

    public static void main(String args[]) {
        // Operator Bitwise --> Operator untuk melakukan operasi pada nilai bit
        
        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;
        
        // Operator SHIFT LEFT
        System.out.println("\nSHIFT LEFT");
        System.out.println("=============");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a); // Hasil: 00000011 = 3
        b = (byte)(a << 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n", b_bits, b); // Hasil: 00011000 = 24
        System.out.println("=============");

        // Operator SHIFT RIGHT
        System.out.println("\nSHIFT RIGHT");
        System.out.println("=============");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a); // Hasil: 00011000 = 24
        b = (byte)(a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n", b_bits, b); // Hasil: 00001100 = 12
        System.out.println("=============");
        
        // Operator Bitwise OR
        System.out.println("Bitwise OR (|)");
        System.out.println("=============");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a); // Hasil: 00011000 = 24
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n", b_bits, b); // Hasil: 00001100 = 12
        c = (byte)(a | b);
        System.out.println("-------------");
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d", c_bits, c); 
        System.out.println(" (OR)"); // Hasil: 00011100 = 28 (OR)
        System.out.println("=============\n");
        
        // Operator Bitwise AND
        System.out.println("Bitwise AND (&)");
        System.out.println("=============");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a); // Hasil: 00011000 = 24
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n", b_bits, b); // Hasil: 00001100 = 12
        c = (byte)(a & b);
        System.out.println("-------------");
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d", c_bits, c);
        System.out.println(" (AND)"); // Hasil: 00001000 = 8 (AND)
        System.out.println("=============\n");
        
        // Operator Bitwise XOR
        System.out.println("Bitwise XOR (^)");
        System.out.println("=============");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a); // Hasil: 00011000 = 24
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d\n", b_bits, b); // Hasil: 00001100 = 12
        c = (byte)(a ^ b);
        System.out.println("-------------");
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0');
        System.out.printf("%s = %d", c_bits, c);
        System.out.println(" (XOR)"); // Hasil: 00010100 = 20 (XOR)
        System.out.println("=============\n");
        
        
        // Operator Bitwise NOT/Negasi
        System.out.println("Bitwise NOT (~)");
        System.out.println("=============");
        a = 24; 
        b = (byte)(~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d\n", a_bits, a); // Hasil: 00011000 = 24
        b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d", b_bits, b); // Hasil: 00011000 = 24
        System.out.println(" (NOT)");
        System.out.println("=============\n");
    }
}
