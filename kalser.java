import java.util.Scanner;
public class kalser {
    public static void main(String[] args) {
         try (Scanner scanner=new Scanner (System.in)){
            //---PROGRAM 3---//
            
            while(true){

                System.out.println("---KALKULATOR SEDERHANA---");
                System.out.print("Masukkan angka pertama: ");
                int nor1 = scanner.nextInt();
                System.out.print("Masukkan angka kedua: ");
                int nor2 = scanner.nextInt();
                System.out.println("Pilih operasi yang anda ingin lakukan");
                System.out.println("1. Penjumlahan");
                System.out.println("2. Pengurangan");
                System.out.println("3. Perkalian");
                System.out.println("4. Pembagian");
                byte operasi = scanner.nextByte();
                int hasil = 0;
                

                switch (operasi){
                    case 1 -> hasil = nor1+nor2;
                    case 2 -> hasil = nor1-nor2;
                    case 3 -> hasil = nor1*nor2;
                    case 4 -> hasil = nor1/nor2;
                    default -> {
                        System.out.println("Masukkan opsi menggunakan angka dari 1-4!");
                    
                    }

            
                }
                System.out.println("Hasilnya: "+hasil);
                System.out.println();
                System.out.println("Program berhasil dijalankan. Ketik 'keluar' jika ingin menghentikan program.");
                String input = scanner.next();
                    if (input.equalsIgnoreCase("Keluar")){
                        System.out.println("Sampai Jumpa");
                        break;
                }   
            }
        }       
    }
}
