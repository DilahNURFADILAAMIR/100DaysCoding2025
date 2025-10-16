import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" MENU MAKANAN ");
        System.out.println(" 1. Mie Ayam Biasa   - Rp 12.000 ");
        System.out.println(" 2. Mie Ayam Bakso   - Rp 15.000 ");
        System.out.println(" 3. Mie Ayam Spesial - Rp 18.000 ");
        System.out.print("Masukkan nomor pilihan Anda (1-3): ");
        int pilihan = input.nextInt();
        String pesan;
        if (pilihan == 1)
            pesan = " Anda memesan Mie Ayam Biasa dengan harga Rp 12.000 ";
        else if (pilihan == 2)
            pesan = " Anda memesan Mie Ayam Bakso dengan harga Rp 15.000 ";
        else if (pilihan == 3)
            pesan = " Anda memesan Mie Ayam Spesial dengan harga Rp 18.000 ";
        else
            pesan = "Pilihan tidak valid.";

        System.out.println(pesan);
    }
}
