//---PROGRAM PERCABANGAN IF ELSE x OPERASI LOGIKA x PERBANDINGAN---//
//--------------------Salam Satu Frekuensi-------------------------//
//--------------------------From TRPL------------------------------//

import java.util.Scanner;
public class jimalogan {
    public static void main(String[] args) {
        try (Scanner scanner=new Scanner (System.in)){
            
            System.out.println("--- PERCABANGAN IF---");
            System.out.println("Masukkan angka yang kamu suka!");
            int angka = scanner.nextInt();
            System.out.println("Apakah angka yang masukkan lebih dari 5?");
            String input = scanner.next();

            if (angka > 5 && input.equalsIgnoreCase("ya")){
                System.out.println("Kejujuran adalah hal yang berharga. Pertahankan!");
            } else {
                System.out.println("Anda berbohong :(");
            }
            
        }
    }
}