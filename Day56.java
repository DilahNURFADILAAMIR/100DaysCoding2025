import java.util.Scanner;
public class Day56 {
        public static void main(String[] args) {
            Scanner tes = new Scanner(System.in);
            int pilihan;
            do {
                System.out.println("\n  MENU INTERAKSI SEDERHANA  ");
                System.out.println("1. Tampilkan Pesan Semangat");
                System.out.println("2. Tampilkan Pesan Penutup");
                System.out.println("3. Keluar");
                System.out.print(" Masukkan pilihan Anda (1-3): ");
                pilihan = tes.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.println(" Tetap semangat ya! Hari ini milikmu ");
                        break;
                    case 2:
                        System.out.println(" Waktunya istirahat, sampai jumpa besok ");
                        break;
                    case 3:
                        System.out.println(" Terima kasih sudah menggunakan Menu Interaksi Sederhana ");
                        break;
                    default:
                        System.out.println(" Pilihan tidak valid, silakan coba lagi! ");
                }
            } while (pilihan != 3);
        }
    }
