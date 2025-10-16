import java.util.Scanner;
public class Day39 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println(" MENU MINUMAN ");
            System.out.println(" 1. Es Teh   - Rp 5.000 ");
            System.out.println(" 2. Es Jeruk - Rp 7.000 ");
            System.out.println(" 3. Kopi Susu - Rp 8.000 ");
            System.out.print(" Masukkan nomor pilihan (1-3) ");
            int pilihan = input.nextInt();
            String hasil;
            if (pilihan == 1) {
                hasil = " Anda memesan Es Teh dengan harga Rp 5.000 ";
            } else if (pilihan == 2) {
                hasil = " Anda memesan Es Jeruk dengan harga Rp 7.000 ";
            } else if (pilihan == 3) {
                hasil = " Anda memesan Kopi Susu dengan harga Rp 8.000 ";
            } else {
                hasil = " Pilihan tidak valid ";
            }
            System.out.println(hasil);
        }
    }
