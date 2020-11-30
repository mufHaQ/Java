package myjava1;

public class Operator_Komparasi {

    public static void main(String args[]) {
        // Operator Komparasi akan menghasilkan nilai dalam bentuk boolean
        
        // Operator Equal/Persamaan
        int a, b, c;
        
        a = 10;
        b = 10;
        c = 20;
        
        boolean komparasi1, komparasi2;
        
        komparasi1 = (a==b);
        komparasi2 = (a==c);
        System.out.println("\nOperator Persamaan");
        System.out.println("================================");
        System.out.printf("Apakah nilai a = b? Jawabannya = %s\n", komparasi1); // Hasil: Apakah nilai a = b? Jawabannya = true
        System.out.printf("Apakah nilai a = c? Jawabannya = %s\n", komparasi2); // Hasil: Apakah nilai a = c? Jawabannya = false
        System.out.println("================================\n");
        
        
        // Operator NotEqual/Pertidaksamaan
        
        int xy, yy, zy;
        
        xy = 10;
        yy = 10;
        zy = 20;
        
        boolean komparasi1b, komparasi2b;
        
        komparasi1b = (xy != yy);
        komparasi2b = (xy != zy);
        System.out.println("Operator Pertidaksamaan");
        System.out.println("================================");
        System.out.printf("Apakah nilai a = b? Jawabannya = %s\n", komparasi1b); // Hasil: Apakah nilai a = b? Jawabannya = false
        System.out.printf("Apakah nilai a = c? Jawabannya = %s\n", komparasi2b); // Hasil: Apakah nilai a = c? Jawabannya = true
        System.out.println("================================\n");
        
        // Operator Less than/Kurang dari
        int ab, bb, cb;
        
        ab = 10;
        bb = 20;
        cb = 5;
        
        boolean komparasi1c, komparasi2c;
        
        komparasi1c = (ab < bb);
        komparasi2c = (ab < cb);
        System.out.println("Operator Kurang dari");
        System.out.println("================================");
        System.out.printf("Apakah nilai a < b? Jawabannya = %s\n", komparasi1c); // Hasil: Apakah nilai a < b? Jawabannya = true
        System.out.printf("Apakah nilai a < c? Jawabannya = %s\n", komparasi2c); // Hasil: Apakah nilai a < c? Jawabannya = false
        System.out.println("================================\n");
        
        // Operator Greater than/Lebih dari
        int ac, bc, cc;
        
        ac = 10;
        bc = 20;
        cc = 5;
        
        boolean komparasi1d, komparasi2d;
        
        komparasi1d = (ac > bc);
        komparasi2d = (ac > cc);
        System.out.println("Operator Lebih dari");
        System.out.println("================================");
        System.out.printf("Apakah nilai a > b? Jawabannya = %s\n", komparasi1d); // Hasil: Apakah nilai a > b? Jawabannya = false
        System.out.printf("Apakah nilai a > c? Jawabannya = %s\n", komparasi2d); // Hasil: Apakah nilai a > c? Jawabannya = true
        System.out.println("================================\n");
        
        // Operator Less than equal/Kurang dari sama dengan
        int ae, be, ce;
        
        ae = 10;
        be = 20;
        ce = 5;
        
        boolean komparasi1e, komparasi2e;
        
        komparasi1e = (ae <= be);
        komparasi2e = (ae <= ce);
        System.out.println("Operator Kurang dari sama dengan");
        System.out.println("================================");
        System.out.printf("Apakah nilai a <= b? Jawabannya = %s\n", komparasi1e); // Hasil: Apakah nilai a <= b? Jawabannya = true
        System.out.printf("Apakah nilai a <= c? Jawabannya = %s\n", komparasi2e); // Hasil: Apakah nilai a <= c? Jawabannya = false
        System.out.println("================================\n");
        
        // Operator Greater than equal/Lebih dari sama dengan
        int af, bf, cf;
        
        af = 10;
        bf = 20;
        cf = 5;
        
        boolean komparasi1f, komparasi2f;
        
        komparasi1f = (af >= bf);
        komparasi2f = (af >= cf);
        System.out.println("Operator Lebih dari sama dengan");
        System.out.println("================================");
        System.out.printf("Apakah nilai a >= b? Jawabannya = %s\n", komparasi1f); // Hasil: Apakah nilai a >= b? Jawabannya = false
        System.out.printf("Apakah nilai a >= c? Jawabannya = %s\n", komparasi2f); // Hasil: Apakah nilai a >= c? Jawabannya = true
        System.out.println("================================\n");
    }
}
