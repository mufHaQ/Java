package myjava1;

public class Operator_Logika {

    public static void main(String args[]) {
        // Operator Logika -> operasi yang bisa dilakukan menggunakan tipe data boolean
        // AND, OR, XOR, negasi
        // Kalau OR ditambah (contoh 1+0), kalau AND dikali (contoh 1*0), kalau XOR (Exclusive OR) akan bernilai true kalau salah satu nilainya berbeda (contoh 1 dengan 0 maka hasilnya true)
        // ! (Negasi) adalah jika hasilnya true maka akan dibalik menjadi false, dan sebaliknya
        
        boolean a, b, c;
        
        // OR dengan menggunakan tanda "||"
        System.out.println("\nOR (||)");
        a = false;
        b = false;
        c = (a||b);
        System.out.println("========================================");
        System.out.println("=============");
        System.out.println(a + " || " + b + " = " + c); // Hasil: false || false = false
        System.out.println("=============\n");
        a = true;
        b = false;
        c = (a||b);
        System.out.println("=============");
        System.out.println(a + " || " + b + " = " + c); // Hasil: true || false = true
        System.out.println("=============\n");
        a = false;
        b = true;
        c = (a||b);
        System.out.println("=============");
        System.out.println(a + " || " + b + " = " + c); // Hasil: false || true = true
        System.out.println("=============\n");
        a = true;
        b = true;
        c = (a||b);
        System.out.println("=============");
        System.out.println(a + " || " + b + " = " + c); // Hasil: true || true = true
        System.out.println("=============");
        System.out.println("========================================\n");
        
        // AND dengan menggunakan tanda "&&"
        System.out.println("AND (&&)");
        a = false;
        b = false;
        c = (a&&b);
        System.out.println("========================================");
        System.out.println("=============");
        System.out.println(a + " && " + b + " = " + c); // Hasil: false && false = false
        System.out.println("=============\n");
        a = true;
        b = false;
        c = (a&&b);
        System.out.println("=============");
        System.out.println(a + " && " + b + " = " + c); // Hasil: true && false = false
        System.out.println("=============\n");
        a = false;
        b = true;
        c = (a&&b);
        System.out.println("=============");
        System.out.println(a + " && " + b + " = " + c); // Hasil: false && true = false
        System.out.println("=============\n");
        a = true;
        b = true;
        c = (a&&b);
        System.out.println("=============");
        System.out.println(a + " && " + b + " = " + c); // Hasil: true && true = true
        System.out.println("=============");
        System.out.println("========================================\n");
        
        // XOR dengan menggunakan tanda "^"
        System.out.println("XOR (^)");
        a = false;
        b = false;
        c = (a^b);
        System.out.println("========================================");
        System.out.println("=============");
        System.out.println(a + " ^ " + b + " = " + c); // Hasil: false ^ false = false
        System.out.println("=============\n");
        a = true;
        b = false;
        c = (a^b);
        System.out.println("=============");
        System.out.println(a + " ^ " + b + " = " + c); // Hasil: true ^ false = true
        System.out.println("=============\n");
        a = false;
        b = true;
        c = (a^b);
        System.out.println("=============");
        System.out.println(a + " ^ " + b + " = " + c); // Hasil: false ^ true = true
        System.out.println("=============\n");
        a = true;
        b = true;
        c = (a^b);
        System.out.println("=============");
        System.out.println(a + " ^ " + b + " = " + c); // Hasil: true ^ true = false
        System.out.println("=============");
        System.out.println("========================================\n");
        
        // NOT/Negasi ==> Flipping dengan tanda "!"
        a = true;
        b = !a;
        System.out.println("NOT/Negasi (!)");
        System.out.println("========================================");
        System.out.println(a + " --> (!) = " + b); // Hasil: true --> (!) = false
        System.out.println("========================================\n");
    }
}
