package myjava1;
import java.util.*;


public class If_Else_Statement {
    public static void main(String args[]) {
        // If Else Statement
        
        Scanner usrInpt = new Scanner(System.in);
        
        int nilaiBenar = 10;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.print("Masukkan nilai anda: ");
        nilaiTebakan = usrInpt.nextInt();
        
        statusTebakan = (nilaiTebakan == nilaiBenar);
        
        if(nilaiTebakan == 10){
            System.out.println("Jawaban anda: " + statusTebakan);
        } else {
            System.out.println("Jawaban anda: " + statusTebakan);
        }
        usrInpt.close();
    }
}
