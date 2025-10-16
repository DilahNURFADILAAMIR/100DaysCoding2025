import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("  MENU MAKANAN  ");
        System.out.println(" 1. Mie Ayam Biasa  - Rp 12.000 ");
        System.out.println(" 2. Mie Ayam Bakso  - Rp 15.000 ");
        System.out.println(" 3. Mie Ayam Spesial - Rp 18.000 ");
        System.out.print(" Masukkan nomor pilihan Anda (1-3): ");
        int pilihan = input.nextInt();
        String pesanan;
        int harga;
        if (pilihan == 1) {
            pesanan = " Mie Ayam Biasa ";
            harga = 12000;
        } else if (pilihan == 2) {
            pesanan = " Mie Ayam Bakso ";
            harga = 15000;
        } else if (pilihan == 3) {
            pesanan = " Mie Ayam Spesial ";
            harga = 18000;
        } else {
            pesanan = " Pilihan tidak valid ";
            harga = 0;
        }
        if (harga > 0) {
            System.out.println("Anda memesan " + pesanan + " dengan harga Rp " + harga);
        } else {
            System.out.println(pesanan);
        }
    }
}
